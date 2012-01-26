/*
 * ast.c
 *
 *  Created on: Nov 23, 2011
 *      Author: benjamin
 */

#include <stdio.h>
#include <stdlib.h>
#include "parse.h"
#include "ast.h"

#define return_error(plop, plip)	if (1){ printf("ERROR %s - %c\n",plop, plip); return NULL;}

NODE *root;
NODE *end;


char* print_typeNode(int typeNode){
	switch (typeNode){
	case ALTER:
			return "ALTER";
	case CONCAT:
			return "CONCAT";
	case REPET:
			return "REPET";
	case LETTER:
			return "LETTER";
	case ENDNODE:
			return "END";
	}
	return "ERROR";
}

void printNode(NODE *node){
	/*printf("printNode\n");*/
	if(node == NULL) {
		printf(" null ");
		return;
	}
	printf("(%s - %c | ", print_typeNode(node->type), node->value);
	printNode(node->left);
	printf(" = ");
	printNode(node->right);
	printf(")");
}

void prettyPrintNode(NODE *node){
	/*printf("printNode\n");*/
	if(node == NULL) {
		printf(" null ");
		return;
	}

	switch (node->type){
		case ALTER:
			printf("(");
			prettyPrintNode(node->left);
			printf(")");
			if(node->right != NULL){
				printf("|(");
				prettyPrintNode(node->right);
				printf(")");
			}
			break;
		case REPET:
			prettyPrintNode(node->left);
			printf("*");
			break;
		case LETTER:
			printf("%c", node->value);
			break;
		case ENDNODE:
			printf("#");
			break;
		case CONCAT:
			prettyPrintNode(node->left);
			printf(".");
			prettyPrintNode(node->right);
			break;
		default:
			printf("PPERROR");
			break;
	}
}



void setEnd(){
	end->type = ENDNODE;
	end->value = '#';
	end->left = NULL;
	end->right = NULL;
}


void setNode(NODE** node, TYPENODE type, NODE* child){
	/*printf("setNode %s\n",print_typeNode(type));*/
	(*node) = (NODE*)malloc(sizeof(NODE));
	(*node)->type = type;
	(*node)->value = token_value;
	(*node)->left = child;
	(*node)->right = NULL;
}

void startAnalyze(){
	/*printf("start\n");*/
	NODE* e;
	setEnd();
	next_token();
	e = expr();
	printf("arbre calcule\n");
	setNode(&root, CONCAT, e);
	root->right = end;
}

NODE *expr() {
	/*printf("expr %s\n",print_token(token));*/
	NODE* child;
	NODE* node;
	child=concat();
	if (token == END) return child;
	if (child == NULL) return_error("expr1", token_value);
	if (token==PIPE) {
		setNode(&node, ALTER, child);
		next_token();
		if ((node->right=expr())== NULL) return_error("expr2", token_value);
		return node;
	} else return child;
}

NODE *concat() {
	/*printf("concat %s\n",print_token(token));*/
	NODE* child;
	NODE* node;
	child=repet();
	if (token==END) return child;
	if (child==NULL) return_error("concat1", token_value);
	if ((token==LBRACE) || (token==CAR)) {
		setNode(&node, CONCAT, child);
		if ((node->right=concat())==NULL) return_error("concat2", token_value);
		return node;
	}
	else return child;
}


NODE *repet() {
	/*printf("repet %s\n",print_token(token));*/
	NODE* child;
	NODE* node;
	child=simple();
	if (token==END) return child;
	if (child==NULL) return_error("repet", token_value);
	if (token==STAR) {
		setNode(&node, REPET, child);
		next_token();
		return node;
	}
	else return child;
}

NODE *simple() {
	/*printf("simple %s\n",print_token(token));*/
	NODE* child = NULL;
	NODE* node;
	if (token == LBRACE) {
		next_token();
		if ((child=expr())==NULL) {return_error("simple1", token_value);}
		if (token!=RBRACE) {return_error("simple2", token_value);}
		setNode(&node, ALTER, child);
		next_token();
		return node;
	} else {
		if (token == END) return NULL;
		if (token!=CAR) {return_error("simple3", token_value);}
		setNode(&node, LETTER, child);
		next_token();
		return node;
	}
}

int main(int argc,char** argv) {
	/*root = (NODE*)malloc(sizeof(NODE));*/
	end = (NODE*)malloc(sizeof(NODE));
	startAnalyze();
	prettyPrintNode(root);
	printf("\n");
	free(root);
	free(end);
	return EXIT_SUCCESS;
}


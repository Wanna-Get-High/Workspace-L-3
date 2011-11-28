/*
 * ast.h
 *
 *  Created on: Nov 23, 2011
 *      Author: benjamin
 */

#ifndef AST_H_
#define AST_H_

typedef enum { ALTER, CONCAT, REPET, LETTER, ENDNODE } TYPENODE;

typedef struct node {
	TYPENODE type;
	char value;
	struct node *left, *right;} NODE;

char* print_typeNode(int typeNode);
void printNode(NODE* node);
void setEnd();
void setNode(NODE** node, TYPENODE type, NODE* child);
void startAnalyze();
NODE *expr();
NODE *concat();
NODE *repet();
NODE *simple();

#endif /* AST_H_ */

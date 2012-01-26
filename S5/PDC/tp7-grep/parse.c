/*
 ============================================================================
 Name        : C_Grep.c
 Author      : Benjamin Van Ryseghem
 Version     :
 Copyright   : MIT
 Description : mgrep in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "parse.h"



char* print_token(int token){
	switch (token){
		case PIPE:
				return "PIPE";
		case STAR:
				return "STAR";
		case LBRACE:
				return "LBRACE";
		case RBRACE:
				return "RBRACE";
		case CAR:
				return "CAR";
		case END:
				return "END";
	}
	return "ERROR";
}

void next_token() {
	char c = getchar();
	token_value = c;
	if ((c==EOF) || (c=='\n')) token=END;
	else {
		switch (c) {
			case '|':
				token = PIPE;
				break;
			case '*':
				token = STAR;
				break;
			case '(':
				token = LBRACE;
				break;
			case ')':
				token = RBRACE;
				break;
			case '\n':
				token = END;
				break;
			case EOF:
				token = END;
				break;
			default :
				token = CAR;
				break;
		}
	}
	/*printf("%s - %c\n",print_token(token),c);*/
}
/*
int main(void) {
	while(token != 5){
		next_token();
	}
	return EXIT_SUCCESS;
}*/

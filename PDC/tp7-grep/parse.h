/*
 * parse.h
 *
 *  Created on: Nov 23, 2011
 *      Author: benjamin
 */

#ifndef PARSE_H_
#define PARSE_H_

typedef enum { PIPE, STAR, LBRACE, RBRACE, CAR, END} TOKEN;
TOKEN token; char token_value;

char* print_token(int token);
void next_token();

#endif /* PARSE_H_ */

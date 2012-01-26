#include <stdio.h>
void
function
(void){
int foo =
0 ;
int *ret = &foo ;
ret += 3 ;
(*ret) += 7 ;
}

int
main
(void){
int x = 0 ;
function() ;
x = 1 ;
printf("%d\n",x) ;
return 0 ;
}


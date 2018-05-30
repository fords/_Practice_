#include<stdio.h>

int main(void) {
    
    float f; 
    printf("Enter value: ");
    scanf("%s", f);
    printf(" Value is %lf\n" ,f); 
    //f = 2 ;
    f *= 5 ;
    
    f /= 3 ;
    printf(" Final value is %lf \n", f) ; 
    return 0;
}
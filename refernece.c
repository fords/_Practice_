#include <iostream>

void swap (int *x, int *y){
    int temp
    temp = *x ;
    *x = *y;
    *y = temp; 
    
}

int main()
{
    int a =100;
    int b = 200;
    
    
    swap(&a , &b);
    printf( "a %d, b %d", a, b );
    return 0 ;
}
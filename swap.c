#include<iostream>
using namespace std;
 
void swap(unsigned int x, unsigned int y)

{    

  printf("before swapping value of x=%d and y=%d ",x,y);

    x = x ^ y;printf(" Decimal number of x  is  %d \n", x );
    y = x ^ y;printf(" Decimal number of y  is  %d \n", y );
    x = x ^ y;printf(" Decimal number of x  is  %d \n", x );
    printf("after swapping value of  x=%d  and y=%d ",x,y);
}
// Driver program to test above function
int main()
{
    unsigned int x ;
    unsigned int y ; 
    //printf("Hello %u \n", x );
    //cout << x ;
    //cout << isPalindrome(x) << endl;
    x = 0b1111 ; //printf(" Decimal number of x  is  %d \n", x );
    y = 0b0011 ;
    swap(x,y);
    //cout << swap(x, y ) << endl;
    return 0;
}
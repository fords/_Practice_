#include<iostream>
using namespace std;
 
// This function returns true if k'th bit in x is set (or 1).
// For example if x (0010) is 2 and k is 2, then it returns true
bool isKthBitSet(unsigned int x, unsigned int k)
{
    return (x & (1 << (k-1)))? true: false;
}
 
// This function returns true if binary representation of x is
// palindrome. For example (1000...001) is paldindrome
bool isPalindrome(unsigned n)
{
    unsigned m = 0;

    for(unsigned tmp = n; tmp; tmp >>= 1)
        m = (m << 1) | (tmp & 1);

    return m == n; 
}
// Driver program to test above function
int main()
{
    unsigned int x;
    //printf("Hello %u \n", x );
    //cout << x ;
    //cout << isPalindrome(x) << endl;
    x = 0b1001 ; printf(" Decimal number is  %d \n", x );
    cout << isPalindrome(x) << endl;
    return 0;
}
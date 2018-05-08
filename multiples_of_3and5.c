/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. **/ 

#include <stdio.h>

int main() {

   int a = 1000;
   int i,no_of_3, no_of_5 ; 
   no_of_3 = 0;
   no_of_5 = 0;
   for( i = 1; i < a; i= i + 1 ){
      if ( i %3 == 0){
          no_of_3 += i;
      }
      else if ( i %5 == 0 ){
          no_of_5 += i;
      }
      else{ ; }
      //printf("value of i: %d\n", i);
   }
   int sum = no_of_3 + no_of_5;
   printf("The sum of multiples of 3 and 5 below 1000 is: %d\n", sum); 
    return 0;
}


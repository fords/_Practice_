#include <stdio.h>
#include <string.h>
 
int main()
{
    int i;

char *arr[50] = {"C","C++","Java","VBA"};
char *(*ptr)[50] = &arr;

(*ptr)[5]="Sander";
for(i=0;i<5;i++)
    printf("String %d : %s\n",i+1,(*ptr)[i]);

return 0;
}
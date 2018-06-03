#include <iostream>
using namespace std;
 #include <stdio.h> // printf
#include <stdlib.h> // malloc, free
#include <string.h> 
// Function to reverse a string
void reverseStr(string& str)
{
    int n = str.length();
 
    
    for ( int i = 0 ; i < n/2 ; i++){
        swap ( str[i] , str[n-1-i]);
    }
}
 
// Driver program
int main(){
	char* s = "hello";
	size_t l = strlen(s);
	char* r = (char*)  malloc((l + 1) * sizeof(char));
	r[l] = '\0';
	int i;
	for(i = 0; i < l; i++) {
		r[i] = s[l - 1 - i];
	}
	printf("normal: %s\n", s);
	printf("reverse: %s\n", r);
	free(r);

    string str = "geeksforgeeks";
    reverseStr(str);
    cout << str;
    return 0;
}



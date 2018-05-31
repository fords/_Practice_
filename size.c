#include <stdio.h>
int main()
{
    struct value
    {
        int bit1 : 1;
        int bit2 : 4;
        int bit3 : 4;
    } bit;

    printf("%d",sizeof(bit));  // 32 bit compiler -> 1 int required (4bytes)  if char is used 8 bits (2 bytes)

    return 0;
}

/*
#include <stdio.h>
int main()
{
    struct value
    {
        char bit1 : 1;
        char bit2 : 4;
        char bit3 : 4;
    } bit;

    printf("%d",sizeof(bit));  // if char is used 8 bits (2 bytes)

    return 0;
}


int main()
{
    struct value
    {
        char bit1 : 1;
        char bit2 : 4;
        char bit3 : 2;
    } bit;

    printf("%d",sizeof(bit));  // 1 byte 

    return 0;
}   */ 
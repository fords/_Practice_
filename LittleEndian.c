int main(){
    int x = 1;   

    unsigned char *c = (unsigned char*) &x; 
    printf( (*c) ? "Little\n" : "Big\n");

    return 0;
}
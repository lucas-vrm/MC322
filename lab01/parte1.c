#include <stdio.h>
#include <stdlib.h>

int main(){

    float s = 200;
    int n = 5;
    float j = 1;

    for (int i = 1; i <= n; i++){
        if (i == 1)
        {
            printf("%d", s);
        }
        else
        {
            s = s*(1 + (j/100));
            printf("%d", s);
        }
        
    }
    
    return 0;
}

#include <stdio.h>
#include <stdlib.h>

float proximaParcela(int x, float j, float s){
    if (x==1)
    {
        return s;
    } else {
        return proximaParcela((x-1), j, (s*(1 + (j/100))));
    }
    
}

int main(){

    float s = 200;
    int n = 5;
    float j = 1;

    for (int i = 1; i <= n; i++)
    {
        printf("%.2f ", proximaParcela(i, j, s));
    }
       
    return 0;
}

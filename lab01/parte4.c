#include <stdio.h>
#include <stdlib.h>

typedef struct Emprestimo
{
    float s;
    int n;
    float j;
}Emprestimo;


float proximaParcela(Emprestimo e){
    if (x==1)
    {
        return s;
    } else {
        return proximaParcela((x-1), j, (s*(1 + (j/100))));
    }
    
}

int main(){

    Emprestimo e1;

    e1.s = 200;
    e1.n = 5;
    e1.j = 1;

    for (int i = 1; i <= e1.n; i++)
    {
        printf("%.2f ", proximaParcela());
    }
       
    return 0;
}

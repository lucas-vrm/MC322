float s = 200;
int n = 5;
float j = 1;

    for (int i = 1; i <= n; i++){
        if (i == 1)
        {
            System.out.println(s);
        }
        else
        {
            s = s*(1 + (j/100));
            System.out.println(s);
        }
        
    }
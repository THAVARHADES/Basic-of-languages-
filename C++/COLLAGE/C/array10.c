#include<stdio.h>

void main(){
    int array1[10];
    int prod=1;
    int i;
    for (i=0;i<10;i++)
    {
        printf("ENTER THE VALUE\n");
        scanf("%d",&array1[i]);
    }
    for (i=0;i<10;i++)
    {
        printf("value of array=>%d\n",array1);
    }    
    for(i=0;i<10;i++)
    {
        prod=prod*array1[i];   
    }
    printf("the value of multi%d",prod);

    
}
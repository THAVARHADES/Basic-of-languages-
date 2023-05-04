#include<stdio.h>
void main(){
    
    
    //variavle and initialisation
    int array1[3][3];
    int row,col;
    for (row=0;row<3;row++)
    {   
        for(col=0;col<3;col++)
        {
            printf("THE VALe in array");
            scanf("%d",&array1[row][col]);
        }    
    }
    //main content
    printf("THE valUE oF ARRAY IS =>\n");
    for (row=0;row<3;row++)
    {
        for(col=0;col<3;col++)
        {
            printf("%d\t",array1[row][col]);
        }
        {
            printf("\n");
        }
    }
}
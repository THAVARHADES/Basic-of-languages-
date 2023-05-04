#include<stdio.h>
void main(){
    int array1[10];
    int i;
    int element_to_be_searched;
    for(i=0;i<10;i++)
    {
        printf("ENTER THE VALUE\n");
        scanf("%d",&array1[i]);
    }
    
    printf("ELemENT TO BE SEARCHED");
    scanf("%d", element_to_be_searched);
    for (i=0;i<10;i++)
    {
        if (element_to_be_searched ==array1[i])
          {
                printf("THE ELEMENT FOUND%d\n",i);
          }      
        else
        {
            printf("ELEMENT IS NOT AVILABLE%d\n",i);
        }    
    }  

}
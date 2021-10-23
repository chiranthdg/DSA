#include<stdio.h>
void main()
{
    int n,flag=0;
    printf("Enter the number of integers in array\n");
    scanf("%d",&n);
    int a[n];
    printf("Enter the array\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int sum=0;
    printf("Enter the sum\n");
    scanf("%d",&sum);
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]+a[j]==sum)
            {
                printf("indices are %d and %d \n",i,j);
                flag=1;
            }
        }
    }
    if(flag==0)
    {
        printf("No indices found\n");
    }
}

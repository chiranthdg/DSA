#include<stdio.h>
void main()
{
    int a[10],arr[10],r=0;
    for(int i=0;i<10;i++)
        a[i]=0;
    int n;
    printf("Enter the ballons given \n");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
        r=arr[i]%10;
        a[r]=1;
    }
    printf("Array without duplicates are\n");
    for(int i=0;i<10;i++)
    {
        if(a[i]==1)
        printf("%d\n",i);
    }
}

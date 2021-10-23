#include<stdio.h>
void main()
{
    int n,flag=0;
    printf("Enter the length of array\n");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the array\n");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    int count=1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[i]==999)
                break;
            if(arr[i]==arr[j] && i!=j)
            {
                count++;
                arr[j]=999;
            }
        }
        if(arr[i]!=999)
        {
            printf("Number of %d's : %d \n",arr[i],count);
        }
        count=1;
    }
}

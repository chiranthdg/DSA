#include<stdio.h>
void main()
{
    int n,flag=0;
    printf("Enter the number of persons in the grp\n");
    scanf("%d",&n);
    int arr[n],dup[n];
    int x=sizeof(arr);
    printf("%d",x);
    printf("Enter the array\n");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j] && i!=j)
            {
                flag=1;
            }
        }
    }
    if(flag==0)
    {
        printf("no identical twins");
    }
    else
    {
        printf("identical twins present");
    }
}

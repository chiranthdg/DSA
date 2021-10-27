#include <stdio.h>
#include <stdlib.h>
struct book{
	int id;
	float price;
	char name[10];
	char aut[10];
};

int push(struct book b[],int top)
{
	if(top==4)
	{
		printf("Can't insert book\n");
		return top;
	}
	top++;
	printf("Enter the book name\n");
	scanf("%s",(b+top)->name);
	printf("Enter the author name\n");
	scanf("%s",(b+top)->aut);
	printf("Enter the book id and price\n");
	scanf("%d%f",&((b+top)->id),&((b+top)->price));
	return top;
}
int pop(struct book b[],int top)
{
	if(top==-1)
	{
		printf("No book to delete\n");
		return top;
	}
	printf("Deleted book details are\n");
	printf("Book id:%d\n",(b+top)->id);
	printf("Book name:%s\n",(b+top)->name);
	printf("Book author:%s\n",(b+top)->aut);
	printf("Book price:%f\n",(b+top)->price);
	top--;
	return top;
}
void disp(struct book b[], int top)
{
	if(top==-1)
	{
		printf("No book to dsiplay\n");return;
	}
	for(int i=top;i>=0;i--)
	{
		printf("Book id:%d\n",(b+top)->id);
		printf("Book name:%s\n",(b+top)->name);
		printf("Book author:%s\n",(b+top)->aut);
		printf("Book price:%f\n",(b+top)->price);
		printf("-----------------------------------\n");
	}

}
void main()
{
	struct book b[5];
	int top=-1;
	int ch;
	while(1)
	{
		printf("Enter\n1.Push book\n2.Pop book\n3. Display\n4. Exit\n");
		scanf("%d",&ch);
		switch(ch)
		{
	
			case 1:top=push(b,top);break;
			case 2:top=pop(b,top);break;
			case 3:disp(b,top);break;
			case 4:exit(0);
			default:break;
		}
	}

}

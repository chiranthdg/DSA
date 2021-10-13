a=int(input("enter the number"))
sum=0
while a!=0 :
	sum+= int(a%10)
	a=int(a/10)
print("sum of digits ",sum)	
		
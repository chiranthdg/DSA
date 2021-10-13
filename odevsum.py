a=int(input('enter the number'))
sum1=sum2=0
for i in range(0,a,2):
	sum1+=i
for i in range(1,a,2):
	sum2+=i	
print("sum of odd numbers ", sum2)
print("sum of even mubers ",sum1)	
m=int(input('enter the number '))
n=int(input('enter the number '))
if m==0 and n==0 :
	print("wrong input")
if m==0 :
	print(f"gcd is {n}")	
if n==0 :
	print(f"gcd is {m}")	
while m!=n:
	if m>n:
		m=m-n
	if n>m:
		n=n-m		
print(f"gcd is {n}")	
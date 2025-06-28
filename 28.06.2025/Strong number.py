import math

num = int(input("Enter number: "))
total = sum(math.factorial(int(d)) for d in str(num))
print("Strong Number" if total == num else "Not Strong Number")

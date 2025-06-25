num = int(input("Enter number: "))
n = len(str(num))
total = sum(int(d)**n for d in str(num))
print("Armstrong Number" if total == num else "Not Armstrong")

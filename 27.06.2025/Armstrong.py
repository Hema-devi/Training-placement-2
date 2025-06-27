num = int(input("Enter number: "))
power = len(str(num))
total = sum(int(d) ** power for d in str(num))
print("Armstrong Number" if total == num else "Not Armstrong")

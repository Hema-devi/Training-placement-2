import math

num = int(input("Enter number: "))
root = math.isqrt(num)
print("Perfect Square" if root * root == num else "Not Perfect Square")

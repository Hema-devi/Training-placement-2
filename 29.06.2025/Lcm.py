def lcm(a, b):
    from math import gcd
    return abs(a * b) // gcd(a, b)

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))
print("LCM:", lcm(x, y))

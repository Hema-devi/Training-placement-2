def add(x, y): return x + y
def sub(x, y): return x - y
def mul(x, y): return x * y
def div(x, y): return x / y if y != 0 else "Cannot divide by zero"

x = float(input("Enter first number: "))
op = input("Enter operator (+ - * /): ")
y = float(input("Enter second number: "))

ops = {'+': add, '-': sub, '*': mul, '/': div}
print("Result:", ops[op](x, y))

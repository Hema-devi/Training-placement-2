lst = list(map(int, input("Enter numbers: ").split()))
evens = [x for x in lst if x % 2 == 0]
print("Even numbers:", evens)

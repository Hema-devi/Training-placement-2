lst = list(map(int, input("Enter numbers: ").split()))
even_sum = sum(i for i in lst if i % 2 == 0)
print("Sum of even numbers:", even_sum)

for num in range(100, 1000):
    total = sum(int(d) ** 3 for d in str(num))
    if total == num:
        print(num, end=" ")

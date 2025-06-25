lst = input("Enter numbers separated by space: ").split()
seen = set()
duplicates = set()

for num in lst:
    if num in seen:
        duplicates.add(num)
    else:
        seen.add(num)

print("Duplicates:", duplicates if duplicates else "No duplicates")

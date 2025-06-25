from collections import Counter

s = input("Enter string: ")
freq = Counter(s)
for k, v in freq.items():
    print(f"{k}: {v}")

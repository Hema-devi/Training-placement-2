text = input("Enter text: ")
upper = lower = digit = special = 0

for char in text:
    if char.isupper(): upper += 1
    elif char.islower(): lower += 1
    elif char.isdigit(): digit += 1
    else: special += 1

print("Uppercase:", upper)
print("Lowercase:", lower)
print("Digits:", digit)
print("Special:", special)

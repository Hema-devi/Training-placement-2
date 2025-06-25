s = input("Enter string: ").lower()
vowels = consonants = 0
for c in s:
    if c.isalpha():
        if c in 'aeiou':
            vowels += 1
        else:
            consonants += 1
print("Vowels:", vowels)
print("Consonants:", consonants)

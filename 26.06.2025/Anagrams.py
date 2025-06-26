s1 = input("First string: ").lower().replace(" ", "")
s2 = input("Second string: ").lower().replace(" ", "")

print("Anagrams" if sorted(s1) == sorted(s2) else "Not Anagrams")

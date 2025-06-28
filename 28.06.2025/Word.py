sentence = input("Enter sentence: ").split()
palindromes = [word for word in sentence if word == word[::-1]]
print("Palindromic words:", palindromes)

letters = input()
s = input()

possibles = set()

for letter in letters:
    for i in range(len(s)):
        # all possible additions
        possibles.add(s[:i] + letter + s[i:])
        # all possible letter changes
        possibles.add(s[0:i] + letter + s[i+1:len(s)+1])
        # all possible deletions
        possibles.add(s[0:i] + s[i+1:len(s)+1])
    possibles.add(s + letter)

possibles.discard(s)
possibles = list(possibles)
possibles.sort()

for possible in possibles:
    print(possible)
# COMPLETE

t = input()
s = input()

l = len(s)

shifts = set()
shifts.add(s)

for i in range(l-1):
    s = s[1:]+s[0]
    shifts.add(s)

cyc = False
for string in shifts:
    for i in range(0, len(t)-l+1):
        if string == t[i:i+l]:
            cyc = True

if cyc == True:
    print("yes")
else:
    print("no")
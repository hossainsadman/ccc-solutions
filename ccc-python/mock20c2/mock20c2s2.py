n = int(input())
q = input()

s = q[0]
for i in range(1, len(q)):
    l = q[i]
    if s[i-1] < l or s[0] < l:
        s = ''.join([s,l])
    else:
        s = ''.join([l,s])

print(s)
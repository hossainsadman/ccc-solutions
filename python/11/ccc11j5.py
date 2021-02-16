n = int(input())
paths = [1 for i in range(n+1)]

for i in range(1,n):
    b = int(input())
    paths[b] = paths[b] * (1 + paths[i])

print(paths[n])
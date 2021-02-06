# COMPLETE

n = int(input())

line = input().split(" ")
for i in range(len(line)):
    line[i] = int(line[i])
line.sort()

for i in line:
    print(i, end=" ")
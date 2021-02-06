n = int(input())

comps = dict()
vals = list()
for i in range(n):
    line = input().split(" ")
    val = 2*int(line[1])+3*int(line[2])+int(line[3])
    vals.append(val)
    comps[line[0]] = val

vals.sort()

if n == 1:
    print(comps.get(vals[0]))
else:
    tmp = comps.get(vals[0])
    tmp1 = comps.get(vals[1])
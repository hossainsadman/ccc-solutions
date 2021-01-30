# t = int(input())
# g = int(input())

g = 2

unplayed = "------"
points = [0,0,0,0]

for i in range(g):
    line = input().split(" ")
    for i in range(len(line)):
        line[i] = int(line[i])

    if line[2] > line[3]:
        points[line[0]-1] += 3
    elif line[2] < line[3]:
        points[line[1]-1] += 3
    else:
        points[line[0]-1] += 1
        points[line[1]-1] += 1

    teams = {line[0],line[1]}
    unplayed.remove(teams)
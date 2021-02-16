import copy

n, m = input().split(" ")
n = int(n)
m = int(m)

adjlist = {}
edges = []
for i in range(1,n+1):
    adjlist[i] = []
for i in range(1,n+1):
    a, b = input().split(" ")
    adjlist[int(a)].append(int(b))
    edges.append([int(a),int(b)])

reached = [False for i in range(m)]
for i in range(n):
    edge = edges[i]

    new_adjlist = copy.deepcopy(adjlist)
    del new_adjlist[edge[0]][new_adjlist[edge[0]].index(edge[1])]

    visited = [False for i in range(1,n+1)]
    q = [1]
    while len(q) > 0:
        cur = q.pop(0)
        if visited[cur]:
            continue
        visited[cur] = True
        for adjNode in new_adjlist[cur]:
            if adjNode == n:
                reached[i] = True
                break
            q.append(adjNode)

for bool in reached:
    if bool == True:
        print("YES")
    else:
        print("NO")
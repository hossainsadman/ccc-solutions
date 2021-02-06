from math import inf
from collections import deque

class graph():
    adjlist = dict()
    dist = dict()
    # endPages = set()
    shortest = inf

    def __init__(self, pages) -> None:
        self.pages = pages

    def addEdge(self, src, dest):
        if src not in self.adjlist:
            self.adjlist[src] = list()
        self.adjlist[src].append(dest)
    
    def dijkstra(self, src):
        visited = set()
        self.dist = {}
        for i in range(1, self.pages+1):
            self.dist[i] = inf
        self.dist[src] = 1
        q = deque()
        q.appendleft(src)
        while len(q)>0:
            cur = q.popleft()
            visited.add(cur)
            if cur not in self.adjlist.keys():
                if g.dist[cur] < self.shortest:
                    self.shortest = g.dist[cur]
                continue
            for adjNode in self.adjlist[cur]:
                self.dist[adjNode] = min(self.dist[adjNode], self.dist[cur]+1)
                if adjNode not in visited:
                    q.appendleft(adjNode)

n = int(input())
g = graph(n)
for i in range(1,n+1):
    text = input().split(" ")
    for j in range(1,int(text[0])+1):
        g.addEdge(i, int(text[j]))

g.dijkstra(1)

if inf in g.dist.values():
    print("N")
else:
    print("Y")
print(g.shortest)
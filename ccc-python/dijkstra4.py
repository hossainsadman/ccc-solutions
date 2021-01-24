from collections import deque
from math import inf


class graph:

    adjlist = {}
    dist = {}
    nodes = set()

    def __init__(self):
        pass

    def addEdge(self, src, dest, weight):
        if src not in self.adjlist:
            self.adjlist[src] = {dest:weight}
        self.adjlist[src][dest] = weight
        
        self.nodes.add(src)
        self.nodes.add(dest)

    # def adjNodes(self, src):
    #     try: 
    #         return self.adjlist[src]
    #     except KeyError:
    #         pass

    # def edgeWeight(self, src, dest):
    #     return self.adjlist[src][dest]

    def dijkstra(self, src):
        self.dist = {node: inf for node in self.nodes}
        self.dist[src] = 0

        q = deque()
        q.append(src)

        while len(q)>0:
            cur = q.popleft()
            if cur not in self.adjlist.keys():
                continue
            for adjNode in self.adjlist[cur].keys():
                self.dist[adjNode] = min(self.dist[adjNode],self.dist[cur]+self.adjlist[cur][adjNode])
                q.append(adjNode)

g = graph()
g.addEdge(1,2,10)
g.addEdge(1,3,20)
g.addEdge(1,7,20)
g.addEdge(2,4,50)
g.addEdge(2,5,10)
g.addEdge(3,4,20)
g.addEdge(3,5,33)
g.addEdge(4,6,2)
g.addEdge(5,6,1)
g.dijkstra(1)
print(g.dist)
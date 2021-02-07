n = int(input())

pages = {}
for i in range(n):
    pages[i] = []
    page = input().split(" ")
    for j in page[1:]:
        pages[i].append(int(j)-1)

dist = [10001 for i in range(n)]
dist[0] = 1
visited = [False for i in range(n)]

q = [0]
while len(q)>0:
    cur = q.pop(0)
    if visited[cur]:
        continue
    visited[cur] = True

    for adjPage in pages[cur]:
        if dist[cur]+1 < dist[adjPage]:
            dist[adjPage] = dist[cur]+1
            q.append(adjPage)

if False in visited:
    print("N")
else:
    print("Y")

endPages = []
for page in pages:
    if len(pages[page]) == 0:
        endPages.append(dist[page])

print(min(endPages))
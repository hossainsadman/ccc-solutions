motels = [0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000]

a = int(input()), b = int(input())
n = int(input())
for i in range(n):
    motels.append(int(input()))
motels.sort()

dists = []
for i in range(1, len(motels)):
    dists.append(motels[i]-motels[i-1])

print(dists)
motels = [0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000]

min = int(input())
max = int(input())

n = int(input())
motels = sorted(motels + [int(input()) for i in range(n)])

paths = [0 for i in motels]
paths[0] = 1

for i in range(len(motels)):
    if paths[i] > 0:
        for j in range(1, len(motels)):
            if min <= motels[j] - motels[i] <= max:
                paths[j] += paths[i]

print(paths[-1])
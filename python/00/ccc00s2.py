n = int(input())
streams = list()

while True:
    num = int(input())
    if num == 99:
        stream = int(input())
        percent_left = int(input())
        tmp = streams[stream-1]
        streams[stream-1] = streams[stream-1] * float(percent_left*0.01)
        streams.insert(stream, tmp-streams[stream-1])
    elif num == 88:
        stream = int(input())
        streams[stream-1] += streams[stream]
        del streams[stream]
    elif num == 77:
        break
    else:
        streams.append(num)

for stream in streams:
    print(round(stream), end=" ")
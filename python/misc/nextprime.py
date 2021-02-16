# https://dmoj.ca/problem/bf3

from math import sqrt
n = int(input())

def isPrime(num):
    if num % 2 != 0:
        for i in range(3, int(sqrt(num))+1):
            if num % i == 0:
                return False
    else:
        return False
    return True

if n == 1 or n == 2:
    print(2)
else:
    while True:
        if isPrime(n):
            print(n)
            break
        else:
            n += 1
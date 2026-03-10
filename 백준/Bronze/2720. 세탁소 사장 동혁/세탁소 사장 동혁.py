t = int(input())
result = []

for i in range(t):
    a = int(input())

    q = a//25
    a %= 25

    d = a//10
    a %= 10

    n = a//5
    a %= 5

    p = a//1
    a %= 1

    result.append((q,d,n,p))

for i in result:
    print(*i)
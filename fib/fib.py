import time
def fib(n):
	if(n<=0):
		return 0
	if(n==1):
		return 1
	return fib(n-1)+fib(n-2)


def dpfib(n, cache):
	if(n<=0):
		return 0
	if(n==1):
		return 1
	if(cache[n] > 0):
		return cache[n] 
	nthfib = dpfib(n-1, cache) + dpfib(n-2, cache)
	cache[n] = nthfib
	return nthfib

n = 35
cache = [0]*(n+1)
t1 = time.time()
print(dpfib(n,cache))
t2 = time.time()
print((t2-t1))

t1 = time.time()
print(fib(n))
t2 = time.time()
print((t2-t1))

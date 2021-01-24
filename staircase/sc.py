

def solve(n):
	# can solve an n-1 and an n-2 problem
	if(n==1):
		return 1
	if(n==2):
		return 2
	return solve(n-1)+solve(n-2)

n = 20
print(solve(20))
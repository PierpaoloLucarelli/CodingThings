import math  
def n_ways(n):
	d = math.floor(n/2)
	# print("D", d)
	sol = 1
	for i in range(1,d+1):
		extra = 0
		if(i%2==0):
			extra = 1
		sol+= (n-i)*min(i,n-(2*i)+extra)
	return sol

for i in range(1,10):
	print("n="+str(i) + " = " + str(n_ways(i)))
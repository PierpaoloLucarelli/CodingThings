def _permute(pref, s):
	if(len(s)==0):
		print(pref)
	else:
		for i in range(len(s)):
			_permute(pref+s[i], s[0:i]+s[i+1:len(s)])

def permute(s):
	_permute("",s)


def fact(n):
	if(n==0):
		return 1
	else:
		return n * fact(n-1)
s="ABCDE"
permute(s)
print("total number of permutations:" + str(fact(len(s))))



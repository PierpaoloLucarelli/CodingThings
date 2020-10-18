import random
def quickSort(a):
	if (len(a)<=1):
		return a
	pivot = a.pop(random.randint(0,len(a)-1)) # slow 
	left = []
	right = []
	for i in a:
		if(i <= pivot):
			left.append(i)
		else:
			right.append(i)
	return quickSort(left) + [pivot] + quickSort(right)


a = [6,4,2,5,2,2,3,32,1,3,8,10,2]
print(quickSort(a))



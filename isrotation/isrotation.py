def isRotation(w1,w2):
	if(len(w1) != len(w2)):
		return False
	first = w2[0]
	for j in range(len(w2)):
		if(w1[j]==first):
			for i in range(len(w2)):
				if(w2[i] != w1[(j+i)%len(w1)]):
					return False
			return True
	return False




w1 = "pierpaolo"
w2 = "erpaolopi"




print(isRotation(w1,w2))


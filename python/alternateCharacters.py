T = int(input().strip())

for t in range(T):
	s = list(input().strip())
	res = 0
	i = 1
	while i < len(s):
		while(i < len(s) and s[i] == s[i-1]):
			res+=1
			del s[i]
		i+=1
	print(res)

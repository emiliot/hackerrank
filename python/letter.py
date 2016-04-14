T = int(input().strip())
for t in range(T):
	s = list(input().strip())
	n = len(s)
	res = 0
	for i in range(int(n/2)):
		j = n - i - 1
		if(s[i] == s[j]):
			continue
		a = min(ord(s[i]), ord(s[j]))
		b = max(ord(s[i]), ord(s[j]))
		res += b - a
	print(res)

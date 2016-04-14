T = int(input().strip())

for t in range(T):
	s = list(input().strip())
	r = s[:]
	r.reverse()

	funny = True
	for i in range(1, len(s)):
		funny = funny and abs(ord(s[i]) - ord(s[i-1])) == abs(ord(r[i]) - ord(r[i-1]))

	if funny:
		print("Funny")
	else:
		print("Not Funny")

	
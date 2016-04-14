s = input().strip()
res = [c for c in set(s.lower()) if c.isalpha()]
if len(res) == 26:
	print("pangram")
else:
	print("not pangram")

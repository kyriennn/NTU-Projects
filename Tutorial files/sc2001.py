arr = [4, 9, 1, 5]

# use tuples to make key value pairs of original indexes

n = len(arr)

pairs = [(arr[i], i) for i in range(n)] # create array of tuples, each tuple is (value, index)
pairs.sort()                            # O(nlogn) sorting 

B = [0] * n # create new array B to put in n elements

for position, (value, originalpos) in enumerate(pairs):
    B[originalpos] = position

print(B)



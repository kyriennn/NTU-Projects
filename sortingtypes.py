mylist = [5, 2, 9, 1, 5, 6]

# merge sort : 2 functions, merge and mergesort
#mergesort just splits the list recursively
#merge compares the 2 sorted lists and merges them into one sorted list

def merge(leftlist, rightlist):
    mergedlist = []

    while leftlist and rightlist:
        if leftlist[0] < rightlist[0]:
            mergedlist.append(leftlist[0])
            leftlist.pop(0)
        elif rightlist[0] < leftlist[0]:
            mergedlist.append(rightlist[0])
            rightlist.pop(0)
        else:
            mergedlist.append(rightlist[0])
            rightlist.pop(0)
            mergedlist.append(leftlist[0])
            leftlist.pop(0)
    
    if leftlist:
        mergedlist.extend(leftlist)
    if rightlist:
        mergedlist.extend(rightlist)

    return mergedlist



def mergesort(a):
    #base case
    if len(a) <2 : 
        return a
    
    leftlist = mylist[:len(a)//2]
    rightlist = mylist[len(a)//2:]

    leftlist = mergesort(leftlist)
    rightlist = mergesort(rightlist)

    return merge(leftlist, rightlist)

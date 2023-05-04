def binarySearch(array1,x,low,high):
    while low <=high:
        mid=low+(high-low)//2
        if array1[mid]==x:
            return mid
        elif array1[mid]<x:
            low=mid+1
        else:
            high=mid-1
array1=[6,13,14,25,33,43,51]
x=25
result=binarySearch(array1,x,0,len(array1)-1)

if result!=-1:
    print("ELEMENT IS PRESENT",str(result))
else:
    print("NOT FOUND : ELEMENT IN ARRAY")
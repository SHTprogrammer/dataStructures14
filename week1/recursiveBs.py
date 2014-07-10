'''
recursive binary search in python

'''


def recursiveBs(array,k):
  # wrapper function that hides indices
  start = 0
  end = len(array) - 1
  result = recursiveInner(array,k,start,end)
  if result == -1:
    print "%d is not in the array" % (k)
  else:
    print "the number %d is in location %d" % (k,result)

  return result


def recursiveInner(a,k,start,end):
  # if the indices are crossed, stop searching (way out #1)
  if start > end:
    failure = -1
    return failure

  # find the midpoint (round down)
  mid = int(start+end)/2
  print "checking between %d and %d" % (start, end)
  print "midpoint: %d" % (mid)

  # success (way out #2)
  if a[mid] == k:
    return mid

  # if target is less than mid, increment end and go deeper
  elif k < a[mid]:
    end = mid - 1
    result = recursiveInner(a,k,start,end)
    return result

  # if target is more than mid, increment start and go deeper
  elif k > a[mid]:
    start = mid + 1
    result = recursiveInner(a,k,start,end)
    return result

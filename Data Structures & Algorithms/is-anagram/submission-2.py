class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        arr1 = []
        for i in s:
            arr1.append(i)
        arr2 = []
        for i in t:
            arr2.append(i)
        arr1.sort()
        arr2.sort()
        if arr1==arr2:
            return True
        else:
            return False
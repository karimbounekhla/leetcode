class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        d = {};
        # Create frequency dict
        for i in arr:
            d[i] = d.get(i, 0) + 1;
            
        # Check whether set of unique values is equal to number of values
        return len(d.values()) == len(set(d.values()))
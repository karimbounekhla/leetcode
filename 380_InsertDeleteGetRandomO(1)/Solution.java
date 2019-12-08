class RandomizedSet {
    Map<Integer, Integer> theMap;
    List<Integer> theList;
    Random rand;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        // HashMap to store value-index pair
        theMap = new HashMap<>();
        theList = new ArrayList<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (theMap.containsKey(val)) {
            return false;
        }
        // Add to end of list and store index in HashMap for O(1) lookup
        theList.add(val);
        theMap.put(val, theList.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!theMap.containsKey(val)) {
            return false;
        }
        // Swap value to remove with last index
        int idxToRemove = theMap.get(val);
        Collections.swap(theList, idxToRemove, theList.size()-1);
        // Update Map with new index
        theMap.put(theList.get(idxToRemove), idxToRemove);
        // Remove value
        theList.remove(theList.size()-1);
        theMap.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        if (theList.size() == 0) {
            return -1;
        }
        int r = rand.nextInt(theList.size());
        return theList.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
class RandomizedCollection {
    // Use Hashmap w Val, List<Entry> pair
    Map<Integer, List<Entry>> map;
    List<Entry> list;

    class Entry {
        int index;
        int val;
        public Entry(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public RandomizedCollection() {
        map = new HashMap<>();
        list = new ArrayList<Entry>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        // Index is always the end of the list
        Entry e = new Entry(val, list.size());

        // Get list of indices for that val
        List<Entry> llist = map.getOrDefault(val, new ArrayList<Entry>());
        llist.add(e);
        map.put(val, llist);
        list.add(e);

        // True only if first item to have been added
        return llist.size()==1;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        // Check if contains key
        if(!map.containsKey(val)) return false;
        
        List<Entry> llist = map.get(val);
        Entry toRemove = llist.get(llist.size()-1);
        llist.remove(llist.size()-1);
        Entry last = list.get(list.size()-1);
        last.index = toRemove.index;
        list.set(toRemove.index, last);
        list.remove(list.size()-1);
        if(llist.size()==0) map.remove(val);
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        if(map.size() == 0) return -1;
        int next = new Random().nextInt(list.size());
        return list.get(next).val;
    }
}
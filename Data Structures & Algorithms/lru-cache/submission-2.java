class LRUCache {
    LinkedHashMap<Integer, Integer> map;
    int capacityVal = 0;

    public LRUCache(int capacity) {
        capacityVal = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            return map.get(key);
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        map.put(key, value);
        if (map.size() > capacityVal) {
            int oldestKey = map.keySet().iterator().next();
            map.remove(oldestKey);
        }
    }
}
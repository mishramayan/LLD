public class LRUCacheApp {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCacheImpl(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.get(2);
        lruCache.put(4,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }
}

/**
 * Input
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2],        [1, 1], [2, 2], [1], [3, 3], [2], [4, 4],  [1],   [3],  [4]]
 * Output
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 * */
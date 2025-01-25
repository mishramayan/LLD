import java.util.*;

public class LRUCacheImpl implements LRUCache{
    int capacity;
    Map<Integer, Integer> cacheMap;
    Deque<Integer> cacheQueue;

    public LRUCacheImpl(int capacity){
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.cacheQueue = new ArrayDeque<>();
    }

    @Override
    public int get(int key) {
        try{
            if(cacheQueue.contains(key)){
                System.out.println(cacheMap.get(key));
                cacheQueue.remove(key);
                cacheQueue.addLast(key);
                return cacheMap.get(key);
            }else{
                System.out.println(-1);
            }
        }catch (Exception e){
            new IllegalAccessError(e.getMessage());
        }
        return -1;
    }

    @Override
    public void put(int key, int value) {
        try{
            cacheMap.put(key, value);
            if(cacheQueue.size() >= capacity){
                cacheQueue.removeFirst();
                cacheQueue.addLast(key);
                System.out.println("PUT method");
            }else{
                cacheQueue.addLast(key);
                System.out.println("PUT method");
            }
        }catch (Exception e){
            new IllegalArgumentException(e.getMessage());
        }
    }
}

/**
 * Input
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * Output
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 * */
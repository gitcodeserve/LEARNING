package com.learning.datastructure.cache;

import java.util.LinkedHashMap;
import java.util.Map;


// Create LRU cache with LinkedHashMap.
// We need to override removeEldestEntry with a condition.
// If the size value of map is greater than current size then remove the first few elements from map.
public class LRUCache<K, V> extends LinkedHashMap {

    private int size;

    private LRUCache(int size){
        super(size, 0.75f, true);
        this.size = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > size;
    }

    public static <K, V> LRUCache<K, V> newInstance(int size) {
        return new LRUCache<K, V>(size);
    }
}

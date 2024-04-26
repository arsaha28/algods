package com.linkedlist.lrucache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CacheManager {
    Map<String,CacheElement> cacheMap = new HashMap<>();
    LinkedList<CacheElement> cacheList = new LinkedList<>();
    int size = 3;

    public void put(String key,String value) {
        if (cacheMap.containsKey(key)) {
            CacheElement cacheElement = cacheMap.get(key);
            cacheElement.value = value;
            cacheList.remove(key);
            cacheList.addFirst(new CacheElement(key, value));
        } else if (cacheList.size() == size) {
            CacheElement cacheElement = cacheList.removeLast();
            cacheMap.remove(cacheElement.key);
            CacheElement newElement = new CacheElement(key, value);
            cacheMap.put(key, newElement);
            cacheList.addFirst(newElement);
        }else{
            CacheElement newElement = new CacheElement(key, value);
            cacheMap.put(key, newElement);
            cacheList.addFirst(newElement);
        }
    }

    public String get(String key) {
        if(cacheMap.containsKey(key)){
            CacheElement cacheElement = cacheMap.get(key);
            cacheList.remove(key);
            cacheList.addFirst(cacheElement);
            return cacheElement.value;
        }else {
            return null;
        }
    }
}

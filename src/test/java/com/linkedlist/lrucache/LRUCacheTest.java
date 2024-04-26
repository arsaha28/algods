package com.linkedlist.lrucache;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void testLRUCache() {
        CacheManager cacheManager = new CacheManager();
        cacheManager.put("key1", "value1");
        cacheManager.put("key2", "value2");
        cacheManager.put("key3", "value3");
        cacheManager.put("key4", "value4");
        Assert.assertNull(cacheManager.get("key1"));
        Assert.assertTrue(cacheManager.cacheList.getFirst().value.equals("value4"));
        Assert.assertTrue(cacheManager.cacheList.getLast().value.equals("value2"));
    }
}

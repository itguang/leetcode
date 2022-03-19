package LRU;

import org.junit.jupiter.api.Assertions;

/**
 * @author itguang
 * @date 2022-03-17 17:22
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        LRUCache lruCache = new LRUCache(5);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        Assertions.assertEquals(2, lruCache.get(2));
        Assertions.assertEquals(lruCache.getHeadNode().getKey(),2);
        Assertions.assertEquals(lruCache.getTailNode().getKey(),1);

        lruCache.put(4, 4);
        lruCache.put(5, 5);
        lruCache.put(6, 6);
        Assertions.assertEquals(-1, lruCache.get(1));
        Assertions.assertEquals(lruCache.getHeadNode().getKey(),6);
        Assertions.assertEquals(lruCache.getTailNode().getKey(),3);

        lruCache.put(7, 7);
        Assertions.assertEquals(lruCache.getHeadNode().getKey(),7);
        Assertions.assertEquals(-1, lruCache.get(3));
    }
}

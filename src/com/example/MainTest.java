package com.example;

import org.junit.jupiter.api.*;

import java.util.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MainTest {

    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";

    int rangeMin = 0, rangeMax = 1000000;
    long t1 = 0;

    //region Set vars
    static Set<Integer> hashSet = new HashSet<>();
    static Set<Integer> treeSet = new TreeSet<>();
    static Set<Integer> linkedHashSet = new LinkedHashSet<>();
    static long hashSetAddDuration = 0;
    static long hashSetFindDuration = 0;
    static long hashSetRemoveDuration = 0;
    static long treeSetAddDuration = 0;
    static long treeSetFindDuration = 0;
    static long treeSetRemoveDuration = 0;
    static long linkedHashSetAddDuration = 0;
    static long linkedHashSetFindDuration = 0;
    static long linkedHashSetRemoveDuration = 0;
    //endregion

    //region List vars
    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();
    static long arrayListAddDuration = 0;
    static long arrayListFindDuration = 0;
    static long arrayListRemoveDuration = 0;
    static long linkedListAddDuration = 0;
    static long linkedListFindDuration = 0;
    static long linkedListRemoveDuration = 0;
    //endregion

    //region Queue vars
    static Queue<Integer> priorityQueue = new PriorityQueue<>();
    static Deque<Integer> arrayDeque = new ArrayDeque<>();
    static long priorityQueueAddDuration = 0;
    static long priorityQueueFindDuration = 0;
    static long priorityQueueRemoveDuration = 0;
    static long arrayDequeAddDuration = 0;
    static long arrayDequeFindDuration = 0;
    static long arrayDequeRemoveDuration = 0;
    //endregion

    //region Map vars
    static Map<Integer, Integer> hashMap = new HashMap<>();
    static Map<Integer, Integer> treeMap = new TreeMap<>();
    static Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    static long hashMapAddDuration = 0;
    static long hashMapFindDuration = 0;
    static long hashMapRemoveDuration = 0;
    static long treeMapAddDuration = 0;
    static long treeMapFindDuration = 0;
    static long treeMapRemoveDuration = 0;
    static long linkedHashMapAddDuration = 0;
    static long linkedHashMapFindDuration = 0;
    static long linkedHashMapRemoveDuration = 0;
    //endregion

    //region Set implementations

    //region Add tests
    @Test
    @Order(1)
    void hashSetAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            hashSet.add(i);
        }
        hashSetAddDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(2)
    void treeSetAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            treeSet.add(i);
        }
        treeSetAddDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(3)
    void linkedHashSetAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            linkedHashSet.add(i);
        }
        linkedHashSetAddDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Find tests
    @Test
    @Order(4)
    void hashSetFindTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            hashSet.contains(i);
        }
        hashSetFindDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(5)
    void treeSetFindTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            treeSet.contains(i);
        }
        treeSetFindDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(6)
    void linkedHashSetFindTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            linkedHashSet.contains(i);
        }
        linkedHashSetFindDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Remove tests
    @Test
    @Order(7)
    void hashSetRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            hashSet.remove(i);
        }
        hashSetRemoveDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(8)
    void treeSetRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            treeSet.remove(i);
        }
        treeSetRemoveDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(9)
    void linkedHashSetRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            linkedHashSet.remove(i);
        }
        linkedHashSetRemoveDuration = System.currentTimeMillis() - t1;
    }
    //endregion tests

    //endregion

    //region List implementations

    //region Add tests
    @Test
    @Order(10)
    void arrayListAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            arrayList.add(i);
        }
        arrayListAddDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(11)
    void linkedListAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            linkedList.add(i);
        }
        linkedListAddDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Find tests
    @Test
    @Order(12)
    void arrayListFindTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            arrayList.get(i);
        }
        arrayListFindDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(13)
    void linkedListFindTest() {
        for (int i = rangeMin; i < rangeMax/100; i++) {
            linkedList.get(i);
        }
        linkedListFindDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Remove tests
    @Test
    @Order(14)
    void arrayListRemoveTest() {
        for (int i = rangeMin; i < rangeMax/100; i++) {
            arrayList.remove(i);
        }
        arrayListRemoveDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(15)
    void linkedListRemoveTest() {
        for (int i = rangeMin; i < rangeMax/100; i++) {
            linkedList.remove(i);
        }
        linkedListRemoveDuration = System.currentTimeMillis() - t1;
    }
    //endregion tests

    //endregion

    //region Queue implementations

    //region Add tests
    @Test
    @Order(16)
    void priorityQueueAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            priorityQueue.add(i);
        }
        priorityQueueAddDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(17)
    void arrayDequeAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            arrayDeque.add(i);
        }
        arrayDequeAddDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Find tests
    @Test
    @Order(18)
    void priorityQueueFindTest() {
        for (int i = rangeMin; i < rangeMax/100; i++) {
            priorityQueue.contains(i);
        }
        priorityQueueFindDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(19)
    void arrayDequeFindTest() {
        for (int i = rangeMin; i < rangeMax/100; i++) {
            arrayDeque.contains(i);
        }
        arrayDequeFindDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Remove tests
    @Test
    @Order(20)
    void priorityQueueRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            priorityQueue.remove(i);
        }
        priorityQueueRemoveDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(21)
    void arrayDequeRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            arrayDeque.remove(i);
        }
        arrayDequeRemoveDuration = System.currentTimeMillis() - t1;
    }
    //endregion tests

    //endregion

    //region Map implementations

    //region Add tests
    @Test
    @Order(22)
    void hashMapAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            hashMap.put(i, i);
        }
        hashMapAddDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(23)
    void treeMapAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            treeMap.put(i, i);
        }
        treeMapAddDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(24)
    void linkedHashMapAddTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            linkedHashMap.put(i, i);
        }
        linkedHashMapAddDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Find tests
    @Test
    @Order(25)
    void hashMapFindTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            hashMap.get(i);
        }
        hashMapFindDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(26)
    void treeMapFindTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            treeMap.get(i);
        }
        treeMapFindDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(27)
    void linkedHashMapFindTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            linkedHashMap.get(i);
        }
        linkedHashMapFindDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //region Remove tests
    @Test
    @Order(28)
    void hashMapRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            hashMap.remove(i);
        }
        hashMapRemoveDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(29)
    void treeMapRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            treeMap.remove(i);
        }
        treeMapRemoveDuration = System.currentTimeMillis() - t1;
    }

    @Test
    @Order(30)
    void linkedHashMapRemoveTest() {
        for (int i = rangeMin; i < rangeMax; i++) {
            linkedHashMap.remove(i);
        }
        linkedHashMapRemoveDuration = System.currentTimeMillis() - t1;
    }
    //endregion

    //endregion

    //region Additional methods
    @BeforeEach
    void startTimer() {
        t1 = System.currentTimeMillis();
    }

    @AfterAll
    static void stopTimer() {
        System.out.println(ANSI_YELLOW + "Set implementations." + ANSI_RESET);
        System.out.format("hashSetAddDuration: %d ms.%n", hashSetAddDuration);
        System.out.format("treeSetAddDuration: %d ms.%n", treeSetAddDuration);
        System.out.format("linkedHashSetAddDuration: %d ms.%n", linkedHashSetAddDuration);
        System.out.format("hashSetFindDuration: %d ms.%n", hashSetFindDuration);
        System.out.format("treeSetFindDuration: %d ms.%n", treeSetFindDuration);
        System.out.format("linkedHashSetFindDuration: %d ms.%n", linkedHashSetFindDuration);
        System.out.format("hashSetRemoveDuration: %d ms.%n", hashSetRemoveDuration);
        System.out.format("treeSetRemoveDuration: %d ms.%n", treeSetRemoveDuration);
        System.out.format("linkedHashSetRemoveDuration: %d ms.%n", linkedHashSetRemoveDuration);

        System.out.println(ANSI_YELLOW + "List implementations." + ANSI_RESET);
        System.out.format("arrayListAddDuration: %d ms.%n", arrayListAddDuration);
        System.out.format("linkedListAddDuration: %d ms.%n", linkedListAddDuration);
        System.out.format("arrayListFindDuration: %d ms.%n", arrayListFindDuration);
        System.out.format("linkedListFindDuration: %d ms.%n", linkedListFindDuration);
        System.out.format("arrayListRemoveDuration: %d ms.%n", arrayListRemoveDuration);
        System.out.format("linkedListRemoveDuration: %d ms.%n", linkedListRemoveDuration);

        System.out.println(ANSI_YELLOW + "Queue implementations." + ANSI_RESET);
        System.out.format("priorityQueueAddDuration: %d ms.%n", priorityQueueAddDuration);
        System.out.format("arrayDequeAddDuration: %d ms.%n", arrayDequeAddDuration);
        System.out.format("priorityQueueFindDuration: %d ms.%n", priorityQueueFindDuration);
        System.out.format("arrayDequeFindDuration: %d ms.%n", arrayDequeFindDuration);
        System.out.format("priorityQueueRemoveDuration: %d ms.%n", priorityQueueRemoveDuration);
        System.out.format("arrayDequeRemoveDuration: %d ms.%n", arrayDequeRemoveDuration);

        System.out.println(ANSI_YELLOW + "Map implementations." + ANSI_RESET);
        System.out.format("hashMapAddDuration: %d ms.%n", hashMapAddDuration);
        System.out.format("treeMapAddDuration: %d ms.%n", treeMapAddDuration);
        System.out.format("linkedHashMapAddDuration: %d ms.%n", linkedHashMapAddDuration);
        System.out.format("hashMapFindDuration: %d ms.%n", hashMapFindDuration);
        System.out.format("treeMapFindDuration: %d ms.%n", treeMapFindDuration);
        System.out.format("linkedHashMapFindDuration: %d ms.%n", linkedHashMapFindDuration);
        System.out.format("hashMapRemoveDuration: %d ms.%n", hashMapRemoveDuration);
        System.out.format("treeMapRemoveDuration: %d ms.%n", treeMapRemoveDuration);
        System.out.format("linkedHashMapRemoveDuration: %d ms.%n", linkedHashMapRemoveDuration);



    }
    //endregion

}
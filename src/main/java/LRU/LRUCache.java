package LRU;

import java.util.HashMap;

/**
 * @author itguang
 * @date 2022-03-17 15:39
 */
public class LRUCache {

    private Node headNode;

    private Node tailNode;

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    private HashMap<Integer, Node> map;

    private int capacity;


    class Node {
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        private Node pre;
        private Node next;
        private int key;
        private int value;

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        int value = node.getValue();
        moveToHead(node);
        return value;
    }


    public void put(int key, int value) {
        // 容量不足
        if (map.size() == capacity) {
            // 找到 链表末尾的值，在map中移除
            map.remove(tailNode.getKey());
            System.out.println(String.format("map remove key:%d", tailNode.getKey()));
            removeTailNode();
        }
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.setValue(value);
            map.put(key, node);
            moveToHead(node);
            return;
        }

        Node node = new Node(key, value);
        moveToHead(node);
        addToHead(node);
        map.put(key, node);
    }

    private void addToHead(Node node) {
        node.next = headNode;
        headNode.pre = node;
    }

    private void moveToHead(Node node) {
        System.out.println(String.format("moveToHead key:%d", node.getKey()));
        if (headNode == null) {
            headNode = node;
            tailNode = node;
            return;
        }
        System.out.println(String.format("exchange- %d(原 head) <-> %d（新 head）", headNode.key, node.key));
        Node next = node.getNext();
        if (next != null) {
            headNode.setNext(next);
            next.setPre(headNode);
        }
        headNode.setPre(node);

        node.setNext(headNode);
        node.setPre(null);

        headNode = node;
    }

    private void removeTailNode() {
        System.out.println(String.format("removeTailNode key:%d", tailNode.getKey()));
        Node pre = tailNode.getPre();
        pre.setNext(null);
        tailNode = pre;
    }
}

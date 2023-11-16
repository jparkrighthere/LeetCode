import java.util.*;

class Trie {
    class Node {
        HashMap<Character,Node> keys;
        boolean exist;

        public Node() {
            keys = new HashMap<>();
            exist = false;
        }
    }

    Node node;

    public Trie() {
        node = new Node();
    }
    
    public void insert(String word) {
        Node head = node;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            Node next = head.keys.get(c);
            if (next == null) {
                next = new Node();
                head.keys.put(c,next);
            }
            head = head.keys.get(c);
        }
        head.exist = true;
    }
    
    public boolean search(String word) {
        Node head = node;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (!head.keys.containsKey(c)) {
                return false;
            }
            head = head.keys.get(c);
        }
        return head.exist;
    }
    
    public boolean startsWith(String prefix) {
        Node head = node;
        char[] arr = prefix.toCharArray();
        for (char c : arr) {
            if (!head.keys.containsKey(c)) {
                return false;
            }
            head = head.keys.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
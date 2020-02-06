package Lesson10exercise;

public class SimplePair<K,V> {
    private K key;
    private V value;

    SimplePair(K k, V v) {
        key = k;
        value = v;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String [] args) {
        SimplePair<Integer, String> pair = new SimplePair<>(1, "Kiros");
        SimplePair<Integer, String> pair2 = new SimplePair<>(2, "Liak");
        SimplePair rawpair = new SimplePair(3, "fake");
        int x = pair.getKey();
        int y = (int) rawpair.getKey();
    }
}

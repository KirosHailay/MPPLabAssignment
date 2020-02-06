package Lesson10exercise;

public class GenericImplementation<K,V> implements Pair<K,V> {

    K key;
    V value;
    public GenericImplementation(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

package be.oak3.generics;

/**
 * Created by vangike on 11/04/2017.
 */
public class Dictionary<K, V> {

    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key.toString() + ": " + value.toString();
    }

    public static void main(String[] args) {
        Dictionary<Integer, String> dictionary = new Dictionary<>();
        dictionary.setKey(1);
        dictionary.setValue("een");

        System.out.println(dictionary);
    }
}

package _09_Generic.Paractice;

class Pair <K, V> {
    private K key;
    private V Value;

    public Pair(K key, V value) {
        this.key = key;
        Value = value;
    }

    public V getValue() {
        return Value;
    }

    public K getKey() {
        return key;
    }
}
public class Paractice1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One",1);
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");

        System.out.println("Key : " + pair1.getKey() + ", Value :" + pair1.getValue());
        System.out.println("Key : " + pair2.getKey() + ", Value :" + pair2.getValue());
    }
}

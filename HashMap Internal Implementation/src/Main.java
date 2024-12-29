//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        MyHashMap<Integer, String> myHashMap = new MyHashMap<Integer, String>(7);
        myHashMap.put(1, "hi");
        myHashMap.put(2, "my");
        myHashMap.put(3, "name");
        myHashMap.put(4, "is");
        myHashMap.put(5, "Mayan!");
        myHashMap.put(6, "how");
        myHashMap.put(7, "are");
        myHashMap.put(8, "you");
        myHashMap.put(9, "doing?");

        String value = myHashMap.get(8);
        System.out.println(value);
    }
}
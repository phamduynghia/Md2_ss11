package bt8;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add(0, "Hello");
        newList.addLast("World!");
        newList.addLast("Hehe");
        newList.addFirst("Dương Dolce");
        System.out.println(newList);
        newList.remove(3);
        System.out.println(newList);
    }
}
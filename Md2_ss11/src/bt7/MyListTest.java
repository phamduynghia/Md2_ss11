package bt7;
// Lớp MyListTest
public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add(1, "Blueberry");

        System.out.println("Phần tử tại vị trí 2: " + list.get(2));

        list.set(0, "Apricot");

        list.remove(3);

        System.out.println("Kích thước của danh sách: " + list.size());

        System.out.println("Danh sách có chứa 'Banana': " + list.contains("Banana"));
    }
}

package bt4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  Tạo 1 list số nguyên
        List<Integer> numbers = new ArrayList<>();
        //  Thêm phần tử vào list
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(6);
        numbers.add(3);

        System.out.println("Danh sách trước khi sắp xếp: " + numbers);

        //  Sắp xếp danh sách theo thứ tự tăng dần sử dụng thuật toán nổi bọt (Bubble Sort)
        bubbleSort(numbers);

        System.out.println("Danh sách sau khi sắp xếp: " + numbers);
    }

    // Thuật toán nổi bọt (Bubble Sort) để sắp xếp danh sách
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Hoán đổi phần tử nếu phần tử hiện tại lớn hơn phần tử kế tiếp
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

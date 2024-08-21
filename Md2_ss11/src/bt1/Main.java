package bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách list1 với các số nguyên ngẫu nhiên
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 100)); // Thêm số ngẫu nhiên từ 0 đến 99
        }

        // In ra danh sách ngẫu nhiên
        System.out.println("Danh sách số nguyên ngẫu nhiên: " + list1);

        // Sử dụng Collections.max() để tìm phần tử lớn nhất
        int maxElement = Collections.max(list1);
        System.out.println("Phần tử có giá trị lớn nhất: " + maxElement);

        // Sử dụng Collections.reverse() để đảo ngược vị trí các phần tử
        Collections.reverse(list1);
        System.out.println("Danh sách sau khi đảo ngược: " + list1);

        // Sử dụng Collections.sort() để sắp xếp các phần tử theo thứ tự tăng dần
        Collections.sort(list1);
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + list1);

        // Tạo danh sách list2 và sao chép tất cả phần tử từ list1 sang list2
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);

        // In ra danh sách list2
        System.out.println("Danh sách list2 (sao chép từ list1): " + list2);
    }
}


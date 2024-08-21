package bt6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Danh sách ban đầu: " + numbers);

        // Tạo 1 list mới để chứa các phần tử không trùng lặp
        List<Integer> uniqueNumbers = new ArrayList<>();

        // Duyệt list cũ và thêm các phần tử không trùng lặp vào list mới
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }

        System.out.println("Danh sách sau khi xóa các phần tử trùng lặp: " + uniqueNumbers);
    }
}

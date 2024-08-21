package bt5;

    import java.util.ArrayList;
    import java.util.List;

    public class Main {
        public static void main(String[] args) {
            //  Tạo 1 list số nguyên
            List<Integer> numbers = new ArrayList<>();
            //  Thêm phần tử vào list
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);
            numbers.add(10);
            System.out.println("Danh sách ban đầu: " + numbers);

            //  Tạo list số nguyên mới để lưu những số nguyên không chia hết cho 2
            List<Integer> oddNumbers = new ArrayList<>();

            //  Duyệt list numbers và gán những số thỏa mãn điều kiện vào list mới
            for (Integer number : numbers) {
                if (number % 2 != 0) { // Kiểm tra nếu số không chia hết cho 2 (là số lẻ)
                    oddNumbers.add(number);
                }
            }

            System.out.println("Danh sách sau khi xóa các số chẵn: " + oddNumbers);
        }
    }


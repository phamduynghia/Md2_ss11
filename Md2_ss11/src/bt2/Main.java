package bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String input = "Rikkei Academy để nông dân biết code";

        List<String> words = new ArrayList<>();

        // Convert chuỗi ở bước 1 thành các phần tử trong mảng (Array) rồi gán vào list
        String[] wordArray = input.split(" ");
        for (String word : wordArray) {
            words.add(word);
        }

        //  Duyệt list và in ra các phần tử có nhiều hơn 3 ký tự
        System.out.println("Các chuỗi có độ dài lớn hơn 3 ký tự:");
        for (String word : words) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}

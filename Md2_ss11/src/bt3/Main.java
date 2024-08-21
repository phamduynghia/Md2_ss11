package bt3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String input = "Học viện Rikkei Academy nơi các học viên học code mỗi ngày";

        String[] wordsArray = input.split(" ");
        List<String> wordsList = new ArrayList<>();
        for (String word : wordsArray) {
            wordsList.add(word);
        }

        //  Tìm ra từ có độ dài ngắn nhất và lưu trữ vào newList
        List<String> newList = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;

        for (String word : wordsList) {
            int wordLength = word.length();
            if (wordLength < minLength) {
                minLength = wordLength;
                newList.clear(); // Xóa danh sách newList để lưu từ mới có độ dài ngắn nhất
                newList.add(word);
            } else if (wordLength == minLength) {
                newList.add(word); // Thêm vào danh sách nếu từ có độ dài bằng minLength
            }
        }

        System.out.println("Những từ có độ dài ngắn nhất:");
        for (String word : newList) {
            System.out.println(word);
        }
    }
}

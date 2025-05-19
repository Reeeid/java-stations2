import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう
        System.out.println(q1());
    }

    public static ArrayList<String> q1() {
        // 問題1: ここから
        ArrayList<String> list = new ArrayList<String>();
        list.add("Tech");
        list.add("Train");
        return list;
        // 問題1: ここまで
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        // 問題2: ここから
        ArrayList<String> foundwords = new ArrayList<String>();
        for (String searchWord : searchWords) {
            for (String word : list) {
                if (word.equals(searchWord)) {
                    foundwords.add(searchWord) ; // 一致する単語が見つかった場合は1を返す
                }
            }
        }
        return foundwords.size();
        // 問題2: ここまで
    }
}

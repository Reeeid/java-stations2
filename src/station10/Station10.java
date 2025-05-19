import java.util.ArrayList;
import java.util.Iterator;

public class Station10 {

    public static void q1(ArrayList<Integer> list) {
        // ここから
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%,9d", list.get(i)));
        if (i != list.size() - 1) {
                sb.append("\r\n");
            }
        }
        System.out.println(sb.toString());
         // ここまで
    }
}

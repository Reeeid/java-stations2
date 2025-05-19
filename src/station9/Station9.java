import java.util.ArrayList;
import java.util.Random;

public class Station9 extends Item{
    ArrayList<Item> itemList = new ArrayList<Item>();

    public static String printOrder(ArrayList<Item> itemList, Random random) {
        // ここから

        //ここから文字を組み立てて価格を表示する
        int totalPrice = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
            sb.append(item.name).append(" ").append(item.price).append("円\r\n");
            totalPrice += item.price;
        }
        sb.append("合計 "+totalPrice+"円\r\n");
        //ここまで価格表示

        //乱数によってキャッシュバック
        int cashback = random.nextInt(100);
        if (cashback % 50 == 0) {
            sb.append("1等: 全額キャッシュバック");
        }else if (cashback % 10 == 0){
            sb.append("2等: 10%キャッシュバック");
        }
        return sb.toString();
        // ここまで
    }
}

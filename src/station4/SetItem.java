import java.util.ArrayList;

public class SetItem extends Item{
    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    String getName(){
        StringBuilder sb = new StringBuilder(name + "(");

        for (int i = 0; i < items.size(); i++) {
            sb.append(items.get(i).name);
            if (i != items.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return  sb.toString();
    }
}

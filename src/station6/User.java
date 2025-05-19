import java.util.Objects;

public class User {
    int id;
    String name;
    String email;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // 同じインスタンスなら等しい
        }
        if (obj == null || getClass() != obj.getClass()) { // 修正: Object -> obj
            return false; // nullまたは異なるクラスなら等しくない
        }
        User user = (User) obj;
        return id == user.id &&
               Objects.equals(name, user.name) &&
               Objects.equals(email, user.email); // 各プロパティを比較
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email); // equalsをオーバーライドしたらhashCodeもオーバーライド
    }
}
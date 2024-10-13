import template.AbstractDisplay;
import template.CharDisplay;
import template.StringDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        //d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로 display 호출가능하며
        //실제 display의 동작은 하위 ㅋ클래스인 CharDisplay나 StringDisplay에서 이루어진다
        d1.display();
        d2.display();
    }
}

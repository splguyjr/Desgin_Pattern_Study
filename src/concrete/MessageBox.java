package concrete;

import framework.Product;

//decochar가 *일때
//***
//*s*
//***의 형태로 출력
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    //자바의 clone 메소드는 자신이나 하위 클래스에서만 호출할 수 있으므로 Product로 clone()을 감싸줄 필요가 있음
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

package template;

public abstract class AbstractDisplay {//이를 abstract class가 아니라 interface로도 구현 가능, 이 경우에는 display()를 final 대신 default로 템플릿 메서드 정의
    //open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //display는 AbstractDisplay에서 구현하는 메소드(처리의 큰 흐름은 상위 클래스에서 결정)
    public final void display() {
        open();
        for (int i=0; i < 5; i++) {
            print();
        }
        close();
    }
}

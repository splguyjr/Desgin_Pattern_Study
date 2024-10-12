package Adapter;

public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);//부모 클래스의 생성자 호출
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

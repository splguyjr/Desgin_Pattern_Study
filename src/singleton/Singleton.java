package singleton;

public class Singleton {
    //static으로 선언된 변수, 객체는 모든 인스턴스에서 공유
    //인스턴스 생성없이도 사용가능한 static method에서는 이러한 static 변수에만 접근가능
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

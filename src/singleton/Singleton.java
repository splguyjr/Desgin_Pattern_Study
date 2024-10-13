package singleton;

public class Singleton {
    private static Singleton singleton = null;

    //private하게 생성자를 막아 외부에서 실수로 생성하는 것을 방지
    private Singleton() {}

    //외부에서 싱글톤 객체 인스턴스를 사용하기 위한 메서드
    //단점: 멀티 쓰레드 환경에서 thread-safe하지 않음
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

package singleton;

public class Singleton_Sync {
    private static Singleton_Sync singleton = null;
    private Singleton_Sync() {}

    //synchronized 키워드를 활용하여 쓰레드가 getInstance() 메소드를 종료할 때까지 lock을 거는 방식
    //단점:최초에 여러 인스턴스가 생기는 것을 방지하기 위한 목적이었지만, 인스턴스가 정상적으로 생성된 이후에도 계속 lock을 걸게 되어 오버헤드
    public static synchronized Singleton_Sync getInstance() {
        if (singleton == null) {
            singleton = new Singleton_Sync();
        }
        return singleton;
    }
}

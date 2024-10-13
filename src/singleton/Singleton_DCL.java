package singleton;

public class Singleton_DCL {
    private static Singleton_DCL singleton = null;
    private Singleton_DCL() {}

    //getInstance가 호출될때마다 바로 synchronized를 통해 lock이 걸리는 것을 피하기 위해,
    //먼저 if문으로 검사하여 생성된 인스턴스가 존재하지 않을 때만 synchronized 활용
    //단점: 컴파일러의 성능 최적화에 의해 명령어 순서가 변경되기에, singleton = new Singleton_DCL();의 부분에서
    //     하나의 쓰레드에 의해 먼저 초기화되어있는 singleton 공간이 다른 쓰레드에 의해 접근당해 이미 null이 아닌 것으로 착각 할 수 있음
    //     이 때문에 하나의 쓰레드가 업데이트한 값을 다른 쓰레드에서 확인할 수 없는 visibility 문제가 발생할 수 있음(캐시 메모리 값을 읽어버림)

    public static Singleton_DCL getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton_DCL();
                }
            }
        }
        return singleton;
    }
}

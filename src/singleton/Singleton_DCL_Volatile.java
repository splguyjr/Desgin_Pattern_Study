package singleton;

public class Singleton_DCL_Volatile {
    private volatile static Singleton_DCL_Volatile singleton = null;
    private Singleton_DCL_Volatile() {}

    // DCL 방식에 volatile 키워드를 추가하여 사용, singleton에 값을 할당하거나 수정할 때 캐시 메모리를 거치지 않고
    // 곧바로 메인 메모리에 업데이트 하게 끔 강제
    // 단점 : 캐시 메모리 + flush를 활용하지 않고 항상 메인 메모리에 곧바로 쓰는 데서 오버헤드 발생

    public static Singleton_DCL_Volatile getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton_DCL_Volatile();
                }
            }
        }
        return singleton;
    }
}

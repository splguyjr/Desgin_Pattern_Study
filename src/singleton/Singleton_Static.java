package singleton;

public class Singleton_Static {
    private static Singleton_Static singletonStatic = new Singleton_Static();

    private Singleton_Static() {}

    //JVM이 Class Loader를 활용해 class path내의 모든 클래스를 로드할 때 미리 인스턴스를 생성해놓는 방식
    //런타임 이전에 이미 인스턴스가 생성되기에 런타임 시의 동시성 제어를 신경 쓸 필요가 없음
    //단점: 클래스가 사용되기도 이전에 메모리 자원에 로드되어있음(static 키워드를 활용했기에)
    //JVM이 클래스를 로드할 때 모든 정적 변수가 초기화되며, 이 과정에서 Singleton_Static 클래스의 정적 변수 singletonStatic 초기화되므로 클래스가 로드
    public static Singleton_Static getInstance() {
        return singletonStatic;
    }

}

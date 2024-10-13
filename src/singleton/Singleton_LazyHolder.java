package singleton;

public class Singleton_LazyHolder {

    private Singleton_LazyHolder() {}

    public static Singleton_LazyHolder getInstance() {
        return LazyHolder.instance;
    }

    //클래스의 내부의 클래스는 외부의 클래스가 초기화될때 초기화되지 않고, 클래스의 static 변수는 클래스를 로딩할 때 초기화되는 것을 이용한 기법
    //LazyHolder라는 Inner Class를 선언해 사용하였으므로 getInstance() 호출 시점에 LazyHolder 클래스가 로딩되며 싱글톤 객체 인스턴스 생성
    private static class LazyHolder {
        private static final Singleton_LazyHolder instance = new Singleton_LazyHolder();
    }

}

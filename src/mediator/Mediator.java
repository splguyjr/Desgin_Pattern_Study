package mediator;

public interface Mediator {
    //중재자가 관리할 멤버(객체)를 생성
    public abstract void createColleagues();

    //각 멤버(객체)가 상태 변화를 중재자에게 보고
    public abstract void colleagueChanged();
}

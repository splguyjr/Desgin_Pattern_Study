package composite;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    //printList메소드는 overloading을 통해 구현, 하위 클래스가 사용시 protected 메소드가 사용됨
    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

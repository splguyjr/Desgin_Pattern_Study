package decorator;

public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row); //row행째 문자열을 얻음

    //모든 행을 표시
    public void show() {
        for (int i =0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}

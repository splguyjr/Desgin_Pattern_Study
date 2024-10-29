package decorator;

public class SideBorder extends Border{
    private char borderChar;
    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }


    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;//문자수는 양쪽에 장식 문자 한개 씩 더한 개수
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}

package strategy;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);//직전에 이겼으면 study(true)로 호출 아니면 study(false)
}

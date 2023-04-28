public class Gold extends Item {

    public int amt;
    private int amount;

    public Gold(int amount){
        super("Gold", String.format("Gold coins a %s", (amount)), amount);
        this.amount = amount;
    }
}

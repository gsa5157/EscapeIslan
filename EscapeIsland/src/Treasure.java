public class Treasure extends LootTreasure {
    private boolean isLooted;

    public Treasure(int x, int y, Gold gold) {
        super(x, y, gold);
        this.isLooted = false;
    }

    public String intro_text() {
        if (isLooted) {
            return "\nThis treasure box seems to be empty.";
        } else {
            return "\nYou've found a treasure box";
        }
    }

    public String loot() {
        if (isLooted) {
            return "\nThe treasure is empty.";
        } else {
            this.isLooted = true;
            return "\nYou open the treasure box and found a valuable treasure!";
        }
    }
}

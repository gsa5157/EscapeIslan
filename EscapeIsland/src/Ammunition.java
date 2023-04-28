public class Ammunition extends Item {

    private int damage;
    private int quantity;

    public Ammunition(String name, String description, int value, int damage, int quantity) {
        super(name, description, value);
        this.damage = damage;
        this.quantity = quantity;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d\nQuantity: %d",
                name, description, value, damage, quantity);
    }
}

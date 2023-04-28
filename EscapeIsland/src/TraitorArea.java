public class TraitorArea extends EnemyRoom {
    private boolean isTraitorDefeated;

    public TraitorArea(int x, int y, Traitor traitor) {
        super(x, y, traitor);
        this.isTraitorDefeated = false;
    }

    public String intro_text() {
        if (isTraitorDefeated) {
            return "\nYou have defeated the traitor and returned to its area.";
        } else {
            return "\nYou have entered a area and see a traitor blocking your path!";
        }
    }

    public boolean fightTraitor() {
        if (isTraitorDefeated) {
            return true;
        } else {
            // Simulate a fight with the ogre
            boolean isPlayerVictorious = (Math.random() < 0.5);

            if (isPlayerVictorious) {
                this.isTraitorDefeated = true;
                return true;
            } else {
                return false;
            }
        }
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}

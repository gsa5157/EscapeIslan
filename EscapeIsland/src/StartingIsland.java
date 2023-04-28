public class StartingIsland extends MapTile {
    public StartingIsland(int x, int y) {
        super(x, y);
    }

    public String intro_text() {
        return "\nYou find yourself in New Island";
    }

    public void modify_player(Player player) {
//Room has no action on player
    }
}

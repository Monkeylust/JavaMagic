package hogwarts.items;

public class Cloak implements Invisible {
    private int capacity;
    private int weight;

    @Override
    public void becomeInvisible() {
        System.out.printf("Людей, которые сейчас под плащом — не видно.");
    }

    @Override
    public void becomeVisible() {
        System.out.printf("Людей, которые сейчас под плащом — видно.");
    }
}
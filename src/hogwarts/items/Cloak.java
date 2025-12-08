/// /////////////////////////////////->FirstTask_Iinterfejsy//////////////////////////////////////////
package hogwarts.items;

public class Cloak implements Invisible {
    private int capacity;
    private int weight;

    public Cloak(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void becomeInvisible() {
        System.out.printf("%nЛюдей, которые сейчас под плащом — не видно.");
    }

    @Override
    public void becomeVisible() {
        System.out.printf("%nЛюдей, которые сейчас под плащом — видно.");
    }
}
/// /////////////////////////////////FirstTask_Iinterfejsy<-//////////////////////////////////////////
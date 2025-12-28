/// /////////////////////////////////->FirstTask_Abstraktnye_klassy//////////////////////////////////////////
package hogwarts.spells;

public class ExpandingSpell extends Spell {
    public ExpandingSpell(String name, String effect, boolean isForbidden) {
        super(name, effect, isForbidden);
    }

    @Override
    public void doMagic() {
        System.out.println("A magnification spell was cast.");
    }
}
/// /////////////////////////////////FirstTask_Abstraktnye_klassy<-//////////////////////////////////////////
/// /////////////////////////////////->FirstTask_Abstraktnye_klassy//////////////////////////////////////////
package hogwarts.spells;

public class ReducingSpell extends Spell {
    public ReducingSpell(String name, String effect, boolean isForbidden) {
        super(name, effect, isForbidden);
    }

    @Override
    public void doMagic() {
        System.out.println("A reduction spell was cast.");
    }
}
/// /////////////////////////////////FirstTask_Abstraktnye_klassy<-//////////////////////////////////////////
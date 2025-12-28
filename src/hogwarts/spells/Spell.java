/// /////////////////////////////////->FirstTask_Abstraktnye_klassy//////////////////////////////////////////
package hogwarts.spells;

public abstract class Spell {
    private final String name;
    private final String effect;
    private final boolean isForbidden;

    public Spell(String name, String effect, boolean isForbidden) {
        this.name = name;
        this.effect = effect;
        this.isForbidden = isForbidden;
    }

    public abstract void doMagic();
}
/// /////////////////////////////////FirstTask_Abstraktnye_klassy<-//////////////////////////////////////////
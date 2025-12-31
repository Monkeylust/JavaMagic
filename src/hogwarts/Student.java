package hogwarts;

import hogwarts.exceptions.SpellCastException;

import java.util.Arrays;

/// /////////////////////////////////->SecondTask///////////////////////////////////////////

public class Student implements Comparable<Student> {
    private String name;
    private String faculty;
    private int age;
    private String[] abilities = new String[3];

    public Student(String name, String faculty, int age, String[] abilities) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAge() {
        return age;
    }

    public String[] getAbilities() {
        return abilities;
    }

    /// /////////////////////////////////->FirstTask_Collections//////////////////////////////////////////
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", age=" + age +
                ", abilities=" + Arrays.toString(abilities) +
                '}';
    }

    /// /////////////////////////////////FirstTask_Collections<-//////////////////////////////////////////

    /// /////////////////////////////////->FirstTask_Isklyucheniya//////////////////////////////////////////
    public void castSpell(Spell spell) {
        if (this.age <= 11) {
            if (spell.getPower() == 1) {
                System.out.printf("%s use spell %s", this.name, spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " still little, for use " + spell.getTitle());
            }
        } else if (this.age <= 12) {
            if (spell.getPower() == 2) {
                System.out.printf("%s use spell %s", this.name, spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " still little, for use " + spell.getTitle());
            }
        } else if (this.age <= 13) {
            if (spell.getPower() == 3) {
                System.out.printf("%s use spell %s", this.name, spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " still little, for use " + spell.getTitle());
            }
        } else if (this.age <= 14) {
            if (spell.getPower() == 4) {
                System.out.printf("%s use spell %s", this.name, spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " still little, for use " + spell.getTitle());
            }
        } else if (this.age <= 15) {
            if (spell.getPower() == 5) {
                System.out.printf("%s use spell %s", this.name, spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " still little, for use " + spell.getTitle());
            }
        } else if (this.age <= 16) {
            if (spell.getPower() == 6) {
                System.out.printf("%s use spell %s", this.name, spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " still little, for use " + spell.getTitle());
            }
        } else if (this.age <= 17) {
            if (spell.getPower() == 7) {
                System.out.printf("%s use spell %s", this.name, spell.getTitle());
            } else {
                /// /////////////////////////////////->TwoTask_Isklyucheniya//////////////////////////////////////////
                throw new SpellCastException(this.name + " still little, for use " + spell.getTitle());
                ////////////////////////////////////TwoTask_Isklyucheniya<-///////////////////////////////////////////
            }
        }
    }
////////////////////////////////////FirstTask_Isklyucheniya<-///////////////////////////////////////////
}
/// //////////////////////////////////SecondTask<-///////////////////////////////////////////
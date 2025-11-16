////////////////////////////////////->SecondTask///////////////////////////////////////////
package __OOP._______one_Klassy_i_Obyekty;

public class _SecondStudent {
    String name;
    String faculty;
    int age;
    String[] abilities = new String[3];

    public _SecondStudent(String name, String faculty, int age, String[] abilities) {
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
}
////////////////////////////////////SecondTask<-///////////////////////////////////////////
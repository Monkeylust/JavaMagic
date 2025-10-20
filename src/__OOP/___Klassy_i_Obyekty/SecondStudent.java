package __OOP.___Klassy_i_Obyekty;

public class SecondStudent {
    String name;
    String faculty;
    int age;
    String[] ability = new String[3];

    public SecondStudent(String name, String faculty, int age, String[] ability) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.ability = ability;
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
    public String[] getAbility() {
        return ability;
    }
}
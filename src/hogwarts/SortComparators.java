/// /////////////////////////////////->FirstTask_Collections//////////////////////////////////////////
package hogwarts;

import java.util.Comparator;

public class SortComparators {

    public static Comparator<Student> NAME_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Student> FACULTY_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getFaculty().compareTo(o1.getFaculty());
        }
    };
}
/// /////////////////////////////////FirstTask_Collections<-//////////////////////////////////////////
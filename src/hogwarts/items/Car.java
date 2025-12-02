package hogwarts.items;

import hogwarts.Student;

public class Car implements Invisible {
    private Student driver;
    private int speed;
    private boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }

    public Car(Student driver, int speed, boolean isFlying) {
        this.driver = driver;
        this.speed = speed;
        this.isFlying = isFlying;
    }

    @Override
    public void becomeInvisible() {
        System.out.printf("$s is invisible", this.getClass());
    }

    @Override
    public void becomeVisible() {
        System.out.printf("$s is visible", this.getClass());
    }
}
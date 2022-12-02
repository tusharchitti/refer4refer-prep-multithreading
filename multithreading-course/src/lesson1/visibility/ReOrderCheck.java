package lesson1.visibility;

public class ReOrderCheck {
    private int counter = 1;
    private boolean flag = false;

    public void update() {
        System.out.println("Updating counter to 2 ... ");
        counter = 2;
        flag = true;
    }

    public void print() {
        if (flag) {
            System.out.println("counter is : " + counter);
        }
    }
}

package lesson1.visibility;

/**
 *  Here the output is going to be 2 ideally , but on some machines it can be 1 also.
 */
public class RunCheck {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ReOrderCheck reOrderCheck = new ReOrderCheck();
            Thread threadA = new Thread(() -> {
                reOrderCheck.update();
            });
            Thread threadB = new Thread(() -> {
                reOrderCheck.print();
            });
            threadA.start();
            threadB.start();
            System.out.println("------");
        }
    }
}

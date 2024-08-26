class AdditionThread extends Thread {
    private int number_1;
    private int number_2;
    public AdditionThread(int number_1, int number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }
    private void add() {
        System.out.println(number_1 + number_2);
    }
    public void run() {
        add();
    }
}
public class SimpleThread {
    public static void main(String[] args) {
        AdditionThread additionThread1 = new AdditionThread(3, 5);
        AdditionThread additionThread2 = new AdditionThread(883, 482);
        additionThread1.start();
        additionThread2.start();
    }
}
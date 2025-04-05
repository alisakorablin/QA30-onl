package homework_8.Task_2;

public class MainStaff {

    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();


        director.printJobTitle();
        worker.printJobTitle();
        accountant.printJobTitle();
    }
}

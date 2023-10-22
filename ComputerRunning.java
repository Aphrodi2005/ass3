
public class ComputerRunning {
    public static void main(String[] args) {
     Computer computer = new Adapter();
        computer.turningOn();
        computer.turningOff();
        computer.restarting();
    }
}


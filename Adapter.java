public class Adapter extends ComputerProcess implements Computer {

    @Override
    public void turningOn() {
        running();
    }

    @Override
    public void turningOff() {
shutDown();
    }

    @Override
    public void restarting() {
restart();
    }
}

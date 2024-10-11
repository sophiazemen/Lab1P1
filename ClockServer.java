import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ClockServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            VectorClock vectorClock = new VectorClockImpl(3);
            Naming.rebind("rmi://localhost/VectorClock", vectorClock);
            System.out.println("Clock Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

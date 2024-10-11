import java.rmi.Naming;

public class ClockClient {
    public static void main(String[] args) {
        try {
            VectorClock vectorClock = (VectorClock) Naming.lookup("rmi://localhost/VectorClock");
            RemoteProcess process1 = new RemoteProcessImpl(0, vectorClock);
            RemoteProcess process2 = new RemoteProcessImpl(1, vectorClock);

            process1.sendEvent(0, "Event from Process 1");
            process2.sendEvent(1, "Event from Process 2");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

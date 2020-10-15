
package iaaf100mrace;
/**
 *
 * @author Liam
 */
public class IAAF100mRace {
    public static void main(String[] args) {
        System.out.println("The race begins:");
        Thread bolt = new Thread(new Athletes("Usain Bolt"));
        bolt.start();
        Thread coleman = new Thread(new Athletes("Christian Coleman"));
        coleman.start();
    }
}

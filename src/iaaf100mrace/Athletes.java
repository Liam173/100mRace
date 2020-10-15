package iaaf100mrace;
/**
 *
 * @author Liam
 */
public class Athletes implements Runnable {
    String name;
    public Athletes(String name) {
        this.name = name;
    }
    
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "0 m : " + name);
                Thread.sleep((long)(Math.random()*2000));
            }
        } catch (Exception e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " finishes the race!");
    }
}

package tantai;
import java.util.Date;
/**
 *
 * Greeter class.
 *
 */
public final class Greeter {
/**
 *
 * SayHello.
 * @return Hello
 *
 */
    public String sayHello() {
        return "Hello world!";
    }
/**
 *
 * SayGoodbye.
 *
 *
 */
    public void sayGoodbye() {
         System.out.println("Goodbye");
    }

 /**
 * Hello world!
 *@param args is
 */
    public static void main(final String[] args) {
        Date date = new Date();
        System.out.println("The date: " + date);
    }
}

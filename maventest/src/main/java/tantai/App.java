package tantai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class App {


    public static void main(final String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Learn learn1 = (Learn) context.getBean("learn");

        learn1.setSay(new SayHello());

        System.out.print("Learn 1 : ");
        learn1.Say();

        Learn learn2 = (Learn) context.getBean("learn");

        System.out.print("Learn 2: ");
        learn2.Say();
    }
}

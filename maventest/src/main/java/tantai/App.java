package tantai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class App {


    public static void main(final String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      
        Student student = (Student) context.getBean("student");

        System.out.println("=========================");

 //       student.printName();
 //       System.out.println("*************************");
        student.getAge();
//        student.printThrowException();
        System.out.println("=========================");

        SayGoodbye goodbye = (SayGoodbye) context.getBean("goodbye");
        goodbye.getMessage1();
//        Say say = (Say) context.getBean("say");
//        say.sayGoodbye();
    }
}

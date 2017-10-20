package tantai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public final class App {


    public static void main(final String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentJPA studentJPA = (StudentJPA) context.getBean("studentJPA");
        studentJPA.create("tai",20);

    }
}


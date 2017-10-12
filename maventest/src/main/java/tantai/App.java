package tantai;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class App {


    public static void main(final String[] args) {
        
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      
      CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
      
      cvp.publish();  
      cvp.publish();
    }
}

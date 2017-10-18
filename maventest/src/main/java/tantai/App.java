package tantai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.sql.DataSource;

import java.util.List;

public final class App {


    public static void main(final String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        StudentJDBCTemplate studentJDBCTemplate =(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        DataSource dataSource = (DataSource)context.getBean("dataSource");

        studentJDBCTemplate.setDataSource(dataSource);

        studentJDBCTemplate.create("a", 10);

        System.out.println("=================");
        StudentJDBCTemplate studentJDBCTemplate1 =(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        studentJDBCTemplate1.create("b",20);


    }
}

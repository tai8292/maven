package tantai;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.List;

public class StudentJPA implements StudentDAO{
    JpaTemplate jpaTemplate;

    public JpaTemplate getJpaTemplate() {
        return jpaTemplate;
    }

    public void setJpaTemplate(JpaTemplate jpaTemplate) {
        this.jpaTemplate = jpaTemplate;
    }

    public void setDataSource(DataSource ds) {

    }

    public void create(String name, Integer age) {
        Student student = new Student(name,age);
        jpaTemplate.persist(student);
    }

    public Student getStudent(Integer id) {
        return null;
    }

    public List<Student> listStudents() {
        return null;
    }

    public void delete(Integer id) {

    }

    public void update(Integer id, Integer age) {

    }
}

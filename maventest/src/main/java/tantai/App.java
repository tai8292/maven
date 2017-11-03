package tantai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tantai.entity.NonTeachingStaff;
import tantai.entity.Staff;
import tantai.entity.TeachingStaff;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public final class App {


    public static void main(final String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Staff");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Student> from = criteriaQuery.from(Student.class);

        CriteriaQuery<Object> select = criteriaQuery.select(from);
        select.where(criteriaBuilder.equal(from.get("name"), "Zara"));

        TypedQuery<Object> typedQuery = entityManager.createQuery(select);
        List<Object> list = typedQuery.getResultList();
        for (Object o : list) {
            System.out.println(o);
        }


        entityManager.close();
        entityManagerFactory.close();
    }
}


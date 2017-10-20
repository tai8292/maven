package tantai;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
   private Integer age;
   private String name;
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   public Student() {
   }

   public Student(String name,Integer age) {
      this.age = age;
      this.name = name;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void setId(Integer id) {
      this.id = id;
   }


   @Override
   public String toString() {
      return "Student{" +
              "age=" + age +
              ", name='" + name + '\'' +
              ", id=" + id +
              '}';
   }
}
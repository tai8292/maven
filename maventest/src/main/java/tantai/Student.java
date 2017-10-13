package tantai;


public class Student {
   private Integer age;
   private String name;

   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
	  System.out.println("Age : " + age );
      return age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void printName() {
      System.out.println("Name : " + name );
  //    return name;
   }
   public void printThrowException(){
	   System.out.println("Exception raised");
       throw new IllegalArgumentException();
   }
}
package tantai;

import org.aspectj.lang.JoinPoint;
public class Logging {
   /** 
      * This is the method which I would like to execute
      * before a selected method execution.
   */
   public void beforeAdvice(JoinPoint jp){
   		System.out.println("call "+ jp.getSignature() );
   }
   
   /** 
      * This is the method which I would like to execute
      * after a selected method execution.
   */
   public void afterAdvice(){
      System.out.println("After setup.");
   }

   /** 
      * This is the method which I would like to execute
      * when any method returns.
   */
   public void afterReturningAdvice(Object retVal) {
      System.out.println("Returning: " + retVal.toString() );
   }

   /**
      * This is the method which I would like to execute
      * if there is an exception raised.
   */
   public void AfterThrowingAdvice(IllegalArgumentException ex){
      System.out.println("There has been an exception: " + ex.toString());   
   }
}
package Practice;

interface Messaging {

    abstract void sending();
    abstract void reciving();

}
  class EmailServices implements Messaging {
 public void sending(){
     System.out.println("happy ");
 }
   public void reciving(){
     System.out.println("sad");
   } 
}
class SmsServices implements Messaging{
    public void sending(){

    } 
    public void reciving(){

    }
}

public class Coupling {
    public static void main(String[] args) {
        EmailServices s = new EmailServices();
        s.reciving();
        s.sending();
    }
}

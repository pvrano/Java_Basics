

/**basic implementations of constructor,string objects.
 *date- 13/7/16
 * @author PVRANO
 */

public class Construct1 {
    public Construct1(){
      this(4);
      System.out.println("no argument");
      
    }
    public Construct1(int x){
        this("pvrano");
        System.out.println(x);
   }
    public Construct1(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        new Construct1();
    }
}

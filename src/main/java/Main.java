
public class Main {
    public static void main(String[] args) {
       

      
        for (int i = 10; i >= 1; i--) {
      
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

 
        }
    }
}

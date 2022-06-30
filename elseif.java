import java.util.Scanner;
public class elseif {
    public static void main(String[]args){
        Scanner time =new Scanner(System.in);
        System.out.println("input a no");
        int a= time.nextInt();

        if (a < 10) {
            System.out.println("Good morning.");
          } else if (a < 20) {
            System.out.println("Good day.");
          }  else {
            System.out.println("Good evening.");
          }
        }
      }
      

    
    


import java.util.Scanner;

public class EmailApp{
  public static void main(String[] Args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please Enter ur Firstname,Lastname");
    String FirstName=scanner.nextLine();
    String LaststName=scanner.nextLine();
    email obj=new email(FirstName, LaststName);
  }
}
import java.util.Scanner;

public class email {
  private String FirstName;
  private String LastName;
  private String Department;
  private String Company = "MyCompany.com";
  private String Password;
  private int MailBoxCapacity = 500;
  private String emailID;
  private int passlength=8;

  public email(String FirstName, String LastName) {
    this.FirstName = FirstName;
    this.LastName = LastName;
    System.out.println(FirstName+" "+LastName);
    SetDept();
    emailid();
    Randompass(passlength);
    EmployeeInfo();
    boolean choice=true;
    System.out.println("Do You want to Change Password?\n1. Yes\n2. No");
    int x=input.nextInt();
    if(x==1) ChangePassword();
    else System.out.println("Have a Nice day.");
  }
  Scanner input = new Scanner(System.in);

  public void SetDept() {
    System.out.println("Departments:");
    System.out.println("1. QC\n2. RnD\n3. Production\n4. None");
    System.out.print("Choose Your Department: ");
    int choose= input.nextInt();
    if(choose==1) Department="QC";
    else if(choose==2) Department="Rnd";
    else if(choose==3) Department="Production";
    else Department="";
  }
  public void emailid(){
    emailID=(FirstName+"."+LastName+"@"+Department+"."+Company);
  }
  public void Randompass(int passlength){
    String pass="asdfghjklzxcvbnmqwertyuiop1234567890@#%^&";
    char[] pas=new char[passlength];
    for(int i=0; i<passlength; i++){
      int x=(int)(Math.random()*pass.length());
      pas[i]=pass.charAt(x);
    }
    Password=new String(pas);
  }
  public void ChangePassword(){
    Password=input.nextLine();
  }
  public void EmployeeInfo(){
    System.out.println("\nEmployee Name: "+FirstName+" "+LastName);
    System.out.println("Department Name: "+Department);
    System.out.println("Mail ID: "+emailID);
    System.out.println("Mail Capacity: "+MailBoxCapacity+"mb");
    System.out.println("Temporary Password: "+Password+"\n");
  }
}

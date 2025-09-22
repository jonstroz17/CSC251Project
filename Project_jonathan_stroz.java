import java.util.Scanner;

public class Project_jonathan_stroz
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int policyNum;
      int age;
      double height;
      double weight;
      String providerName;
      String nameFirst;
      String nameLast;
      String smoker;
      //user-defined variables
      
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextInt();
      keyboard.nextLine();
      //user enters policy number
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      //user enters policy provider name
      
      System.out.print("Please enter the Policyholder's First Name: ");
      nameFirst = keyboard.nextLine();
      //user enters policyholder's first name
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      nameLast = keyboard.nextLine();
      //user enters policyholder's last name
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      //user enters policyholder's age
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smoker = keyboard.nextLine();
      while(!smoker.equalsIgnoreCase("smoker") && !smoker.equalsIgnoreCase("non-smoker"))
      {
         System.out.print("\nInvalid input.");
         System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smoker = keyboard.nextLine();
      }
      if(smoker.equalsIgnoreCase("smoker"))
      {
         smoker = "smoker";
      }
      else
      {
         smoker = "non-smoker";
      }
      //user enters policyholder's smoking status
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      keyboard.nextLine();
      //user enters policyholder's height
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      keyboard.nextLine();
      //user enters policyholder's weight
      
      Policy account = new Policy(policyNum, providerName, nameFirst, nameLast, age, smoker, height, weight);
      //new Policy class instance constructed
      
      System.out.print("\nPolicy Number: " + account.getPolicyNum());
      System.out.print("\nProvider Name: " + account.getProviderName());
      System.out.print("\nPolicyholder's First Name: " + account.getFirstName());
      System.out.print("\nPolicyholder's Last Name: " + account.getLastName());
      System.out.print("\nPolicyholder's Age: " + account.getAge());
      System.out.print("\nPolicyholder's Smoking Status: " + account.getSmokingStatus());
      System.out.print("\nPolicyholder's Height: " + account.getHeight() + " inches");
      System.out.print("\nPolicyholder's Weight: " + account.getWeight() + " pounds");
      System.out.printf("\nPolicyholder's BMI: %.2f", account.calculateBMI());
      System.out.printf("\nPolicy Price: $%.2f", account.calculateInsurancePrice());
   }
}

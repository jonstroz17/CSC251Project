import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_jonathan_stroz
{
   public static void main(String[] args) throws IOException
   {
      File policyFile = new File("PolicyInformation.txt");
      Scanner fileRead = new Scanner(policyFile);
      Scanner keyboard = new Scanner(System.in);
      ArrayList<Policy> policies = new ArrayList<Policy>();
      //class instance declarations
      
      int policyNum;
      int age;
      double height;
      double weight;
      String providerName;
      String nameFirst;
      String nameLast;
      String smoker;
      //user-defined variables
      
      int noSmoke = 0, yesSmoke = 0;
      //non-user-defined variables
      
      do
      {
         policyNum = fileRead.nextInt();
         fileRead.nextLine();
         //policy number is read
         
         providerName = fileRead.nextLine();
         //policy provider name is read
         
         nameFirst = fileRead.nextLine();
         //policyholder's first name is read
         
         nameLast = fileRead.nextLine();
         //policyholder's last name is read
         
         age = fileRead.nextInt();
         fileRead.nextLine();
         //policyholder's age is read
         
         smoker = fileRead.nextLine();
         //policyholder's smoking status is read
         
         height = fileRead.nextDouble();
         fileRead.nextLine();
         //policyholder's height is read
         
         weight = fileRead.nextDouble();
         //policyholder's weight is read
         
         policies.add(new Policy(policyNum, providerName, nameFirst, nameLast, age, smoker, height, weight));
         //new Policy class instance constructed
      }
      while(fileRead.hasNext());
      //policy information is read from file
      
      fileRead.close();
      //file that was being read is closed
      
      for(int i = 0; i < policies.size(); i++)
      {
         System.out.print("\nPolicy Number: " + policies.get(i).getPolicyNum());
         System.out.print("\nProvider Name: " + policies.get(i).getProviderName());
         System.out.print("\nPolicyholder's First Name: " + policies.get(i).getFirstName());
         System.out.print("\nPolicyholder's Last Name: " + policies.get(i).getLastName());
         System.out.print("\nPolicyholder's Age: " + policies.get(i).getAge());
         System.out.print("\nPolicyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
         System.out.print("\nPolicyholder's Height: " + policies.get(i).getHeight() + " inches");
         System.out.print("\nPolicyholder's Weight: " + policies.get(i).getWeight() + " pounds");
         System.out.printf("\nPolicyholder's BMI: %.2f", policies.get(i).calculateBMI());
         System.out.printf("\nPolicy Price: $%.2f", policies.get(i).calculateInsurancePrice());
         System.out.print("\n");
         //policy information is displayed
         
         if(policies.get(i).getSmokingStatus().equals("smoker"))
         {
            yesSmoke++;
         }
         else
         {
            noSmoke++;
         }
         //smoking status added to running tallies
      }
      //policy information for all policies is displayed
      
      System.out.print("\nThe number of policies with a smoker is: " + yesSmoke);
      System.out.print("\nThe number of policies with a non-smoker is: " + noSmoke);
      //total numbers of smokers and non-smokers is displayed
   }
}

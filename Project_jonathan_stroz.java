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
   }
}

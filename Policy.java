public class Policy
{
   private int policyNum;
   private String providerName;
   private String nameFirst;
   private String nameLast;
   private int age;
   private String smoker;
   private double height;
   private double weight;
   //class fields
   
   /**
   constructors
   */
   
   public Policy()
   {
      policyNum = 0;
      providerName = "";
      nameFirst = "";
      nameLast = "";
      age = 0;
      smoker = "non-smoker";
      height = 0.0;
      weight = 0.0;
   }
   //no-arg constructor
   
   public Policy(int num, String name, String first, String last, int polAge, String polSmoke, double polHeight, double polWeight)
   {
      policyNum = num;
      providerName = name;
      nameFirst = first;
      nameLast = last;
      age = polAge;
      smoker = polSmoke;
      height = polHeight;
      weight = polWeight;
   }
   //arg constructor
   
   /**
   mutators
   */
   
   public void setPolicyNum(int num)
   {
      policyNum = num;
   }
   //policy number mutator
   
   public void setProviderName(String name)
   {
      providerName = name;
   }
   //provider name mutator
   
   public void setFirstName(String first)
   {
      nameFirst = first;
   }
   //first name mutator
   
   public void setLastName(String last)
   {
      nameLast = last;
   }
   //last name mutator
   
   public void setAge(int polAge)
   {
      age = polAge;
   }
   //age mutator
   
   public void setSmokingStatus(String polSmoke)
   {
      smoker = polSmoke;
   }
   //smoking status mutator
   
   public void setHeight(double polHeight)
   {
      height = polHeight;
   }
   //height mutator
   
   public void setWeight(double polWeight)
   {
      weight = polWeight;
   }
   //weight mutator
   
   /**
   accessors
   */
   
   public int getPolicyNum()
   {
      return policyNum;
   }
   //policy number accessor
   
   public String getProviderName()
   {
      return providerName;
   }
   //policy number accessor
   
   public String getFirstName()
   {
      return nameFirst;
   }
   //first name accessor
   
   public String getLastName()
   {
      return nameLast;
   }
   //last name accessor
   
   public int getAge()
   {
      return age;
   }
   //age accessor
   
   public String getSmokingStatus()
   {
      return smoker;
   }
   //smoking status accessor
   
   public double getHeight()
   {
      return height;
   }
   //height accessor
   
   public double getWeight()
   {
      return weight;
   }
   //weight accessor
   
   /**
   additional methods
   */
   
   public double calculateBMI()
   {
      double bmi;
      
      bmi = (weight * 703.0) / (height * height);
      
      return bmi;
   }
   //calculates BMI of policyholder
   
   public double calculateInsurancePrice()
   {
      final double BASE_FEE = 600.0;
      final double AGE_FEE = 75.0;
      final double SMOKE_FEE = 100.0;
      //fee constants
      
      double bmiFee = (calculateBMI() - 35.0) * 20.0;
      //bmi fee calculation
      
      double price = BASE_FEE;
      //insurance price
      
      if(age > 50)
      {
         price += AGE_FEE;
      }
      //determines whether to apply age fee
      
      if(smoker.equals("smoker"))
      {
         price += SMOKE_FEE;
      }
      //determines whether to apply smoking status fee
      
      if(calculateBMI() > 35.0)
      {
         price += bmiFee;
      }
      //determines whether to apply BMI fee
      
      return price;
   }
   //calculates price of insurance policy
}

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
   
   /**
      The Policy method is the no-arg constructor of the class.
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
   
   /**
      The Policy method is the arg-constructor of the class.
      @param num The policy number.
      @param name The policy provider's name.
      @param first The policy holder's first name.
      @param last The policy holder's last name.
      @param polAge The policy holder's age.
      @param polSmoke The policy holder's smoking status.
      @param polHeight The policy holder's height.
      @param polWeight The policy holder's weight.
   */
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
   
   /**
   mutators
   */
   
   /**
      The setPolicyNum method is the policy number mutator method.
      @param num The new policy number.
   */
   public void setPolicyNum(int num)
   {
      policyNum = num;
   }
   
   /**
      The setProviderName method is the provider name mutator method.
      @param name The new provider name.
   */
   public void setProviderName(String name)
   {
      providerName = name;
   }
   
   /**
      The setFirstName method is the policy holder first name mutator method.
      @param first The new policy holder first name.
   */
   public void setFirstName(String first)
   {
      nameFirst = first;
   }
   
   /**
      The setLastName method is the policy holder last name mutator method.
      @param last The new policy holder last name.
   */
   public void setLastName(String last)
   {
      nameLast = last;
   }
   
   /**
      The setAge method is the policy holder age mutator method.
      @param polAge The new policy holder age.
   */
   public void setAge(int polAge)
   {
      age = polAge;
   }
   
   /**
      The setSmokingStatus method is the policy holder smoking status mutator method.
      @param polSmoke The new policy holder smoking status.
   */
   public void setSmokingStatus(String polSmoke)
   {
      smoker = polSmoke;
   }
   
   /**
      The setHeight method is the policy holder height mutator method.
      @param polHeight The new policy holder height.
   */
   public void setHeight(double polHeight)
   {
      height = polHeight;
   }
   
   /**
      The setWeight method is the policy holder weight mutator method.
      @param polWeight The new policy holder weight.
   */
   public void setWeight(double polWeight)
   {
      weight = polWeight;
   }
   
   /**
   accessors
   */
   
   /**
      The getPolicyNum method is the policy number accessor method.
   */
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   /**
      The getProviderName method is the provider name accessor method.
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      The getFirstName method is the policy holder first name accessor method.
   */
   public String getFirstName()
   {
      return nameFirst;
   }
   
   /**
      The getLastName method is the policy holder last name accessor method.
   */
   public String getLastName()
   {
      return nameLast;
   }
   
   /**
      The getAge method is the policy holder age accessor method.
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      The getSmokingStatus method is the policy holder smoking status accessor method.
   */
   public String getSmokingStatus()
   {
      return smoker;
   }
   
   /**
      The getHeight method is the policy holder height accessor method.
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      The getWeight method is the policy holder weight accessor method.
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
   additional methods
   */
   
   /**
      The calculateBMI method calculates the policy holder's BMI.
      @return The BMI of the policy holder.
   */
   public double calculateBMI()
   {
      double bmi;
      
      bmi = (weight * 703.0) / (height * height);
      
      return bmi;
   }
   
   /**
      The calculateInsurancePrice method calculates the price of the policy holder's insurance policy.
      @return The total price of the policy holder's insurance policy.
   */
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
}

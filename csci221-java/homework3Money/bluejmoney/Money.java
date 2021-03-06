
public class Money
   {
      public int dollars;
      public int cents;
      static Money varmoney = new Money();
      public int vardollars;
      public int varcents;
      public int mdollars;
      public int mcents;
      public int userdollars;
      public int usercents;
      
      //contructor for money with no variables
      public Money()
         {
            dollars = 0;
            cents = 0;
         }
      //contructor for money with variables
      public Money(int userdollars, int usercents)
         {
            dollars = userdollars;
            cents = usercents;
         }
      //overrides the value of cents with a uservalue
      public void setCents(int chgcents)
         {
            cents = chgcents;
         }
      //overrides the value of dollars with a uservalue
      public void setDollars(int chgdollars)
         {
            dollars = chgdollars;
         }
      //return current value of cents
      public int getCents()
         {
            return cents;
         }
      //returns current value of dollars
      public int getDollars()
         {
            return dollars;
         }
      //increases the value of first Money by the second Money
      public void increment(Money m)
         {
            int mdollars = m.getDollars();
            int mcents = m.getCents();
            
            cents = cents + mcents;
            dollars = dollars + mdollars;
            
            while (cents >= 100)
               {
                  cents = cents - 100;
                  dollars = dollars + 1;
               }
         }
      //decreases the value of the first money by the second money
      public void decrement(Money m)
         {
            int mdollars = m.getDollars();
            int mcents = m.getCents();
            
            cents = cents - mcents;
            dollars = dollars - mdollars;
            
            while (cents < 0)
               {
                  cents = cents + 100;
                  dollars = dollars - 1;
               }
         }
      //adds 2 Moneys together and returns the value as a third Money
      public Money add(Money m)
         {
            mdollars = m.getDollars();
            mcents = m.getCents();
            
            varcents = cents + mcents;
            vardollars = dollars + mdollars;
            
            while (varcents >= 100)
               {
                  varcents = varcents - 100;
                  vardollars = vardollars + 1;
               }
            
            
            varmoney.setDollars(vardollars);
            varmoney.setCents(varcents);
            
            return varmoney; 
         }
      //subtracts 1 Money from the other and returns the value as a third Money
      public Money subtract(Money m)
         {
            mdollars = m.getDollars();
            mcents = m.getCents();
            
            varcents = cents - mcents;
            vardollars = dollars - mdollars;           
            
            while (varcents < 0)
               {
                  varcents = varcents + 100;
                  vardollars = vardollars - 1;
               }
            varmoney.setDollars(vardollars);
            varmoney.setCents(varcents);
                        
            return varmoney;
         }
      //tests for equality between 2 Moneys
      public boolean equals(Money m)
         {
            mdollars = m.getDollars();
            mcents = m.getCents();
            
            return (mcents == cents && mdollars == dollars);
         }
      //toString method
      public String toString()
         {
            return ("$" + dollars + "." + cents);
         }
      //print method for Money
      public void print()
         {
            System.out.println("$" + dollars + "." + cents);
         }
   }
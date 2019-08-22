import java.io.*;


class SavingAmount

{
    
      int amt;
   
    
      public int getAmt()

      {
        
          return amt;

      }
    
   
      public void setAmt(int newAmt)
  
      {
         
          this.amt=newAmt;
   
      }
    
   
     void increment()
   
     {
        
          amt=amt+1000;
   
     }
    
     void decrement()
    
     {
       
          amt=amt-100;
   
     }
   
     void checkSavings()
    
    {
       
         if(amt>=1000)
       
         {
            
              System.out.println("Congratulation! You have saved a good amount");        
        
         }
       
         else if(amt>=0)
        
        {
            
              System.out.println("Insufficient Saving");
        
        }
       
         else
        
        {
            
              System.out.println("You are in debt");
        
        }
    
     }
   
     public static void main (String[] args) 
    {
       
        
        SavingAmount s=new SavingAmount();
       
        s.setAmt(1000);
       
        s.increment();
        
        s.decrement();
        
        s.checkSavings();
        
        System.out.println("your current balance is "+s.getAmt());
    
    }

}
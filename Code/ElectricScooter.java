
public class ElectricScooter extends Vehicle
{
    //Declaring instance variables//
    private int Range ;
    private int BatteryCapacity ;
    private int Price ;
    private String ChargingTime ;
    private String Brand ;
    private String Mileage ;
    private boolean hasPurchased ;
    private boolean hasSold ;
    
    public ElectricScooter(int VehicleId,String VehicleName,String VehicleWeight,
                          String VehicleSpeed, String VehicleColor,int BatteryCapacity)
    {
        super(VehicleId, VehicleName, VehicleWeight, VehicleColor); //calling attributes of superclass using super keyword//
        super.setVehicleSpeed(VehicleSpeed);   //calling setVehicleSpeed method from superclass//
        super.setVehicleColor(VehicleColor);   //calling  method setVehicleColor from superclass// 
        this.BatteryCapacity= BatteryCapacity;
        Range= 0;
        Price= 0;
        Brand ="";
        Mileage="";
        ChargingTime="";
        hasPurchased = false ;
        hasSold= false ;
    }
    
    public int getRange() 
    {
        return Range;
        
        //accessor method for Range//
    }
    
    public int getBatteryCapacity() 
    {
        return BatteryCapacity;
        
        //accessor method for BatteryCapacity//
    }
    
    public int getPrice() 
    {
        return Price;
        
        //accessor method for Price//
    }
    
    public String getChargingTime() 
    {
        return ChargingTime;
        
        //accessor method for ChargingTime//
    }
    
    public String getBrand() 
    {
        return Brand;
        
        //accessor method for Brand//
    }
    
    public boolean gethasSold()
    {
        return hasSold;
    }
    
    public String getMileage() 
    {
        return Mileage;
        
        //accessor method for Mileage//
    }
    
    public boolean gethasPurchased() 
    {
        return hasPurchased;
        
        //accessor method for hasPurchased//
    }
    public void sethasPurchased( boolean purchased) 
    {
        this.hasPurchased= purchased; 
        
    }
    
    public void sethasSold( boolean sold) 
    {
        this.hasSold= sold ; 
        
    }
    
    
    public void setPrice(int NewPrice) 
    {
        this.Price= NewPrice  ;
       
        //setter method for setting New price //
    }
    
      
    public void setBrand(String NewBrand)
    {
        if(hasPurchased==false) //using boolean statement to check hasPurchased input//
        {
        this.Brand=NewBrand;
        }
        
        else 
        {
           System.out.println("It is not possible to change the brand "); 
        }
    }  
    
    public void purchase(String Brand, int Price,String ChargingTime, String Mileage, int Range)
    {
        if(hasPurchased==false) //using boolean statement to check hasPurchased input//
        {
            setBrand(Brand);
            this.Price=Price;
            this.ChargingTime=ChargingTime;
            this.Mileage=Mileage;
            this.Range=Range;
            this.hasPurchased=true;
    
        }
        else 
        {
            System.out.println(" The scooter has already been purchased");
        }
    }
        
    public void sell(int Price)
    {
        if(hasSold==false)
        {
           this.Price=Price;                   //setting the values of price//
           this.ChargingTime="" ;              //initializing value of attribute to "" //
           this.Mileage="";                    
           this.BatteryCapacity= 0;            //initializing value of attribute to 0 //
           this.Range=0;
           this.hasSold=true;
           this.hasPurchased=false;
        }
        
        else
        {
           System.out.println("The scooter has been already sold.") ; 
        }
    }
    
     
    public void display()     
    {
        
        super.display(); //calling display method from duper class using super keyword//
        
        if (hasPurchased == true) //using boolean condition
        {
            System.out.println("\nScooter_Infromation");
            System.out.println("The brand is:"+ Brand);
            System.out.println("The battery capacity is:" + BatteryCapacity + " kilowatt" );
            System.out.println("The mileage given by the scooter is:" + Mileage + " kms");
            System.out.println("The range is:" + Range + " kms"  );
            System.out.println("The recharge time is:" + ChargingTime + " hrs");
    
        } 
        
        }
        
        
 } // class closed.
        

    
    


    
    




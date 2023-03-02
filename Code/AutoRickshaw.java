

public class AutoRickshaw extends Vehicle
{
    
    private int EngineDisplacement ;
    private String Torque ;
    private int NumberOfSeats ;
    private int FuelTankCapacity ; 
    private String GroundClearance ;
    private int ChargeAmount ;
    private String BookedDate ;
    private boolean isBooked ;
    
    //declaring instance variables.

    
    public AutoRickshaw( int VehicleID,
                         String VehicleName,
                         String VehicleWeight,
                         String VehicleColor, 
                         String VehicleSpeed,
                         int EngineDisplacement,
                         String Torque, 
                         int FuelTankCapacity,
                         String GroundClearance)
    {
       super(VehicleID, VehicleName, VehicleColor, VehicleWeight);    //calling superclass constructor parameters//
       super.setVehicleSpeed(VehicleSpeed);
       this.EngineDisplacement= EngineDisplacement; 
       this.Torque= Torque ;
       this.FuelTankCapacity= FuelTankCapacity ;
       this.GroundClearance= GroundClearance;
       isBooked=false ;
    }
    
    

    public int getEngineDisplacement() 
    {
        return EngineDisplacement;
       
        //acessor method for EngineDisplacement//
    } 
    
    
    public String getTorque() 
    {
        return Torque;
       
        //acessor method for Torque//
    } 
    
     public int getNumberOfSeats() 
    {
        return NumberOfSeats;
       
        //acessor method for getting Seats//
    } 
    
    
    public int getFuelTankCapacity() 
    {
        return FuelTankCapacity;
       
        //acessor method for FuelTankCapacity//
    }
    
    
    public String getGroundClearance() 
    {
        return GroundClearance;
       
        //acessor method for GroundClearance//
    }
    
    
    public int getChargeAmount() 
    {
        return ChargeAmount;
       
        //acessor method for ChargeAmount//
    }
    
    
    public String getBookedDate() 
    {
        return BookedDate;
       
        //acessor method for BookedDate//
    }
    
    
    public boolean getisBooked() 
    {
        return isBooked;
       
        //acessor method for isBooked //
    }
    
    public void setisBooked(boolean result) 
    {
        this.isBooked= result ;
       
        //setter method for setting isBooked value //
    }
    
    public void setChargeAmount( int NewChargeAmount)
    {
        this.ChargeAmount =NewChargeAmount;
    
        //Setter method for setting new charge amount.
    }
    
    public void setNumberOfSeats(int NewNumberOfSeats)
    {
        this.NumberOfSeats = NewNumberOfSeats ;
    
        //Setter method for setting new number of seats.
    }
    
    public void getFuelTankCapacity(int NewFuelTankCapacity)
    {
        this.FuelTankCapacity = NewFuelTankCapacity ;
    
        //Setter method for setting new number of seats.
    }
      
    
    public void setBookedDate(String NewDate)
    {
        this.BookedDate = NewDate ;
    
        //Setter method for setting new bookeddate.
    }
    
    public void book ( String BookedDate,int ChargeAmount,int NumberOfSeats)
    {
    
        if(isBooked==false)
        { 
            setNumberOfSeats(NumberOfSeats);
            setChargeAmount(ChargeAmount); 
            setBookedDate(BookedDate);
            System.out.println("The rickshaw is already booked ");
            System.out.println("The Id of the rickshaw is:"+ getVehicleID() ); //getting VechileID from superclass.
            setisBooked(true);
        }
        else
        {
            System.out.println("Already Booked");
            
        }
    }
    
    public void display()     
    {
        
        super.display(); //calling display method from duper class using super keyword//
        System.out.println("") ;
        
        if (isBooked == true) //using boolean condition
        {
            System.out.println("\nVehilce_Infromation");
            System.out.println("The Engine Displacement is:"+ EngineDisplacement+"cc");
            System.out.println("The torque produced is:" + Torque+"nm" );
            System.out.println("The fuel tank capacity is:" + FuelTankCapacity+"ltr");
            System.out.println("The ground clearence is:" + GroundClearance+ "mm");
            System.out.println("The booked date is:" + getBookedDate());
    
        } 
        
    
        if(ChargeAmount<=0 ) // using if else statement
        {
            System.out.println("Charge amount is not set");
        }
        else 
        {
            System.out.println("Charge amount is Rs:"+ ChargeAmount);   
        }
        
        if(NumberOfSeats<=0 ) // using if else statement
        {
            System.out.println("Number of seats is not set");
        }
        else
        {
            System.out.println("Number of seats is: "+ NumberOfSeats) ;  
        }
        
    } // exiting method display
}// exiting class auto rickshaw
        


    
    
        
    


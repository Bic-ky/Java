//creating class Vehicle
public class Vehicle 
{
    private String VehicleName;
    private String VehicleWeight;
    private String VehicleSpeed;
    private String VehicleColor;
    private int VehicleID;
    
    //Declaring instance variables.
    
    

    public Vehicle ( int VehicleID, String VehicleName, String VehicleColor ,String VehicleWeight)
    {
       this.VehicleID= VehicleID ;
       this.VehicleName= VehicleName;
       this.VehicleColor= VehicleColor;
       this.VehicleWeight= VehicleWeight;
        
       //Initializing instance variables.   
    }
    
    
    
    public int getVehicleID () 
    {
        return VehicleID;
       
        //acessor method for VehicleID//
    }  
    
    
    
    public String getVehicleName () 
    {
        return VehicleName;
       
        //acessor method for VehicleName//
    } 
    
    
    
    public String getVehicleColor () 
    {
        return VehicleColor;
       
        //acessor method for VehicleColor//
    } 
    
    
    
    public String getVehicleWeight () 
    {
        return VehicleWeight;
       
        //acessor method for VehicleWeight//
    } 
    
    
    
    public void setVehicleSpeed(String NewSpeed) 
    {
        this.VehicleSpeed = NewSpeed ;
        

        //Using setter method to set the vehicle speed to new speed.
    }
    
    
    
    public void setVehicleColor(String NewColor) 
    {
        this.VehicleColor = NewColor ;
        

        //Using setter method to set the vehicle color to new color.
    }
    
    
    
    public void display ()  // Creating display method.
    {
        
        System.out.println("The vehicle ID is :" + VehicleID) ;
        System.out.println("The name of the vehicle is:"+ VehicleName);
        System.out.println("The color of the vehicle is:"+ VehicleColor);  
        System.out.println("The speed of the vehicle is:"+ VehicleSpeed); 
        

        if(VehicleWeight =="")
        {
            System.out.println("");
        }
        else
        {
            System.out.println("The weight of the vehicle is:"+ VehicleWeight );
        }
        

            System.out.println("----------------------------------------------");
    }

     
    }
    
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;
import java.util.*;


public class TransportGUI implements ActionListener  
{
    //-------------------------------------------Instance Variables for Auto Rickshaw and Electric scooter------------------------------------------//
   private JFrame frame,frameE;
   private JPanel panel1,panel2, panel3;
   private JPanel panelE1, panelE2, panelE3;
   
   private JLabel heading_AR, vName_AR, vWeight_AR,vSpeed_AR, vColor_AR,vID1_AR, vID2_AR;
   private JLabel heading_ES, vName_ES, vWeight_ES,vSpeed_ES, vColor_ES,vID1_ES, vID2_ES, vID3_ES;
   
   private JTextField vName_textfield, vWeight_textfield, vSpeed_textfield, vColor_textfield, vID1_textfield, vID2_textfield;
   private JTextField EName_textfield, EvWeight_textfield, ESpeed_textfield, EColor_textfield, EvID1_textfield,EvID2_textfield,EvID3_textfield;
   
   private JLabel ED_AR, Torque_AR, FTC_AR, NOS_AR, GC_AR, CA_AR,Book_AR;
   private JLabel BC_E,Brand_E,Price_E,Price2_E,ChargingTime_E, Mileage_E,Range_E;
   
   private JTextField ED_textfield, Torque_textfield, FTC_textfield, NOS_textfield, GC_textfield, CA_textfield;
   private JTextField BC_textfield,Brand_textfield,Price_textfield,Price2_textfield,ChargingTime_textfield, Mileage_textfield,Range_textfield;
   
   private JComboBox<String> Month, Year, Day;
 
   private JButton add_btn1, book_btn, Display_btn, Clear_btn, ChangeEV_btn;
   private JButton add_btn2, purchase_btn, DisplayE_btn, ClearE_btn, ChangeAR_btn, sell_btn;
   
    
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
   
   
   
   public static void main(String[] args)
   {   
       TransportGUI Gui = new TransportGUI();
       Gui.AutoRickshaw_gui();
       
   }
   
   public void AutoRickshaw_gui()
   {
       String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","24","26","27","28","29","30"};
        
       String[] month = {"month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
       String[] year = {"year","2021","2022","2023","2023","2024","2025","2026","2027"};
        
        
        
       //frame for autorickshaw
       frame = new JFrame("Auto Rickshaw");
       frame.setVisible(true);
       frame.setBounds(100,25,1200,720);
       
       
       //panel1 for autoRickshaw
       panel1 = new JPanel();
       panel1.setSize(1200, 700);
       
       //adding change to electric scooter button to panel1
       ChangeEV_btn = new JButton();
       ChangeEV_btn.setBounds(420,620,310,40);
       ChangeEV_btn.setText("Change to Electric Scooter");
       ChangeEV_btn.addActionListener(this);
       ChangeEV_btn.setBackground(new Color(135,206,250));
       
       
       
       panel2 = new JPanel();
       panel2.setBounds(10,70,570,540);
       panel2.setBackground(new Color(169, 210, 163));
       panel2.setLayout(null);
       
       panel3 = new JPanel();
       panel3.setBounds(600,70,570,540);
       panel3.setBackground(new Color(243,220,233));
       panel3.setLayout(null);
       
       //label and text field for autorickshaw
       
       heading_AR = new JLabel("Auto Rickshaw");
       heading_AR.setBounds(500, 20, 250, 25);
       heading_AR.setFont(new Font("SansSerif", Font.BOLD, 30));
       
       vID1_AR = new JLabel();
       vID1_AR.setText("Vehicle ID:");
       vID1_AR.setBounds(50,20,100,25);
       vID1_textfield = new JTextField();
       vID1_textfield.setBounds(220,20,150,30);
       
       vName_AR = new JLabel();
       vName_AR.setText("Vehicle Name:");
       vName_AR.setBounds(50,70,100,25);
       vName_textfield = new JTextField();
       vName_textfield.setBounds(220,70,150,30);
       
       vWeight_AR = new JLabel();
       vWeight_AR.setText("Vehicle Weight:");
       vWeight_AR.setBounds(50,120,100,25);
       vWeight_textfield = new JTextField();
       vWeight_textfield.setBounds(220,120,150,30);
       
       vColor_AR = new JLabel();
       vColor_AR.setText("Vehicle Colour:");
       vColor_AR.setBounds(50,170,100,25);
       vColor_textfield = new JTextField();
       vColor_textfield.setBounds(220,170,150,30);
       
       vSpeed_AR = new JLabel();
       vSpeed_AR.setText("Vehicle Speed:");
       vSpeed_AR.setBounds(50,220,100,25);
       vSpeed_textfield = new JTextField();
       vSpeed_textfield.setBounds(220,220,150,30);
       
       ED_AR = new JLabel();
       ED_AR.setText("Engine Displacement:");
       ED_AR.setBounds(50,270,135,25);
       ED_textfield = new JTextField();
       ED_textfield.setBounds(220,270,150,30);
       
       Torque_AR = new JLabel();
       Torque_AR.setText("Torque:");
       Torque_AR.setBounds(50,320,100,25);
       Torque_textfield = new JTextField();
       Torque_textfield.setBounds(220,320,150,30);
       
       FTC_AR = new JLabel();
       FTC_AR.setText("Fuel Tank Capacity:");
       FTC_AR.setBounds(50,370,120,25);
       FTC_textfield = new JTextField();
       FTC_textfield.setBounds(220,370,150,30);
       
       GC_AR = new JLabel();
       GC_AR.setText("Ground Clearance:");
       GC_AR.setBounds(50,420,160,25);
       GC_textfield= new JTextField();
       GC_textfield.setBounds(220,420,150,30);
       
       
       //Adding Buttons for panel1 of AutoRickshaw
       
       add_btn1 = new JButton();
       add_btn1.setBounds(50,490,320,40);
       add_btn1.setText("Add an AutoRickshaw");
       add_btn1.addActionListener(this);
  
       //Adding labels and Textfields to book an AutoRickshaw in panel3
       
       vID2_AR = new JLabel("Vehicle ID:");
       vID2_AR.setBounds(50,15,100,25);
       vID2_textfield = new JTextField();
       vID2_textfield.setBounds(220,15,150,30);
        
       Book_AR = new JLabel("Book Date:");
       Book_AR.setBounds(50,60,140,25);
       
       Day = new JComboBox<String>(day);
       Day .setBounds(220,60,50,30);
       Month = new JComboBox<String>(month);
       Month.setBounds(280,60,100,30);
       Year = new JComboBox<String>(year);
       Year.setBounds(390,60,80,30);
        
       CA_AR = new JLabel("Charge Amount:");
       CA_AR.setBounds(50,105,150,25);
       CA_textfield = new JTextField();
       CA_textfield.setBounds(220,105,150,30);
        
       NOS_AR = new JLabel("Number of Seats:");
       NOS_AR.setBounds(50,150,150,25);
       NOS_textfield = new JTextField();
       NOS_textfield.setBounds(220,150,150,30);
       
       
       //Adding Buttons to panel 3 
       
       book_btn = new JButton();
       book_btn.setBounds(160,230,310,40);
       book_btn.setText("Book an Auto Rickshaw");
       book_btn.addActionListener(this);
       
       Clear_btn = new JButton();
       Clear_btn.setBounds(360,300,100,40);
       Clear_btn.setText("Clear");
       Clear_btn.setBackground(new Color(220,20,60));
       Clear_btn.addActionListener(this);
       
       Display_btn = new JButton();
       Display_btn.setBounds(160,300,100,40);
       Display_btn.setText("Display");
       Display_btn.setBackground(new Color(135,206,250));
       Display_btn.addActionListener(this);
       
       
    
       
       //adding textfields,labels and buttons for add autorickshaw in panel2.
       
       
       panel2.add(vID1_AR);
       panel2.add(vID1_textfield);
       panel2.add(vName_AR);
       panel2.add(vName_textfield);
       panel2.add(vColor_AR);
       panel2.add(vColor_textfield);
       panel2.add(vSpeed_AR);
       panel2.add(vSpeed_textfield);
       panel2.add(vWeight_AR);
       panel2.add(vWeight_textfield);
       panel2.add(ED_AR);
       panel2.add(ED_textfield);
       panel2.add(Torque_AR);
       panel2.add(Torque_textfield);
       panel2.add(FTC_AR);
       panel2.add(FTC_textfield);
       panel2.add(GC_AR);
       panel2.add(GC_textfield);
       panel2.add(add_btn1);
       
       
       
       //Adding TextFields,labels and buttons to book aurorickshaw in panel3
       
       panel3.add(vID2_AR);
       panel3.add(vID2_textfield);
       panel3.add(Book_AR);
       panel3.add(Day);
       panel3.add(Month);
       panel3.add(Year);
       panel3.add(NOS_AR);
       panel3.add(NOS_textfield);
       panel3.add(CA_AR);
       panel3.add(CA_textfield);
       panel3.add(Display_btn);
       panel3.add(Clear_btn);
       panel3.add(book_btn);
       panel3.add(ChangeEV_btn);
       
       
       panel1.setLayout(null);
       panel1.add(panel2);
       panel1.add(panel3);
       panel1.add(heading_AR);
       panel1.add(ChangeEV_btn);
       frame.add(panel1);
       
    }
       
//--------------------------------------------New Frame for Electric Scooter---------------------------------------------//
   public void ElectricScooter_gui()
   {
       
       frameE = new JFrame("Electric Scooter");
       frameE.setVisible(true);
       frameE.setBounds(100,25,1200,720);
       
       
       //panel1 for electric scoooter
       panelE1 = new JPanel();
       panelE1.setSize(1200, 700);
       
       //adding change to electric scooter button to panel1
       ChangeAR_btn = new JButton();
       ChangeAR_btn.setBounds(420,620,310,40);
       ChangeAR_btn.setText("Change to Auto Rickshaw");
       ChangeAR_btn.setBackground(new Color(135,206,250));
       ChangeAR_btn.addActionListener(this);
       
       
       panelE2 = new JPanel();
       panelE2.setBounds(10,70,570,540);
       panelE2.setBackground(new Color(169, 210, 163));
       panelE2.setLayout(null);
       
       panelE3 = new JPanel();
       panelE3.setBounds(600,70,570,540);
       panelE3.setBackground(new Color(243,220,233));
       panelE3.setLayout(null);
       
       //label and text field for electric scooter
       
       heading_ES = new JLabel("Electric Scooter");
       heading_ES.setBounds(500, 20, 250, 25);
       heading_ES.setFont(new Font("SansSerif", Font.BOLD, 30));
       
       // Labels, Buttons and texfields for adding an electric scooter
       vID1_ES = new JLabel();
       vID1_ES.setText("Vehicle ID:");
       vID1_ES.setBounds(50,20,100,25);
       EvID1_textfield = new JTextField();
       EvID1_textfield.setBounds(220,20,150,30);
       
       vName_ES = new JLabel();
       vName_ES.setText("Vehicle Name:");
       vName_ES.setBounds(50,70,100,25);
       EName_textfield = new JTextField();
       EName_textfield.setBounds(220,70,150,30);
       
       vWeight_ES = new JLabel();
       vWeight_ES .setText("Vehicle Weight:");
       vWeight_ES .setBounds(50,120,100,25);
       EvWeight_textfield = new JTextField();
       EvWeight_textfield.setBounds(220,120,150,30);
       
       vColor_ES = new JLabel();
       vColor_ES.setText("Vehicle Colour:");
       vColor_ES.setBounds(50,170,100,25);
       EColor_textfield = new JTextField();
       EColor_textfield.setBounds(220,170,150,30);
       
       vSpeed_ES = new JLabel();
       vSpeed_ES .setText("Vehicle Speed:");
       vSpeed_ES .setBounds(50,220,100,25);
       ESpeed_textfield = new JTextField();
       ESpeed_textfield.setBounds(220,220,150,30);
       
       
       BC_E= new JLabel();
       BC_E.setText("Battery Capacity:");
       BC_E.setBounds(50,270,160,25);
       BC_textfield = new JTextField();
       BC_textfield.setBounds(220,270,150,30);
       
       vID2_ES = new JLabel();
       vID2_ES.setText("Vehicle ID:");
       vID2_ES.setBounds(80,10,100,25);
       EvID2_textfield = new JTextField();
       EvID2_textfield.setBounds(250,10,150,30);
       
       Brand_E = new JLabel();
       Brand_E.setText("Brand:");
       Brand_E.setBounds(80,60,120,25);
       Brand_textfield = new JTextField();
       Brand_textfield.setBounds(250,60,150,30);
       
       Price_E= new JLabel();
       Price_E.setText("Price:");
       Price_E.setBounds(80,110,160,25);
       Price_textfield = new JTextField();
       Price_textfield.setBounds(250,110,150,30);
       
       ChargingTime_E= new JLabel();
       ChargingTime_E.setText("Charging Time:");
       ChargingTime_E.setBounds(80,160,160,25);
       ChargingTime_textfield = new JTextField();
       ChargingTime_textfield.setBounds(250,160,150,30);
       
       Mileage_E= new JLabel();
       Mileage_E.setText("Mileage:");
       Mileage_E.setBounds(80,210,160,25);
       Mileage_textfield= new JTextField();
       Mileage_textfield.setBounds(250,210,150,30);
       
       Range_E= new JLabel();
       Range_E.setText("Range:");
       Range_E.setBounds(80,260,160,25);
       Range_textfield = new JTextField();
       Range_textfield.setBounds(250,260,150,30);
       
       
       
       //Adding Buttons 
       
       add_btn2 = new JButton();
       add_btn2.setBounds(50,350,320,40);
       add_btn2.setText("Add an Electric Scooter");
       add_btn2.addActionListener(this);
       
       ClearE_btn = new JButton();
       ClearE_btn.setBounds(240,450,130,45);
       ClearE_btn.setText("Clear");
       ClearE_btn.setBackground(new Color(220,20,60));
       ClearE_btn.addActionListener(this);
       
       DisplayE_btn = new JButton();
       DisplayE_btn.setBounds(50,450,130,45);
       DisplayE_btn.setText("Display");
       DisplayE_btn.setBackground(new Color(135,206,250));
       DisplayE_btn.addActionListener(this);
       
       purchase_btn = new JButton();
       purchase_btn.setBounds(80,310,320,40);
       purchase_btn.setText("Purchase Electric Scooter");
       purchase_btn.addActionListener(this);
       
       vID3_ES= new JLabel();
       vID3_ES.setText("Vehicle ID:");
       vID3_ES.setBounds(80,375,160,25);
       EvID3_textfield = new JTextField();
       EvID3_textfield.setBounds(250,375,150,30);
       
       Price2_E= new JLabel();
       Price2_E.setText("Price:");
       Price2_E.setBounds(80,425,160,25);
       Price2_textfield = new JTextField();
       Price2_textfield.setBounds(250,425,150,30);
       
       
       sell_btn = new JButton();
       sell_btn.setBounds(80,480,320,40);
       sell_btn.setText("Sell Electric Scooter");
       sell_btn.addActionListener(this);
       
       
       //Adding labels , textfields and  buttons to panel
       panelE2.add(vID1_ES);
       panelE2.add(EvID1_textfield);
       panelE2.add(vName_ES);
       panelE2.add(EName_textfield);
       panelE2.add(vColor_ES);
       panelE2.add(EColor_textfield);
       panelE2.add(vSpeed_ES);
       panelE2.add(ESpeed_textfield);
       panelE2.add(vWeight_ES);
       panelE2.add(EvWeight_textfield);
       panelE2.add(BC_E);
       panelE2.add(BC_textfield);
       panelE2.add(add_btn2);
       panelE2.add(DisplayE_btn);
       panelE2.add(ClearE_btn); 
       
       //Adding TextFields,labels and buttons to book Electric Scooter in panel3
       

       panelE3.add(Brand_E);
       panelE3.add(Brand_textfield);
       panelE3.add(Price_E);
       panelE3.add(Price_textfield);
       panelE3.add(ChargingTime_E);
       panelE3.add(ChargingTime_textfield);
       panelE3.add(Mileage_E);
       panelE3.add(Mileage_textfield);
       panelE3.add(Range_E);
       panelE3.add(Range_textfield);
       panelE3.add(purchase_btn);
       panelE3.add(vID2_ES);
       panelE3.add(EvID2_textfield);
       panelE3.add(vID3_ES);
       panelE3.add(EvID3_textfield);
       panelE3.add(Price2_E);
       panelE3.add(Price2_textfield);
       panelE3.add(sell_btn);
       
       panelE1.setLayout(null);
       panelE1.add(panelE2);
       panelE1.add(panelE3);
       panelE1.add(heading_ES);
       panelE1.add(ChangeAR_btn);
       frameE.add(panelE1);
       
    
    }
    

   //for button functionality of auto rickshaw method
   
   public void actionPerformed(ActionEvent e)
   {
       //calling electricScooter_gui() method
       
       if(e.getSource() == ChangeEV_btn)
       {
           ElectricScooter_gui();
           
       }
       
       if(e.getSource() == ChangeAR_btn)
       {
           //calling AutoRickshaw_gui() method
           
           AutoRickshaw_gui();
           
       }
       
       
       if(e.getSource() == add_btn1)
        {
            try
            {
                String vID = vID1_textfield.getText();
                String vName = vName_textfield.getText();
                String vWeight = vWeight_textfield.getText();
                String vColor = vColor_textfield.getText();
                String vSpeed = vSpeed_textfield.getText();
                String vED = ED_textfield.getText();
                String vTorque = Torque_textfield.getText();
                String vFTC = FTC_textfield.getText();
                String vGC = GC_textfield.getText();
                
                
                int a = Integer.parseInt(vID);
                int b = Integer.parseInt(vED);
                int c = Integer.parseInt(vFTC);
                
                AutoRickshaw auto_rickshaw = new AutoRickshaw(a,vName,vWeight,vColor,vSpeed,b,vTorque,c,vGC);
                
                boolean T = false;
                for(Vehicle i : vehicles)
                {
                    if(i.getVehicleID () == Integer.parseInt(vID1_textfield.getText()))
                    {
                        T = true;
                        break;
                    }
                }
                
                if(T == false)
                {
                    vehicles.add(auto_rickshaw);
                    JOptionPane.showMessageDialog(panel2,"Added successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(panel2,"This vehicle is already added.","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
            
            catch(NumberFormatException a)
            {
                JOptionPane.showMessageDialog(panel2,"Invalid datatype!!\n NOTE: Please enter integer value for Vehicle ID,Engine Displacement,Fueltank Capacity .","Error",JOptionPane.ERROR_MESSAGE);
    
            }
            
       }
       
       if(e.getSource() == book_btn)
        {
            try
            {
                String day = Day.getSelectedItem().toString();
                String month = Month.getSelectedItem().toString();
                String year = Year.getSelectedItem().toString();
                String date = day+"-"+month+"-"+year;
                Vehicle AR ;
                boolean Tt;
            
                for(Vehicle obj : vehicles)
                {
                    if(obj.getVehicleID() == Integer.parseInt(vID2_textfield.getText()))
                    {
                        if (obj instanceof AutoRickshaw)
                        {
                            int CA = Integer.parseInt(CA_textfield.getText());
                            int NOS = Integer.parseInt(NOS_textfield.getText());

                            AR= (AutoRickshaw)obj;
                            Tt = ((AutoRickshaw)AR).getisBooked();
                            
                            if(Tt == false)
                            {
                                ((AutoRickshaw)AR).book(date,CA,NOS);
                                JOptionPane.showMessageDialog(panel3,"The Vehicle is booked successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panel3,"This Vehicle is already booked. Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(panel3,"This Vehicle doesn't exist.Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                    
                    }
                }
            }
            catch(NumberFormatException a)
            {
                JOptionPane.showMessageDialog(panel3,"Invalid !! please enter valid datatype.\n  NOTE: Please enter Integer value for ChargeAmount & NumberOfSeats","Error",JOptionPane.ERROR_MESSAGE);
                
            }
        }
        
       
       if(e.getSource() == Clear_btn)
       {
           
           vName_textfield.setText("");
           vID1_textfield.setText("");
           vID2_textfield.setText("");
           vWeight_textfield.setText("");
           vSpeed_textfield.setText("");
           vColor_textfield.setText("");
           ED_textfield.setText("");
           Torque_textfield.setText("");
           NOS_textfield.setText("");
           FTC_textfield.setText("");
           GC_textfield.setText("");
           CA_textfield.setText("");
           Day.setSelectedIndex(0);
           Month.setSelectedIndex(0);
           Year.setSelectedIndex(0);
            
       }
       
       
        if(e.getSource() == Display_btn)
        {   Vehicle display;
            for(Vehicle obj : vehicles)
            {
                if(obj instanceof AutoRickshaw)
                {
                    String vID = "Vehicle ID: "+vID1_textfield.getText()+"\n";
                    String vName = "Vehicle Name: "+vName_textfield.getText()+"\n";
                    String vWeight = "Vehicle Weight: "+vWeight_textfield.getText()+"\n";
                    String vColor = "Vehicle Colour: "+vColor_textfield.getText()+"\n";
                    String vSpeed = "Vehicle Speed: "+vSpeed_textfield.getText()+"\n";
                    String vED = "Engine Displacement: "+ED_textfield.getText()+"\n";
                    String vTorque = "Torque: "+Torque_textfield.getText()+"\n";
                    String vFTC = "Fuel Tank Capacity: "+FTC_textfield.getText()+"\n";
                    String vGC = "Ground Clearance: "+GC_textfield.getText()+"\n";
                    String day = Day.getSelectedItem().toString();
                    String month = Month.getSelectedItem().toString();
                    String year = Year.getSelectedItem().toString();
                    String date = "Booked Date: "+day+"-"+month+"-"+year+"\n";
                    String CA = "Charge Amount: "+CA_textfield.getText()+"\n";
                    String NOS = "Number of Seats: "+NOS_textfield.getText()+"\n";

                    display = obj;
                    ((AutoRickshaw)display).display();
                    
                    JOptionPane.showMessageDialog(panel3,(vID+vName+vWeight+vColor+vSpeed+vED+vTorque+vFTC+vGC)+(date+CA+NOS),"Success",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
       
       //---------------------------Adding Button functionality of electric scooter-----------------------------------------------------------//

       
       
       
       if(e.getSource() == add_btn2)           //ADD ELCTRIC SCOOTER BUTTON(add_btn2)
       
       {
           
            try
            
            {
                int es_vID = Integer.parseInt(EvID1_textfield.getText());
                String es_Name = EName_textfield.getText();
                String es_Weight = EvWeight_textfield.getText();
                String es_Speed = ESpeed_textfield.getText();
                String es_Color = EColor_textfield.getText();
                int es_Batterycapacity = Integer.parseInt(BC_textfield.getText());
                
                ElectricScooter ES = new ElectricScooter(es_vID, es_Name, es_Weight, es_Speed, es_Color, es_Batterycapacity);
                boolean T = false;

                for(Vehicle i : vehicles)
                {
                    if(i.getVehicleID() == Integer.parseInt(EvID1_textfield.getText()))
                    {
                        T = true;
                        break;
                    }
                }

                if (T == false)
                {
                    vehicles.add(ES);
                    JOptionPane.showMessageDialog(panelE2,"Added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    JOptionPane.showMessageDialog(panelE2,"This Electric Scooter already exist.Please try again.","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            
            {
                JOptionPane.showMessageDialog(panelE2,"Invalid.Please enter valid data.\n NOTE: Please enter Integer value for vehicle ID and BatteryCapacity","Error",JOptionPane.ERROR_MESSAGE);
            }
       }
       

       
       
       
       if(e.getSource() == purchase_btn)         //PURCHASE ELCTRIC SCOOTER BUTTON
        {
            try
            {
                Vehicle buy;
                boolean Tt;
                for(Vehicle obj: vehicles)
                {
                    if(obj.getVehicleID() == Integer.parseInt(EvID2_textfield.getText()))
                    {
                        if(obj instanceof ElectricScooter)
                        {
                            buy = obj;
                            Tt = ((ElectricScooter)buy).gethasPurchased();
                            String B = Brand_textfield.getText();
                            String CT = ChargingTime_textfield.getText();
                            String M = Mileage_textfield.getText();
                            int R = Integer.parseInt(Range_textfield.getText());
                            int P = Integer.parseInt(Price_textfield.getText());
                            
                            if(Tt == false)
                            {
                                ((ElectricScooter)buy).purchase(B,P, CT, M, R);
                                JOptionPane.showMessageDialog(panelE3,"The vehicle has been Purchased successfully.","Successful",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panelE3,"The Vehicle is already purchased.","Successful",JOptionPane.INFORMATION_MESSAGE);
                            }        
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(panelE3,"This Vehicle doesn't exist.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(panelE3,"Invalid! Please enter valid data. \n NOTE: Please enter integer value for Price and Range.","Error",JOptionPane.ERROR_MESSAGE);
            }
       }
       
       
       
       if(e.getSource() == sell_btn)             //SELL ELECTRIC SCOOTER BUTTON
       {
            try
            {
                Vehicle sell;
                boolean Tt;
                for(Vehicle obj: vehicles)
                {
                    if(obj.getVehicleID() == Integer.parseInt(EvID3_textfield.getText()))
                    {
                        if(obj instanceof ElectricScooter)
                        {
                            sell = obj;
                            Tt = ((ElectricScooter)sell).gethasSold();
                            int P = Integer.parseInt(Price2_textfield.getText());
                            
                            if(Tt == false)
                            {
                                ((ElectricScooter)sell).sell( P); 
                                JOptionPane.showMessageDialog(panelE3,"Sold successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panelE3,"The vehicle is already sold.","Success",JOptionPane.INFORMATION_MESSAGE);
                            }        
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(panelE3,"This vehicle doesn't exist.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(panelE3,"Invalid! Please enter valid data.\n NOTE: Please enter integer value for Price.","Error",JOptionPane.ERROR_MESSAGE);
            }
       }
       
       

       if(e.getSource() == DisplayE_btn)            //DISPLAY BUTTON FOR ELECTRIC SCOOTER 
       {   Vehicle displayES;
           for(Vehicle obj : vehicles)
           
           {
               if(obj instanceof ElectricScooter)
               
              {
                    String vID = "Vehicle ID: "+EvID1_textfield.getText()+"\n";
                    String vName = "Vehicle Name: "+EName_textfield.getText()+"\n";
                    String vWeight = "Vehicle Weight: "+EvWeight_textfield.getText()+"\n";
                    String vColor = "Vehicle Colour: "+EColor_textfield.getText()+"\n";
                    String vSpeed = "Vehicle Speed: "+ESpeed_textfield.getText()+"\n";
                    String BC ="Battery Capacity: " +BC_textfield.getText()+"\n";
                    String B ="Brand: "+Brand_textfield.getText()+"\n";
                    String M ="Mileage: "+Mileage_textfield.getText()+"\n";
                    String R ="Range: "+Range_textfield.getText()+"\n";
                    String CT ="Charging Time: "+ChargingTime_textfield.getText()+"\n";
                    displayES = obj;
                    ((ElectricScooter)displayES).display();
                    
                    JOptionPane.showMessageDialog(panel3,(vID+vName+vWeight+vColor+vSpeed+BC+B+M+R+CT),"Success",JOptionPane.INFORMATION_MESSAGE);
                    
              }
              
                
           }
       }
       
       if(e.getSource() == ClearE_btn)
       {
           
           EvID1_textfield.setText("");
           EName_textfield.setText("");
           EvWeight_textfield.setText("");
           EColor_textfield.setText("");
           ESpeed_textfield.setText("");
           BC_textfield.setText("");
           EvID2_textfield.setText("");
           Brand_textfield.setText("");
           Price_textfield.setText("");
           ChargingTime_textfield.setText("");
           Mileage_textfield.setText("");
           Range_textfield.setText("");
           EvID3_textfield.setText("");
           Price2_textfield.setText("");
           
            
       }
        
       
        
        
       
       
       
       
   }
   
   
   
}

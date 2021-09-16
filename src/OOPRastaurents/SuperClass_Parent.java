/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPRastaurents;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shofi_Ahmed
 */
public class SuperClass_Parent {
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double CheeseBurger;
    public double ChickenLegend;
    
    public double MilkShake;
    public double VinilaCone;
    public double VinilaMilkShake;
    public double ChocolateMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    
    public double GetAmount()
    {
       Meals = ChickenBurger +  ChickenBurgerM + CheeseBurger + ChickenLegend;
       Drinks = MilkShake + VinilaCone + VinilaMilkShake + ChocolateMilkShake;
       TotalofMD = Meals + Drinks;
       AllTotalofMD = TotalofMD;
       return AllTotalofMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem()
    {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "confrm if you want to exit", "Restaurant Managment System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    public double pChickenBurger = 35.00;
    public double pChickenBurgerM = 40.00;
    public double pCheeseBurger = 45.00;
    public double pChickenLegend = 50.00;
    
    public double pMilkShake = 35.00;
    public double pVinilaCone = 40.00;
    public double pVinilaMilkShake = 45.00;
    public double pChocolateMilkShake = 50.00;
    
    public double mcTax= 0.15;
    public Double cFindTax(double cAmount)
    {
        double FindTax = mcTax * AllTotalofMD;
        return FindTax;
    }
}

/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

import javax.swing.*;
import java.text.DecimalFormat;


public class SalesCommission {

    public static void main(String[] args) {
        double Hours = getInput("how many hours");
        double rate = getInput("what is the rate");
        double Commission = getInput("what the Percent of sale:");
        double Hourlypay = getInput("what is ")

        double payRate = payRate(Hours, rate,);
        double Commission = Commission( Hourlypay, Commission);




    }
    public static int getInput(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
    public static double payRate(double Hours, double rate, double Sale, double Total){
       return Hours * rate + Sale * Total / 100.00;
    }
    public static double Commission(double HourlyPay, double Commission){
        return HourlyPay + Commission;

    }
    public static void Output(double payRate, double Commssion){
        DecimalFormat round = new DecimalFormat("#.##");

        JOptionPane.showMessageDialog(null, "Hourly Rate:" + round.format(payRate));
        JOptionPane.showMessageDialog(null, "Hours Worked: " + round.format(payRate));
        JOptionPane.showMessageDialog(null, "Sale Commission: " + round.format(Commssion));
        JOptionPane.showMessageDialog(null, "Total Sales: " + round.format(Commssion));


    }

}

import java.util.Scanner;
public class Ex4_Q4_TestMyFCStaff
{
   public static void main(String[]args)
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Staff Name: ");
      String name = console.nextLine();
      System.out.print("Staff ID: ");
      String staffID = console.nextLine();
      System.out.print("Total Hours Work: ");
      int totalHoursWork = console.nextInt();
      System.out.print("Total Sales: RM ");
      double totalSales = console.nextDouble();
      
      MyFCStaff info= new MyFCStaff(name,staffID,totalHoursWork,totalSales);
      System.out.println(info.toString());
   }
}

class MyFCStaff
{
   private String name;
   private String staffID;
   private int totalHoursWork;
   private double totalSales;
   private double commission=0;
   private double totalSalary;
   
   public MyFCStaff(String name,String staffID,int totalHoursWork,double totalSales)
   {
      this.name=name;
      this.staffID=staffID;
      this.totalHoursWork=totalHoursWork;
      this.totalSales=totalSales;
   }
   public double calculateCommission()
   {
      if (totalSales>=150 && totalSales<=300)
         commission = totalSales * 0.05;
      else if (totalSales>=301 && totalSales<=500)
         commission = totalSales * 0.10;
      else if (totalSales>500)
         commission = totalSales * 0.15;
      else
         commission = 0;
         
      return commission;        
    }
   
    public double calculateSalary()
    {
      return totalSalary=totalHoursWork*8+calculateCommission();
    }
    public String toString()
    {
      String nm,id,tHours,tSales,tSalary;
      nm=String.format("%nStaff Name: %s%n",name);
      id=String.format("StaffID: %s%n",staffID);
      tHours=String.format("Hours Work: %d%n",totalHoursWork);
      tSales=String.format("Total Sale: RM %.2f%n",totalSales);
      tSalary=String.format("Total Salary: RM %.2f%n",calculateSalary());
      
      return nm + id + tHours + tSales + tSalary;
    }
}
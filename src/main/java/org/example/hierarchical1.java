package org.example;

import java.util.*;
class employee
{
    int emp_id;
    String empname;
} 
class salary extends employee
{
   double monthly_salary,da,hra,pf,gp,np;
   String designation;
   salary(int emp_id,String empname,String designation,double monthly_salary)
   {
       this.emp_id=emp_id;
       this.empname=empname;
       this.designation=designation;
       this.monthly_salary=monthly_salary;
   }
 void calculateSalary()
 {
     if(monthly_salary>=20000)
     {
         da= monthly_salary*0.04;
         hra=monthly_salary*0.05;
         pf=monthly_salary*0.12;
     }
     else
     {
         da=monthly_salary*0.02;
         hra=monthly_salary*0.03;
         pf=monthly_salary*0.1;
     }
     gp=monthly_salary+da+hra;
     np=gp-pf;
     System.out.println();
     System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
     System.out.println("Name of employee is::"+empname);
     System.out.println("Employee ID is::"+emp_id);
     System.out.println("Designation of employee is::"+designation);
     System.out.println("Basic salary is::"+monthly_salary);
     System.out.println("DA of employee is::"+ da);
     System.out.println("HRA of employee is::"+ hra);
     System.out.println("PF of employee is::"+ pf);
     System.out.println("Gross pay of empolyee is::"+ gp);
     System.out.println("Net pay of employee is::"+ np);
     System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
     }
 }
public class hierarchical1
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int id[] = new int[2];
       List<String> name = new ArrayList<>();
       List<String> desig = new ArrayList<>();
       double sal[] = new double[2]; char c='y';
       while(c=='y' || c=='Y')
   {
			System.out.println("Enter id of employee..");
			id[0] = s.nextInt();
			id[1] = s.nextInt();
			System.out.println("Enter name of employee..");
			name.add(s.next());
			name.add(s.next());
			System.out.println("Enter designation of employee..");
			desig.add(s.next());
			desig.add(s.next());
			System.out.println("Enter salary of employee..");
			sal[0] = s.nextDouble();
			sal[1] = s.nextDouble();
			salary x = new salary(id[0], name.get(0), desig.get(0), sal[0]);
			salary x1 = new salary(id[1], name.get(1), desig.get(1), sal[1]);
			x.calculateSalary();
			x1.calculateSalary();
		System.out.println("Do you want to continue?Enter (y or Y) to continue");
		c = s.next().charAt(0);
	}
}
}

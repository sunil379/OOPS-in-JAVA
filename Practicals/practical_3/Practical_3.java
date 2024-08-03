package practical_3;
/*
Practical No. :- 3 
Q.3] A company has many employees. An employee has employee Id, basic salary, house rent allowance, dearness allowance, profession tax and total salary. 
An employee has an address. The address has apartment number, apartment name, road and PIN code.
The total salary of an employee is the summation of basic salary, house rent allowance which is 20 percent of basic salary, dearness allowance which is 45 percent of basic salary. 
The take home salary is calculated after deducting profession tax from which is 7 percent of basic salary from the total salary.
When an employee is appointed, he is assigned with an employee Id and basic salary. One can ask for total salary of the employee and take-home salary of the employee.
Identify a class/classes from the above statement, identify the attributes, the data types, the behavior. Test your program for ten employees
Display all the details of the employees as per id and as per pin code.
Display takes home salary for all the employees; display the tax to be deducted across all employees.
*/

import java.util.*;

public class Practical_3 {
    public static void main(String[] args) {
        Employee Rahul = new Employee(101, "(42,TajResidency,400001)", 850000, "Rahul");
        Employee Priya = new Employee(102, "(15,InfinitiTowers,400002)", 1750000, "Priya");
        Employee Amit = new Employee(103, "(8,GaneshNagar,400003)", 2500000, "Amit");
        Employee Neha = new Employee(104, "(33,ShivajiPark,400004)", 3500000, "Neha");
        Employee Vikram = new Employee(105, "(19,MahalaxmiHeights,400005)", 4500000, "Vikram");
        Employee Sunil = new Employee(106, "(55,AshokaNagar,400006)", 5500000, "Anjali");
        Employee Rajesh = new Employee(107, "(7,VijayComplex,400007)", 3750000, "Rajesh");
        Employee Pooja = new Employee(108, "(22,GandhiRoad,400008)", 2250000, "Pooja");
        Employee Sanjay = new Employee(109, "(11,NehruPlace,400009)", 1350000, "Sanjay");
        Employee Meera = new Employee(110, "(39,IndiraNagar,400010)", 1600000, "Meera");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(Rahul);
        employees.add(Priya);
        employees.add(Amit);
        employees.add(Neha);
        employees.add(Vikram);
        employees.add(Sunil);
        employees.add(Rajesh);
        employees.add(Pooja);
        employees.add(Sanjay);
        employees.add(Meera);
        @SuppressWarnings("unused")
        Calculations f = new Calculations(employees);
        Display z = new Display(employees);
        System.out.println("Details of 10 Employees: ");
        z.getDisplay();
    }
}

class Calculations {
    public Calculations(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            employee.setPer((float) 0.2 * (employee.getBS()));
            employee.setHRA((float) (employee.getPer()));
        }
        for (Employee employee : employees) {
            employee.setPer2((float) 0.45 * (employee.getBS()));
            employee.setDA((float) (employee.getPer2()));
        }
        for (Employee employee : employees) {
            employee.setPer3((float) 0.07 * (employee.getBS()));
            employee.setPT((float) (employee.getPer3()));
        }
        for (Employee employee : employees) {
            employee.setPer4((employee.getBS()) + employee.getHRA() + employee.getDA());
            employee.setTS((float) (employee.getPer4()));
        }
        for (Employee employee : employees) {
            employee.setPer5((employee.getTS()) - employee.getPT());
            employee.setTHS((float) (employee.getPer5()));
        }
    }
}

class Display {
    ArrayList<Employee> employees;

    public Display(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void getDisplay() {
        System.out.printf("%-10s %-5s %-25s %-12s %-10s %-10s %-10s %-12s %-15s%n",
                "Name", "ID", "Address", "BasicSalary", "HRA", "DA", "PTax", "TotalSalary", "TakeHomeSalary");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        for (Employee employee : employees) {
            System.out.printf("%-10s %-5d %-25s %-12d %-10.2f %-10.2f %-10.2f %-12.2f %-15.2f%n",
                    employee.getName(),
                    employee.getEmpId(),
                    employee.getAddress(),
                    employee.getBS(),
                    employee.getHRA(),
                    employee.getDA(),
                    employee.getPT(),
                    employee.getTS(),
                    employee.getTHS());
        }
    }

}

class Employee {
    int EmpId, BS;
    String name, address;
    float HRA, DA, PT, TS, THS;
    float per, per2, per3, per4, per5;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        this.EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBS() {
        return BS;
    }

    public void setBS(int BS) {
        this.BS = BS;
    }

    public Employee(int EmpId, String address, int BS, String name) {
        this.EmpId = EmpId;
        this.address = address;
        this.name = name;
        this.BS = BS;
    }

    public float getHRA() {
        return HRA;
    }

    public void setHRA(float HRA) {
        this.HRA = HRA;
    }

    public float getDA() {
        return DA;
    }

    public void setDA(float DA) {
        this.DA = DA;
    }

    public float getPT() {
        return PT;
    }

    public void setPT(float PT) {
        this.PT = PT;
    }

    public float getTS() {
        return TS;
    }

    public void setTS(float TS) {
        this.TS = TS;
    }

    public float getTHS() {
        return THS;
    }

    public void setTHS(float THS) {
        this.THS = THS;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public float getPer2() {
        return per2;
    }

    public void setPer2(float per2) {
        this.per2 = per2;
    }

    public float getPer3() {
        return per3;
    }

    public void setPer3(float per3) {
        this.per3 = per3;
    }

    public float getPer4() {
        return per4;
    }

    public void setPer4(float per4) {
        this.per4 = per4;
    }

    public float getPer5() {
        return per5;
    }

    public void setPer5(float per5) {
        this.per5 = per5;
    }
}
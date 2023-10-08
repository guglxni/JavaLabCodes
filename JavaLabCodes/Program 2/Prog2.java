import java.util.Scanner;
class Address{
    int street_num;
    String city,state,country;

    Address(int sn, String c,String s,String cy)
    {
        street_num = sn;
        city = c;
        state = s;
        country = cy;
    }
}

class Student{
    String USN,Name;
    Address address;

    Student(String usn,String name,Address a)
    {
        USN = usn;
        Name = name;
        address = a;
    }

}
class College{
    String Name;
    Address address;

    College(String name,Address a)
    {
        Name = name;
        address = a;
    }
}
class Employee{
    String name,empID;
    Address address;

    Employee(String EmpID,String Name,Address a)
    {
        empID = EmpID;
        name = Name;
        address = a;
    }
}
public class Prog2 {
    public static void main(String[] args)
    {
        int s=0,c=0,e=0,i,sn,choice;
        Address ad;
        String temp1,temp2,city,state,country;
        Student[] students;
        College[] colleges;
        Employee[] employees;
        students = new Student[20];
        colleges = new College[20];
        employees = new Employee[20];
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("1.Enter the student details\n2.Enter the college details\n3.Enter the employee details\n4.Get the data\nAny other number to exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of students");
                    s = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter the student data (USN,Name,address(street num , city , state, country\n");
                    for (i = 0; i < s; i++) {
                        System.out.println("for student " + (i + 1));
                        temp1 = in.nextLine();
                        temp2 = in.nextLine();
                        sn = in.nextInt();
                        in.nextLine();
                        city = in.nextLine();
                        state = in.nextLine();
                        country = in.nextLine();
                        ad = new Address(sn, city, state, country);
                        students[i] = new Student(temp1, temp2, ad);
                    }
                    break;
                case 2:
                    System.out.println("Enter the number of colleges");
                    c = in.nextInt();
                    in.nextLine();

                    System.out.print("Enter the details for college\n");
                    for (i = 0; i < c; i++) {
                        System.out.print("for college " + (i + 1) + "(name , address)\n");
                        temp1 = in.nextLine();
                        sn = in.nextInt();
                        in.nextLine();
                        city = in.nextLine();
                        state = in.nextLine();
                        country = in.nextLine();
                        ad = new Address(sn, city, state, country);
                        colleges[i] = new College(temp1, ad);
                    }
                    break;
                case 3:
                    System.out.println("Enter the number of employees");
                    e = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter the details for employees(empid, name,address)\n");
                    for (i = 0; i < e; i++) {
                        System.out.print("for employee " + (i + 1) + " empid , name,address\n");
                        temp1 = in.nextLine();
                        temp2 = in.nextLine();
                        sn = in.nextInt();
                        in.nextLine();
                        city = in.nextLine();
                        state = in.nextLine();
                        country = in.nextLine();
                        ad = new Address(sn, city, state, country);
                        employees[i] = new Employee(temp1, temp2, ad);
                    }
                    break;
                case 4:
                    System.out.println("Student number\tUSN\t Name\tAddress\n");
                    for (i = 0; i < s; i++) {
                        System.out.println((i + 1) +"\t" + students[i].USN + "\t" + students[i].Name + "\t" + students[i].address.street_num + " " + students[i].address.city + " " + students[i].address.state + " " + students[i].address.country);
                    }
                    System.out.println("College number\tName\tAddress\n");
                    for (i = 0; i < c; i++) {

                        System.out.println((i + 1) +"\t" + colleges[i].Name + "\t"+ colleges[i].address.street_num + " " + colleges[i].address.city + " " + colleges[i].address.state + " " + colleges[i].address.country);
                    }
                    System.out.println("employee number\tEmpid\tName\tAddress\n");
                    for (i = 0; i < e; i++) {

                        System.out.println((i + 1) + "\t" + employees[i].empID + "\t " + employees[i].name + "\t" + employees[i].address.street_num + " " + employees[i].address.city + " " + employees[i].address.state + " " + employees[i].address.country);
                    }
                    break;




                default:
                    System.exit(0);
            }
        }


    }
}

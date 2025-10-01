import java.util.*;

public class Main {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int id;
    String name,address,phone,email;
    CustomerService cs=new CustomerService();

    // asking the user for checking where they are customer/ admin
    System.out.println("Enter your domain customer or admin as (C/A): ");
    String type=sc.nextLine();
    if(type.equalsIgnoreCase("C")){
        System.out.println("1. To Add customer Details\n2. To Update Customer Details\n3. to Book Courier\n 4. to make payment\n5. Exit\nEnter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter your customer id: ");
            id=sc.nextInt();
            sc.nextLine();//to consume extra newline
            System.out.println("Enter your Name: ");
            name=sc.nextLine();
            System.out.println("Enter your Mobile no: ");
            phone=sc.nextLine();
            System.out.println("Enter your Address: ");
            address=sc.nextLine();
            System.out.println("Enter you Email id: ");
            email=sc.nextLine();
            cs.AddCustomerdetails(id,name,phone,address, email);
            break;

            case 2:
            System.out.println("Enter your customer id: ");
            id=sc.nextInt();
            sc.nextLine(); //to consume newline
            System.out.println("Enter your Name: ");
            name=sc.nextLine();
            System.out.println("Enter your Mobile no: ");
            phone=sc.nextLine();
            System.out.println("Enter your Address: ");
            address=sc.nextLine();
            System.out.println("Enter you Email id: ");
            email=sc.nextLine();
            cs.changeCustomerDetails(id,name,phone,address,email);
            break;
            case 3:break;
            case 4:break;
            case 5:
            System.out.println("SEE you again ,Exiting....");
            break; 
        }
    }

  }

}

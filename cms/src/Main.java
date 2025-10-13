import java.util.*;

public class Main {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int id,choice;// declaring variable before because of usinf switch 
    String name,address,phone,email,status;
    //create obj for classes
    CustomerService cs=new CustomerService();
    CourierService cous=new CourierService();
    Payment pay=new Payment();

    // asking the user for checking where they are customer/ admin
    System.out.println("Enter your domain customer or admin as (C/A): ");
    String type=sc.nextLine();
    // there is chance the user may enter a noncase sensitive letter to avoid this using equalsIgnoreCase()
    if(type.equalsIgnoreCase("C")){
        //menu driven detail for user to choose correct work
        System.out.println("1. To Add customer Details\n2. To Update Customer Details\n3. to Book Courier\n4. to make payment\n5. Exit\nEnter your choice: ");
        choice=sc.nextInt();
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
            System.out.println("Enter your Email id: ");
            email=sc.nextLine();
            cs.changeCustomerDetails(id,name,phone,address,email);
            break;

            case 3:
            System.out.println("Enter your Courier ID: ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Description for your parcel: ");
            String desc=sc.nextLine();
            System.out.println("Enter weight of your Product: ");
            double weight=sc.nextDouble();
            sc.nextLine();//to consume extra newline
            System.out.println("Enter the status of your product: ");
            status=sc.nextLine();
            System.out.println("Enter your Customer ID: ");
            int customer_id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the your Branch name: ");
            String bname=sc.nextLine();
            cous.BookCourier(id,desc,weight,status,customer_id,bname);
            break;

            case 4:
            System.out.println("Enter your payment id: ");
            int payment_id=sc.nextInt();
            System.out.println("Enter a Courier_id: ");
            id=sc.nextInt();
            System.out.println("Enter a amount to be Paid: ");
            double amt=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter your mode you want to pay: ");
            String mode=sc.nextLine();
            System.out.println("Enter a status of your payment: ");
            status=sc.nextLine();
            pay.MakePayment(payment_id,id,amt,mode,status);
            break;

            case 5:
            System.out.println("SEE you again ,Exiting....");
            break; 
        }
    }

    // if the user enter 'A' admin part will work
    else if(type.equalsIgnoreCase("A")){
        System.out.println("1.Update courier status\n2.update payment status\n3.Exit\nEnter your choice: ");
        choice =sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter your courier id to be updated: ");
            id=sc.nextInt();
            sc.nextLine();// to consume extra new line
            System.out.println("ENter a status to update: ");
            status=sc.nextLine();
            cous.updateStatus(id,status);
            break;

            case 2:
            System.out.println("Enter your payment id to be updated: ");
            id=sc.nextInt();
            sc.nextLine();// to consume extra new line
            System.out.println("Eter a status to update: ");
            status=sc.nextLine();
            pay.updatepaymentStatus(id,status);
            break;
        // this case will get execute when user enter '3'
            case 3:
            System.out.println("Thank you for spending your presious time!! exiting...");
            break;
        }
    }
    // this case will get execute if user does not enter neither 'c' not 'a'
    else
    {
        System.out.println("type is invalid try again..");
    }

    sc.close();

  }

}

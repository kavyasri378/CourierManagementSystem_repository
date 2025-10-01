import java.util.*;
import java.sql.*;

public class CustomerService {
    // using this function the customer can add their details to Courier System
    public void AddCustomerdetails(int customer_id,String name,String phone,String address,String email){
        String query="INSERT INTO customer (customer_id,name,phone,address,email) VALUES(?,?,?,?,?)";
        try(Connection con= DBManager.getConnection();
        PreparedStatement pmt = con.prepareStatement(query))
        {
           pmt.setInt(1,customer_id);
           pmt.setString(2,name);
           pmt.setString(3,phone);
           pmt.setString(4,address);
           pmt.setString(5,email);
           pmt.executeUpdate();
           System.out.println(name+"! Congradulation your details get added successfully!!...");
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }


    //using this function the customer can make the change to their details if needed
    public void changeCustomerDetails(int customer_id,String name,String phone,String address, String email)
    {
        String quer="UPDATE customer SET name=?,phone=?,address=?,email=? WHERE customer_id=?";
        try(Connection con=DBManager.getConnection();
        PreparedStatement pst=con.prepareStatement(quer))
        {
            pst.setString(1,name);
            pst.setString(2,phone);
            pst.setString(3,address);
            pst.setString(4,email);
            pst.setInt(5,customer_id);
            pst.executeUpdate();
            System.out.println(name+"!Congratulation ,your details get updated in customer details!!");
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }

}

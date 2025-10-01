import java.util.*;
import java.sql.*;
public class CourierService {
    public void BookCourier(int id,String desc,double weight,String status,int cus_id,String Bname)
    {
        String query="INSERT INTO courier (courier_id,description,weight,statuc,customer_id,branch_name) VALUES (?,?,?,?,?,?)";
        try(Connection con=DBManager.getConnection();
        PreparedStatement pmt=con.prepareStatement(query))
        {
            pmt.setInt(1,id);
            pmt.setString(2,desc);
            pmt.setDouble(3,weight);
            pmt.setString(4,status);
            pmt.setInt(5,cus_id);
            pmt.setString(6,Bname);
            pmt.executeUpdate();
            System.out.println("Congratulations!! your order of Booking parcel is Updated successfully!!");
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }

    public void updateStatus(int id,String status){
        String query="UPDATE courier SET statuc=? WHERE courier_id=?";
        try(Connection con=DBManager.getConnection();
        PreparedStatement pmt=con.prepareStatement(query))
        {
            pmt.setString(1,status);
            pmt.setInt(2,id);
            int r=pmt.executeUpdate();
            if(r>0){
                System.out.println("Status of the courier get updated!!");
            }
            else{
                System.out.println("Courier not found");
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}

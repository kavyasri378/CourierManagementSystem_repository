import java.util.*;
import java.sql.*;

public class Payment {
    public void MakePayment(int payment_id, int courier_id, double amt, String mode, String status) {
        String query = "INSERT INTO payment (payment_id,courier_id,amount,mode,status) VALUES (?,?,?,?,?)";
        try (Connection con = DBManager.getConnection();
                PreparedStatement pmt = con.prepareStatement(query)) {
            pmt.setInt(1, payment_id);
            pmt.setInt(2, courier_id);
            pmt.setDouble(3, amt);
            pmt.setString(4, mode);
            pmt.setString(5, status);
            pmt.executeUpdate();
            System.out.println("Your Payment is Done Successfully!!!!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void updatepaymentStatus(int id, String status) {
        String query = "UPDATE payment SET status=? WHERE payment_id=?";
        try (Connection con = DBManager.getConnection();
                PreparedStatement pmt = con.prepareStatement(query)) {
            pmt.setString(1, status);
            pmt.setInt(2, id);
            int r = pmt.executeUpdate();
            if (r > 0) {
                System.out.println("Status of the payment get updated!!");
            } else {
                System.out.println("Courier not found");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

package PosProject;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class AdminCred {
    static DBConnection db;
    private final String adminUser = "Admin";
    private final String adminPass = "123";
    
    public String getAdminUser () {
        return this.adminUser;
    }
    
    public String getAdminPass() {
        return this.adminPass;
    }
    
    public void storeToDB () {
        db = new DBConnection();
        try {
            db.ps = db.con.prepareStatement("INSERT INTO admin (Username, Password) VALUES (?,?)");
            db.ps.setString(1, getAdminUser());
            db.ps.setString(2, getAdminPass());
            
            int check = db.ps.executeUpdate();
            
                if(check == 1) {
                    System.out.println("Stored");
                } else {
                    System.out.println("Not stored");
                }
            }
        catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
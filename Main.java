import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection MyCon = DaoFactory.getConnection();
        try {
            Statement st = MyCon.createStatement();
          ResultSet rs = st.executeQuery("select * from article;");
          while(rs.next())
          {
              System.out.println(rs.getString(1)+ " : "+
                      rs.getString("Designation")+
                      " "+rs.getFloat(3));
          }
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

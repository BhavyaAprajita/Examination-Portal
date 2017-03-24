
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class quest {

    public String qstn;
    public String op1;
    public String op2;
    public String op3;
    public String op4;
    public String rans;

    public quest(int qid) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "rajesh");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM questions WHERE qid=?");
            ps.setString(1, Integer.toString(qid));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                qstn = rs.getString("QUESTION");

                op1 = rs.getString("op1");

                op2 = rs.getString("op2");

                op3 = rs.getString("op3");

                op4 = rs.getString("op4");

                rans = rs.getString("ANS");
            }
            con.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

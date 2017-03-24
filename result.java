
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class result extends javax.swing.JFrame {

    /**
     * Creates new form result
     */
    public result() {
        initComponents();
        setTitle("Result");
         setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        String s1=""+score.righta;
        String s2=""+score.wronga;
        r.setText(s1);
        w.setText(s2);
        String s3;
        sc1.setText(String.valueOf(score.sc));
         float p=(float)(score.sc*100)/100;
         per.setText(String.valueOf(p));
        if(p>=30)
        { s3="PASS";}
        else
        {   s3="FAIL";}
        res.setText(s3);
        
      
      id.setText(stuid.id);
       try{
   

           Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","rajesh");
    PreparedStatement ps = con.prepareStatement("SELECT * FROM stu_register where id=?");
    ps.setString(1, stuid.id);
    ResultSet rs1 = ps.executeQuery();
     
    while(rs1.next())
    {
         fn.setText(rs1.getString("fname"));
        
        ln.setText(rs1.getString("lname"));
       
        cno.setText(rs1.getString("contact"));
        
        gn.setText(rs1.getString("gender"));
        
        st.setText(rs1.getString("state"));
        
        db.setText(rs1.getString("dob"));
    } 
       con.close();
      ps.close();
      rs1.close();}
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }
    }

    private static BufferedImage getScreenShot(Component com)
    {
        BufferedImage image= new BufferedImage(com.getWidth(),com.getHeight(),BufferedImage.TYPE_INT_RGB);
        com.paint(image.getGraphics());
        return image;
    }
  
    private static void saveScreenShot(Component com, String fileName) throws Exception
    {
        BufferedImage img=getScreenShot(com);
        ImageIO.write(img,"png",new File(fileName));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rs = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cno = new javax.swing.JLabel();
        per = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        st = new javax.swing.JLabel();
        db = new javax.swing.JLabel();
        gn = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        sc1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 380));
        setResizable(false);

        rs.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Result", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Bold", 0, 24), new java.awt.Color(204, 51, 0))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 51));
        jLabel21.setText("Enrollment No.");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Date Of Birth");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("State");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setText("Contact No.");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("No. of Wrong answers");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("First Name");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("No. of right asnwers");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("Percentage");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("Score ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        cno.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cno.setForeground(new java.awt.Color(0, 102, 51));
        cno.setText("jLabel3");

        per.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        per.setForeground(new java.awt.Color(0, 102, 51));
        per.setText("jLabel3");

        id.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 102, 51));
        id.setText("jLabel3");

        fn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        fn.setForeground(new java.awt.Color(0, 102, 51));
        fn.setText("jLabel3");

        st.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        st.setForeground(new java.awt.Color(0, 102, 51));
        st.setText("jLabel3");

        db.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        db.setForeground(new java.awt.Color(0, 102, 51));
        db.setText("jLabel3");

        gn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        gn.setForeground(new java.awt.Color(0, 102, 51));
        gn.setText("jLabel3");

        r.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        r.setForeground(new java.awt.Color(0, 102, 51));
        r.setText("jLabel3");

        w.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        w.setForeground(new java.awt.Color(0, 102, 51));
        w.setText("jLabel3");

        ln.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ln.setForeground(new java.awt.Color(0, 102, 51));
        ln.setText("jLabel3");

        sc1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        sc1.setForeground(new java.awt.Color(0, 102, 51));
        sc1.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fn)
                    .addComponent(ln)
                    .addComponent(id)
                    .addComponent(cno)
                    .addComponent(gn)
                    .addComponent(st)
                    .addComponent(db)
                    .addComponent(r)
                    .addComponent(w)
                    .addComponent(per)
                    .addComponent(sc1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id)
                .addGap(18, 18, 18)
                .addComponent(fn)
                .addGap(18, 18, 18)
                .addComponent(ln)
                .addGap(18, 18, 18)
                .addComponent(cno)
                .addGap(18, 18, 18)
                .addComponent(gn)
                .addGap(18, 18, 18)
                .addComponent(st)
                .addGap(18, 18, 18)
                .addComponent(db)
                .addGap(18, 18, 18)
                .addComponent(sc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(r)
                .addGap(18, 18, 18)
                .addComponent(w)
                .addGap(18, 18, 18)
                .addComponent(per)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Result");

        res.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        res.setForeground(new java.awt.Color(0, 102, 51));
        res.setText("jLabel3");

        javax.swing.GroupLayout rsLayout = new javax.swing.GroupLayout(rs);
        rs.setLayout(rsLayout);
        rsLayout.setHorizontalGroup(
            rsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(res)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        rsLayout.setVerticalGroup(
            rsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(res))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 0));
        jButton1.setText("Save Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/online exm.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(rs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(492, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(601, 601, 601))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(rs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        setSize(new java.awt.Dimension(1382, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            saveScreenShot(rs,"Result.png");
            JOptionPane.showMessageDialog(rootPane, "Result is saved!");
        } catch(Exception e){
             JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cno;
    private javax.swing.JLabel db;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel gn;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ln;
    private javax.swing.JLabel per;
    private javax.swing.JLabel r;
    private javax.swing.JLabel res;
    private javax.swing.JPanel rs;
    private javax.swing.JLabel sc1;
    private javax.swing.JLabel st;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables
}

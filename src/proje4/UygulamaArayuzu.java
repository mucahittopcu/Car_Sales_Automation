package proje4;

import com.sun.org.apache.xml.internal.dtm.DTM;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import sun.font.TrueTypeFont;

public class UygulamaArayuzu extends javax.swing.JFrame {

    public static DefaultTableModel table = new DefaultTableModel();
    public static Statement sqlDurum = null;
    public static ResultSet satir = null;
    public static Connection conn = null;

    public UygulamaArayuzu() {
        initComponents();
        setIcon();
        ComboBox();
        jTable1.setModel(table);
        table.setColumnIdentifiers(new String[]{"ID", "İlan Adı", "Fiyat", "Şehir", "Marka", "Model", "Vites Türü", "Yakıt Turu", "Renk", "Araba Km", "İlan Tarihi"});
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(1);
        sehir();
        siralamaOlcutu();
        tumListe();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jTextField15 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jComboBox6 = new javax.swing.JComboBox<>();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KAYIT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İLAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel1.setText("İlan Adı :");

        jLabel2.setText("İlan Şehri :");

        jLabel3.setText("İlan Tarihi :");

        jComboBox1.setBorder(null);

        jLabel21.setText("Gün");

        jLabel22.setText("Ay");

        jLabel23.setText("Yıl");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel22)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel23)
                        .addContainerGap(360, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ARAÇ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Marka :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Model :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Yakıt Türü :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Vites Türü :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Renk :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Km :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fiyat :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Dizel");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Benzin");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Lpg");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Elektrik");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Otomatik");

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Manuel");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6))
                    .addComponent(jTextField3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4))
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jTextField7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("GÜNCELLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SİL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Temizle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FİLTRELEME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Şehir :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Fiyat Aralığı :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Yakıt Türü :");

        jTextField8.setText("0");

        jTextField9.setText("999999999");

        jCheckBox1.setText("Dizel");

        jCheckBox2.setText("Benzin");

        jCheckBox3.setText("Lpg");

        jCheckBox4.setText("Elektrik");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Vites Türü :");

        jCheckBox5.setText("Otomatik");

        jCheckBox6.setText("Manuel");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Km Aralığı :");

        jTextField10.setText("0");

        jTextField11.setText("999999999");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Renk :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Araç İlan Tarihi :");

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("Son 24 Saat");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("Son 1 Hafta");

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("Son 1 Ay");

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("Hepsi");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("İlan Adı :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Araç Marka :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Araç Model :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Sıralama :");

        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setText("A-Z");

        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setText("Z-A");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jRadioButton12)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(48, 48, 48))
        );

        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setText("Son 1 Yıl");

        jButton4.setText("Filtrele");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Hepsi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jCheckBox5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBox3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox4))
                                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jRadioButton10)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel12))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox6, 0, 213, Short.MAX_VALUE)
                                    .addComponent(jTextField15)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField17))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setName(""); // NOI18N
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel11.setText("All Right Reserved  ® MD-Soft");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tumListe();
        System.out.println("Hepsi Getirildi.");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (!sayiMi(jTextField8.getText()) || !sayiMi(jTextField9.getText())
                    || !sayiMi(jTextField10.getText()) || !sayiMi(jTextField11.getText()) || !sayiMi(jTextField16.getText())) {
                JOptionPane.showMessageDialog(null, "Sayı Girmeniz Gereken Yere Metin Girdiniz .\nLütfen Düzeltin !!!", "UYARI", JOptionPane.CLOSED_OPTION);
            } else {

                for (int i = table.getRowCount() - 1; i >= 0; i--) {
                    table.removeRow(i);
                }
                veriTabaniBaglanti();
                String veriler[] = new String[11];
                String sqlVerFilter
                        = "SELECT tbl_ilan.IlanID,tbl_ilan.Ilan_Adi,tbl_ilan.Ilan_Fiyat,"
                        + "	      tbl_sehir.Sehir,"
                        + "	      tbl_araba.Araba_Marka,tbl_araba.Araba_Model,"
                        + "       tbl_vitesturu.Vites_Turu,"
                        + "       tbl_yakitturu.Yakit_Turu,"
                        + "       tbl_renk.Renk,"
                        + "       tbl_ilan.Ilan_Km,"
                        + "       tbl_ilan.Ilan_Tarih "
                        + "FROM tbl_ilan "
                        + "JOIN tbl_araba "
                        + "ON tbl_ilan.Ilan_ArabaID=tbl_araba.ArabaID "
                        + "JOIN tbl_sehir "
                        + "ON tbl_ilan.Ilan_SehirID=tbl_sehir.SehirID "
                        + "JOIN tbl_vitesturu "
                        + "ON tbl_araba.Araba_VitesTuruID=tbl_vitesturu.VitesTuruID "
                        + "JOIN tbl_yakitturu "
                        + "ON tbl_araba.Araba_YakitTuruID=tbl_yakitturu.YakitTuruID "
                        + "JOIN tbl_renk "
                        + "ON tbl_araba.Araba_RenkID=tbl_renk.renkID "
                        + "WHERE tbl_ilan.IlanID ";

                if (!jTextField15.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_ilan.Ilan_Adi  LIKE '%" + jTextField15.getText() + "%'";
                }
                if (!jComboBox6.getSelectedItem().equals("Şehir Seçiniz...")) {
                    sqlVerFilter += " AND tbl_sehir.Sehir LIKE '%" + jComboBox6.getSelectedItem() + "%'";
                }
                if (!jTextField17.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_araba.Araba_Marka LIKE '%" + jTextField17.getText() + "%'";
                }
                if (!jTextField16.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_araba.Araba_Model LIKE '%" + jTextField16.getText() + "%'";
                }
                if (!jTextField8.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_ilan.Ilan_Fiyat>=" + jTextField8.getText();
                }
                if (!jTextField9.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_ilan.Ilan_Fiyat<=" + jTextField9.getText();
                }
                if (jCheckBox1.isSelected() || jCheckBox2.isSelected() || jCheckBox3.isSelected() || jCheckBox4.isSelected()) {
                    int kontrol = 0;
                    sqlVerFilter += " AND (";
                    if (jCheckBox1.isSelected()) {
                        sqlVerFilter += " tbl_yakitturu.Yakit_Turu = '" + jCheckBox1.getText() + "'";
                        kontrol++;
                    }
                    if (jCheckBox2.isSelected()) {
                        if (kontrol > 0) {
                            sqlVerFilter += " OR";
                        }
                        kontrol++;
                        sqlVerFilter += " tbl_yakitturu.Yakit_Turu = '" + jCheckBox2.getText() + "'";
                    }
                    if (jCheckBox3.isSelected()) {
                        if (kontrol > 0) {
                            sqlVerFilter += " OR";
                        }
                        kontrol++;
                        sqlVerFilter += " tbl_yakitturu.Yakit_Turu = '" + jCheckBox3.getText() + "'";
                    }
                    if (jCheckBox4.isSelected()) {
                        if (kontrol > 0) {
                            sqlVerFilter += " OR";
                        }
                        kontrol++;
                        sqlVerFilter += " tbl_yakitturu.Yakit_Turu = '" + jCheckBox4.getText() + "'";
                    }
                    kontrol = 0;
                    sqlVerFilter += ")";
                }
                if (jCheckBox5.isSelected() || jCheckBox6.isSelected()) {
                    int kontrol = 0;
                    sqlVerFilter += " AND (";
                    if (jCheckBox5.isSelected()) {
                        sqlVerFilter += " tbl_vitesturu.Vites_Turu = '" + jCheckBox5.getText() + "'";
                        kontrol++;
                    }
                    if (jCheckBox6.isSelected()) {
                        if (kontrol > 0) {
                            sqlVerFilter += " OR";
                        }
                        kontrol++;
                        sqlVerFilter += " tbl_vitesturu.Vites_Turu = '" + jCheckBox6.getText() + "'";
                    }
                    kontrol = 0;
                    sqlVerFilter += ")";
                }
                if (!jTextField10.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_ilan.Ilan_Km>=" + jTextField10.getText();
                }
                if (!jTextField11.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_ilan.Ilan_Km<=" + jTextField11.getText();
                }
                if (!jTextField13.getText().equalsIgnoreCase("")) {
                    sqlVerFilter += " AND tbl_renk.Renk  LIKE '%" + jTextField13.getText() + "%'";
                }
                //Tarih Filtresi
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar filtreSaat = Calendar.getInstance();
                Calendar sistemSaati = Calendar.getInstance();
                System.out.println(sdf.format(sistemSaati.getTime()));
                String sisTar = sdf.format(sistemSaati.getTime());
                if (jRadioButton7.isSelected()) {
                    filtreSaat.add(Calendar.DATE, -1);
                    String filtTar = sdf.format(filtreSaat.getTime());
                    sqlVerFilter += " AND (tbl_ilan.Ilan_Tarih BETWEEN '" + filtTar + "' AND '" + sisTar + "')";
                }
                if (jRadioButton8.isSelected()) {
                    filtreSaat.add(Calendar.DATE, -7);
                    String filtTar = sdf.format(filtreSaat.getTime());
                    sqlVerFilter += " AND (tbl_ilan.Ilan_Tarih BETWEEN '" + filtTar + "' AND '" + sisTar + "')";

                }
                if (jRadioButton9.isSelected()) {
                    filtreSaat.add(Calendar.MONTH, -1);
                    String filtTar = sdf.format(filtreSaat.getTime());
                    sqlVerFilter += " AND (tbl_ilan.Ilan_Tarih BETWEEN '" + filtTar + "' AND '" + sisTar + "')";
                }
                if (jRadioButton10.isSelected()) {
                }
                if (jRadioButton13.isSelected()) {
                    filtreSaat.add(Calendar.YEAR, -1);
                    String filtTar = sdf.format(filtreSaat.getTime());
                    sqlVerFilter += " AND (tbl_ilan.Ilan_Tarih BETWEEN '" + filtTar + "' AND '" + sisTar + "')";
                }
                //Siralama Fitresi
                if (jComboBox4.getSelectedItem().equals("ID")) {
                    sqlVerFilter += " ORDER BY tbl_ilan.IlanID";
                }
                if (jComboBox4.getSelectedItem().equals("İlan Adı")) {
                    sqlVerFilter += " ORDER BY tbl_ilan.Ilan_Adi";
                }
                if (jComboBox4.getSelectedItem().equals("Fiyat")) {
                    sqlVerFilter += " ORDER BY tbl_ilan.Ilan_Fiyat";
                }
                if (jComboBox4.getSelectedItem().equals("Şehir")) {
                    sqlVerFilter += " ORDER BY tbl_sehir.Sehir";
                }
                if (jComboBox4.getSelectedItem().equals("Marka")) {
                    sqlVerFilter += " ORDER BY tbl_araba.Araba_Marka";
                }
                if (jComboBox4.getSelectedItem().equals("Model")) {
                    sqlVerFilter += " ORDER BY tbl_araba.Araba_Model";
                }
                if (jComboBox4.getSelectedItem().equals("Araba Km")) {
                    sqlVerFilter += " ORDER BY tbl_ilan.Ilan_Km";
                }
                if (jComboBox4.getSelectedItem().equals("İlan Tarihi")) {
                    sqlVerFilter += " ORDER BY tbl_ilan.Ilan_Tarih";
                }
                //Küçükten buyuğe sıralama kontrolü
                if (jRadioButton12.isSelected()) {
                    sqlVerFilter += " DESC";
                }
                System.out.println(sqlVerFilter);
                satir = sqlDurum.executeQuery(sqlVerFilter);
                while (satir.next()) {
                    veriler[0] = satir.getString(1);
                    veriler[1] = satir.getString(2);
                    veriler[2] = satir.getString(3);
                    veriler[3] = satir.getString(4);
                    veriler[4] = satir.getString(5);
                    veriler[5] = satir.getString(6);
                    veriler[6] = satir.getString(7);
                    veriler[7] = satir.getString(8);
                    veriler[8] = satir.getString(9);
                    veriler[9] = satir.getString(10);
                    veriler[10] = satir.getString(11);

                    table.addRow(veriler);
                }
            }
            System.out.println("Filtrelendi.");
            System.out.println(conn.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (sqlDurum != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        try {
            System.out.println(conn.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (!seciliMi()) {
                JOptionPane.showMessageDialog(null, "Seçili Bir İlan Yok.\n Silmek İçin İlan Seçiniz.", "UYARI", JOptionPane.CLOSED_OPTION);
            } else {
                veriTabaniBaglanti();
                String verSil = "DELETE FROM tbl_renk WHERE RenkID=" + table.getValueAt(jTable1.getSelectedRow(), 0);
                sqlDurum.executeUpdate(verSil);
                tumListe();
                temizle();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (sqlDurum != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        try {
            System.out.println(conn.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (jTextField1.getText().equals("") || jTextField3.getText().equals("")
                    || jTextField4.getText().equals("") || jTextField5.getText().equals("")
                    || jTextField6.getText().equals("") || jTextField7.getText().equals("")
                    || (!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected() && !jRadioButton4.isSelected())
                    || (!jRadioButton5.isSelected() && !jRadioButton6.isSelected())) {
                JOptionPane.showMessageDialog(null, "Eksik Bilgi Bıraktınız . Lütfen Doldurunuz .", "UYARI", JOptionPane.INFORMATION_MESSAGE);
            } else if (!sayiMi(jTextField6.getText()) || !sayiMi(jTextField7.getText()) || !sayiMi(jTextField4.getText())) {
                JOptionPane.showMessageDialog(null, "Sayı Girmeniz Gereken Yere Metin Girdiniz .\nLütfen Düzeltin !!!", "UYARI", JOptionPane.INFORMATION_MESSAGE);
            } else if (!seciliMi()) {
                JOptionPane.showMessageDialog(null, "Seçili Bir İlan Yok.\n Güncellemek İçin İlan Seçiniz.", "UYARI", JOptionPane.CLOSED_OPTION);
            } else {
                veriTabaniBaglanti();
                //Renk Tablsou Güncelleniyor.
                String verGuncelleRenk
                        = "UPDATE tbl_Renk SET Renk='" + jTextField5.getText()
                        + "' WHERE RenkID=" + table.getValueAt(jTable1.getSelectedRow(), 0);
                System.out.println(verGuncelleRenk);
                sqlDurum.executeUpdate(verGuncelleRenk);
                //Araba Tablosu Güncelleniyor.
                String verGuncelleAraba
                        = "UPDATE tbl_Araba SET Araba_Marka='" + jTextField3.getText()
                        + "',Araba_Model='" + jTextField4.getText() + "'";
                if (jRadioButton1.isSelected()) {
                    verGuncelleAraba += ",Araba_YakitTuruID=1 ";
                } else if (jRadioButton2.isSelected()) {
                    verGuncelleAraba += ",Araba_YakitTuruID=2 ";
                } else if (jRadioButton3.isSelected()) {
                    verGuncelleAraba += ",Araba_YakitTuruID=3 ";
                } else if (jRadioButton4.isSelected()) {
                    verGuncelleAraba += ",Araba_YakitTuruID=4 ";
                }
                //Vites Turu Kontrol
                if (jRadioButton5.isSelected()) {
                    verGuncelleAraba += ",Araba_VitesTuruID=1";
                } else if (jRadioButton6.isSelected()) {
                    verGuncelleAraba += ",Araba_VitesTuruID=2";
                }
                verGuncelleAraba += " WHERE ArabaID=" + table.getValueAt(jTable1.getSelectedRow(), 0);
                sqlDurum.executeUpdate(verGuncelleAraba);
                System.out.println(verGuncelleAraba);
                //İlan Tablosu Güncelleniyor.
                String verGuncelleIlan
                        = "UPDATE tbl_ilan SET Ilan_Adi='" + jTextField1.getText()
                        + "',Ilan_Fiyat=" + jTextField7.getText()
                        + ",Ilan_Km=" + jTextField6.getText()
                        + ",Ilan_Tarih='" + jComboBox3.getSelectedItem() + "-" + (jComboBox2.getSelectedIndex() + 1) + "-" + jComboBox1.getSelectedItem() + "'"
                        + ",Ilan_SehirID=" + (jComboBox5.getSelectedIndex() + 1)
                        + " WHERE IlanID=" + table.getValueAt(jTable1.getSelectedRow(), 0);

                System.out.println(verGuncelleIlan);
                sqlDurum.executeUpdate(verGuncelleIlan);
                JOptionPane.showMessageDialog(null, "Güncelleme Başarılı .", "BAŞARILI", JOptionPane.CLOSED_OPTION);
                tumListe();
                temizle();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (sqlDurum != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        try {
            System.out.println(conn.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (jTextField1.getText().equals("") || jTextField3.getText().equals("")
                    || jTextField4.getText().equals("") || jTextField5.getText().equals("")
                    || jTextField6.getText().equals("") || jTextField7.getText().equals("")
                    || (!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected() && !jRadioButton4.isSelected())
                    || (!jRadioButton5.isSelected() && !jRadioButton6.isSelected())) {
                JOptionPane.showMessageDialog(null, "Eksik Bilgi Bıraktınız . Lütfen Doldurunuz .", "UYARI", JOptionPane.INFORMATION_MESSAGE);
            } else if (!sayiMi(jTextField6.getText()) || !sayiMi(jTextField7.getText()) || !sayiMi(jTextField4.getText())) {
                JOptionPane.showMessageDialog(null, "Sayı Girmeniz Gereken Yere Metin Girdiniz .\nLütfen Düzeltin !!!", "UYARI", JOptionPane.INFORMATION_MESSAGE);

            } else {
                boolean tabloBosMu = true;
                veriTabaniBaglanti();
                int id;
                String kayitBilgi[] = new String[10];
                String sql = "SELECT IlanID FROM tbl_ilan ORDER BY IlanID";
                satir = sqlDurum.executeQuery(sql);
                while (satir.next()) {
                    tabloBosMu = false;
                }
                if (tabloBosMu == true) {
                    id = 1;
                } else {
                    satir.last();
                    id = satir.getInt(1) + 1;
                }

                //Renk Ekleniyor
                String verEkleRenk
                        = "INSERT INTO tbl_renk "
                        + "(renkID,Renk) "
                        + "VALUES (" + id + ",'" + jTextField5.getText() + "')";
                System.out.println(verEkleRenk);
                sqlDurum.executeUpdate(verEkleRenk);
                System.out.println(verEkleRenk);
                //Araba Ekleniyor
                String verEkleAraba
                        = "INSERT INTO tbl_araba "
                        + "(ArabaID,Araba_Marka,Araba_Model,Araba_YakitTuruID,Araba_VitesTuruID,Araba_RenkID) "
                        + "VALUES (" + id + ",'" + jTextField3.getText() + "','" + jTextField4.getText() + "'";
                //Yakit Turu Id Kayit
                if (jRadioButton1.isSelected()) {
                    verEkleAraba += ",1";
                } else if (jRadioButton2.isSelected()) {
                    verEkleAraba += ",2";
                } else if (jRadioButton3.isSelected()) {
                    verEkleAraba += ",3";
                } else if (jRadioButton4.isSelected()) {
                    verEkleAraba += ",4";
                }
                //Vites Turu Id Ekleme
                if (jRadioButton5.isSelected()) {
                    verEkleAraba += ",1";
                } else if (jRadioButton6.isSelected()) {
                    verEkleAraba += ",2";
                }
                verEkleAraba += "," + id + ")";
                sqlDurum.executeUpdate(verEkleAraba);
                System.out.println(verEkleAraba);
                //İlan Özellikleri Ekleniyor.
                String verEkleIlan
                        = "INSERT INTO tbl_ilan "
                        + "(IlanID,Ilan_Adi,Ilan_Fiyat,Ilan_Km,Ilan_Tarih,"
                        + "Ilan_ArabaID,Ilan_SehirID) "
                        + "VALUES (" + id + ",'" + jTextField1.getText() + "',"
                        + jTextField7.getText() + "," + jTextField6.getText() + ","
                        + "'" + jComboBox3.getSelectedItem() + "-" + (jComboBox2.getSelectedIndex() + 1) + "-" + jComboBox1.getSelectedItem() + "',"
                        + id + "," + (jComboBox5.getSelectedIndex() + 1) + ")";
                System.out.println(verEkleIlan);
                sqlDurum.executeUpdate(verEkleIlan);
                JOptionPane.showMessageDialog(null, "Kayıt Başarılı .", "BAŞARILI", JOptionPane.CLOSED_OPTION);
                tumListe();
                temizle();
            }
            System.out.println(conn.isClosed());
            System.out.println("Kaydedildi.");
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (sqlDurum != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        try {
            System.out.println(conn.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        temizle();
        System.out.println("Temizlendi");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            System.out.println("double clicked");
            jTextField1.setText(String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 1)));
            jTextField3.setText(String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 4)));
            jTextField4.setText(String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 5)));
            jTextField5.setText(String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 8)));
            jTextField6.setText(String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 9)));
            jTextField7.setText(String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 2)));
            if (String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 7)).equals("Dizel")) {
                jRadioButton1.setSelected(true);
            } else if (String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 7)).equals("Benzin")) {
                jRadioButton2.setSelected(true);
            } else if (String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 7)).equals("Lpg")) {
                jRadioButton3.setSelected(true);
            } else if (String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 7)).equals("Elektrik")) {
                jRadioButton4.setSelected(true);
            }
            if (String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 6)).equals("Otomatik")) {
                jRadioButton5.setSelected(true);
            } else if (String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 6)).equals("Manuel")) {
                jRadioButton6.setSelected(true);
            }
            jComboBox5.setSelectedItem(table.getValueAt(jTable1.getSelectedRow(), 3));
            String tarihBol[] = new String[3];
            String tarih = String.valueOf(table.getValueAt(jTable1.getSelectedRow(), 10));
            tarihBol = tarih.split("-");
            System.out.println(tarihBol[2] + "-" + tarihBol[1] + "-" + tarihBol[0]);
            jComboBox1.setSelectedIndex(Integer.parseInt(tarihBol[2]) - 1);
            jComboBox2.setSelectedIndex(Integer.parseInt(tarihBol[1]) - 1);
            jComboBox3.setSelectedItem(tarihBol[0]);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public void temizle() {
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jRadioButton1.setSelected(true);
        jRadioButton5.setSelected(true);
    }

    public void ComboBox() {
        for (int i = 1; i <= 31; i++) {
            jComboBox1.addItem(String.valueOf(i));
        }
        for (int i = 1990; i <= 2025; i++) {
            jComboBox3.addItem(String.valueOf(i));
        }
        jComboBox2.addItem("Ocak");
        jComboBox2.addItem("Şubat");
        jComboBox2.addItem("Mart");
        jComboBox2.addItem("Nisan");
        jComboBox2.addItem("Mayıs");
        jComboBox2.addItem("Haziran");
        jComboBox2.addItem("Temmuz");
        jComboBox2.addItem("Ağustos");
        jComboBox2.addItem("Eylül");
        jComboBox2.addItem("Ekim");
        jComboBox2.addItem("Kasım");
        jComboBox2.addItem("Aralık");
    }

    public static void tumListe() {
        try {
            for (int i = table.getRowCount() - 1; i >= 0; i--) {
                table.removeRow(i);
            }
            veriTabaniBaglanti();
            String veriler[] = new String[11];
            String sqlVerGet
                    = "SELECT tbl_ilan.IlanID,tbl_ilan.Ilan_Adi,tbl_ilan.Ilan_Fiyat,"
                    + "	      tbl_sehir.Sehir,"
                    + "	      tbl_araba.Araba_Marka,tbl_araba.Araba_Model,"
                    + "       tbl_vitesturu.Vites_Turu,"
                    + "       tbl_yakitturu.Yakit_Turu,"
                    + "       tbl_renk.Renk,"
                    + "       tbl_ilan.Ilan_Km,"
                    + "       tbl_ilan.Ilan_Tarih "
                    + "FROM tbl_ilan "
                    + "JOIN tbl_araba "
                    + "ON tbl_ilan.Ilan_ArabaID=tbl_araba.ArabaID "
                    + "JOIN tbl_sehir "
                    + "ON tbl_ilan.Ilan_SehirID=tbl_sehir.SehirID "
                    + "JOIN tbl_vitesturu "
                    + "ON tbl_araba.Araba_VitesTuruID=tbl_vitesturu.VitesTuruID "
                    + "JOIN tbl_yakitturu "
                    + "ON tbl_araba.Araba_YakitTuruID=tbl_yakitturu.YakitTuruID "
                    + "JOIN tbl_renk "
                    + "ON tbl_araba.Araba_RenkID=tbl_renk.renkID ";

            if (jComboBox4.getSelectedItem().equals("ID")) {
                sqlVerGet += "ORDER BY tbl_ilan.IlanID";
            }
            if (jComboBox4.getSelectedItem().equals("İlan Adı")) {
                sqlVerGet += " ORDER BY tbl_ilan.Ilan_Adi";
            }
            if (jComboBox4.getSelectedItem().equals("Fiyat")) {
                sqlVerGet += " ORDER BY tbl_ilan.Ilan_Fiyat";
            }
            if (jComboBox4.getSelectedItem().equals("Şehir")) {
                sqlVerGet += " ORDER BY tbl_sehir.Sehir";
            }
            if (jComboBox4.getSelectedItem().equals("Marka")) {
                sqlVerGet += " ORDER BY tbl_araba.Araba_Marka";
            }
            if (jComboBox4.getSelectedItem().equals("Model")) {
                sqlVerGet += " ORDER BY tbl_araba.Araba_Model";
            }
            if (jComboBox4.getSelectedItem().equals("Araba Km")) {
                sqlVerGet += " ORDER BY tbl_ilan.Ilan_Km";
            }
            if (jComboBox4.getSelectedItem().equals("İlan Tarihi")) {
                sqlVerGet += " ORDER BY tbl_ilan.Ilan_Tarih";
            }
            //Küçükten buyuğe sıralama kontrolü
            if (jRadioButton12.isSelected()) {
                sqlVerGet += " DESC";
            }
            satir = sqlDurum.executeQuery(sqlVerGet);
            while (satir.next()) {
                veriler[0] = satir.getString(1);
                veriler[1] = satir.getString(2);
                veriler[2] = satir.getString(3);
                veriler[3] = satir.getString(4);
                veriler[4] = satir.getString(5);
                veriler[5] = satir.getString(6);
                veriler[6] = satir.getString(7);
                veriler[7] = satir.getString(8);
                veriler[8] = satir.getString(9);
                veriler[9] = satir.getString(10);
                veriler[10] = satir.getString(11);

                table.addRow(veriler);
            }
            System.out.println("Tüm Liste Geldi.");
            System.out.println(conn.isClosed());

        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (sqlDurum != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        try {
            System.out.println(conn.isClosed());

        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sehir() {
        try {
            veriTabaniBaglanti();
            String sql = "Select Sehir From tbl_sehir";
            satir = sqlDurum.executeQuery(sql);
            jComboBox6.addItem("Şehir Seçiniz...");
            while (satir.next()) {
                jComboBox5.addItem(satir.getString(1));
                jComboBox6.addItem(satir.getString(1));
            }
            System.out.println("Sehirler Yüklendi.");
            System.out.println(conn.isClosed());

        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (sqlDurum != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        try {
            System.out.println(conn.isClosed());

        } catch (SQLException ex) {
            Logger.getLogger(UygulamaArayuzu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }     // TODO add

    }

    public void siralamaOlcutu() {
        jComboBox4.addItem("ID");
        jComboBox4.addItem("İlan Adı");
        jComboBox4.addItem("Fiyat");
        jComboBox4.addItem("Şehir");
        jComboBox4.addItem("Marka");
        jComboBox4.addItem("Model");
        jComboBox4.addItem("Araba Km");
        jComboBox4.addItem("İlan Tarihi");
    }

    public boolean sayiMi(String gelSayi) {
        boolean sayi = false;
        for (int i = 0; i < gelSayi.length(); i++) {
            if (Character.isDigit(gelSayi.charAt(i))) {
                System.out.println(i + ". deger sayidir : " + gelSayi.charAt(i));
                sayi = true;

            } else {
                System.out.println(i + ". deger metindir : " + gelSayi.charAt(i));
                sayi = false;
                return sayi;
            }
        }
        return true;
    }

    public boolean seciliMi() {
        for (int i = 0; i < table.getRowCount(); i++) {
            if (jTable1.isRowSelected(i)) {
                return true;
            }
        }
        return false;
    }

    public static void veriTabaniBaglanti() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/arackayit";
        final String USER = "root";
        final String PASS = "password";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            sqlDurum = conn.createStatement();
            System.out.println("Connected.");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("md.png")));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UygulamaArayuzu jframe = new UygulamaArayuzu();
                jframe.setVisible(true);
                jframe.setLocationRelativeTo(null);
                jframe.setResizable(false);
                jframe.setTitle("Araba İlan Otomasyonu");
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JComboBox<String> jComboBox3;
    private static javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private static javax.swing.JRadioButton jRadioButton11;
    private static javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private static javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

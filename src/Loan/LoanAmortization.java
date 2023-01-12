/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;


/**
 *
 * @author Dell
 */
public class LoanAmortization extends javax.swing.JFrame {

    /**
     * Creates new form LoanAmortization
     */
    Date issueddate,duedate,datefortable=null;
    public LoanAmortization() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMemberid = new javax.swing.JLabel();
        jTextFieldMemberid = new javax.swing.JTextField();
        jMemberName = new javax.swing.JLabel();
        jTextFieldMembername = new javax.swing.JTextField();
        jTextFieldLoanAmount = new javax.swing.JTextField();
        jLoanAmount = new javax.swing.JLabel();
        jLoanPeriod = new javax.swing.JLabel();
        jTextFieldLoanPeriod = new javax.swing.JTextField();
        jRateofLoan = new javax.swing.JLabel();
        jTextFieldRateofloan = new javax.swing.JTextField();
        jTextFieldNoofpaymentsinyear = new javax.swing.JTextField();
        jRateofLoan1 = new javax.swing.JLabel();
        jRateofLoan2 = new javax.swing.JLabel();
        jTextFielTotalnoofpayments = new javax.swing.JTextField();
        jProceed = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMemberName1 = new javax.swing.JLabel();
        jTextFieldLoanid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMemberid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMemberid.setText("Member id:");

        jTextFieldMemberid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldMemberid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMemberidActionPerformed(evt);
            }
        });
        jTextFieldMemberid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMemberidKeyPressed(evt);
            }
        });

        jMemberName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMemberName.setText("Member Name:");

        jTextFieldMembername.setEditable(false);
        jTextFieldMembername.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldMembername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembernameActionPerformed(evt);
            }
        });

        jTextFieldLoanAmount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldLoanAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoanAmountActionPerformed(evt);
            }
        });
        jTextFieldLoanAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLoanAmountKeyPressed(evt);
            }
        });

        jLoanAmount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLoanAmount.setText("Loan Amount:");

        jLoanPeriod.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLoanPeriod.setText("Loan Period:");

        jTextFieldLoanPeriod.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldLoanPeriod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLoanPeriodKeyPressed(evt);
            }
        });

        jRateofLoan.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRateofLoan.setText("Rate Of Loan");

        jTextFieldRateofloan.setEditable(false);
        jTextFieldRateofloan.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldRateofloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRateofloanActionPerformed(evt);
            }
        });
        jTextFieldRateofloan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRateofloanKeyPressed(evt);
            }
        });

        jTextFieldNoofpaymentsinyear.setEditable(false);
        jTextFieldNoofpaymentsinyear.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNoofpaymentsinyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoofpaymentsinyearActionPerformed(evt);
            }
        });
        jTextFieldNoofpaymentsinyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNoofpaymentsinyearKeyPressed(evt);
            }
        });

        jRateofLoan1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRateofLoan1.setText("No. Of payments Per Year");

        jRateofLoan2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRateofLoan2.setText("Total No.of Payments");

        jTextFielTotalnoofpayments.setEditable(false);
        jTextFielTotalnoofpayments.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFielTotalnoofpayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielTotalnoofpaymentsActionPerformed(evt);
            }
        });
        jTextFielTotalnoofpayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFielTotalnoofpaymentsKeyPressed(evt);
            }
        });

        jProceed.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jProceed.setText("Proceed");
        jProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProceedActionPerformed(evt);
            }
        });

        jClear.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jAdd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jAdd.setText("Add");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Due Date", "Year", "PMT", "Interest", "Principal", "Loan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.setRowMargin(5);
        jScrollPane1.setViewportView(jTable1);

        jMemberName1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMemberName1.setText("Loan ID");

        jTextFieldLoanid.setEditable(false);
        jTextFieldLoanid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldLoanid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoanidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jRateofLoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jRateofLoan, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addComponent(jMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMemberName1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoanPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLoanPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLoanid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRateofloan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNoofpaymentsinyear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielTotalnoofpayments, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jProceed)
                            .addGap(86, 86, 86)
                            .addComponent(jClear)
                            .addGap(131, 131, 131)
                            .addComponent(jAdd))
                        .addComponent(jMemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRateofLoan2))
                    .addContainerGap(1220, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldMemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLoanPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLoanPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMemberName1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLoanid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMembername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRateofLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldRateofloan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRateofLoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNoofpaymentsinyear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFielTotalnoofpayments, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                .addGap(172, 172, 172))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jMemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(406, 406, 406)
                    .addComponent(jRateofLoan2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jProceed)
                        .addComponent(jClear)
                        .addComponent(jAdd))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMemberidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMemberidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMemberidActionPerformed

    private void jTextFieldMemberidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMemberidKeyPressed
        char c=evt.getKeyChar();
        try {
            if (Character.isDigit(c)||evt.getKeyCode()==KeyEvent.VK_ENTER||
                    evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||
                    evt.getKeyCode()==KeyEvent.VK_DELETE||
                    evt.getKeyCode()==KeyEvent.VK_LEFT||
                    evt.getKeyCode()==KeyEvent.VK_RIGHT||
                    evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||
                    evt.getKeyCode()==KeyEvent.VK_DELETE||
                    evt.getKeyCode()==KeyEvent.VK_LEFT||
                    evt.getKeyCode()==KeyEvent.VK_UP
                    || evt.getKeyCode()==KeyEvent.VK_SPACE) {
            jTextFieldMemberid.setEditable(true);
        }
        else{
            jTextFieldMemberid.setEditable(false);
        }
        } catch (Exception e) {
        }
        try {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER||evt.getKeyCode()==KeyEvent.VK_DOWN||evt.getKeyCode()==KeyEvent.VK_LEFT||evt.getKeyCode()==KeyEvent.VK_RIGHT) {
            jTextFieldLoanAmount.requestFocus();
        } 
        } catch (Exception e){
            
        }
       
    }//GEN-LAST:event_jTextFieldMemberidKeyPressed

    private void jTextFieldMembernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembernameActionPerformed

    private void jTextFieldLoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoanAmountActionPerformed

    private void jTextFieldLoanAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLoanAmountKeyPressed
        // TODO add your handling code here:
        try {
            char c=evt.getKeyChar();
            if (Character.isDigit(c)|| evt.getKeyCode()==KeyEvent.VK_DECIMAL||
                    evt.getKeyCode()==KeyEvent.VK_BACK_SPACE ||
                    evt.getKeyCode()==KeyEvent.VK_DELETE||
                    evt.getKeyCode() == KeyEvent.VK_ENTER ||
                    evt.getKeyCode() == KeyEvent.VK_DOWN ||
                    evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                jTextFieldLoanAmount.setEditable(true);
            }
            else{
                jTextFieldLoanAmount.setEditable(false);
            }
        } catch (Exception e) {
        }
                try {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER||evt.getKeyCode()==KeyEvent.VK_DOWN||evt.getKeyCode()==KeyEvent.VK_LEFT||evt.getKeyCode()==KeyEvent.VK_RIGHT) {
            jTextFieldLoanPeriod.requestFocus();
        } 
        } catch (Exception e){
            
        }
    }//GEN-LAST:event_jTextFieldLoanAmountKeyPressed

    private void jTextFieldLoanPeriodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLoanPeriodKeyPressed
         //TODO add your handling code here:
        try {
            char c=evt.getKeyChar();
            if (Character.isDigit(c)|| evt.getKeyCode()==KeyEvent.VK_DECIMAL||evt.getKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getKeyCode()==KeyEvent.VK_DELETE||evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                jTextFieldLoanPeriod.setEditable(true);
            }
            else{
                jTextFieldLoanPeriod.setEditable(false);
            }
        } catch (Exception e) {
        }
        try {
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                       int Member_id=Integer.parseInt(jTextFieldMemberid.getText());
        int Loan_amount=Integer.parseInt(jTextFieldLoanAmount.getText());
        int Period=Integer.parseInt(jTextFieldLoanPeriod.getText());
        
        //SQL Part
        String url="jdbc:mysql://localhost:3306/cooperativemanagementsystem";
        String uname="root";
        String pwd="";
        ResultSet rs;
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,pwd);
            String sql="Select * from Loan where Member_id=? and Loan_amount=? and Loan_period=?";
                    
               PreparedStatement st=con.prepareStatement(sql);
               st.setInt(1, Member_id);
               st.setInt(2, Loan_amount);
               st.setInt(3, Period);
               rs=st.executeQuery();
               while(rs.next()){
                   jTextFieldLoanid.setText(String.valueOf(rs.getInt("Loan_id")));
                   jTextFieldMembername.setText(rs.getString("Member_name"));
                   jTextFieldRateofloan.setText(String.valueOf(rs.getDouble("Rate_ofloan")));
                   jTextFieldNoofpaymentsinyear.setText(String.valueOf(rs.getInt("No_of_paymentsperyear")));
                   jTextFielTotalnoofpayments.setText(String.valueOf(rs.getInt("Total_no_of_payments")));
                   datefortable=rs.getDate("Issued_date_time");
                   issueddate=rs.getDate("Issued_date_time");
               }
        } catch (Exception e) {
            System.out.println(e);
        }

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextFieldLoanPeriodKeyPressed

    private void jTextFieldRateofloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRateofloanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRateofloanActionPerformed

    private void jTextFieldRateofloanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRateofloanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRateofloanKeyPressed

    private void jTextFieldNoofpaymentsinyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoofpaymentsinyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoofpaymentsinyearActionPerformed

    private void jTextFieldNoofpaymentsinyearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNoofpaymentsinyearKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
//
//            Integer Loan_period=Integer.parseInt(jTextFieldLoanPeriod.getText());
//            Integer No_of_payementsperyear=Integer.parseInt(jTextFieldNoofpaymentsinyear.getText());
//            Integer Total_no_of_payments=Loan_period*No_of_payementsperyear;
//            jTextFielTotalnoofpayments.setText(String.valueOf(Total_no_of_payments));
//        }

    }//GEN-LAST:event_jTextFieldNoofpaymentsinyearKeyPressed

    private void jTextFielTotalnoofpaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielTotalnoofpaymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielTotalnoofpaymentsActionPerformed

    private void jTextFielTotalnoofpaymentsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielTotalnoofpaymentsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielTotalnoofpaymentsKeyPressed

    private void jProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProceedActionPerformed
        //Initialization
        int Member_id=Integer.parseInt(jTextFieldMemberid.getText());
        int Loan_id=Integer.parseInt(jTextFieldLoanid.getText());
        int Period=Integer.parseInt(jTextFieldLoanPeriod.getText());
        double Loan_amount=Double.parseDouble(jTextFieldLoanAmount.getText());
        double Rate_of_loan=(Double.parseDouble(jTextFieldRateofloan.getText()))/100;
        int No_of_payments=Integer.parseInt(jTextFielTotalnoofpayments.getText());
        int Year=Integer.parseInt(jTextFieldLoanPeriod.getText());
        double pmt=0;
        double interest=0;
        double principal=0;

        pmt=Loan_amount*Rate_of_loan/(1-((1/(Math.pow((1+Rate_of_loan),No_of_payments)))));

        for (int i = 0; i <= No_of_payments; i++) {
            String Loan1=String.valueOf(Loan_amount);
            String i1=String.valueOf(i);
            String stringdate=String.valueOf(datefortable);

            if (i==0) {
                String table_data[]={stringdate,i1,"","","",Loan1};
                DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
                tablemodel.addRow(table_data);
                
            }
            else{
                
                datefortable.setMonth(19);
                String issueddatestring=String.valueOf(issueddate);
                pmt=pmt;
                interest=Loan_amount*Rate_of_loan;
                principal=pmt-interest;
                String  pmt1=String.format("%.4f",pmt);
                String Interest1=String.format("%.4f",interest);
                String principal1=String.format("%.4f",principal);
                Loan_amount=Loan_amount-principal;
                String Loan2=String.format("%.4f",Loan_amount);
                String table_data[]={issueddatestring,i1,pmt1,Interest1,principal1,Loan2};
                DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
                tablemodel.addRow(table_data);

            }
        }
     

    }//GEN-LAST:event_jProceedActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        String url="jdbc:mysql://localhost:3306/cooperativemanagementsystem";
        String uname="root";
        String pwd="";
        ResultSet rs;
        Connection con=null;
        int Member_id=Integer.parseInt(jTextFieldMemberid.getText());
        int Loan_id=Integer.parseInt(jTextFieldLoanid.getText());
        int Period=Integer.parseInt(jTextFieldLoanPeriod.getText());
        double Loan_amount=Double.parseDouble(jTextFieldLoanAmount.getText());
        double Rate_of_loan=(Double.parseDouble(jTextFieldRateofloan.getText()))/100;
        int No_of_payments=Integer.parseInt(jTextFielTotalnoofpayments.getText());
        int Year=Integer.parseInt(jTextFieldLoanPeriod.getText());
        double pmt=0;
        double interest=0;
        double principal=0;
        

        pmt=Loan_amount*Rate_of_loan/(1-((1/(Math.pow((1+Rate_of_loan),No_of_payments)))));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,pwd);
       
        for (int i = 0; i <= No_of_payments; i++) {
            if (i==0) {
           String sql="insert into loan_amortization(Due_date,Loan_id,Member_id,Year,pmt,Interest,Principal,Loan) values(?,?,?,?,?,?,?,?)";
           PreparedStatement st=con.prepareStatement(sql);
           st.setDate(1, issueddate);
           st.setInt(2, Loan_id);
           st.setInt(3, Member_id);
           st.setInt(4,i);
           st.setDouble(5,0);
           st.setDouble(6, 0);
           st.setDouble(7,0 );
           st.setDouble(8, Loan_amount);
           st.execute();
                
            }
            else{
                
                issueddate.setMonth(19);
                pmt=pmt;
                interest=Loan_amount*Rate_of_loan;
                principal=pmt-interest;
                Loan_amount=Loan_amount-principal;
           String sql="insert into loan_amortization(Due_date,Loan_id,Member_id,Year,pmt,Interest,Principal,Loan) values(?,?,?,?,?,?,?,?)";
           PreparedStatement st=con.prepareStatement(sql);
           st.setDate(1, issueddate);
           st.setInt(2, Loan_id);
           st.setInt(3, Member_id);
           st.setInt(4,i);
           st.setDouble(5,pmt);
           st.setDouble(6, interest);
           st.setDouble(7,principal );
           st.setDouble(8, Loan_amount);
           st.execute();

            }
        }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }//GEN-LAST:event_jClearActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        // Back
      
    }//GEN-LAST:event_jAddActionPerformed

    private void jTextFieldLoanidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoanidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoanidActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoanAmortization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAmortization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAmortization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAmortization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAmortization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JButton jClear;
    private javax.swing.JLabel jLoanAmount;
    private javax.swing.JLabel jLoanPeriod;
    private javax.swing.JLabel jMemberName;
    private javax.swing.JLabel jMemberName1;
    private javax.swing.JLabel jMemberid;
    private javax.swing.JButton jProceed;
    private javax.swing.JLabel jRateofLoan;
    private javax.swing.JLabel jRateofLoan1;
    private javax.swing.JLabel jRateofLoan2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFielTotalnoofpayments;
    private javax.swing.JTextField jTextFieldLoanAmount;
    private javax.swing.JTextField jTextFieldLoanPeriod;
    private javax.swing.JTextField jTextFieldLoanid;
    private javax.swing.JTextField jTextFieldMemberid;
    private javax.swing.JTextField jTextFieldMembername;
    private javax.swing.JTextField jTextFieldNoofpaymentsinyear;
    private javax.swing.JTextField jTextFieldRateofloan;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrary;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
\\\\@author kotyba outri
 */
public class Labrarya extends javax.swing.JFrame {
int normal , drowing , folder ,penn ,penci1,coal1; //للعدادات
double notebookPrise  ,notebookkPrise,bookPrise, cilPrise , pen1Prise,pencilPrise;//الدولار
final double notebook =2 ,notebookk=2.5,boook=3, cil =3.5, pen11=4,pencil1 = 4.60;//للسعر
double subtotal ,vat,total1;
int invoice1;//رقم الفاتورة
PrintWriter output;
    
    
    
    public Labrarya() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        aggrehate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        coal = new javax.swing.JSpinner();
        penc = new javax.swing.JSpinner();
        pen = new javax.swing.JSpinner();
        pencil = new javax.swing.JLabel();
        pen1 = new javax.swing.JLabel();
        coalPencil = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        ACCOUNT = new javax.swing.JButton();
        savein = new javax.swing.JButton();
        newin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        norm = new javax.swing.JSpinner();
        fold = new javax.swing.JSpinner();
        draw = new javax.swing.JSpinner();
        note = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        book = new javax.swing.JLabel();
        invoicee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Library system :");

        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("the account");

        total.setText("Total :             0.0 $");

        tax.setText("Tax :               0.0 $");

        aggrehate.setText("aggregate :     0.0 $");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aggrehate))
                        .addGap(0, 106, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aggrehate)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel9.setText("pencil :");

        jLabel10.setText("charcoal pencil :");

        jLabel11.setText("fountain pen :");

        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("pens");

        coal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                coalStateChanged(evt);
            }
        });

        penc.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pencStateChanged(evt);
            }
        });

        pen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                penStateChanged(evt);
            }
        });

        pencil.setText("0.0 $");

        pen1.setText("0.0 $");

        coalPencil.setText("0.0 $");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pencil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pen1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(coalPencil, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pencil)
                    .addComponent(penc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pen1)
                    .addComponent(pen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(coalPencil)
                    .addComponent(coal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabel19.setForeground(new java.awt.Color(0, 102, 255));
        jLabel19.setText("the account");

        ACCOUNT.setText("account");
        ACCOUNT.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ACCOUNTStateChanged(evt);
            }
        });
        ACCOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCOUNTActionPerformed(evt);
            }
        });

        savein.setText("Save the invoice");
        savein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveinActionPerformed(evt);
            }
        });

        newin.setText("new invoice");
        newin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(savein)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ACCOUNT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(ACCOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savein, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel23.setText("Normal notebook :");

        jLabel24.setText("Drawing book :");

        jLabel25.setText("Folder notebook :");

        jLabel26.setForeground(new java.awt.Color(0, 102, 255));
        jLabel26.setText("Tools");

        norm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                normStateChanged(evt);
            }
        });

        fold.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                foldStateChanged(evt);
            }
        });

        draw.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drawStateChanged(evt);
            }
        });

        note.setText("0.0 $");

        note1.setText("0.0 $");

        book.setText("0.0 $");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(norm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(note, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(note1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(book, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(norm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(note))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(fold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(note1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book))
                .addGap(21, 21, 21))
        );

        invoicee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invoicee.setForeground(new java.awt.Color(204, 0, 0));
        invoicee.setText("invoice number : 0 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(invoicee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(invoicee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void normStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_normStateChanged
     // حطيتا اسم المتغير= اسم العداد جووا الj frem
     normal = (Integer) norm.getValue();
     // اسم المتغير الدولار = اسعر* اسم المتغير للعداد
     notebookPrise =  notebook * normal;
     // اسم الدولار بالجي فريم .سيت(اسم المتغير الدولار+)
     note.setText(notebookPrise + " ");
    }//GEN-LAST:event_normStateChanged

    private void foldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_foldStateChanged
        // TODO add your handling code here:
        drowing = (Integer) fold.getValue();
        notebookkPrise =  notebookk * drowing;
        note1.setText(notebookkPrise + " ");
    }//GEN-LAST:event_foldStateChanged

    private void drawStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drawStateChanged
        // TODO add your handling code here:
        folder = (Integer) draw.getValue();
        bookPrise =  boook * folder;
        book.setText(bookPrise + " ");
    }//GEN-LAST:event_drawStateChanged

    private void pencStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pencStateChanged
        // TODO add your handling code here:
        penn = (Integer) penc.getValue();
        cilPrise =  cil * penn;
        pencil.setText(cilPrise + " ");
    }//GEN-LAST:event_pencStateChanged

    private void penStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_penStateChanged
        // TODO add your handling code here:
        penci1 = (Integer) penc.getValue();
        pen1Prise =  pen11 * penci1;
        pen1.setText(pen1Prise + " ");
    }//GEN-LAST:event_penStateChanged

    private void coalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_coalStateChanged
        // TODO add your handling code here:
        coal1 = (Integer) coal.getValue();
        pencilPrise =  pencil1 * coal1;
        coalPencil.setText(pencilPrise + "$");
    }//GEN-LAST:event_coalStateChanged

    private void ACCOUNTStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ACCOUNTStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ACCOUNTStateChanged

    private void ACCOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCOUNTActionPerformed
    // حطينا المتغير =اسماء المتغيرات بالدولار
     subtotal = notebookPrise+notebookkPrise+bookPrise+cilPrise+pen1Prise+pencilPrise;
     total.setText(" Total :  " + subtotal + "$");//
     
     vat = subtotal * 0.05;
     vat = vat * 100;
     vat = (double)((int) vat);
     vat = vat /100 ; 
     tax.setText("Tax :  " + vat + "$");
     
     total1 = subtotal + vat;
     aggrehate.setText(" aggregate :  " + total1 + "$ ");
     
    }//GEN-LAST:event_ACCOUNTActionPerformed

    private void saveinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveinActionPerformed
        // TODO add your handling code here:
        try{
            
            if (total1 != 0){
            
                output = new PrintWriter ("billNo." + invoice1 + ".txt");
                
                output.println("invoice number:  "+invoice1);
                output.println("******************");
              }
                if(normal != 0){
                output.println(normal + " :Normal notebook  ");
                output.println( notebookPrise + "$");
                }
                if(drowing != 0){
                output.println(drowing + " :Folder notebook  ");
                output.println( notebookkPrise + "$");
                }
                if(folder != 0){
                output.println(folder + " :Drawing book  ");
                output.println( bookPrise + "$");
                }
                if(penn != 0){
                output.println(penn + " :pencil  ");
                output.println( cilPrise+ "$");
                }
                if(penci1 != 0){
                output.println(penci1 + " :fountain pen  ");
                output.println( pen1Prise + "$");
                }
                if(coal1 != 0){
                output.println(coal1 + " :charcoal pencil  ");
                output.println( pencilPrise + "$");
                }
                output.println("-----");
                output.println("$Total:  "+ subtotal + "");
                output.println("$Tax:  "+ vat + " ");
                output.println("$aggregate:  "+ total1 + " " );
                output.println();
                output.println("* Thank you for your order*");
                
                output.close();
        }
        catch (FileNotFoundException ex){
        Logger. getLogger(Labrarya.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_saveinActionPerformed

    private void newinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newinActionPerformed
        // TODO add your handling code here:
        if (total1 !=0){
        //حفظ القيم اسماء الجي فريم
           norm.setValue(0);
           fold.setValue(0);
           draw.setValue(0);
           penc.setValue(0);
           pen.setValue(0);
           coal.setValue(0);
           //بعد ما نعمل فاتورة جديدة بينكتبو محل المجميع
           total     .setText("Total");
           tax       .setText("Tax");
           aggrehate .setText("aggregate");
           
           subtotal =0;
           vat=0;
           total1=0;
           
           invoice1++;
           invoicee.setText("invoice number:" + invoice1);
        }
    }//GEN-LAST:event_newinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Labrarya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Labrarya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Labrarya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Labrarya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Labrarya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACCOUNT;
    private javax.swing.JLabel aggrehate;
    private javax.swing.JLabel book;
    private javax.swing.JSpinner coal;
    private javax.swing.JLabel coalPencil;
    private javax.swing.JSpinner draw;
    private javax.swing.JSpinner fold;
    private javax.swing.JLabel invoicee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton newin;
    private javax.swing.JSpinner norm;
    private javax.swing.JLabel note;
    private javax.swing.JLabel note1;
    private javax.swing.JSpinner pen;
    private javax.swing.JLabel pen1;
    private javax.swing.JSpinner penc;
    private javax.swing.JLabel pencil;
    private javax.swing.JButton savein;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

   private static class note {

      
   }

   
       

        
   
}

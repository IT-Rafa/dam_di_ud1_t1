package dam.di.ud1.t1.interfaz;

import java.awt.CardLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author it-ra
 */
public class Main_frame extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Main_frame() {
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

        title_container = new javax.swing.JPanel();
        hotel_label = new javax.swing.JLabel();
        menus_container = new javax.swing.JPanel();
        mainMenu_container_card0 = new javax.swing.JPanel();
        lounges_button = new javax.swing.JButton();
        rooms_button = new javax.swing.JButton();
        exit_button0 = new javax.swing.JButton();
        loungeMenu_container_card1 = new javax.swing.JPanel();
        loungeManage_button = new javax.swing.JButton();
        loungeBooks_button = new javax.swing.JButton();
        back_button1 = new javax.swing.JButton();
        exit_button1 = new javax.swing.JButton();
        loungeBookMenu_container_card2 = new javax.swing.JPanel();
        newBookLounge_button = new javax.swing.JButton();
        rooms_button2 = new javax.swing.JButton();
        back_button2 = new javax.swing.JButton();
        exit_button2 = new javax.swing.JButton();
        menuBar_container = new javax.swing.JMenuBar();
        rooms_menu = new javax.swing.JMenu();
        lounges_menu = new javax.swing.JMenu();
        bookLounge_menu = new javax.swing.JMenu();
        newBookLounge_menuitem = new javax.swing.JMenuItem();
        manageBooksLounge_menuitem = new javax.swing.JMenuItem();
        manageLounge = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Lucho Gesti??n");
        setLocationByPlatform(true);
        setName("mainApp"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        title_container.setBackground(java.awt.Color.lightGray);
        title_container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hotel_label.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        hotel_label.setForeground(new java.awt.Color(0, 0, 204));
        hotel_label.setText("Hotel Lucho");

        javax.swing.GroupLayout title_containerLayout = new javax.swing.GroupLayout(title_container);
        title_container.setLayout(title_containerLayout);
        title_containerLayout.setHorizontalGroup(
            title_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_containerLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(hotel_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        title_containerLayout.setVerticalGroup(
            title_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hotel_label)
        );

        menus_container.setLayout(new java.awt.CardLayout());

        mainMenu_container_card0.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Men?? principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lounges_button.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lounges_button.setText("Salones");
        lounges_button.setToolTipText("Gesti??n de los salones");
        lounges_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lounges_buttonActionPerformed(evt);
            }
        });

        rooms_button.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        rooms_button.setText("Habitaciones");
        rooms_button.setToolTipText("Gesti??n de las habitaciones");

        exit_button0.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        exit_button0.setText("SALIR");
        exit_button0.setToolTipText("Finalizar la aplicaci??n");
        exit_button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenu_container_card0Layout = new javax.swing.GroupLayout(mainMenu_container_card0);
        mainMenu_container_card0.setLayout(mainMenu_container_card0Layout);
        mainMenu_container_card0Layout.setHorizontalGroup(
            mainMenu_container_card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenu_container_card0Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(mainMenu_container_card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rooms_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lounges_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(mainMenu_container_card0Layout.createSequentialGroup()
                .addComponent(exit_button0)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainMenu_container_card0Layout.setVerticalGroup(
            mainMenu_container_card0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenu_container_card0Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lounges_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rooms_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(exit_button0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menus_container.add(mainMenu_container_card0, "0");

        loungeMenu_container_card1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        loungeManage_button.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        loungeManage_button.setText("Reservas salones");
        loungeManage_button.setToolTipText("Crear o modificar las reservas de los salones");
        loungeManage_button.setActionCommand("Reserva salon");
        loungeManage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loungeManage_buttonActionPerformed(evt);
            }
        });

        loungeBooks_button.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        loungeBooks_button.setText("Gesti??n salones");
        loungeBooks_button.setToolTipText("Crear o modificar los salones actuales");
        loungeBooks_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loungeBooks_buttonActionPerformed(evt);
            }
        });

        back_button1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        back_button1.setText("Volver");
        back_button1.setToolTipText("Volver al men?? anterior");
        back_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button1ActionPerformed(evt);
            }
        });

        exit_button1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        exit_button1.setText("SALIR");
        exit_button1.setToolTipText("Finalizar la aplicaci??n");
        exit_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loungeMenu_container_card1Layout = new javax.swing.GroupLayout(loungeMenu_container_card1);
        loungeMenu_container_card1.setLayout(loungeMenu_container_card1Layout);
        loungeMenu_container_card1Layout.setHorizontalGroup(
            loungeMenu_container_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loungeMenu_container_card1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(loungeMenu_container_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loungeBooks_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loungeManage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(loungeMenu_container_card1Layout.createSequentialGroup()
                .addComponent(exit_button1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button1))
        );
        loungeMenu_container_card1Layout.setVerticalGroup(
            loungeMenu_container_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loungeMenu_container_card1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(loungeManage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loungeBooks_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(loungeMenu_container_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        menus_container.add(loungeMenu_container_card1, "1");

        loungeBookMenu_container_card2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva sal??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        newBookLounge_button.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        newBookLounge_button.setText("Nueva");
        newBookLounge_button.setToolTipText("Nueva reserva de un sal??n");
        newBookLounge_button.setActionCommand("Nueva reserva");
        newBookLounge_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookLounge_buttonActionPerformed(evt);
            }
        });

        rooms_button2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        rooms_button2.setText("Modificar");
        rooms_button2.setToolTipText("Modificar las reserva de salones actuales");

        back_button2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        back_button2.setText("Volver");
        back_button2.setToolTipText("Volver al men?? anterior");
        back_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button2ActionPerformed(evt);
            }
        });

        exit_button2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        exit_button2.setText("SALIR");
        exit_button2.setToolTipText("Finalizar la aplicaci??n");
        exit_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loungeBookMenu_container_card2Layout = new javax.swing.GroupLayout(loungeBookMenu_container_card2);
        loungeBookMenu_container_card2.setLayout(loungeBookMenu_container_card2Layout);
        loungeBookMenu_container_card2Layout.setHorizontalGroup(
            loungeBookMenu_container_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loungeBookMenu_container_card2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(loungeBookMenu_container_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rooms_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBookLounge_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(loungeBookMenu_container_card2Layout.createSequentialGroup()
                .addComponent(exit_button2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button2))
        );
        loungeBookMenu_container_card2Layout.setVerticalGroup(
            loungeBookMenu_container_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loungeBookMenu_container_card2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(newBookLounge_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rooms_button2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(loungeBookMenu_container_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        menus_container.add(loungeBookMenu_container_card2, "2");

        menuBar_container.setBackground(new java.awt.Color(255, 0, 102));
        menuBar_container.setForeground(new java.awt.Color(255, 102, 102));

        rooms_menu.setText("Habitaciones");
        menuBar_container.add(rooms_menu);

        lounges_menu.setText("Salones");
        lounges_menu.setToolTipText("");

        bookLounge_menu.setText("Reservas salones");

        newBookLounge_menuitem.setText("Nueva reserva");
        newBookLounge_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookLounge_menuitemActionPerformed(evt);
            }
        });
        bookLounge_menu.add(newBookLounge_menuitem);

        manageBooksLounge_menuitem.setText("Gestionar reservas");
        bookLounge_menu.add(manageBooksLounge_menuitem);

        lounges_menu.add(bookLounge_menu);

        manageLounge.setText("Gesti??n salones");
        lounges_menu.add(manageLounge);

        menuBar_container.add(lounges_menu);

        setJMenuBar(menuBar_container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menus_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menus_container, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("mainApp");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button0ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exit_button0ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void loungeBooks_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loungeBooks_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loungeBooks_buttonActionPerformed

    private void lounges_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lounges_buttonActionPerformed
        CardLayout cl;
        cl = (CardLayout) menus_container.getLayout();
        cl.show(menus_container, "1");
    }//GEN-LAST:event_lounges_buttonActionPerformed

    private void loungeManage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loungeManage_buttonActionPerformed
        CardLayout cl;
        cl = (CardLayout) menus_container.getLayout();
        cl.show(menus_container, "2");

    }//GEN-LAST:event_loungeManage_buttonActionPerformed

    private void back_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button1ActionPerformed
        CardLayout cl;
        cl = (CardLayout) menus_container.getLayout();
        cl.show(menus_container, "0");
    }//GEN-LAST:event_back_button1ActionPerformed

    private void exit_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exit_button1ActionPerformed

    private void back_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button2ActionPerformed
        CardLayout cl;
        cl = (CardLayout) menus_container.getLayout();
        cl.show(menus_container, "1");
    }//GEN-LAST:event_back_button2ActionPerformed

    private void exit_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button2ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exit_button2ActionPerformed

    private void newBookLounge_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookLounge_buttonActionPerformed
        LoungeNewBook dialog = new LoungeNewBook(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_newBookLounge_buttonActionPerformed

    private void newBookLounge_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookLounge_menuitemActionPerformed
                LoungeNewBook dialog = new LoungeNewBook(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_newBookLounge_menuitemActionPerformed

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
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_frame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button1;
    private javax.swing.JButton back_button2;
    private javax.swing.JMenu bookLounge_menu;
    private javax.swing.JButton exit_button0;
    private javax.swing.JButton exit_button1;
    private javax.swing.JButton exit_button2;
    private javax.swing.JLabel hotel_label;
    private javax.swing.JPanel loungeBookMenu_container_card2;
    private javax.swing.JButton loungeBooks_button;
    private javax.swing.JButton loungeManage_button;
    private javax.swing.JPanel loungeMenu_container_card1;
    private javax.swing.JButton lounges_button;
    private javax.swing.JMenu lounges_menu;
    private javax.swing.JPanel mainMenu_container_card0;
    private javax.swing.JMenuItem manageBooksLounge_menuitem;
    private javax.swing.JMenuItem manageLounge;
    private javax.swing.JMenuBar menuBar_container;
    private javax.swing.JPanel menus_container;
    private javax.swing.JButton newBookLounge_button;
    private javax.swing.JMenuItem newBookLounge_menuitem;
    private javax.swing.JButton rooms_button;
    private javax.swing.JButton rooms_button2;
    private javax.swing.JMenu rooms_menu;
    private javax.swing.JPanel title_container;
    // End of variables declaration//GEN-END:variables
}

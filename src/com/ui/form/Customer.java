package com.ui.form;

import com.ui.component.Card;
import com.ui.model.Model_Card;
import com.ui.swing.PanelBorder;
import com.ui.swing.Table;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Customer extends JPanel implements ActionListener {
    // components
    private JPanel j;
    private JPanel p1,p2,p3,p4,p5,p6,p7;
    private JTextField txtName, txtPhone, txtEmail, txtAddress, txtRDate, txtCustomerID, txtCpw;
    private JButton  btnTotal, btnSearch, btnDel, btnUpdate, btnCancel;

    private Card c1;
    private Card c2;
    private Card c3;
    private JLabel label;
    private JLayeredPane panelContainer;
    private PanelBorder panelBorder;
    private JScrollPane spTable;
    private Table table;

    public Customer() {
        initComponents();
    }

    private void initComponents() {

        panelContainer = new JLayeredPane();
        c1 = new Card();
        c2 = new Card();
        c3 = new Card();
        panelBorder = new PanelBorder();
        label = new JLabel();
        spTable = new JScrollPane();
        table = new Table();
        j = new JPanel();

        panelContainer.setPreferredSize(new DimensionUIResource(400,300));
//        panelContainer.setPreferredSize(new Dimension(400,300));


        j.setBackground(Color.red);

        new JPanel(new GridLayout(7, 0));

//        setBackground(new Color(242, 242, 242));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(125, 125, 125))
        );




    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Customer();
    }
}

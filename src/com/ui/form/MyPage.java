package com.ui.form;

import com.ui.swing.Table;
import com.main.Conn;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;

public class MyPage extends JPanel {
	private Connection conn;
	private Table table;
	
    public MyPage() {
        initComponents();
        loadData();
    }
    
	private void initComponents() {
        JLabel label = new JLabel();
        setBackground(new Color(242, 242, 242));

        label.setFont(new Font("sansserif", 0, 36)); // NOI18N
        label.setForeground(new java.awt.Color(106, 106, 106));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("내 정보");
        
    	table = new Table();
    	JScrollPane scrollPane = new JScrollPane(table);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                        .addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                .addGap(128, 128, 128)
                        		.addGap(28, 28, 28)
                                .addComponent(label)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
//                                .addGap(125, 125, 125))
                                .addContainerGap())
        );
    }
	
	private void loadData() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("EMPLOYEEID");
		model.addColumn("ENAME");
		model.addColumn("POSITION");
		model.addColumn("EPHONE");
		model.addColumn("EEMAIL");
		model.addColumn("HIREDATE");
		
		try {
			conn = Conn.conn();
			Statement stmt = conn.createStatement();
			String query = "SELECT EMPLOYEEID, ENAME, POSITION, EPHONE, EEMAIL, HIREDATE from Employee";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				model.addRow(new Object[]{
						rs.getString("EMPLOYEEID"),
						rs.getString("ENAME"),
						rs.getString("POSITION"),
						rs.getString("EPHONE"),
						rs.getString("EEMAIL"),
						rs.getDate("HIREDATE")
					}
				);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		table.setModel(model);
	}
}

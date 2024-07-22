package com.main;

import java.sql.*;

public class Conn {
    private static Connection con;
    private Conn() {}
    public static Connection conn(){
        if (con == null) {
            synchronized (Conn.class) {
                if (con == null) {
                    try {
                        String url = "jdbc:oracle:thin:@bookerpmsa_high?TNS_ADMIN=C:/Wallet_BookERPMSA";
                        String user = "ADMIN";
                        String password = "Madwolves9810!";
                        con = DriverManager.getConnection(url, user, password);
                        System.out.println("Successful!");
                    } catch (SQLException e) {
                        System.out.println("Wallet 경로 확인");
                        System.out.println("라이브러리에 JDBC 확인");
                        System.out.println("오라클 접속 확인");
                        e.printStackTrace();
                    }
                }
            }
        }
        return con;
    }
    //연결 테스트용
    public static void main(String[] args) {
        conn();
    }
}

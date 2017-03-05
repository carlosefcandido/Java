package persistencia.sispront;

import java.sql.*;

public class dao {
    public Connection con;
    public Statement stmt;
    public PreparedStatement stmt1;
    public ResultSet rst;

    public dao(){
        this.con = null;
        this.stmt = null;
        this.stmt1 = null;
        this.rst = null;
    }

    public boolean Conexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prontua2","root","");

            return(true);
        }catch(Exception e){
            return(false);

        }
    }

    public Connection getCon(){
        return con;
    }

    public int executarUpdate(String sql){
        int linha = -1;
        try{
            stmt = con.createStatement();
            linha = this.stmt1.executeUpdate(sql);
            return(linha);
        }catch(Exception e){
            return(linha);
        }
    }

    public ResultSet executarSelect(String sql){
        try{
            stmt = con.createStatement();
            this.stmt1.executeQuery(sql);
            return rst;
        }catch(Exception e){
            return rst;
        }
    }

}

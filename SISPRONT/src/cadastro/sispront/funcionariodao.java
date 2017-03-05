/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastro.sispront;

/**
 *
 * @author Carlos Eduardo
 */
import persistencia.sispront.dao;
/**
 *
 * @author Carlos Eduardo
 */
public class funcionariodao extends dao{
    public void gravar (funcionario f) throws Exception{
        Conexao();
        String sql = "insert into funcionario (nome, cpf, setor, login, senha) values (?, ?, ?, ?, ?)";
        stmt1 = con.prepareStatement(sql);
        stmt1.setString(1, f.getNome());
        stmt1.setString(2, f.getCpf());
        stmt1.setString(3, f.getSetor());
        stmt1.setString(4, f.getLogin());
        stmt1.setString(5, f.getSenha());

        stmt1.executeUpdate();
        stmt1.close();
    }

    public funcionario consulta (String cpf) throws Exception{
        Conexao();
        String sql = "select * from funcionario where cpf = ?";
        stmt1 = con.prepareStatement(sql);
        stmt1.setString(1, cpf);
        funcionario f = new funcionario();
        rst = stmt1.executeQuery();
        while(rst.next()){
            f.setCodfunc(rst.getInt("codfunc"));
            f.setNome(rst.getString("nome"));
            f.setCpf(rst.getString("cpf"));
            f.setSetor(rst.getString("setor"));
            f.setLogin(rst.getString("login"));
            f.setSenha(rst.getString("senha"));
        }
        rst.close();
        stmt1.close();
        return(f);
    }

    public void alterar (funcionario f) throws Exception{
        Conexao();
        String sql = "update funcionario set nome=?, cpf=?, setor=?, login=?, senha=? where codfunc = ?";
        stmt1 = con.prepareStatement(sql);
        stmt1.setString(1, f.getNome());
        stmt1.setString(2, f.getCpf());
        stmt1.setString(3, f.getSetor());
        stmt1.setString(4, f.getLogin());
        stmt1.setString(5, f.getSenha());
        stmt1.setInt(6, f.getCodfunc());

        stmt1.executeUpdate();
        stmt1.close();
    }
}

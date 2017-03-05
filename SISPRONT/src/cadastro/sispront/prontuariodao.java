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
public class prontuariodao extends dao{
    public void gravar (prontuario p) throws Exception{
        Conexao();
        String sql = "insert into prontuario (nome, cpf, num_pront, data_internacao, data_alta, corredor, prateleira, num_caixa) values (?, ?, ?, ?, ?, ?, ?, ?)";
        stmt1 = con.prepareStatement(sql);
        stmt1.setString(1, p.getNomepront());
        stmt1.setString(2, p.getCpf());
        stmt1.setInt(3, p.getNumpront());
        stmt1.setString(4, p.getData_internacao());
        stmt1.setString(5, p.getData_alta());
        stmt1.setString(6, p.getCorredor());
        stmt1.setString(7, p.getPrateleira());
        stmt1.setString(8, p.getNum_caixa());

        stmt1.executeUpdate();
        stmt1.close();
    }

    public prontuario consulta (String numpront) throws Exception{
        Conexao();
        String sql = "select * from prontuario where num_pront = ?";
        stmt1 = con.prepareStatement(sql);
        stmt1.setString(1, numpront);
        prontuario p = new prontuario();
        rst = stmt1.executeQuery();
        while(rst.next()){
            p.setCodpront(rst.getInt("codpront"));
            p.setNomepront(rst.getString("nome"));
            p.setCpf(rst.getString("cpf"));
            p.setNumpront(rst.getInt("num_pront"));
            p.setData_internacao(rst.getString("data_internacao"));
            p.setData_alta(rst.getString("data_alta"));
            p.setCorredor(rst.getString("corredor"));
            p.setPrateleira(rst.getString("prateleira"));
            p.setNum_caixa(rst.getString("num_caixa"));
        }
        rst.close();
        stmt1.close();
        return(p);
    }

    public void alterar (prontuario p) throws Exception{
        Conexao();
        String sql = "update prontuario set nome=?, cpf=?, num_pront=?, data_internacao=?, data_alta=?, corredor=?, prateleira=?, num_caixa=? where codpront = ?";
        stmt1 = con.prepareStatement(sql);
        stmt1.setString(1, p.getNomepront());
        stmt1.setString(2, p.getCpf());
        stmt1.setInt(3, p.getNumpront());
        stmt1.setString(4, p.getData_internacao());
        stmt1.setString(5, p.getData_alta());
        stmt1.setString(6, p.getCorredor());
        stmt1.setString(7, p.getPrateleira());
        stmt1.setString(8, p.getNum_caixa());
        stmt1.setInt(9, p.getCodpront());

        stmt1.executeUpdate();
        stmt1.close();
    }
}

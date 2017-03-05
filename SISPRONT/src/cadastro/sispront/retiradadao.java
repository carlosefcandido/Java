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
public class retiradadao extends dao{
    public void gravar (retirada r) throws Exception{
        Conexao();
        String sql = "insert into retirada_prontuario (codfunc, codpront, data, hora) values (?, ?, ?, ?)";
        stmt1 = con.prepareStatement(sql);
        stmt1.setInt(1, r.getCodfunc());
        stmt1.setInt(2, r.getCodpront());
        stmt1.setString(3, r.getDt());
        stmt1.setString(4, r.getHr());

        stmt1.executeUpdate();
        stmt1.close();
    }
}

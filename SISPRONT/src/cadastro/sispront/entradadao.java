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
public class entradadao extends dao{
    public void gravar (entrada e) throws Exception{
        Conexao();
        String sql = "insert into entrega_prontuario (codfunc, codpront, data, hora) values (?, ?, DATE_FORMAT(NOW(),'%d/%m/%Y'), CURTIME())";
        stmt1 = con.prepareStatement(sql);
        stmt1.setInt(1, e.getCodfunc());
        stmt1.setInt(2, e.getCodpront());
        //stmt1.setString(3, e.getDt());
        //stmt1.setString(3, e.getHr());

        stmt1.executeUpdate();
        stmt1.close();
    }
}

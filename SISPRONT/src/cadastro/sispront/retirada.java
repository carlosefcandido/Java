/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastro.sispront;

/**
 *
 * @author Carlos Eduardo
 */
public class retirada {
    private int codfunc;
    private int codpront;
    private String dt;
    private String hr;
    private funcionario func;
    private prontuario pront;

    /**
     * @return the codfunc
     */
    public int getCodfunc() {
        return codfunc;
    }

    /**
     * @param codfunc the codfunc to set
     */
    public void setCodfunc(int codfunc) {
        this.codfunc = codfunc;
    }

    /**
     * @return the codpront
     */
    public int getCodpront() {
        return codpront;
    }

    /**
     * @param codpront the codpront to set
     */
    public void setCodpront(int codpront) {
        this.codpront = codpront;
    }

    /**
     * @return the dt
     */
    public String getDt() {
        return dt;
    }

    /**
     * @param dt the dt to set
     */
    public void setDt(String dt) {
        this.dt = dt;
    }

    /**
     * @return the hr
     */
    public String getHr() {
        return hr;
    }

    /**
     * @param hr the hr to set
     */
    public void setHr(String hr) {
        this.hr = hr;
    }

    /**
     * @return the func
     */
    public funcionario getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(funcionario func) {
        this.func = func;
    }

    /**
     * @return the pront
     */
    public prontuario getPront() {
        return pront;
    }

    /**
     * @param pront the pront to set
     */
    public void setPront(prontuario pront) {
        this.pront = pront;
    }
}

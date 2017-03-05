/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia.sispront;

/**
 *
 * @author Carlos Eduardo
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class upper extends PlainDocument{
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        super.insertString(offs, str.toUpperCase(),a);
    }

}

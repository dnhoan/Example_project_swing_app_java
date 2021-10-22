
package Model;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ValidConstrain {
    JTextField jTextField;
    JPasswordField jPasswordField;
    JTextArea jTextArea;
    JLabel jlabel;
    String alert;

    public ValidConstrain(JTextField jTextField, String alert) {
        this.jTextField = jTextField;
        this.alert = alert;
    }

    public ValidConstrain(JPasswordField jPasswordField, String alert) {
        this.jPasswordField = jPasswordField;
        this.alert = alert;
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    public ValidConstrain(JLabel label, String alert) {
        this.jlabel = label;
        this.alert = alert;
    }

    public ValidConstrain(JTextArea jTextArea, String alert) {
        this.jTextArea = jTextArea;
        this.alert = alert;
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    public JLabel getLabel() {
        return jlabel;
    }

    public void setLabel(JLabel label) {
        this.jlabel = label;
    }

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    public JPasswordField getjPasswordField() {
        return jPasswordField;
    }

    public void setjPasswordField(JPasswordField jPasswordField) {
        this.jPasswordField = jPasswordField;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }
    
    
    
}

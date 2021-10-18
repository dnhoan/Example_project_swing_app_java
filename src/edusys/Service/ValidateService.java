package edusys.Service;

import edusys.model.ValidConstrain;
import java.awt.Color;

public class ValidateService {

    public static boolean isEmpty(ValidConstrain... arguments) {
        for (int i = 0; i < arguments.length; i++) {
            if (arguments[i].getjTextField() != null) {
                if (arguments[i].getjTextField().getText().trim().isEmpty()) {
                    arguments[i].getjTextField().requestFocus();
                    MessageService.alert(null, "Bạn chưa nhập " + arguments[i].getAlert());
                    return true;
                }
            } 
            else if (arguments[i].getjPasswordField() != null) {
                if (arguments[i].getjPasswordField().getText().trim().isEmpty()) {
                    arguments[i].getjPasswordField().requestFocus();
                    MessageService.alert(null, "Bạn chưa nhập " + arguments[i].getAlert());
                    return true;
                }
            }
            else if (arguments[i].getLabel()!= null) {
                if (arguments[i].getLabel().getToolTipText() == null) {
                    arguments[i].getLabel().requestFocus();
                    MessageService.alert(null, "Bạn chưa chọn " + arguments[i].getAlert());
                    return true;
                }
            }
            else if (arguments[i].getjTextArea()!= null) {
                if (arguments[i].getjTextArea().getText().trim().isEmpty()) {
                    arguments[i].getjTextArea().requestFocus();
                    MessageService.alert(null, "Bạn chưa nhập " + arguments[i].getAlert());
                    return true;
                }
            }
        }
        return false;
    }

}

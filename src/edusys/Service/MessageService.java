
package edusys.Service;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MessageService {
    public static void alert(Component currentParent, String message) {
        JOptionPane.showMessageDialog(
                currentParent, message, 
                "Hệ thống quản lý đào tạo", 
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    public static boolean confirm(Component currentParent, String message) {
        int result = JOptionPane.showConfirmDialog(
                currentParent, message, 
                "Hệ thống quản lý đào tạo", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
        );
        return result == JOptionPane.YES_OPTION;
    }
    public static String prompt(Component currentParent, String message) {
        return JOptionPane.showInputDialog(
                currentParent, message, 
                "Hệ thống quản lý đào tạo", 
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}

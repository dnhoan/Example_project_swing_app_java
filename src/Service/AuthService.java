
package Service;

import Model.Employee;

public class AuthService {
    public static Employee user = null;
    public static void clear() {
        AuthService.user = null;
    }
    public static  boolean isLogin() {
        return AuthService.user != null;
    }
    public static boolean isManager() {
        return AuthService.isLogin() && user.isVaiTro();
    }
}

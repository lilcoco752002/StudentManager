package User;

public class UserAccount {
    private String username;
    private String password;
    private String role;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void login(String inputUser, String inputPass) {
        if (inputUser.equals(username) && inputPass.equals(password)) {
            System.out.println("Dang nhap thanh cong! Chao mung " + role + ": " + username);
        } else {
            System.out.println("Dang nhap that bai. Sai ten dang nhap hoac mat khau.");
        }
    }

    public void logout() {
        System.out.println("Nguoi dung " + username + " da dang xuat khoi he thong.");
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Doi mat khau thanh cong cho tai khoan: " + username);
    }
}

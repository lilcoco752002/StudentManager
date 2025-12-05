package User;

public class UserProfile {
    private String userId;
    private String userName;
    private String email;

    // getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void login() {
        System.out.println("Nguoi dung " + userName + " dang nhap thanh cong.\n");
    }

    public void updateProfile() {
        System.out.println("Cap nhat thong tin nguoi dung " + userName + " thanh cong.");
    }

    public void logout() {
        System.out.println("Nguoi dung " + userName + " da dang xuat.");
    }

    public void changePassword(String newPassword) {
        System.out.println("Doi mat khau cho nguoi dung " + userName + " thanh cong.");
    }
}

import User.UserAccount;
import Student.StudentProfile;
import Department.DepartmentInfo;
import Report.ReportGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n        STUDENT MANAGEMENT SYSTEM \n");

        System.out.println("1. User & Authentication Module\n");
        UserAccount admin = new UserAccount();
        admin.setUsername("admin");
        admin.setPassword("123456");
        admin.setRole("Administrator");

        admin.login("admin", "123456"); // Login success
        admin.changePassword("newpass789");
        admin.logout();

        System.out.println("\n2. Department Module\n");
        DepartmentInfo itDept = new DepartmentInfo();
        itDept.addDepartment("CNTT", "Cong Nghe Thong Tin", "TS. Nguyen Van A");
        itDept.showDepartmentInfo();
        itDept.listCourses();

        System.out.println("\n3. Student Module\n");
        StudentProfile student1 = new StudentProfile();
        student1.addStudent("SV001", "Le Huu Thanh", 3.5, 07 / 05 / 2002);
        student1.viewStudentDetails();

        student1.updateStudent("Duong Thanh (Updated)", 3.8);
        student1.viewStudentDetails();

        System.out.println("\n4. Report Module\n");
        ReportGenerator reportGen = new ReportGenerator();
        reportGen.generateStudentReport("SV001");
        reportGen.generateDepartmentReport("CNTT");
    }
}

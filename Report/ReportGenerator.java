package Report;

public class ReportGenerator {

    public void generateStudentReport(String studentId) {
        System.out.println("[REPORT] Dang tao bao cao ket qua hoc tap cho sinh vien: " + studentId);
        System.out.println(">> Hoan tat: Bao cao da duoc luu duoi dang PDF!");
    }

    public void generateDepartmentReport(String deptId) {
        System.out.println("[REPORT] Dang tong hop so lieu thong ke cho khoa: " + deptId);
        System.out.println(">> Hoan tat: Bao cao tong hop khoa da san sang!");
    }
}

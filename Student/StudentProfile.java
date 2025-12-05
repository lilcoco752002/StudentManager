package Student;

public class StudentProfile {
    private String studentId;
    private String fullName;
    private double gpa;
//chức năng thêm sinh viên
    public void addStudent(String id, String name, double gpa) {
        this.studentId = id;
        this.fullName = name;
        this.gpa = gpa;
        System.out.println("Them moi sinh vien thanh cong: " + fullName + " (" + studentId + ")");
    }
//chức năng cập nhật sinh viên
    public void updateStudent(String newName, double newGpa) {
        this.fullName = newName;
        this.gpa = newGpa;
        System.out.println("Cap nhat thong tin sinh vien " + studentId + " thanh cong!");
    }
//chức năng xem sinh viên
    public void viewStudentDetails() {
        System.out.println("--- Thong tin Sinh vien ---");
        System.out.println("MSSV: " + studentId);
        System.out.println("Ho ten: " + fullName);
        System.out.println("Diem GPA: " + gpa);
        System.out.println("---------------------------");
    }
}

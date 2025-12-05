package Department;

public class DepartmentInfo {
    private String deptId;
    private String deptName;
    private String headOfDept;

    // chức năng thêm khoa
    public void addDepartment(String id, String name, String head) {
        this.deptId = id;
        this.deptName = name;
        this.headOfDept = head;
        System.out.println("Them khoa moi: " + deptName + " (" + deptId + ")");
    }

    public void showDepartmentInfo() {
        System.out.println("Khoa: " + deptName + " | Truong khoa: " + headOfDept);
    }

    public void listCourses() {
        System.out.println("Danh sach mon hoc thuoc khoa " + deptName + ":");
        System.out.println("- Lap trinh Java co ban");
        System.out.println("- Cau truc du lieu va giai thuat");
        System.out.println("- Co so du lieu");
    }
}

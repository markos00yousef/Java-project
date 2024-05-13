public class Student {

    String studentName;
    int studentBirthYear;
    String studentCollege;

    public Student (String name, int year, String college){
        this.studentName = name;
        this.studentBirthYear = year;
        this.studentCollege = college;
    }


    int CollegeID() {
        int student_ID = 2021*10000 + studentBirthYear;
        return student_ID;
    }

    String CollegeEmail() {
        String student_Email = studentName.substring(0,2) + studentBirthYear + "@college.com";
        return student_Email;
    }
    
}

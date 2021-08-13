package homework.controller;

import homework.models.Student;
import homework.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService= new StudentService();

    public List<Student> findAllStudent(){
        return studentService.findAll();
    }

    public void saveStudent(Student student){
        studentService.saveToDatabase(student);
    }

    public void deleteStudent(int id){
        studentService.deleteFromDatabase(id);
    }

    public void updateStudent(Student student, int id){
        studentService.updateOnDatabase(student, id);
    }

    public List<Student> studentListByGender(char gender) {
        return studentService.studentListByGender(gender);
    }

    public List<Student> studentListByCourse(int courseId) {
        return studentService.studentListByCourse(courseId);
    }
}

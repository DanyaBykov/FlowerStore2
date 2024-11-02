package ucu.edu.ua.flower.store.student;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentService getStudent() {
        return studentService;
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
}

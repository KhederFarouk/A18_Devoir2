package a18_devoir2.controller;


import a18_devoir2.model.Student;
import a18_devoir2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/create-student")
    public ModelAndView showCreateStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return new ModelAndView("create-student");
    }
    @PostMapping( consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Student createStudent(@ModelAttribute Student student) {
        return studentService.createStudent(student);
    }


}
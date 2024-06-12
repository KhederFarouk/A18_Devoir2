package a18_devoir2.service;

import a18_devoir2.model.Student;
import a18_devoir2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Transactional
    public Student createStudent(Student student) {
        studentRepository.save(student);
        studentRepository.flush();
        return student;
    }
}
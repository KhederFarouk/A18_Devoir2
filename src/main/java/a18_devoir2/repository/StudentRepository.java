package a18_devoir2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import a18_devoir2.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

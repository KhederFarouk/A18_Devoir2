package a18_devoir2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudentApplication extends SpringBootServletInitializer  {
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }
}
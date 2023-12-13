package fr.efrei.project.entrypoint;

import fr.efrei.project.service.StudentService;
import fr.efrei.project.domain.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentEntryPoint {

        private final StudentService studentService;

        @GetMapping
        public List<Student> getStudents() {
            return studentService.getStudents();
        }

        @GetMapping("/{id}")
        public Student getStudent(@PathVariable Integer id) {
            return studentService.getStudent(id);
        }

        @PostMapping
        public Student saveStudent(@RequestBody Student student) {
            return studentService.saveStudent(student);
        }

        @PutMapping("/{id}")
        public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
            return studentService.updateStudent(id, student);
        }

        @DeleteMapping("/{id}")
        public void deleteStudent(@PathVariable Integer id) {
            studentService.deleteStudent(id);
        }
}

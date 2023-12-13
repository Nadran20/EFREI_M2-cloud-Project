package fr.efrei.project;

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
        public Student getStudent(@PathVariable Long id) {
            return studentService.getStudent(id);
        }

        @PostMapping
        public Student saveStudent(@RequestBody Student student) {
            return studentService.saveStudent(student);
        }

        @DeleteMapping("/{id}")
        public void deleteStudent(@PathVariable Long id) {
            studentService.deleteStudent(id);
        }
}

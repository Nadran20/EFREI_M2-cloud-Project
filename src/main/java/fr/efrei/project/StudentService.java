package fr.efrei.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

        public List<Student> getStudents() {
            return Collections.emptyList();
        }

        public Student getStudent(Long id) {
            return null;
        }

        public Student saveStudent(Student student) {
            return null;
        }

        public void deleteStudent(Long id) {
            return;
        }
}

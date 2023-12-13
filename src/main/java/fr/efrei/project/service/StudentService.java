package fr.efrei.project.service;

import fr.efrei.project.domain.entity.Student;
import fr.efrei.project.domain.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

        public List<Student> getStudents() {
            return studentRepository.findAll();
        }

        public Student getStudent(Integer id) {
            return studentRepository.findById(id).orElse(null);
        }

        public Student updateStudent(Integer id, Student student) {
            Student studentToUpdate = studentRepository.findById(id).orElse(null);
            if (studentToUpdate != null) {
                studentToUpdate.setName(student.getName());
                studentToUpdate.setAge(student.getAge());
                return studentRepository.save(studentToUpdate);
            }
            return null;
        }

        public Student saveStudent(Student student) {
            return studentRepository.save(student);
        }

        public void deleteStudent(Integer id) {
            studentRepository.deleteById(id);
        }
}

package fr.efrei.project.domain.repository;

import fr.efrei.project.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
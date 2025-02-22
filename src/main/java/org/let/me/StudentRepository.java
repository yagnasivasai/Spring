package org.let.me;


/*JpaRepository: Provides built-in methods for performing CRUD operations like save(), findAll(), findById(), etc.
You don't need to write the implementation for these methods; Spring Data JPA will do it for you.*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}

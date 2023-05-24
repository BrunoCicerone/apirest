package com.usuarios.apiusuarios.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.usuarios.apiusuarios.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // Agrega métodos personalizados si los necesitas
}

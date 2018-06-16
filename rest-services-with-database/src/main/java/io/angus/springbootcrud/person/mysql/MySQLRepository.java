package io.angus.springbootcrud.person.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MySQLRepository extends JpaRepository<MySQLRecord, Integer> {

}

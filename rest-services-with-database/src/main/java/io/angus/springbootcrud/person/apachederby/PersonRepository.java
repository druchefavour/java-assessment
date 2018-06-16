package io.angus.springbootcrud.person.apachederby;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonRecord, String> {

}

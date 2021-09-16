package pl.demo.phonebook;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAll();
    List<Person> findPersonByName(String name);
    void deleteById(Long id);

    @Query(
            value = "SELECT * FROM person where person.name = :name  LIMIT 1", nativeQuery = true)
    Person findOnePersonByName (String name);



}

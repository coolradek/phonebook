package pl.demo.phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/person")

public class PersonApi {

    @Autowired
    private PersonRepository personRepository;

    private List<Person> PersonList;

    public PersonApi () {
        PersonList = new ArrayList<>();
        PersonList.add(new Person(1L, "Kazimierz", "789654123"));
        PersonList.add(new Person(2L, "Stefan", "46576879"));
    }
    @GetMapping("/all")
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @GetMapping("/names")
    public List<Person> getByName(@RequestParam String name) {

        return personRepository.findPersonByName(name);
    }

    @GetMapping("/{id}")
    public Optional<Person> getById(@PathVariable("id") Long id) {

        return personRepository.findById(id);
    }

    @GetMapping("/name")
    public Person getOneByName(@RequestParam String name) {

        return personRepository.findOnePersonByName(name);

    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @DeleteMapping("/delete")
    public void deletePerson(@RequestParam Long id) {
        personRepository.deleteById(id);
    }
}

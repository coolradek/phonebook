package pl.demo.phonebook;

import javax.persistence.*;

@Entity
public class Person {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person() {
    }

    public Person(Long id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
}

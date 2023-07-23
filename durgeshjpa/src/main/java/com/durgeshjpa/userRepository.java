package com.durgeshjpa;

import org.springframework.data.repository.CrudRepository;


public interface userRepository extends CrudRepository<Users,Integer> {

    void deleteById(int id);

    Users findByName(String abrar);

    Users findByAge(int i);
}

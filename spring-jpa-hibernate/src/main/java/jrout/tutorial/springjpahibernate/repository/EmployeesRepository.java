package jrout.tutorial.springjpahibernate.repository;

import jrout.tutorial.springjpahibernate.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees,Integer> {

}

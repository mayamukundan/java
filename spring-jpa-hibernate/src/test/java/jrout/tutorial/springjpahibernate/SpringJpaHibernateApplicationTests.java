package jrout.tutorial.springjpahibernate;

import jrout.tutorial.springjpahibernate.model.Employees;
import jrout.tutorial.springjpahibernate.repository.EmployeesRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaHibernateApplicationTests {

	@Autowired
	private EmployeesRepository employeesRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindById(){
		Optional<Employees> employees = employeesRepository.findById(10003);
		System.out.println(employees.get());
	}
}

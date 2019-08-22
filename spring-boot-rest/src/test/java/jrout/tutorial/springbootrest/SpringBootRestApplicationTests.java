package jrout.tutorial.springbootrest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRest() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Student student = restTemplate.getForObject("http://localhost:8087/hello/student", Student.class);
        System.out.println(student.getName());
    }

}
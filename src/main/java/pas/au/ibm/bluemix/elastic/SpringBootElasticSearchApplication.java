package pas.au.ibm.bluemix.elastic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootElasticSearchApplication {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootElasticSearchApplication.class, args);
    }

    @PostConstruct
    private void init()
    {
        employeeRepository.save(new Employee("1", "Pas", "apicella", "Manager", 10));
        employeeRepository.save(new Employee("2", "Lucia", "apicella", "Team Leader", 20));
        employeeRepository.save(new Employee("3", "Siena", "apicella", "Clerk", 30));
        employeeRepository.save(new Employee("4", "Lucas", "apicella", "Clerk", 30));
        employeeRepository.save(new Employee("5", "Jake", "King", "Clerk", 40));
        employeeRepository.save(new Employee("6", "Debbie", "Keys", "Clerk", 40));
    }
}

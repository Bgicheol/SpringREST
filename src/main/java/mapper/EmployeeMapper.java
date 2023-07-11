package mapper;

import java.util.List;

import com.ezen.springrest.dto.Employee;

public interface EmployeeMapper {
	
	List<Employee> getAll();
	
	List<Employee> getRandomEmployees(int size);
}

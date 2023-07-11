package mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.springrest.dto.Employee;

@Service
public class EmployeeMapperImp1 implements EmployeeMapper {
	
	@Autowired
	EmployeeMapper eeMapper;
	
	@Override
	public List<Employee> getAll() {
		
		return eeMapper.getAll();
	}
	
	@Override
	public List<Employee> getRandomEmployees(int size) {
		
		return null;
	}
}

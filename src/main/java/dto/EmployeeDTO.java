package dto;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDTO {
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Integer salary;
	private Date hire_date;
	private Integer department_id;
}

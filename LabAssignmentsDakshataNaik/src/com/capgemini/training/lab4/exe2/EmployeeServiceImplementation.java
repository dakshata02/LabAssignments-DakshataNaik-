package com.capgemini.training.lab4.exe2;
public class EmployeeServiceImplementation implements  EmployeeService {
	Employee emp = new Employee();
	@Override
	
	public void getDetails(Employee employee) {
		
		
		Integer id = employee.getId();
		String name = employee.getName();
		Double sal = employee.getSalary();
		String desig = employee.getDesignation();
		String InsScheme = employee.getInsuranceScheme();
		
	}

	@Override
	public void findInsuranceScheme(Employee employee) {
		if(employee.getSalary()>15000 || employee.getDesignation().equals("analyst"))
			System.out.println("Maternity Insurance");
		else if(employee.getSalary()>25000 || employee.getDesignation().equals("software developer"))
			System.out.println("Medical insurance");
		else if(employee.getSalary()>30000 || employee.getDesignation().equals("Data Engineer"))
			System.out.println("Car Insurancer");
		
		
	}

	@Override
	public void displayDetails(Employee employee) {
		System.out.println(	"ID = "+employee.getId()+
		"\nName = "+ employee.getName()+
		"\nSalary = "+employee.getSalary()+
		"\nDesignation = "+employee.getDesignation());
		
	}

}

package com.hexa.model;

public class Employee {

	private String Employee_LastName, Employee_FirstName, Employee_Address, Employee_Role;
	private String Employee_User_Name, Employee_Password, Employee_Joining, Employee_Email;
	private int Manager_Id, Employee_Id ;
	private long Employee_Phone ;
	
	
	public String getEmployee_LastName() {
		return Employee_LastName;
	}
	public void setEmployee_LastName(String employee_LastName) {
		Employee_LastName = employee_LastName;
	}
	
	
	public String getEmployee_FirstName() {
		return Employee_FirstName;
	}
	public void setEmployee_FirstName(String employee_FirstName) {
		Employee_FirstName = employee_FirstName;
	}
	
	
	public String getEmployee_Address() {
		return Employee_Address;
	}
	public void setEmployee_Address(String employee_Address) {
		Employee_Address = employee_Address;
	}
	
	
	public String getEmployee_Role() {
		return Employee_Role;
	}
	public void setEmployee_Role(String employee_Role) {
		Employee_Role = employee_Role;
	}
	
	
	public String getEmployee_User_Name() {
		return Employee_User_Name;
	}
	public void setEmployee_User_Name(String employee_User_Name) {
		Employee_User_Name = employee_User_Name;
	}
	
	
	public String getEmployee_Password() {
		return Employee_Password;
	}
	public void setEmployee_Password(String employee_Password) {
		Employee_Password = employee_Password;
	}
	
	
	public String getEmployee_Joining() {
		return Employee_Joining;
	}
	public void setEmployee_Joining(String employee_Joining) {
		Employee_Joining = employee_Joining;
	}
	
	
	public String getEmployee_Email() {
		return Employee_Email;
	}
	public void setEmployee_Email(String employee_Email) {
		Employee_Email = employee_Email;
	}
	
	
	public int getManager_Id() {
		return Manager_Id;
	}
	public void setManager_Id(int manager_Id) {
		Manager_Id = manager_Id;
	}
	
	
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	
	
	public long getEmployee_Phone() {
		return Employee_Phone;
	}
	public void setEmployee_Phone(long employee_Phone) {
		Employee_Phone = employee_Phone;
	}
	
	
	
	public Employee() {
		
	}
	public Employee(String employee_LastName, String employee_FirstName, String employee_Address, String employee_Role,
			String employee_User_Name, String employee_Password, String employee_Joining, String employee_Email,
			int manager_Id, int employee_Id, long employee_Phone) {
		super();
		Employee_LastName = employee_LastName;
		Employee_FirstName = employee_FirstName;
		Employee_Address = employee_Address;
		Employee_Role = employee_Role;
		Employee_User_Name = employee_User_Name;
		Employee_Password = employee_Password;
		Employee_Joining = employee_Joining;
		Employee_Email = employee_Email;
		Manager_Id = manager_Id;
		Employee_Id = employee_Id;
		Employee_Phone = employee_Phone;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [Employee_LastName=" + Employee_LastName + ", Employee_FirstName=" + Employee_FirstName
				+ ", Employee_Address=" + Employee_Address + ", Employee_Role=" + Employee_Role
				+ ", Employee_User_Name=" + Employee_User_Name + ", Employee_Password=" + Employee_Password
				+ ", Employee_Joining=" + Employee_Joining + ", Employee_Email=" + Employee_Email + ", Manager_Id="
				+ Manager_Id + ", Employee_Id=" + Employee_Id + ", Employee_Phone=" + Employee_Phone + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Employee_Address == null) ? 0 : Employee_Address.hashCode());
		result = prime * result + ((Employee_Email == null) ? 0 : Employee_Email.hashCode());
		result = prime * result + ((Employee_FirstName == null) ? 0 : Employee_FirstName.hashCode());
		result = prime * result + Employee_Id;
		result = prime * result + ((Employee_Joining == null) ? 0 : Employee_Joining.hashCode());
		result = prime * result + ((Employee_LastName == null) ? 0 : Employee_LastName.hashCode());
		result = prime * result + ((Employee_Password == null) ? 0 : Employee_Password.hashCode());
		result = prime * result + (int) (Employee_Phone ^ (Employee_Phone >>> 32));
		result = prime * result + ((Employee_Role == null) ? 0 : Employee_Role.hashCode());
		result = prime * result + ((Employee_User_Name == null) ? 0 : Employee_User_Name.hashCode());
		result = prime * result + Manager_Id;
		return result;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Employee_Address == null) {
			if (other.Employee_Address != null)
				return false;
		} else if (!Employee_Address.equals(other.Employee_Address))
			return false;
		if (Employee_Email == null) {
			if (other.Employee_Email != null)
				return false;
		} else if (!Employee_Email.equals(other.Employee_Email))
			return false;
		if (Employee_FirstName == null) {
			if (other.Employee_FirstName != null)
				return false;
		} else if (!Employee_FirstName.equals(other.Employee_FirstName))
			return false;
		if (Employee_Id != other.Employee_Id)
			return false;
		if (Employee_Joining == null) {
			if (other.Employee_Joining != null)
				return false;
		} else if (!Employee_Joining.equals(other.Employee_Joining))
			return false;
		if (Employee_LastName == null) {
			if (other.Employee_LastName != null)
				return false;
		} else if (!Employee_LastName.equals(other.Employee_LastName))
			return false;
		if (Employee_Password == null) {
			if (other.Employee_Password != null)
				return false;
		} else if (!Employee_Password.equals(other.Employee_Password))
			return false;
		if (Employee_Phone != other.Employee_Phone)
			return false;
		if (Employee_Role == null) {
			if (other.Employee_Role != null)
				return false;
		} else if (!Employee_Role.equals(other.Employee_Role))
			return false;
		if (Employee_User_Name == null) {
			if (other.Employee_User_Name != null)
				return false;
		} else if (!Employee_User_Name.equals(other.Employee_User_Name))
			return false;
		if (Manager_Id != other.Manager_Id)
			return false;
		return true;
	}
}

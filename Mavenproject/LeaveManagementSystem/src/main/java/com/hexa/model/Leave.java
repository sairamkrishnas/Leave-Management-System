package com.hexa.model;

public class Leave {

	private int Employee_Id, Leave_Id; 
	private String Leave_Type, Leave_Reason, From_Date, To_Date, Leave_Status;
	
	
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	
	
	public int getLeave_Id() {
		return Leave_Id;
	}
	public void setLeave_Id(int leave_Id) {
		Leave_Id = leave_Id;
	}
	
	
	public String getLeave_Type() {
		return Leave_Type;
	}
	public void setLeave_Type(String leave_Type) {
		Leave_Type = leave_Type;
	}
	
	
	public String getLeave_Reason() {
		return Leave_Reason;
	}
	public void setLeave_Reason(String leave_Reason) {
		Leave_Reason = leave_Reason;
	}
	
	
	public String getFrom_Date() {
		return From_Date;
	}
	public void setFrom_Date(String from_Date) {
		From_Date = from_Date;
	}
	
	
	public String getTo_Date() {
		return To_Date;
	}
	public void setTo_Date(String to_Date) {
		To_Date = to_Date;
	}
	
	
	public String getLeave_Status() {
		return Leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		Leave_Status = leave_Status;
	}
	
	
	
	public Leave() {
		
	}
	public Leave(int employee_Id, int leave_Id, String leave_Type, String leave_Reason, String from_Date,
			String to_Date, String leave_Status) {
		super();
		Employee_Id = employee_Id;
		Leave_Id = leave_Id;
		Leave_Type = leave_Type;
		Leave_Reason = leave_Reason;
		From_Date = from_Date;
		To_Date = to_Date;
		Leave_Status = leave_Status;
	}
	
	
	
	@Override
	public String toString() {
		return "Leave [Employee_Id=" + Employee_Id + ", Leave_Id=" + Leave_Id + ", Leave_Type=" + Leave_Type
				+ ", Leave_Reason=" + Leave_Reason + ", From_Date=" + From_Date + ", To_Date=" + To_Date
				+ ", Leave_Status=" + Leave_Status + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Employee_Id;
		result = prime * result + ((From_Date == null) ? 0 : From_Date.hashCode());
		result = prime * result + Leave_Id;
		result = prime * result + ((Leave_Reason == null) ? 0 : Leave_Reason.hashCode());
		result = prime * result + ((Leave_Status == null) ? 0 : Leave_Status.hashCode());
		result = prime * result + ((Leave_Type == null) ? 0 : Leave_Type.hashCode());
		result = prime * result + ((To_Date == null) ? 0 : To_Date.hashCode());
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
		Leave other = (Leave) obj;
		if (Employee_Id != other.Employee_Id)
			return false;
		if (From_Date == null) {
			if (other.From_Date != null)
				return false;
		} else if (!From_Date.equals(other.From_Date))
			return false;
		if (Leave_Id != other.Leave_Id)
			return false;
		if (Leave_Reason == null) {
			if (other.Leave_Reason != null)
				return false;
		} else if (!Leave_Reason.equals(other.Leave_Reason))
			return false;
		if (Leave_Status == null) {
			if (other.Leave_Status != null)
				return false;
		} else if (!Leave_Status.equals(other.Leave_Status))
			return false;
		if (Leave_Type == null) {
			if (other.Leave_Type != null)
				return false;
		} else if (!Leave_Type.equals(other.Leave_Type))
			return false;
		if (To_Date == null) {
			if (other.To_Date != null)
				return false;
		} else if (!To_Date.equals(other.To_Date))
			return false;
		return true;
	}
}

package com.hexa.model;

public class Leave {

	private int employee_Id, leave_Id; 
	private String leave_Type, leave_Reason, from_Date, to_Date, leave_Status;
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public int getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(int leave_Id) {
		this.leave_Id = leave_Id;
	}
	public String getLeave_Type() {
		return leave_Type;
	}
	public void setLeave_Type(String leave_Type) {
		this.leave_Type = leave_Type;
	}
	public String getLeave_Reason() {
		return leave_Reason;
	}
	public void setLeave_Reason(String leave_Reason) {
		this.leave_Reason = leave_Reason;
	}
	public String getFrom_Date() {
		return from_Date;
	}
	public void setFrom_Date(String from_Date) {
		this.from_Date = from_Date;
	}
	public String getTo_Date() {
		return to_Date;
	}
	public void setTo_Date(String to_Date) {
		this.to_Date = to_Date;
	}
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employee_Id;
		result = prime * result + ((from_Date == null) ? 0 : from_Date.hashCode());
		result = prime * result + leave_Id;
		result = prime * result + ((leave_Reason == null) ? 0 : leave_Reason.hashCode());
		result = prime * result + ((leave_Status == null) ? 0 : leave_Status.hashCode());
		result = prime * result + ((leave_Type == null) ? 0 : leave_Type.hashCode());
		result = prime * result + ((to_Date == null) ? 0 : to_Date.hashCode());
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
		if (employee_Id != other.employee_Id)
			return false;
		if (from_Date == null) {
			if (other.from_Date != null)
				return false;
		} else if (!from_Date.equals(other.from_Date))
			return false;
		if (leave_Id != other.leave_Id)
			return false;
		if (leave_Reason == null) {
			if (other.leave_Reason != null)
				return false;
		} else if (!leave_Reason.equals(other.leave_Reason))
			return false;
		if (leave_Status == null) {
			if (other.leave_Status != null)
				return false;
		} else if (!leave_Status.equals(other.leave_Status))
			return false;
		if (leave_Type == null) {
			if (other.leave_Type != null)
				return false;
		} else if (!leave_Type.equals(other.leave_Type))
			return false;
		if (to_Date == null) {
			if (other.to_Date != null)
				return false;
		} else if (!to_Date.equals(other.to_Date))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Leave [employee_Id=" + employee_Id + ", leave_Id=" + leave_Id + ", leave_Type=" + leave_Type
				+ ", leave_Reason=" + leave_Reason + ", from_Date=" + from_Date + ", to_Date=" + to_Date
				+ ", leave_Status=" + leave_Status + "]";
	}
	public Leave(int employee_Id, int leave_Id, String leave_Type, String leave_Reason, String from_Date,
			String to_Date, String leave_Status) {
		super();
		this.employee_Id = employee_Id;
		this.leave_Id = leave_Id;
		this.leave_Type = leave_Type;
		this.leave_Reason = leave_Reason;
		this.from_Date = from_Date;
		this.to_Date = to_Date;
		this.leave_Status = leave_Status;
	}
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Leave(Leave l) {
		setEmployee_Id(l.employee_Id);
		setLeave_Type(l.leave_Type);
		setLeave_Reason(l.leave_Reason);
		setFrom_Date(l.from_Date);
		setTo_Date(l.to_Date);
		setLeave_Id(l.leave_Id);
		setLeave_Status(l.leave_Status);
	}
}
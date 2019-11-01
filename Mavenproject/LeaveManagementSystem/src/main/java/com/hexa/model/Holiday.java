package com.hexa.model;

public class Holiday {

	private int holiday_Id;
	private String holiday_Name, holiday_Type, holiday_Date, holiday_Day;
	public int getHoliday_Id() {
		return holiday_Id;
	}
	public void setHoliday_Id(int holiday_Id) {
		this.holiday_Id = holiday_Id;
	}
	public String getHoliday_Name() {
		return holiday_Name;
	}
	public void setHoliday_Name(String holiday_Name) {
		this.holiday_Name = holiday_Name;
	}
	public String getHoliday_Type() {
		return holiday_Type;
	}
	public void setHoliday_Type(String holiday_Type) {
		this.holiday_Type = holiday_Type;
	}
	public String getHoliday_Date() {
		return holiday_Date;
	}
	public void setHoliday_Date(String holiday_Date) {
		this.holiday_Date = holiday_Date;
	}
	public String getHoliday_Day() {
		return holiday_Day;
	}
	public void setHoliday_Day(String holiday_Day) {
		this.holiday_Day = holiday_Day;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((holiday_Date == null) ? 0 : holiday_Date.hashCode());
		result = prime * result + ((holiday_Day == null) ? 0 : holiday_Day.hashCode());
		result = prime * result + holiday_Id;
		result = prime * result + ((holiday_Name == null) ? 0 : holiday_Name.hashCode());
		result = prime * result + ((holiday_Type == null) ? 0 : holiday_Type.hashCode());
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
		Holiday other = (Holiday) obj;
		if (holiday_Date == null) {
			if (other.holiday_Date != null)
				return false;
		} else if (!holiday_Date.equals(other.holiday_Date))
			return false;
		if (holiday_Day == null) {
			if (other.holiday_Day != null)
				return false;
		} else if (!holiday_Day.equals(other.holiday_Day))
			return false;
		if (holiday_Id != other.holiday_Id)
			return false;
		if (holiday_Name == null) {
			if (other.holiday_Name != null)
				return false;
		} else if (!holiday_Name.equals(other.holiday_Name))
			return false;
		if (holiday_Type == null) {
			if (other.holiday_Type != null)
				return false;
		} else if (!holiday_Type.equals(other.holiday_Type))
			return false;
		return true;
	}
	public Holiday(int holiday_Id, String holiday_Name, String holiday_Type, String holiday_Date, String holiday_Day) {
		super();
		this.holiday_Id = holiday_Id;
		this.holiday_Name = holiday_Name;
		this.holiday_Type = holiday_Type;
		this.holiday_Date = holiday_Date;
		this.holiday_Day = holiday_Day;
	}
	public Holiday() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Holiday(Holiday h) {
		setHoliday_Name(h.holiday_Name);
		setHoliday_Type(h.holiday_Type);
		setHoliday_Date(h.holiday_Date);
		setHoliday_Day(h.holiday_Day);
		
	}
	@Override
	public String toString() {
		return "Holiday [holiday_Id=" + holiday_Id + ", holiday_Name=" + holiday_Name + ", holiday_Type=" + holiday_Type
				+ ", holiday_Date=" + holiday_Date + ", holiday_Day=" + holiday_Day + "]";
	}
	
}
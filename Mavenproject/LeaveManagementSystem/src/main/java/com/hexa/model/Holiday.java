package com.hexa.model;

public class Holiday {

	private int Holiday_Id;
	private String Holiday_Name, Holiday_Type, Holiday_Date, Holiday_Day;
	
	public int getHoliday_Id() {
		return Holiday_Id;
	}
	public void setHoliday_Id(int holiday_Id) {
		Holiday_Id = holiday_Id;
	}
	
	
	public String getHoliday_Name() {
		return Holiday_Name;
	}
	public void setHoliday_Name(String holiday_Name) {
		Holiday_Name = holiday_Name;
	}
	
	
	public String getHoliday_Type() {
		return Holiday_Type;
	}
	public void setHoliday_Type(String holiday_Type) {
		Holiday_Type = holiday_Type;
	}
	
	
	public String getHoliday_Date() {
		return Holiday_Date;
	}
	public void setHoliday_Date(String holiday_Date) {
		Holiday_Date = holiday_Date;
	}
	
	
	public String getHoliday_Day() {
		return Holiday_Day;
	}
	public void setHoliday_Day(String holiday_Day) {
		Holiday_Day = holiday_Day;
	}
	
	
	public Holiday() {
		
	}
	public Holiday(String holiday_Name, String holiday_Type, String holiday_Date, String holiday_Day) {
		super();
		Holiday_Name = holiday_Name;
		Holiday_Type = holiday_Type;
		Holiday_Date = holiday_Date;
		Holiday_Day = holiday_Day;
	}
	
	
	@Override
	public String toString() {
		return "Holiday [Holiday_Id=" + Holiday_Id + ", Holiday_Name=" + Holiday_Name + ", Holiday_Type=" + Holiday_Type
				+ ", Holiday_Date=" + Holiday_Date + ", Holiday_Day=" + Holiday_Day + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Holiday_Date == null) ? 0 : Holiday_Date.hashCode());
		result = prime * result + ((Holiday_Day == null) ? 0 : Holiday_Day.hashCode());
		result = prime * result + Holiday_Id;
		result = prime * result + ((Holiday_Name == null) ? 0 : Holiday_Name.hashCode());
		result = prime * result + ((Holiday_Type == null) ? 0 : Holiday_Type.hashCode());
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
		if (Holiday_Date == null) {
			if (other.Holiday_Date != null)
				return false;
		} else if (!Holiday_Date.equals(other.Holiday_Date))
			return false;
		if (Holiday_Day == null) {
			if (other.Holiday_Day != null)
				return false;
		} else if (!Holiday_Day.equals(other.Holiday_Day))
			return false;
		if (Holiday_Id != other.Holiday_Id)
			return false;
		if (Holiday_Name == null) {
			if (other.Holiday_Name != null)
				return false;
		} else if (!Holiday_Name.equals(other.Holiday_Name))
			return false;
		if (Holiday_Type == null) {
			if (other.Holiday_Type != null)
				return false;
		} else if (!Holiday_Type.equals(other.Holiday_Type))
			return false;
		return true;
	}
}

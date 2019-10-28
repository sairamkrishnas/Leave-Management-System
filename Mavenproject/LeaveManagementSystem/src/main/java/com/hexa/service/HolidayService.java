package com.hexa.service;

import java.util.ArrayList;

import com.hexa.connection.DbConnection;
import com.hexa.model.Holiday;

public class HolidayService {
	ArrayList<Holiday> result = new ArrayList<Holiday>();
	public ArrayList<Holiday> ViewHoliday() {
		DbConnection db = new DbConnection();
		result = db.ViewHolidays();
		return result;
	}
}

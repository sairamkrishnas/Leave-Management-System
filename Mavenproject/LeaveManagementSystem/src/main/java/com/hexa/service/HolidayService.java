package com.hexa.service;

import com.hexa.connection.DbConnection;

public class HolidayService {

	public void ViewHoliday() {
		DbConnection db = new DbConnection();
		db.ViewHolidays();
	}
}

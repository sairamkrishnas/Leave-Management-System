insert into employee_details 
	(Employee_LastName,Employee_FirstName,Manager_Id,Employee_Phone,Employee_Address,Employee_Email,Employee_Role,Employee_User_Name,Employee_Password,Employee_Joining_Date,No_of_Leaves_Applied,Image)
values
	('Suram','Sunishma Reddy','5',2034035674,'Atlanta,GA','sunishma@gmail.com','Employee','sunishma@gmail.com','sunishma1234','2019-09-15','','assets/suni.jpeg'),
    ('Shakamuri','Sai Ram Krishna','5',203406789,'Atlanta,GA','sairam@gmail.com','Admin','sai@gmail.com','sairam1234','2019-09-15','','assets/SaiRam.jpeg'),
	('Somisetty','Priyanka','6',2034332332,'Atlanta,GA','priyanka@gmail.com','Employee','priyanka@gmail.com','priyanka1234','2019-09-15','','assets/priya.jpg'),
    ('MA','Vicky','5',2034561239,'Atlanta,GA','vicky@gmail.com','Employee','vicky@gmail.com','vicky1234','2019-09-15','','assets/vicky.jpeg'),
    ('Shivangula','Manogna','6',2034224444,'Atlanta,GA','manogna@gmail.com','Employee','manogna@gmail.com','manogna1234','2019-09-15','','assets/manu.jpg'),
    ('Aravindhan','Uma Maheswari','',2034334343,'Atlanta,GA','uma@gmail.com','Manager','uma@gmail.com','uma1234','2010-09-15','','assets/uma.png'),
    ('Selvakumar','Daniel','',2033324352,'Atlanta,GA','daniel@gmail.com','Manager','daniel@gmail.com','dani1234','2010-09-15','','assets/dani.jpg');

insert into holiday 
	(Holiday_Name,Holiday_Type,Holiday_Date,Holiday_Day)
values
	("New Year's Day",'Federal','2019-01-01','Tuesday'),
    ("Birthday of Martin Luther King Jr.",'Federal','2019-01-21','Monday'),
    ("Washington's Birthday",'Federal','2019-02-18','Monday'),
    ("Memorial Day",'Federal','2019-05-27','Monday'),
    ("Independence Day",'Federal','2019-07-4','Thursday'),
    ("Labor Day",'Federal','2019-09-02','Monday'),
    ("Columbus Day",'Federal','2019-10-14','Monday'),
    ("Veterans Day",'Federal','2019-11-11','Monday'),
    ("Thanksgiving Day",'Federal','2019-11-28','Thursday'),
    ("Christmas Day",'Federal','2019-12-25','Wednesday'),
    ("New Year's Day",'Federal','2020-01-01','Wednesday'),
    ("Birthday of Martin Luther King Jr.",'Federal','2020-01-20','Monday'),
    ("Washington's Birthday",'Federal','2020-02-17','Monday'),
    ("Memorial Day",'Federal','2020-05-25','Monday'),
    ("Independence Day",'Federal','2020-07-03','Friday'),
    ("Labor Day",'Federal','2020-09-07','Monday'),
    ("Columbus Day",'Federal','2020-10-12','Monday'),
    ("Veterans Day",'Federal','2020-11-11','Wednesday'),
    ("Thanksgiving Day",'Federal','2020-11-26','Thursday'),
    ("Christmas Day",'Federal','2020-12-25','Friday');
    
insert into employee_leave
	(Employee_Id,Leave_Type,Leave_Reason,From_Date,To_Date)
values
	(1,'Sick','Hign Fever','2019-10-13','2019-10-15')
    
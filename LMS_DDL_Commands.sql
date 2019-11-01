create table Employee_Details (
	Employee_Id bigint(10) not null auto_increment,
	Employee_LastName varchar(10) not null,
	Employee_FirstName varchar(20) not null,
    Manager_Id varchar(10),
    Employee_Phone bigint(10),
    Employee_Address Varchar(20),
    Employee_Email Varchar(40),
    Employee_Role Varchar(10),
    Employee_User_Name Varchar(20) not null,
    Employee_Password Varchar(20) not null,
    Employee_Joining_Date Date not null,
    No_of_Leaves_Applied int(25),
    Image varchar(255),
    constraint Emp_Primary primary key(Employee_Id)
);
create table Employee_Leave
(
	Employee_Id bigint(10),
	Leave_Id int not null auto_increment,
    Leave_Type varchar(20),
    Leave_Reason Varchar(40),
    From_Date date,
    To_Date date,
    Leave_Status varchar(10) default 'Pending',
    constraint Leave_Primary primary key(Leave_Id),
	constraint Emp_Foreign Foreign key(Employee_Id) references Employee_Details(Employee_Id)
);

create table Holiday
(
	Holiday_Id bigint(10) not null auto_increment,
    Holiday_Name varchar(100) not null,
    Holiday_Type varchar(50) not null,
    Holiday_Date date not null,
    Holiday_Day varchar(10) not null,
    constraint Holiday_Primary primary key(Holiday_Id)
);

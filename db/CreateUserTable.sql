CREATE TABLE User
(
	userID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	userName		varchar(100)	not null,
	userEmail		varchar(100)	not null,
	userRole		varchar(20)		not null,
	userToken		varchar(100)	not null,
	userStatus		integer			not null,
	userLastUpdate	text 			not null
);


BEGIN TRANSACTION;
insert into User 
( userName, userEmail, userRole, userToken, userStatus, userLastUpdate ) 
values  
('Des', 'desjohn@yahoo.com', 'admin', '', '1', datetime('now')),
('Paul', 'Paulie@hotmail.com', 'admin', '', '1', datetime('now')),
('Claire', 'Claire@gmail.com', 'admin', '', '1', datetime('now'));
COMMIT;
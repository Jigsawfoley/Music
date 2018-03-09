CREATE TABLE Playlists (
	playlistID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	playlistName		varchar(100)	not null,
	playlistOwnerID		integer			not null,
	playlistAdded		text 			not null
);


BEGIN TRANSACTION;
insert into Playlists ( 
	playlistName,
	playlistOwnerID, 
	playlistAdded
) 
values  (
	'80s',
	1,  
	datetime('now')
),
(
	'90s',
	2,  
	datetime('now')
),
(
	'Noughties',
	3,  
	datetime('now')
);
COMMIT;
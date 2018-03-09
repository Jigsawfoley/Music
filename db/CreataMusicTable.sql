CREATE TABLE Music (
	musicID				integer		    not null	PRIMARY KEY AUTOINCREMENT,
	musicArtist			varchar(100)	not null,
	musicName			varchar(100)	not null,
	musicAlbum			varchar(40)		not null,
	musicLink			varchar(100)	not null,
	addedByUserID		integer			not null,
	dateAdded			text 			not null
);


BEGIN TRANSACTION;
insert into Music ( 
	musicArtist, 
	musicName, 
	musicAlbum,
	musicLink, 
	addedByUserID, 
	dateAdded 
) 
values  (
	'Bruno Mars', 
	'Uptown Funk',
	'Uptown Funk',
	'https://www.youtube.com/watch?v=OPf0YbXqDm0', 
	1, 
	datetime('now')
),
(
	'Ed Sheeran', 
	'Thinking out loud',
	'X',
	'https://www.youtube.com/watch?v=lp-EO5I60KA', 
	1, 
	datetime('now')
),
(
	'Harry Styles', 
	'Sign of the times', 
	'Harry Styles', 
	'https://www.youtube.com/watch?v=z0GKGpObgPY', 
	2, 
	datetime('now')
),
(
	'Kendrick Lamar', 
	'DNA', 
	'Damn', 
	'https://www.youtube.com/watch?v=NLZRYQMLDW4', 
	2, 
	datetime('now')
);
COMMIT;
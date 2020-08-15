CREATE TABLE ASSETSTATUS(
	ID INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	OWNER VARCHAR(20) NOT NULL,
	DATASTARTTIME TIMESTAMP NOT NULL,
	DATATHEME VARCHAR(20) NOT NULL,
	DATASIZE VARCHAR(20) NOT NULL,
	BLOCKVERSION VARCHAR(20) NOT NULL,
	DATAINBLOACKID VARCHAR(20) NOT NULL,
	ISONLINE BOOLEAN  NOT NULL
) DEFAULT CHARSET=UTF8;

CREATE TABLE ASSETTRADING (
	ID INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	OWNER VARCHAR(20) NOT NULL,
	USERS VARCHAR(20) NOT NULL,
	TRADETIME VARCHAR(20) NOT NULL,
	DATATHEME VARCHAR(20) NOT NULL,
	DATAVALUE VARCHAR(20) NOT NULL,
	DATASIZE VARCHAR(20) NOT NULL,
	ISONLINE BOOLEAN NOT NULL
	

) DEFAULT CHARSET=UTF8;


CREATE TABLE ASSETPRICING(
	ID INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	DATACHEACKER VARCHAR(20) NOT NULL,
	DATAPRICEDECIDETIME TIMESTAMP NOT NULL,
	DATASIZE VARCHAR(20) NOT NULL,
	DATAVALUE VARCHAR(20) NOT NULL,
	ISONLINE BOOLEAN NOT NULL
)  DEFAULT CHARSET=UTF8;


CREATE TABLE USERS(
	 ID INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	 USERNAME VARCHAR(20) NOT NULL PRIMARY KEY ,
	 PASSWORD VARCHAR(20) NOT NULL
) DEFAULT CHARSET=UTF8;



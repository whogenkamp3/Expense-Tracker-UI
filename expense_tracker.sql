CREATE TABLE Login (
     login_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
     user_name VARCHAR(50) NOT NULL,
     password VARCHAR(50) NOT NULL
)ENGINE = INNODB;


CREATE TABLE Expense (
     expense_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
     category VARCHAR(50) NOT NULL,
     amount double NOT NULL,
     purchase_date DATE,
     descriptions VARCHAR(50),
     fk_login_id int NOT NULL,
     INDEX par_ind (fk_login_id),
     FOREIGN KEY (fk_login_id) REFERENCES Login(login_id)
     ON DELETE CASCADE
)ENGINE = INNODB;

CREATE TABLE personal_info(
     personal_key int PRIMARY KEY NOT NULL AUTO_INCREMENT,
     first_name VARCHAR(50) NOT NULL,
     last_name VARCHAR(50) NOT NULL,
     email VARCHAR(50) NOT NULL,
     credit_card BIGINT NOT NULL,
     fk_login_id int NOT NULL,
     INDEX par_ind (fk_login_id),
     FOREIGN KEY (fk_login_id) REFERENCES Login(login_id)
     ON DELETE CASCADE
)ENGINE = INNODB;

SELECT *
FROM Login;

SELECT *
FROM Expense;

SELECT *
FROM personal_info;

INSERT INTO personal_info VALUES
     (1,"Bill", "Walter", "bill@gmail.com", 4444555588883333,1);

INSERT INTO Expense VALUES
     (1,"furniture",54.32,"2019-04-27", "bought a new chair", 1);

INSERT INTO Login VALUES
	(1,'whogenkamp','hogenkamp'),
    (2,'lh', 'username'),
    (3,'lukas','lukas'),
    (4,'matt','matt'),
    (5,'meg','meg'),
    (6,'hello','hello'),
    (7,'hi','hi'),
    (8,'bye','bye');


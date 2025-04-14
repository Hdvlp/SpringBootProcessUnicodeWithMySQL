
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '+3wIK_iwaX&&1&LSpFP^p0N992TvNT@@Dty4*225';
FLUSH PRIVILEGES;

CREATE DATABASE processunicodedb CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;



USE processunicodedb;

SELECT * FROM userstable LIMIT 200;

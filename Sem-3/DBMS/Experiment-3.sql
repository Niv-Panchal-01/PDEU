use Office_1;

select NAME from CLIENT_MASTER;
select * from CLIENT_MASTER;
select NAME, CITY, STATE FROM client_master;

SELECT * FROM product_master;

select * from client_master where city = "Mumbai";

select SALESMANNAME from salesman_master where salary = 3000;

UPDATE client_master SET CITY = "Bangalore" where CLIENTNO = "C00005";
UPDATE client_master SET BALDUE = 1000 where CLIENTNO = "C00001";
update product_master SET COSTPRICE = 950.00 WHERE DESCRIPTION = "Trousers";
update salesman_master set CITY = "Pune";
select * from salesman_master;

delete FROM salesman_master where SALARY = 3500;
DELETE FROM product_master WHERE QTYONHAND = 100;
DELETE FROM client_master WHERE STATE = "Tamil Nadu";

alter table client_master add Telephone INT;
alter table product_master modify column SELLPRICE DECIMAL(10,2);

DROP TABLE CLIENT_MASTER;

ALTER TABLE salesman_master RENAME sman_mast;
DESC sman_mast;
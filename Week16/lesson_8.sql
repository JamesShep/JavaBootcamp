-- RDBMS -> Relational DataBase Management System
--       ->  MySQL, PostgreSQL, MS SQL Server, Oracle

-- Relationships exist between tables (3 types):
--   One-to-Many  (relationship)
--   Many-to-Many (relationship)
--   One-to-One   (relationship)

-- User        Transaction
--  1     <->      1, 2
--  2     <->   3, 4, 5, 6
--  3     <->      7, 8

select * from users;
select * from transactions;
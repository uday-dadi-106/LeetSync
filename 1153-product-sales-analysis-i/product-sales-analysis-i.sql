# Write your MySQL query statement below
select p.product_name, s.year,s.price
from Sales s inner join Product p
on s.product_id=p.Product_id;
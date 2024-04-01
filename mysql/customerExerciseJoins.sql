SELECT * FROM classicmodels.customers ORDER BY customerNumber;
SELECT * FROM classicmodels.orders ORDER BY customerNumber;
SELECT * FROM classicmodels.orderdetails ORDER BY orderNumber;

SELECT * FROM customers where customerNumber=363;

SELECT orders.customerNumber,customers.customerName, orders.orderDate, orders.requiredDate, orders.shippedDate, orders.comments, orderdetails.productCode,orderdetails.quantityOrdered, orderdetails.priceEach
FROM orders 
LEFT JOIN customers
ON orders.customerNumber=customers.customerNumber
LEFT JOIN orderdetails
ON orders.orderNumber=orderdetails.orderNumber
ORDER BY orders.customerNumber;




 

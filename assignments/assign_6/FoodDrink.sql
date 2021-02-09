drop table FoodDrink;

Create table FoodDrink(
foodtype varchar(10),
foodname varchar(20),
ordertype varchar(25),
quantity int(5),
price double(10,1)
);

Insert into FoodDrink values('Food', 'Pizza', 'Take Away', 2, 8300.0);

Insert into FoodDrink values('Food', 'Pizza', 'Dine in Service', 2, 8100.0);

Insert into FoodDrink values('Food', 'California Sandwich', 'Take Away', 2, 2800.0);

Insert into FoodDrink values('Food', 'California Sandwich', 'Dine in Service', 2, 2600.0);

Insert into FoodDrink values('Drink', 'Milk', 'Take Away', 1, 1000.0);

Insert into FoodDrink values('Drink', 'Milk', 'Dine in Service', 1, 900.0);

Insert into FoodDrink values('Drink', 'Coffee', 'Take Away', 1, 1800.0);

Insert into FoodDrink values('Drink', 'Coffee', 'Dine in Service', 1, 1500.0);

Insert into FoodDrink values('Food', 'Hamburger', 'Take Away', 1, 2500.0);

Insert into FoodDrink values('Food', 'Hamburger', 'Dine in Service', 1, 2400.0);

Select * from FoodDrink;

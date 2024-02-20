# PaymentMode - Object Oriented Programming
<br>

## Description
📝 **A simple java program that demonstrates the concept of **inheritance** with the use of interface `Payment Mode` to create classes that are of specific modes of Payment: `GCash`, `Maya`, `ShopeePay`.** <br>

 *Note*: This project is a seatwork for my OOP subject. I was instructed to make a simple program out of a given uml class diagram. I added two contructors: one for when user specifies a Payment Method, two for when user doesn't specify a Payment Method. See instructions at the bottom.

---

## This Contains
📁 ./src/ <br>
- `PaymentApp.java` : Contains the main method of the project. Instantiates an example of an `Order` object.
- `Order.java` : Has two constructors (one including PaymentMethod, two not including PaymentMethod)
- `PaymentMode.java` : An interface for specific payment methods.
- `GCash.java` : implements `PaymentMode`
- `Maya.java` : implements `PaymentMode`
- `ShopeePay.java` : implements `PaymentMode`

---

## Screenshots
### 💾 Main Method 
<p align='center'> ![main](./imgs/main.png) </p>
<br>

### 💾 Output 1 (Payment Method is specified) 
<p align='center'> ![output1](./imgs/output1.png) </p>
<br>

### 💾 Output 2 (Payment Method is not specified) 
<p align='center'> ![output2](./imgs/output2.png) </p>
<br>

---

## SW Instructions
> ✏️ Develop a payment application that allows users to place orders for items, define the quantity, unit price, and choose a payment method (GCash, Maya, ShopeePay). The application should calculate the total amount based on the order details and any applicable discounts offered by the chosen payment method, storing the result in the totalAmount attribute of the Order class.
>
> **Specific requirements:** 
> PaymentApp class: This class serves as the entry point for the application. It demonstrates how to create an Order object, set its properties (item, quantity, unit price, and payment method), and calculate the total amount based on the chosen payment method.
> The application should have an Order class that stores information about the ordered item, quantity, unit price, chosen payment method, and the calculated total amount (totalAmount).
> The application should implement a PaymentMode interface that defines a method for calculating the discount offered by the payment method.
> The application should have concrete implementations of PaymentMode for GCash, Maya, ShopeePay:
> GCash: Does not offer any discount (discount rate = 0.0)
> Maya: Offers a 5% discount (discount rate = 0.05)
> ShopeePay: Offers a 10% discount
> The application should allow users to set the payment method for an order and calculate the total amount, storing it in the totalAmount attribute.








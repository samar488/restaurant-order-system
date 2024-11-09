# Restaurant Order System

## Project Overview
The **Restaurant Order System** is designed to manage and streamline the process of placing and managing orders in a restaurant. It includes features such as order creation, user management, payment processing, and delivery tracking.

## Features
- **User Management**: Register and manage user profiles.
- **Order Management**: Create, update, and track orders.
- **Menu Management**: Admins can add, remove, and update menu items.
- **Cart Management**: Users can add or remove items from their cart.
- **Payment Processing**: Supports transactions with discount options.
- **Delivery Tracking**: Monitor order delivery status.
- **Review System**: Users can leave reviews and ratings for items.

## Class Descriptions
### 1. Order Class
- **Data Members**: *orderID, user, orderItems, totalPrice, deliveryAddress, orderStatus*
- **Methods**: `createOrder()`, `cancelOrder()`, `updateOrderStatus()`
- **Relationship**: Aggregation with User, Composition with Item and Address, Association with OrderStatus.

### 2. User Class
- **Data Members**: *userid, name, username, password, address, isEliteCustomer, orderHistory*
- **Methods**: `subscribeToElite()`, `updateHistory()`, `updateProfile()`
- **Relationship**: Composition with Address, Aggregation with Order.

### 3. Item Class
- **Data Members**: *itemid, name, category, price, description*
- **Methods**: `updatePrice()`
- **Relationship**: Aggregation with Category.

### 4. Admin Class
- **Data Members**: *adminID, name, email*
- **Methods**: `addMenuItem()`, `removeMenuItem()`, `updateMenuItem()`, `viewReports()`

### 5. Other Classes
- Review, Menu, PaymentTransaction, Invoice, Discount, Subscription, Address, Category, Delivery, Cart.

## Contributors

- [Mahmoud Raslan](https://github.com/Ma7mod-Raslan) - Team Lead
- **Mahmoud Ashraf** - Team Member
- **Mohammed Yasser** - Team Member
- **Heba Gamal** - Team Member
- **Samar Elshahat** - Team Member


# Customer Relationship Manager - REST API
This is the REST API for the Customer Relationship Manager.

## Description
This Project perform the CRUD operations for a list of Customers which are stored in a MySQL Database.

## Features
 The available features can be achieved through the use of the following endpoints:

| HTTP Method | Endpoint | CRUD Action
| :---: | --- | --- |
| POST | /api/customers | Create a new customer |
| GET | /api/customers | Read a list of customers |
| GET | /api/customers/{customerId} | Read a single customer |
| PUT | /api/customers | Update an existing customer |
| DELETE | /api/customers/{customerId} | Delete an existing customer |

## Technologies
* [C3PO] - JDBC3 connection and statement pooling
* [Hibernate] - object-relational mapping tool for Java
* [Jackson] - high-performance JSON processor for Java
* [MySQL] - relational database management system
* [Spring Web MVC] - web framework from Spring built on the Servlet API

## Tools used
* [Eclipse] - most widely used Java IDE
* [GitHub] - web-based hosting service for version control using Git
* [MySQL Workbench] - visual design tool for the MySQL database system
* [Postman] - API development environment (ADE)
* [Sublime Text] - awesome text editor for code, markup and prose

## Todos
* Write automated tests

[//]: # (These are reference links used in the body of this note. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

[C3PO]: <https://www.mchange.com/projects/c3p0/>
[Eclipse]: <https://www.eclipse.org/>
[GitHub]: <https://github.com/>
[Hibernate]: <https://hibernate.org/>
[Jackson]: <https://github.com/FasterXML/jackson>
[MySQL]: <https://www.mysql.com/>
[MySQL Workbench]: <https://www.mysql.com/products/workbench/>
[Postman]: <https://www.getpostman.com/>
[Spring Web MVC]: <https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html>
[Sublime Text]: <https://www.sublimetext.com/>

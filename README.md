# RestfulApiWebApp
Full Stack Development – Creating a REST based application
 -Priti Sherekar, Viswanathan Appakkudal Ramani

This project involves developing three main parts of modern Web Development –Model, View, and Control. We made a full stack application comprising of:
•	Rest APIs created using spring boot. 4 API’s that serve getting allUsersData, specificUserData, specificUserAllOrdersData, specificUserSpecificOrderData
•	JavaScript with CSS and JQuery to develop SPA and View-Control integration
•	Remote JSON database 
•	Docker to dock project as an image
The theme of the project is Users. Displaying user details such as username, phone number, email address and shopping orders.
Starting off with the Back-end development, we developed 4 REST API’s with Spring Boot. Functions of API’s are:
•	allUsersData – Get all the users from database 
•	specificUserData -  Get only the particular user of liking
•	specificUserAllOrdersData – Get all the shopping orders of  a particular user
•	specificUserSpecificOrderData- Get only an order of a particular user.

The data retrieved from the APIS, are then processed, filtered and displayed on webpage. Using, Vanilla JavaScript, JQuery, CSS to display a simple webpage with buttons, fields and tables. It’s a Single Page Application, wherein, clicking on buttons data is displayed within a table. Inputs are displayed to choose particular user and particular order.
We created a local JSON database, storing static text. All the GET Requests are performed based on the data from this JSON file. 
Once completing the project, we created a JAR file and encompassed it within a Docker container. Thus, ready to be shipped anywhere and anytime.

Notes: 
1)	All services return JSON text
2)	AllUsersData: Clicking on button within the All User section, User Table and Order table are populated with data fetched from corresponding endpoint.
3)	specificUserData: Provide any value between 1 and 5 in the input field and click Submit button, User Table and Order table will be updated with Particular User Data
4)	specificUserAllOrdersData: Provide any value between 1 and 5 in the input field and click Submit button, Order table will be updated with Particular User Data
5)	specificUserSpecificOrderData: Provide {order1/ order2/ order3/ order4} in order input field and any value between 1 and 5 in the User input field, click Submit button, Order table will be displayed with particular user, particular order data.

Installation Instructions:
1)	Download the project from GitHub
2)	Make the command prompt working directory to be downloaded folder
3)	Perform: Docker build -f Dockerfile -t rest-service . Let the setup complete
4)	Perform: docker run -p 8080:8080 rest-service (Port number as specified in application.properties file is 8080).
5)	Navigate to http://localhost:8080


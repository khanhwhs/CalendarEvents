# CalendarEvents

Follow these steps to get the app up and running on local:

1. clone this git down and open as a Maven project
2. Create a local mySql Database named " eventDB" and run the dbScripts.sql file from the root of the project;
3. Make sure the propeties connecting to the local DB are match with /Users/khanhnguyen/calendarevent/src/main/resources/application.properties
      spring.datasource.url=jdbc:mysql://localhost/eventDB?useSSL=false
      spring.datasource.username=root
      spring.datasource.password=password
      spring.datasource.platform=mysql
3. Run the Application and go to this url on any browser to test all the Web Services: http://localhost:8080/swagger-ui.html


#Reminders

- Enter date in this format "dd-MM-yyyy"



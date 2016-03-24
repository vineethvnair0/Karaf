
To set up the project follow the below steps

1) Build the project using maven.

2) execute the below commands to deploy the app in karaf

  1) feature:repo-add mvn:com.karaf.firstservlet/my-feature/1.0.0-SNAPSHOT/xml
  
  2) feature:install my-test-servlet

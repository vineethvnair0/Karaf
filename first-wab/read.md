
To set up the project follow the below steps

1) Build the project using maven.

2) execute the below commands to deploy the app in karaf

  1) feature:repo-add mvn:com.karaf.firstwab/web-feature/1.0-SNAPSHOT/xml

  2) feature:install my-first-wab

3) Hit the URL : http://localhost:8181/first-wab/

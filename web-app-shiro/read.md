
To set up the project follow the below steps

1) Build the project using maven.

2) execute the below commands to deploy the app in karaf

  1) feature:repo-add mvn:com.karaf.shiro/web-app-feature/1.0-SNAPSHOT/xml

  2) feature:install web-app-shiro

3) Hit the URL : http://localhost:8181/shiro-example/ (username and password by default karaf/karaf)

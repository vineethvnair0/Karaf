
To set up the project follow the below steps

1) Build the project using maven.

2) execute the below commands to deploy the app in karaf

  1) feature:repo-add mvn:com.karaf.form.auth/auth-feature/1.0-SNAPSHOT/xml

  2) feature:install form-auth-app

3) Hit the URL : http://localhost:8181/karaf-auth/ (username and password by default karaf/karaf)

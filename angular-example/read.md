1) Build the project using maven

2) Install cxf in karaf
  1) feature:repo-add cxf 3.1.6
  2)feature:install cxf
  
3)feature:repo-add mvn:com.karaf.angular/angular-webapp-feature/1.0-SNAPSHOT/xml

4)feature:install angular-app

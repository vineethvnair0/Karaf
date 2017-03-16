1) Build the package using maven

2) Install cxf and http

      1) feature:repo-add cxf 3.1.5
      2) feature:install http cxf

3) Install the pacakge

    1) feature:repo-add mvn:com.karaf.shiro.auth/shiro-feature/1.0-SNAPSHOT/xml
    2) feature:install shiro-rest-service


4) http://localhost:8181/cxf/shiro/hello/yourname

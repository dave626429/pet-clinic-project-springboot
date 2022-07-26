# pet-clinic-project-springboot

## Springboot multi-module-project

### Maven Bugs:
1. Configure external maven, if the m2e is causing issues when using **release:prepare**
2. Your project -> right-click -> Run as -> Configure -> add the external maven to you path (can be done from windows preference-> maven -> installations-> add maven dir)
3. git repo commit issue: **first git pull and then release**
4. Git tag issues: delete outdated tags in the git navigator under tags

adding custom banner - https://patorjk.com/software/taag/#p=display&v=1&f=Sub-Zero&t=SPRING

### Thymleaf NOTEs:
1. should be in template folder.
2. index.html should include name space: xmlns:th="http://www.thymeleaf.org".
3. when using name space use **single quotes** if having spaces in your view string value

### H2 properties
1. spring.datasource.url=jdbc:h2:mem:testdb
2. spring.datasource.driverClassName=org.h2.Driver
3. spring.datasource.username=username
4. spring.datasource.password=password
5. spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
6. **for enable the GUI console**
   * spring.h2.console.enabled=true


### Externaliztion Properties Hierarchy
1. Command line variable
2. OS environement variable
3. .properties or .yaml

### Profiling .propeties files
1. **spring.profiles.active**=<profile_name1>,<profile_name2>...
  ```<application>-<profile_name>.properties
  ex: application-dev.properties
      application-production.properties
      application-qa.properties
  ```    
    
### .yaml files
1. Do not use **TAB** for spacing.
2. use space after **colon**.
```
#EXTERNAILZATION
dave:
  username: test username
  password: test password
  jdbcurl: jdbc URL

spring:
  datasource:
    url: 'jdbc:h2:mem:testdb'
    driver-class-name: 'org.h2.Driver'
    username: username
    password: password
  profiles:
    active:
  thymeleaf:
    cache: false
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      enabled: true
```

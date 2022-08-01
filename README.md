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

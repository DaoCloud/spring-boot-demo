# spring-boot-demo

A java demo for SonarQube.


### API：http://{ip}:8080
### 返回值："Hello! Docker!"
--
### 使用 SonarQube

运行以下命令：

``	
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Pcoverage-per-test
``
``
mvn sonar:sonar -Dsonar.host.url=http://{ip}:{port} -Dsonar.login=xxxx -Dsonar.password=xxxxx -Dsonar.dynamicAnalysis=reuseReports -Dsonar.java.covergaePlugin=jacoco
``

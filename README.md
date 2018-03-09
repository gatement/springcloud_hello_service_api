## description
* a common lib

## package and deploy to remote maven private repository
* Run `./mvnw -s .mvn/settings.xml clean deploy`

## include me in your pom.xml
```xml
    </dependencies>
        <dependency>
            <groupId>com.lgh.springcloud.hello.service.api</groupId>
            <artifactId>springcloud_hello_service_api</artifactId>
            <version>0.1.3</version>
        </dependency>
    </dependencies>
    <repositories>
        <repository>
            <id>jserver_nexus</id>
            <name>jserver_nexus</name>
            <url>http://jserver:8081/repository/maven-public/</url>
            <snapshots>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </repository>
    </repositories>
 ```
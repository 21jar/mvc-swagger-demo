启动后访问
http://localhost:8080/{项目上下文}/swagger-ui.html
##注意事项
1.pom文件中加入

    <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger2</artifactId>
      <version>${swagger2.version}</version>
    </dependency>
    <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger-ui</artifactId>
      <version>${swagger2.version}</version>
    </dependency>
    <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-staticdocs</artifactId>
      <version>${swagger2.version}</version>
    </dependency>
    <swagger2.version>2.6.0</swagger2.version>
2.swagger config中配置

groupName不能是中文

加入

    @EnableWebMvc
    @EnableSwagger2
    @ComponentScan(basePackages ={"com.topsoft.controller"})

或者在xml文件中扫描
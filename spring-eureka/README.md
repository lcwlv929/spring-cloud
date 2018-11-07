#设置tomcat服务端口号
server.port=1111
#设置服务名称
spring.application.name=eureka-service

eureka.instance.hostname=localhost
#注册中心不需要注册自己
eureka.client.register-with-eureka=false
#注册中心不需要去发现服务
eureka.client.fetch-registry=false
#设置服务注册中心的URL
eureka.client.serviceUrl.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka

http://localhost:1111/
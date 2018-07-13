#基础镜像：仓库是java，标签用8
FROM java:8

#将打包好的spring程序拷贝到容器中的指定位置
COPY provider-0.0.1-SNAPSHOT.jar /opt/app/app.jar

#修复时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

#容器对外暴露9090端口
EXPOSE 9090

WORKDIR /opt/app

CMD java -jar app.jar
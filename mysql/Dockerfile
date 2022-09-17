FROM mysql:5.7
MAINTAINER kukaro <justkukaro@naver.com>

ADD ./mysql-init-files /docker-entrypoint-initdb.d
ADD ./mysql/mysql.cnf /etc/mysql/conf.d/mysql.cnf
RUN mkdir -p /var/log/mysql/general
RUN touch /var/log/mysql/general/mysql_general.log
RUN chmod -R 777 /var/log/mysql/general/mysql_general.log

EXPOSE 3306

CMD ["mysqld"]
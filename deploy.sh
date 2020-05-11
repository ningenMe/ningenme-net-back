./mvnw package
pid=`lsof -i:8080 | awk -F: '/java/{print $1}' | awk '{print $2}'`
if [ $pid != "" ] ; then
    kill -9 $pid
fi
java -jar ./target/ningenme-net-back.jar 
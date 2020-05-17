./mvnw clean
./mvnw package
pid=`jps | awk -F: '/ningenme-net-back.jar/{print $1}' | awk '{print $1}'`
if [ $pid != "" ] ; then
    kill -9 $pid
fi
java -jar target/ningenme-net-back.jar &

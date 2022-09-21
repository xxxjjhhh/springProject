//no stop
nohup java -jar springProject.jar
//if no logging a
& > /dev/null

//log file location
nohup.out


//end nohup background process
ps -ef | grep springProject.jar  //or ps
sudo kill -9 PID

//no stop
nohup java -jar springProject.jar &
// & mean background
//if no logging add
> /dev/null

//log file location
nohup.out


//end nohup background process
ps -ef | grep springProject.jar  //or ps
sudo kill -9 PID

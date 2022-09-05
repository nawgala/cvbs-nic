# ReadMe

## Dependency
* java 1.5
* 2.4 servlet API compatable containers
    <pre><code>
        tomcat apache-tomcat-5.5.17
        jetty 7
    </code></pre>

## How to build & deploy
1. axis 1.6.3 is available at /path/to/project.root/deps/axis2-1.6.3
1. set environment variable, AXIS2_HOME
   <pre><code>
    export AXIS2_HOME = /path/to/axis2-1.6.3
   </code></pre>
1. run `ant` from $AXIS2_HOME/webapp and copy `$AXIS2_HOME/webapp/dist/axis2.war` to `/path/to/apache-tomcat-5.5.17/webapps`
1. start tomcat
   `./catalina.sh run`
1. stop tomcat
1. copy doc/nic.properties to /path/to/apache-tomcat-5.5.17/webapps/axis2/WEB-INF/classes/
1. run `ant` from cvbs-nic
1. copy cvbs-nic/build/lib/MobileMoneyService.aar to /path/to/apache-tomcat-5.5.17/webapps/axis2/WEB-INF/services/
1. start tomcat


## verify service
### Method 1
1. goto `http://localhost:8080/axis2/`
1. click on `services`
1. click on `MobileMoneyService`

### Method 2
1. goto `http://localhost:8080/axis2/services/MobileMoneyService?wsdl`


## Code generation (Only for developers)

### client

go to `cd $AXIS2_HOME/bin`

`./wsdl2java.sh  -uri /home/sampath/Project/ngit/custom-projects-etisalat/mrecharge-customization/testing/cvbs-nic/doc/MobileMoneyService_21112016.wsdl  -p com.hsenidmobile.mrecharge.cvbs.in.connector  -o cvbs-nic-client -s -u -Eosv false`

### server

go to `cd $AXIS2_HOME/bin`

`./wsdl2java.sh  -uri /home/sampath/Project/ngit/custom-projects-etisalat/mrecharge-customization/testing/cvbs-nic/doc/MobileMoneyService_21112016.wsdl  -p com.hsenidmobile.ipg.sim.nic.server  -o cvbs-nic-sim   -ss -sd -u -Eosv false`


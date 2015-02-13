
dummytest

1. Prerequisites
    JAVA and MAVEN 
    Make sure java home and path is set for Maven after maven installation 

    $PATH  /usr/apache-maven/apache-maven-3.2.5/bin [export PATH="/usr/apache-maven/apache-maven-3.2.5:$PATH"]
    $JAVA_HOME /Library/Java/JavaVirtualMachines/jdk1.7.0_71.jdk/Contents/Home/


2.Kick of steps , either write this in shell script and call from jenkins or directly.
   git clone https://github.com/madhucs/nTestFrame.git
   
   cd nTestFrame/CheckMavenConfig/
   
   mvn clean
   
   mvn compile
   
   mvn test
   


# ServerAnalyser-master
  
  This program monitors and maintains log of network activity in and out of the server and serves as a second degree
  forensics layer to information security after Firewall. The recorded data is securely stored into MySQL database that can be retrieved 
  in case of a breach and the logs can be read to reveal important data relating to the attacker/hacker.



## Installation
The program requires installation of following before proceeding

- JDK 1.6 or higher
- NetBeans 8
- Wireshark 
- WinPcap 3.0 or above ( install while installing Wireshark ) 
- Powershell
- MySQl Server 5.1


### MySQL Configuration
	
	Set the MySQL Configuration using MySQL Instance Configuration Wizard with :
	Username: root
	Password: 1111
	
	Before proceeding to login to the application,
	Run the sql file  "proadmin.sql" to create the necessary database structure. 
	
	You may change this anytime by configuring code before you deploy it into server.

### Running the application from NetBeans IDE 8.0

##### Prerequisites
			
			- MySQL ConnectorJ
			
##### Finally Running
			
			- Select **main.java** and hit `Run` to start execution for the first time only.
			- Create a shortcut to the program ( `Server_Analyser.jar` ) found inside the `dist` directory for subsequent executions.
			
	
##### Read the same on a lucid website

 `https://biswajee.github.io/ServerAnalyser/`
	


## Note
   NetGroup Packet Filter Driver (NPF) is running.
   In case, it isn't, make sure you start the program ( `Server_Analyser.jar` ) with "Run As Administrator" privilege.

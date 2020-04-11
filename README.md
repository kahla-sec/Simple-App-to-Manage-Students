# Simple App to Manage Students #
Simple Java application to retrieve informations about a student , the client application connects to the Server through sockets and retrieve the informations from the Database, created as school project with my teammates Montassar Amri and Med Ali Zaabi .
You can check the report HERE .
## Overview ##
![TASK](https://i.imgur.com/76PuJNC.jpg)
### Client App ###

![PIC](https://imgur.com/jh6fFoI.png)
![PIC](https://imgur.com/8tXa4sn.png)

### Server App ###

![PIC](https://i.imgur.com/1DYhvkl.jpg)

## How To use ##
### Client App ###
Navigate To src folder then type :

> /usr/lib/jvm/java-8-openjdk-amd64/bin/javac -cp .:com/Etudiant/frame/lib/AbsoluteLayout.jar com/Etudiant/frame/LoginGUI.java

After that type :
> java -cp .:com/Etudiant/frame/lib/AbsoluteLayout.jar com.Etudiant.frame.LoginGUI

**Note** : You need OpenJDK 8 for the client app .

And enjoy managing students :p 

### Server App ###

Run the following Commands :
> /usr/lib/jvm/java-11-openjdk-amd64/bin/javac -cp .:lib/mariadb-java-client-2.6.0.jar MainServ.java

> /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp .:lib/mariadb-java-client-2.6.0.jar MainServ

**Note** : You need OpenJDK 11 for the server app .

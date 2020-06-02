The project is a UR style guide library. The purpose of this library is to make it easier for the URCap developer to implement the layout/frontend of the URCap. This library follows the style guide "STYLE GUIDE (e-Series)" found at https://plus.universal-robots.com/download-center/. Notice that the library only supports the layout for e-Series.

This library has been made open-source such that developers can access the source-code, download it or event contribute. If anyone wishes to contribute, making pull requests will be available. 

How to use this library:

1) The user have to download or clone the repository (for any updates).

2) To use the library, the project must be opened in an IDE, where it is possible to export the project as a JAR.

3) For exporting the project, please choose to export the source code as well and name the jar file "URStyleGuide" without the quotation marks such that it will be called URStyleGuide.jar.

4) Add this to the URCap project as a third-party library. Follow the bullets points below to add the library:
 
4.a) From the terminal, direct to the exported jar file  and write the following command-line in the terminal: 

	mvn install:install-file -Dfile=URStyleGuide.jar -DgroupId=com.ur -DartifactId=StyleGuide -Dversion=1.0 -Dpackaging=jar
      
4.b) Insert the following in the pom.xml file of the URCap project as part of the <Import-Package> tag:
      
	com.ur.style*;version="[1.0)"
  
4.c) Insert the following in the pom.xml file below the <Import-Package> tag:
     	
	<Embed-Dependency>StyleGuide;scope=compile|runtime</Embed-Dependency>
  
4.d) Insert the following as a part of the <dependencies> tag:
     	
	<dependency>
        	<groupId>com.ur</groupId>
		<artifactId>StyleGuide</artifactId>
        	<version>1.0</version>
	</dependency>

For an example on how the library is implemented in a URCap, please refer to the following github link:

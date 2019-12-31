This is a simple example to show how to develop application 
with the fractal component model.

On console :
ant dist

windows:
%FRACTAL_HOME%/bin/fractal.bat -cp dist/helloworld.jar -fscript
linux:
bash $FRACTAL_HOME/bin/fractal.sh -cp dist/helloworld.jar -fscript

With eclipse :
As fraclet uses annotations to generate Java code and Fractal ADL,
you can't run directly the Fractal ADL.

- click right on the build.xml
- select "Run As" -> "Ant Build...", the "Edit Configuration" window appears 
- select the "Environment" tab
- click on the "New" button to add a new Environment variable
- set FRACTAL_HOME as name, click the "Variables..." button for the value and select FRACTAL_HOME
- click OK, and Run


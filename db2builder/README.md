# Effective Java Builders
* This is not setup as a real project to make it easier to follow what gets created by what.
* Use JOOQ to generate Interfaces (and other files) from database.
 * These files can be seen in my-app/joog-gen
 * I used command line interface due to a problem with the maven-plugin
* Modify JOOQ generated Interfaces to add Freebuilder import and annotation.
 * These files can be seen in my-app/src/main/java/com/mycompany/app/jooq/tables/interfaces
 * Adding annotation and import can be automated without a lot of effort
* Create Builder files using Freebuilder (pom-freebuilder.xml)
 * These files can be see in my-app/freebuilder-gen/com/mycompany/app/jooq/tables/interfaces


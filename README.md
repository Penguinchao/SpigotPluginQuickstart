# This is a maven-archetype to quickstart spigot plugin development


## How to use:

* Open your terminal or command prompt
* Switch to the directory you want the plugin to live in
* Create the project using the archetype:

```
mvn archetype:generate \
-DarchetypeRepository=http://nexus.tkausl.net/content/groups/public/ \
-DarchetypeGroupId=net.tkausl.archetypes \
-DarchetypeArtifactId=spigot-plugin-simple \
-DarchetypeVersion=1.0-SNAPSHOT
```

## Next steps:

After creating the project, you should be able to compile the simple dummy-plugin, just switch in the plugins directory and type `mvn install`, your .jar will be in target/.
To test the plugin, just copy the .jar-file in your servers plugins-folder and restart or reload the server. A dummy command is already implemented, just type /<your plugin name> (its your artifactId) and you'll get a simple message, showing you the pluginname and the version.

Please read the [Spigot Developer Informations](http://www.spigotmc.org/wiki/spigot/) for further informations on how to develop spigot-plugins,
the JavaDoc lives [here](https://hub.spigotmc.org/javadocs/spigot/).
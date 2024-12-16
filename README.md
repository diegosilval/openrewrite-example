## Example OpenRewrite

```shell
mvn -U org.openrewrite.maven:rewrite-maven-plugin:5.46.3:runNoFork -Drewrite.activeRecipes=org.openrewrite.java.migrate.lang.var.UseVarForObject,org.openrewrite.java.migrate.lang.var.UseVarForPrimitive,org.openrewrite.java.migrate.lang.var.UseVarForGenericsConstructors,org.openrewrite.java.migrate.lang.var.UseVarForGenericMethodInvocations -Drewrite.exportDatatables=true
```


```shell
mvn -U org.openrewrite.maven:rewrite-maven-plugin:run "-Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-migrate-java:RELEASE" "-Drewrite.activeRecipes=org.openrewrite.java.migrate.lang.UseVar" "-Drewrite.exportDatatables=true"
```
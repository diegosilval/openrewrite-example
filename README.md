## Example OpenRewrite

```shell
mvn -U org.openrewrite.maven:rewrite-maven-plugin:run \
    -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-migrate-java:RELEASE \
    -Drewrite.activeRecipes=org.openrewrite.java.migrate.lang.UseVar \
    -Drewrite.exportDatatables=true
```
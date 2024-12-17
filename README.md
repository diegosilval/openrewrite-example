## Example OpenRewrite

```shell
mvn -U org.openrewrite.maven:rewrite-maven-plugin:run \
    -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-migrate-java:RELEASE \
    -Drewrite.activeRecipes=com.sample.MyRecipe \
    -Drewrite.exportDatatables=true
```
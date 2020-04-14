set -e
rm -rf ../src/generated/kotlin
openapi-generator generate -i ../src/main/resources/openapi.yaml -g kotlin-spring -o output --package-name com.chummy_tummies
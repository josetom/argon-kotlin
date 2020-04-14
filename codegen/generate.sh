set -e

# clean
rm -rf ../src/generated/kotlin
rm -rf out

# generate files
openapi-generator generate -i ../src/main/resources/openapi.yaml -g kotlin-spring -o out -c config.yaml

# move files
mkdir ../src/generated/kotlin
cp -r out/src/main/kotlin/com ../src/generated/kotlin/com

# remove unwanted files
rm ../src/generated/kotlin/com/chummy_tummies/apis/ApiUtil.kt
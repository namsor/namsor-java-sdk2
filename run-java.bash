echo update openapi-generator
./bin/utils/openapi-generator-cli.sh
rm -Rf ./namsor/client/java/
echo run openapi-generator
java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate --git-repo-id namsor-java-sdk2 --git-user-id namsor --artifact-version 2.0.13 --group-id com.namsor --artifact-id namsor-sdk2 --invoker-package com.namsor.sdk2.invoke --model-package com.namsor.sdk2.model --api-package com.namsor.sdk2.api -i https://v2.namsor.com/NamSorAPIv2/api2/openapi.json -g java -o  namsor/client/java
cd ./namsor/client/java/
mvn clean package
cd target
cp -R /home/namsor/codegen/openapi-generator/namsor/client/java/* /home/namsor/codegen/namsor-java-sdk2/
cp /home/namsor/codegen/openapi-generator/run-java.bash /home/namsor/codegen/namsor-java-sdk2/
#~/dropbox_uploader.sh upload namsor-sdk2-1.0.0.jar namsor-sdk2-1.0.0.jar
#~/dropbox_uploader.sh upload namsor-sdk2-1.0.0-javadoc.jar namsor-sdk2-1.0.0-javadoc.jar
#~/dropbox_uploader.sh upload namsor-sdk2-1.0.0-sources.jar namsor-sdk2-1.0.0-sources.jar
#~/dropbox_uploader.sh upload namsor-sdk2-1.0.0-tests.jar namsor-sdk2-1.0.0-tests.jar

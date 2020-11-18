./start-execution.sh $1

./gradlew clean packageDebug

./end-execution.sh
rm buildSessionId.txt
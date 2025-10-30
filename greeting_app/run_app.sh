#!/bin/bash
# ==========================================
# Compile and Run Greeting App (Plain Java)
# ==========================================

echo
echo "===== Compiling Java Files ====="
find com/greeting_app -name "*.java" > sources.txt
javac @sources.txt

if [ $? -ne 0 ]; then
  echo "Compilation failed!"
  exit 1
fi

echo
echo "===== Running Greeting App ====="
java com.greeting_app.Main

echo
echo "===== Program Finished ====="

# Clean up
find com/greeting_app -name "*.class" -delete


rootProject.name = "react-native-keychain-new"

include(":library")
project(":library").projectDir = File(rootProject.projectDir, "./android")

// androidx, ReactNative 0.60+
includeBuild("KeychainExample/android")

def qa(){    
        env.BUILD_ENV = "qa"
        env.ANDROID_APP_VERSION = "qa_android-${BUILD_NUMBER}.apk"
        env.ANDROID_PLATFORM = "android"
        env.ANDROID_APK_NAME = "androidtv_${BUILD_ENV}_signed"
        env.ANDROID_APK_PATH = "apps/release/cnn_go_android/app"
}    
def prod(){     
        env.BUILD_ENV = "prod"
        env.ANDROID_APP_VERSION = "prod_android-${BUILD_NUMBER}.apk"
        env.ANDROID_PLATFORM = "android"
        env.ANDROID_APK_NAME = "androidtv_${BUILD_ENV}_signed.apk"
}               
return this

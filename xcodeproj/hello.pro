-keep class ca.weblite.codename1.app.Main{
   public static void main(java.lang.String[]);
 }
-keepclassmembers public class com.codename1.impl.ios.IOSImplementation {
    *;
}

-repackageclasses ''
-allowaccessmodification
-dontpreverify

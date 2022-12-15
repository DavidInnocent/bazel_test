load("@build_bazel_rules_android//android:rules.bzl", "android_library", "android_local_test")

android_library(
    name = "lib",
    srcs = glob(["src/main/java/**/*.java"]),
    custom_package = "com.example.android.bazel",
    manifest = "//src/main:AndroidManifest.xml",
    resource_files = glob(["src/main/res/**"]),
)

android_local_test(
    name = "test",
    srcs = ["//src/test/java/com/example/android/bazel/MainActivityTest.java"],
    custom_package = "com.example.android.bazel.test",
    test_class = "com.example.android.bazel.test.MainActivityTest",
    deps = [
        ":lib",
        "@maven//:junit_junit",
        "@maven//:org_robolectric_robolectric",
        "@robolectric//bazel:android-all",
    ],
)

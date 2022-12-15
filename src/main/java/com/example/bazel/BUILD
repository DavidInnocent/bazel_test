package(
   default_visibility = ["//src:__subpackages__"],
)
load("@build_bazel_rules_android//android:rules.bzl", "android_library")
load("@build_bazel_rules_android//android:rules.bzl", "android_library")
android_library(
    name = "greeter_activity",
    srcs = glob(["*.java"]),
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [
        "@maven//:com_google_android_material_material",
        "@maven//:androidx_constraintlayout_constraintlayout",
        "@maven//:androidx_appcompat_appcompat",

         "@maven//:androidx_lifecycle_lifecycle_livedata",
         "@maven//:androidx_lifecycle_lifecycle_viewmodel",
         "@maven//:androidx_lifecycle_lifecycle_viewmodel_savedstate",
#         "@maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core_jvm",
    ],
)
#
#java_import(
#    name = "kotlinx_coroutines_core_jvm_fixed",
#    jars = ["@kotlinx_coroutines_core_fixed//:v1/https/repo1.maven.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-core-jvm/1.5.0/kotlinx-coroutines-core-jvm-1.5.0.jar"],
#    deps = [
#        ":sun_dependencies_neverlink",
#		"@maven//:org_jetbrains_kotlin_kotlin_stdlib_common",
#		"@maven//:org_jetbrains_kotlin_kotlin_stdlib_jdk8",
#    ],
#    visibility = ["//visibility:public"],
#)
#
#java_library(
#    name = "sun_dependencies_neverlink",
#    srcs = ["SignalHandler.java", "Signal.java"],
#    neverlink = True,
#)



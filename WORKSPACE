android_sdk_repository(
    name = "androidsdk",
    build_tools_version = "30.0.1",
	api_level = 30,
)
android_ndk_repository(
    name = "androidndk",
)


load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "4.5"
RULES_JVM_EXTERNAL_SHA = "b17d7388feb9bfa7f2fa09031b32707df529f26c91ab9e5d909eb1676badd9a6"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")

#overridden_targets = {
#    # Override the maven dep with the fixed target
#    "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm": "@//:kotlinx_coroutines_core_jvm_fixed",
#}

maven_install(
    override_targets = overridden_targets,
    artifacts = [
        "androidx.appcompat:appcompat:1.2.0",
        "com.google.android.material:material:1.2.1",
        "androidx.constraintlayout:constraintlayout:2.1.4",
        "androidx.lifecycle:lifecycle-livedata:2.5.1",
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.5.1",
        "androidx.lifecycle:lifecycle-viewmodel:2.5.1",
#        "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:jar:1.5.0",
#        "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0",

#      "com.android.support:appcompat-v7:26.1.0",

#        "androidx.core:core:1.6.0",
#        "androidx.savedstate:savedstate:1.2.0",
#        "androidx.lifecycle:lifecycle-livedata-core:2.5.1",

#        "androidx.lifecycle:lifecycle-process:2.5.1",
#        "androidx.lifecycle:lifecycle-runtime:2.5.1",
#        "androidx.lifecycle:lifecycle-service:2.5.1",


        "org.robolectric:robolectric:4.9",
        "junit:junit:4.12",
        "javax.inject:javax.inject:1",
        "org.hamcrest:java-hamcrest:2.0.0.0",
        "androidx.test.espresso:espresso-core:3.1.1",
        "androidx.test:rules:aar:1.1.1",
        "androidx.test:runner:aar:1.1.1",



        # Dependencies needed to manage version conflicts


    ],
    repositories = [
        # Private repositories are supported through HTTP Basic auth
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
        "https://jcenter.bintray.com",
    ],
    fetch_sources = True,
    generate_compat_repositories = True,
    version_conflict_policy = "pinned",
)

# Create a second maven repository that downloads the original kotlinx-coroutines-core-jvm
# jar. This will be used to override the root @maven target with the hacked
# version compiled against the neverlink sun dependencies.
#maven_install(
#    name = "kotlinx_coroutines_core_fixed",
#    artifacts = ["org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:jar:1.5.0"],
#    repositories = ["https://repo1.maven.org/maven2"],
#)


load("@maven//:compat.bzl", "compat_repositories")
compat_repositories()


http_archive(
    name = "build_bazel_rules_android",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
)

http_archive(
    name = "robolectric",
    sha256 = "7655c49633ec85a18b5a94b1ec36e250671808e45494194959b1d1d7f3e73a23",
    strip_prefix = "robolectric-bazel-4.9",
    urls = ["https://github.com/robolectric/robolectric-bazel/archive/4.9.tar.gz"],
)

load("@robolectric//bazel:robolectric.bzl", "robolectric_repositories")

robolectric_repositories()
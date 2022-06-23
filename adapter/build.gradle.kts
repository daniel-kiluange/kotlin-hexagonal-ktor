val ktor_version: String by project
val koin_version: String by project
dependencies{
    implementation(project(":data"))
    implementation(project(":port"))
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.insert-koin:koin-ktor:$koin_version")
}
tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":support:logging"))
    implementation(project(":storage:db-main"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
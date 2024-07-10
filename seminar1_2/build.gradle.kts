plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.commons:commons-lang3:3.0")
    implementation("com.google.code.gson:gson:2.9.0")
    compileOnly("org.projectlombok:lombok:1.18.30")



}

tasks.test {
    useJUnitPlatform()
}
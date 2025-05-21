plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("application")
    id("checkstyle")
    id("org.sonarqube") version "6.2.0.5505"
}
group = "App.java"
version = "1.0-SNAPSHOT"
application {
	mainClass = "hexlet.code.App"
}
sonar {
  properties {
    property("sonar.projectKey", "KristinaB-t_java-project-61")
    property("sonar.organization", "kristinab-t")
    property("sonar.host.url", "https://sonarcloud.io")
  }
}
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

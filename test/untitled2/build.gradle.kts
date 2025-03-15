plugins {
    id("java")
    checkstyle
}

group = "org.omnisphere.two2"
version = "1.0-SNAPSHOT"
val mapStructVersion = "1.5.5.Final"
val lombokVersion = "1.18.30"
val lombokMapstructBinding = "0.2.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.mapstruct:mapstruct:$mapStructVersion")
    implementation("org.projectlombok:lombok-mapstruct-binding:$lombokMapstructBinding")

    compileOnly("org.projectlombok:lombok:$lombokVersion")

    annotationProcessor("org.mapstruct:mapstruct-processor:$mapStructVersion");
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:$lombokMapstructBinding");
    annotationProcessor("org.projectlombok:lombok:$lombokVersion");
}

tasks.withType<Checkstyle>().configureEach{
    reports {
        xml.required = true;
        html.required = true;
    }
}

tasks.checkstyleMain {
    source = fileTree("src/main/java")
}

tasks.test {
    useJUnitPlatform()
}
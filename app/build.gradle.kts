plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

application {
    mainClass.set("com.mammb.app.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

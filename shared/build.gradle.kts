plugins {
    id("pq.java-conventions")
}

dependencies {
    implementation("org.spongepowered:configurate-yaml:4.1.2")
    compileOnly("net.pistonmaster:pistonmotd-api:5.2.0")
    compileOnly("com.google.guava:guava:33.4.0-jre")
}

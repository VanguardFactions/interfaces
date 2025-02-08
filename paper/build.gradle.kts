repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    api(projects.interfacesCore)
    compileOnlyApi(libs.paper.api)
    compileOnly(libs.guava)
}

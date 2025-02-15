import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.2.6.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	kotlin("jvm") version "1.3.71"
	kotlin("plugin.spring") version "1.3.71"
}

group = "com.chummy_tummies"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

kotlin.sourceSets.create("generated")

//sourceSets {
//	main {
//		java {
//			srcDir("src/generated/kotlin")
//		}
//	}
//}

sourceSets.main {
	withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
		kotlin.srcDirs("src/main/kotlin", "src/generated/kotlin")
	}
}


dependencies {
	implementation("org.openapitools:openapi-generator-gradle-plugin:4.3.0")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

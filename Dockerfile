# Gunakan base image Java 21 versi Alpine untuk ukuran container yang sangat kecil dan efisien
FROM eclipse-temurin:21-jre-alpine

# Buat direktori kerja di dalam container
WORKDIR /app

# Copy file JAR hasil build maven ke dalam container
# Asumsi: Anda sudah melakukan 'mvn clean package' atau './mvnw clean package'
COPY target/praktikum8-0.0.1-SNAPSHOT.jar app.jar

# Expose port yang digunakan oleh Tomcat Spring Boot
EXPOSE 8080

# Eksekusi aplikasi saat container berjalan
ENTRYPOINT ["java", "-jar", "app.jar"]
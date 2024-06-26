FROM openjdk:17-jdk-slim

# Interface gráfica
RUN apt-get update && apt-get install -y \
    x11-apps \
    libxext6 \
    libxrender1 \
    libxtst6 \
    libxi6 \
    libxt6

WORKDIR /app

COPY src /app/src

COPY bin /app/bin

RUN javac -d bin src/App.java src/objects/*.java src/functions/*.java

CMD ["java", "-cp", "bin", "App"]

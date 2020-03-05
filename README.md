# MarvelAPI

API de catálogo de super-heróis da Marvel, baseado em https://developer.marvel.com/docs#!/public.

[![CodeFactor](https://www.codefactor.io/repository/github/adrianedecol/marvelapi/badge)](https://www.codefactor.io/repository/github/adrianedecol/marvelapi)

## Tecnologias Utilizadas

| # | Para que |
|:-:|:-|
| [Java 8](https://java.com/en/download/help/linux_x64_install.xml) | Linguagem de programação qual a aplicação foi construída |
| [Spring Boot](https://spring.io/projects/spring-boot) | Framework base em qual a aplicação foi construída e projetada |
| [Spring Fox](http://springfox.github.io/springfox/) | Ferramenta para geração da documentação da api Rest com Swagger, que funciona integrada com Spring Boot |
| [Swagger](https://swagger.io) | Tecnologia utilizada para documentação das api’s Rest  |
| [Maven](https://maven.apache.org/) | Ferramenta de gestão de dependências e build  |
| [JUnit 5](https://junit.org/junit5/) | Utilizado para execução dos testes da app |
| [Lombok](https://projectlombok.org) | Ferramenta utilitária para geração de código em Java com foco em diminuir o boilerplate |
| [H2](https://www.h2database.com/html/main.html) | Banco de dados em memória do Java |

## Execução
Os dados ficam armazenados no banco h2 em memória e são recriados toda vez que a aplicação for encerrada, não sendo necessário rodar nenhum script.

### Execução local IDE 
A aplicação pode ser executada e alterada por uma IDE Java (Eclipse, IntelliJ IDEA, etc). O formato da abertura/importação do processo vai depender da IDE adotada.

#### Pré requisitos
- [Java 8](https://java.com/en/download/help/linux_x64_install.xml) 
- [Maven](https://maven.apache.org/)

### Execução local manual
A aplicação pode ser executada manualmente atráves de linha de comando

#### Pré requisitos
- [Java 8](https://java.com/en/download/help/linux_x64_install.xml) 
- [Maven](https://maven.apache.org/)

#### Comandos
```shell
# Na raiz do projeto, executar os seguintes comandos

# Build Maven (executa os testes automatizados)
mvn clean install

# Execução
java -jar target\marvelAPI-0.0.1-SNAPSHOT.jar

```

## Links importantes

### Swagger

A documentação da API pode ser acessada pela própria aplicação, via Swagger, disponível atráves do link `http://localhost:8080/swagger-ui.html`.

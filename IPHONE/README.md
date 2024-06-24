## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## UML
```mermaid
classDiagram
    interface NavegadorInternet {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class SafariNavegador {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone {
        +main(String[] args)
    }

    interface Ipod {
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica()
    }

    class ExecutarIpod {
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica()
    }

    interface AparelhoTelefonico {
        +ligar()
        +atender()
        +iniciarCorreioVoz()
    }

    class ChamadasTelefonicas {
        +ligar()
        +atender()
        +iniciarCorreioVoz()
    }

    NavegadorInternet <|.. SafariNavegador
    Iphone -> NavegadorInternet
    Iphone -> Ipod
    Ipod <|.. ExecutarIpod
    Iphone -> AparelhoTelefonico
    AparelhoTelefonico <|.. ChamadasTelefonicas
```
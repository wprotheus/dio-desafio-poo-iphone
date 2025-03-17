# DIO - Trilha Java Básico

## Autor  
🔸[wprotheus](https://github.com/wprotheus)
  
## POO - Desafio  

### Modelagem e Diagramação de um Componente iPhone  

Neste desafio serei responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades definidas/escolhidas.  

#### Funcionalidades a modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo  
1. Criado o diagrama UML que representa as funcionalidades descritas acima.  

### Diagrama UML
```mermaid
---
title: iPhone
---
classDiagram    
    iPhone --> Reprodutor_Musical
    iPhone --> Aparelho_Telefonico
    iPhone --> Navegador_na_Internet
    class Reprodutor_Musical {
    <<interface>>        
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }
    class Aparelho_Telefonico {
    <<interface>>
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
    }
    class Navegador_na_Internet {
    <<interface>>
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }


```

2. Implementada as classes e interfaces correspondentes em Java.

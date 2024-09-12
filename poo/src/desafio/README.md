# POO - Desafio

## Modelagem e Diagramação de um Componente iPhone

Neste desafio, modelar e diagramar a representação UML do componente iPhone
abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e
Navegador na Internet.

### Funcionalidades a Modelar

 1 - Reprodutor Musical
    Métodos: tocar(), pausar(), selecionarMusica(String musica)
 2 - Aparelho Telefônico
    Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
 3 - Navegador na Internet
    Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

### UML

 ```plaintext
+------------------+
|     iPhone       |
+------------------+
| - tocar()        |
| - pausar()       |
| - selecionarMusica|
| - ligar()        |
| - atender()      |
| - iniciarCorreioVoz|
| - exibirPagina() |
| - adicionarNovaAba|
| - atualizarPagina |
+------------------+

+----------------------+
|  Reprodutor Musical   |
+----------------------+
| + tocar(): void       |
| + pausar(): void      |
| + selecionarMusica(musica: String): void |
+----------------------+

+----------------------+
|  Aparelho Telefônico  |
+----------------------+
| + ligar(numero: String): void |
| + atender(): void             |
| + iniciarCorreioVoz(): void   |
+----------------------+

+----------------------------+
|  Navegador na Internet      |
+----------------------------+
| + exibirPagina(url: String): void |
| + adicionarNovaAba(): void       |
| + atualizarPagina(): void        |
+----------------------------+
```

### Explicação

* Interfaces: Cada interface (ReprodutorMusical, AparelhoTelefonico
NavegadorInternet) define os métodos que a classe iPhone deve implementar.

* Classe iPhone: Implementa as três interfaces, fornecendo o comportamento
específico de cada funcionalidade.

* Método main: Testa as funcionalidades, chamando os métodos implementados.

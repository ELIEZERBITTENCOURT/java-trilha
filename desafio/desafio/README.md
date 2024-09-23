# Desafio Bootcamp Java Developer

Este projeto é uma simulação de um sistema de Bootcamp desenvolvido em Java, utilizando os princípios da Programação Orientada a Objetos (POO). Ele contém as classes necessárias para gerenciar cursos, mentorias, desenvolvedores e bootcamps, além de calcular o XP adquirido conforme o progresso dos desenvolvedores.

## Funcionalidades

- **Inscrição em Bootcamp:** Desenvolvedores podem se inscrever em um bootcamp e automaticamente ter acesso a todos os conteúdos (cursos e mentorias).
- **Progresso nos Conteúdos:** Desenvolvedores podem progredir pelos conteúdos inscritos (cursos e mentorias) e marcar os conteúdos como concluídos.
- **Cálculo de XP:** Cada conteúdo possui uma pontuação de XP (Experiência) que é calculada com base em suas características. O XP total é acumulado à medida que o desenvolvedor avança.
  
## Estrutura do Projeto

O projeto está estruturado em várias classes, cada uma responsável por uma parte do sistema:

### Classes Principais

- **Conteudo (Classe Abstrata):**
  - Representa o conteúdo genérico de um Bootcamp.
  - Atributos:
    - `titulo`
    - `descricao`
  - Método abstrato:
    - `calcularXp()`

- **Curso:**
  - Herda de `Conteudo`, representando um curso.
  - Atributos:
    - `cargaHoraria`
  - Implementação de `calcularXp()` baseada na carga horária do curso.
  
- **Mentoria:**
  - Herda de `Conteudo`, representando uma mentoria.
  - Atributos:
    - `localData` (data da mentoria)
  - Implementação de `calcularXp()` com um valor fixo e um bônus.

- **Dev:**
  - Representa o desenvolvedor inscrito em um bootcamp.
  - Atributos:
    - `nome`
    - `conteudosInscritos` (lista de cursos/mentorias inscritos)
    - `conteudosConcluidos` (lista de cursos/mentorias concluídos)
  - Métodos:
    - `inscrever(Bootcamp bootcamp)`: Inscreve o desenvolvedor no bootcamp.
    - `progredir()`: Marca um conteúdo como concluído e remove da lista de conteúdos inscritos.
    - `calcularTotalXp()`: Calcula o XP total do desenvolvedor com base nos conteúdos concluídos.

- **Bootcamp:**
  - Representa o bootcamp em si, agregando cursos, mentorias e desenvolvedores.
  - Atributos:
    - `nome`
    - `descricao`
    - `dataInicio`
    - `dataFim`
    - `conteudos` (lista de cursos e mentorias)
    - `devs` (lista de desenvolvedores inscritos)

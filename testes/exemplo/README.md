# Estudos de POO e segurança com testes

Exemplo básico de um sistema de login em Java que utiliza princípios de Programação Orientada a Objetos (POO) com testes e operação simulada de OpenID para controle de autenticação.

OBS: No entanto, dado que a implementação completa de OpenID envolve interações com APIs externas e servidores de autenticação, vou ilustrar a estrutura central do sistema com base nos conceitos principais da POO.
Para um sistema real de login com OpenID, você utilizaria bibliotecas e APIs como a do Spring Security ou OAuth2/OpenID Connect.
Aqui, vou focar nos pilares da POO: Abstração, Encapsulamento, Herança, e Polimorfismo, com uma simulação de um processo de autenticação via OpenID.

## Estrutura do Projeto

1. Classe `Usuario`: Representa um usuário do sistema, com herança para tipos de usuário com diferentes níveis de segurança.
2. Interface `Autenticacao`: Define a autenticação via OpenID.
3. Classe `LoginService`: Realiza o login e a validação de segurança.

## Explicação do Código

`Abstração`: A classe `Usuario` é abstrata e contém as informações básicas de um usuário, mas não implementa o comportamento de permissões. As subclasses `Admin` e `UsuarioComum` implementam esse comportamento.

`Encapsulamento`: As propriedades do usuário, como nome, email, e nivelSeguranca, são privadas e acessadas por métodos públicos, garantindo proteção aos dados.

`Herança`: `Admin` e `UsuarioComum` herdam de Usuario, reutilizando os atributos e implementando seus próprios métodos de permissão.

`Polimorfismo`: O método abstrato exibirPermissoes é sobrescrito de formas diferentes em cada tipo de usuário.

Autenticação com OpenID: O método autenticar simula a validação de um token OpenID. No cenário real, uma biblioteca OpenID seria usada para a verificação de tokens reais.

## Estrutura dos Testes

1. Testar autenticação com token válido.
2. Testar autenticação com token inválido.
3. Verificar as permissões de `Admin` e `UsuárioComum`.

### Explicação dos Testes

* Autenticação com token válido:
    Testa se tanto o Admin quanto o Usuário Comum podem ser autenticados com um token válido ("tokenValido123").

* Autenticação com token inválido:
    Testa se o sistema rejeita a autenticação para ambos os usuários quando o token é inválido ("tokenInvalido").

* Testes de Permissões:
    Verifica se o Admin tem permissões adequadas com nível de segurança "Admin".
    Verifica se o Usuário Comum tem permissões adequadas com nível de segurança "Usuário Comum".

### Como Executar os Testes

Compile o código e adicione a dependência do JUnit.

Execute os testes através do seu ambiente de desenvolvimento (Eclipse, IntelliJ, etc.) ou via linha de comando, se você estiver usando Maven:

```code
mvn test
```

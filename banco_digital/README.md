# Desafio criando Banco Digital com Java e Orientação a Objetos

Este projeto implementa um sistema básico de banco utilizando os princípios da Programação Orientada a Objetos (POO) em Java. O sistema permite a criação de dois tipos de contas bancárias (Corrente e Poupança) e a gestão de clientes e suas contas, oferecendo operações básicas como depósito, saque, transferência e exibição de extrato.

## Estrutura do Projeto

### 1. `Cliente`

A classe `Cliente` representa os clientes do banco. Cada cliente tem as seguintes propriedades:

- **Nome**: O nome do cliente.
- **CPF**: O CPF do cliente (identificação).
- **Contas**: Uma lista de contas associadas ao cliente (um cliente pode ter múltiplas contas).

#### Principais Métodos

- `adicionarConta(Conta conta)`: Adiciona uma nova conta à lista de contas do cliente.
- `exibirInformacoes()`: Exibe as informações do cliente, como nome, CPF, e os extratos de todas as suas contas.

### 2. `Conta`

A classe abstrata `Conta` define os atributos e métodos comuns entre diferentes tipos de contas bancárias. Todos os tipos de contas herdam desta classe.

#### Atributos

- **Número da conta**: Identificador único da conta.
- **Saldo**: O saldo atual da conta.

#### Principais Métodos

- `depositar(double valor)`: Adiciona um valor ao saldo da conta.
- `sacar(double valor)`: Retira um valor do saldo, se houver saldo suficiente.
- `transferir(double valor, Conta destino)`: Transfere um valor de uma conta para outra.
- `extrato()`: Exibe o saldo e o número da conta.

### 3. `ContaCorrente`

A classe `ContaCorrente` herda da classe `Conta` e define uma taxa fixa para saques.

#### Comportamentos Específicos

- **Taxa de saque**: Cada saque realizado tem uma taxa de R$1,00 além do valor solicitado.

### 4. `ContaPoupanca`

A classe `ContaPoupanca` herda da classe `Conta` e adiciona a funcionalidade de rendimento sobre o saldo da conta.

#### Comportamentos Específicos

- **Rendimento**: A cada chamada do método `aplicarRendimento()`, o saldo da conta poupança recebe um rendimento de 5%.

## Funcionalidades

1. **Criar Clientes**: Os clientes podem ser criados com nome e CPF.
2. **Criar Contas**: Os clientes podem ter uma ou mais contas, tanto correntes quanto poupanças.
3. **Depósito**: O cliente pode depositar valores nas suas contas.
4. **Saque**: O cliente pode sacar valores das suas contas (com taxa para contas correntes).
5. **Transferência**: É possível transferir valores entre contas (mesmo entre clientes diferentes).
6. **Rendimento (Conta Poupança)**: Contas poupança podem aplicar rendimentos.
7. **Exibição de Extrato**: Exibe informações detalhadas do cliente e o saldo de suas contas.

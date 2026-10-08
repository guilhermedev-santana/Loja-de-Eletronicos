# 🛒 Gerenciamento de Loja de Eletrônicos

Projeto desenvolvido em **Java** como atividade prática de **Programação Orientada a Objetos (POO)**, com o objetivo de aplicar conceitos fundamentais como **abstração, herança, encapsulamento, polimorfismo, sobrecarga e sobrescrita**.

O sistema simula o gerenciamento de produtos eletrônicos de uma loja, permitindo cadastrar, listar e buscar produtos por categoria ou nome.

---

## 📚 Objetivo da Atividade

Desenvolver um sistema de gerenciamento de uma loja de eletrônicos utilizando os principais conceitos da Programação Orientada a Objetos.

A atividade também exige a utilização explícita dos tipos **Wrapper `Integer` e `Double`** para representar valores inteiros e decimais.

---

## 🛠️ Tecnologias Utilizadas

* ☕ Java
* 📦 Programação Orientada a Objetos (POO)
* 🔢 `Integer` e `Double`
* 🔹 Enumeração (`enum`)
* 📋 `ArrayList`

---

## 🧠 Conceitos de POO Aplicados

### 🔒 Encapsulamento

Os atributos das classes são declarados como `private`, sendo acessados e modificados através de métodos `getters` e `setters`.

Também foram implementadas validações nos métodos `setCodigo()` e `setPreco()`.

### 🎯 Abstração

A classe `Produto` é definida como uma **classe abstrata**, contendo características comuns aos produtos e o método abstrato `exibirInformacoes()`.

### 🧬 Herança

A classe `Eletronico` herda características e comportamentos da classe abstrata `Produto`.

```java
public class Eletronico extends Produto
```

### 🔄 Polimorfismo

O método `exibirInformacoes()` é sobrescrito na classe `Eletronico`, permitindo que um objeto seja tratado através da referência de sua classe base.

### ✏️ Sobrescrita

O método:

```java
exibirInformacoes()
```

é sobrescrito na classe `Eletronico` para apresentar as informações específicas de um produto eletrônico.

### ➕ Sobrecarga

A classe `Eletronico` possui duas versões do método `exibirInformacoes()`:

```java
exibirInformacoes()
```

e

```java
exibirInformacoes(Boolean detalhado)
```

A segunda versão permite escolher entre uma exibição detalhada ou resumida.

---

## 📦 Estrutura do Projeto

O projeto utiliza o pacote:

```text
br.senai.poo.atividade
```

Estrutura principal:

```text
atividadePOO-SEUNOMECOMPLETO
└── src
    └── br
        └── senai
            └── poo
                └── atividade
                    ├── Produto.java
                    ├── Eletronico.java
                    ├── Loja.java
                    ├── Exemplo.java
                    └── CategoriaProdutoEnum.java
```

---

## 🏗️ Classes do Sistema

### 📦 Produto

Classe **abstrata** responsável por representar as características básicas de um produto.

Possui os atributos:

* `nome`
* `codigo` (`Integer`)
* `preco` (`Double`)

O código não pode ser `null` ou negativo, enquanto o preço deve ser maior que zero.

Também possui o método abstrato:

```java
exibirInformacoes()
```

---

### 💻 Eletronico

Classe responsável por representar os produtos eletrônicos.

Herda da classe `Produto` e possui:

* `categoria`
* `id`
* `proximoId`

O `id` é gerado automaticamente para cada novo eletrônico criado.

A classe também implementa a sobrescrita e a sobrecarga do método `exibirInformacoes()`.

---

### 🏪 Loja

Responsável pelo gerenciamento dos produtos eletrônicos cadastrados.

Principais métodos:

```java
adicionarProduto(Eletronico produto)
```

Adiciona um produto à lista da loja.

```java
listarProdutos()
```

Retorna todos os produtos cadastrados.

```java
buscarPorCategoria(CategoriaProdutoEnum categoria)
```

Busca produtos de uma determinada categoria.

```java
buscarPorNome(String nome)
```

Busca um produto pelo nome e informa quando o produto não é encontrado.

---

### 📋 CategoriaProdutoEnum

Enumeração utilizada para representar as categorias disponíveis:

```java
SMARTPHONE
NOTEBOOK
PERIFERICO
```

---

### ▶️ Exemplo

Classe que contém o método `main()` e demonstra o funcionamento do sistema.

São cadastrados **6 produtos eletrônicos**, sendo realizadas operações como:

* Cadastro de produtos;
* Listagem detalhada;
* Listagem resumida;
* Busca por categoria `SMARTPHONE`;
* Busca por categoria `NOTEBOOK`.

---

## 🧪 Exemplo de Funcionamento

### Informações detalhadas

```text
Eletrônico [1]: Galaxy S25 Código: 101 Preço: 4999.90 Categoria: SMARTPHONE
Eletrônico [2]: Dell Inspiron Código: 102 Preço: 3599.90 Categoria: NOTEBOOK
```

### Informações resumidas

```text
Galaxy S25
Dell Inspiron
```

### Busca por categoria

```text
--- SMARTPHONES ---
Galaxy S25
iPhone 17
Redmi Note
```

```text
--- NOTEBOOKS ---
Dell Inspiron
Lenovo IdeaPad
Acer Aspire
```

---

## 📌 Requisitos Atendidos

* [x] Classe abstrata `Produto`
* [x] Classe `Eletronico`
* [x] Classe `Loja`
* [x] Classe `Exemplo`
* [x] Enum `CategoriaProdutoEnum`
* [x] Encapsulamento
* [x] Abstração
* [x] Herança
* [x] Polimorfismo
* [x] Sobrecarga
* [x] Sobrescrita
* [x] Validação de código
* [x] Validação de preço
* [x] Geração automática de ID
* [x] Utilização de `Integer`
* [x] Utilização de `Double`
* [x] Cadastro de 6 produtos
* [x] Listagem detalhada e resumida
* [x] Busca por categoria

---

## 🎓 Atividade Acadêmica

**Tema:** Gerenciamento de Loja de Eletrônicos
**Disciplina:** Programação Orientada a Objetos
**Linguagem:** Java

Desenvolvido para aplicação prática dos conceitos fundamentais de **POO**.

---

## 👨‍💻 Autor

**Guilherme de Carvalho Santana**

Projeto desenvolvido como atividade acadêmica para prática e aprofundamento em **Java e Programação Orientada a Objetos**.

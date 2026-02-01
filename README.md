# Tax Payer System – Java OOP

## 📌 Descrição
Projeto desenvolvido em **Java** com o objetivo de praticar **Programação Orientada a Objetos**, utilizando
**classes abstratas, métodos abstratos, herança e polimorfismo**.

O sistema lê os dados de contribuintes (pessoa física ou jurídica), calcula o imposto devido de acordo com
regras específicas e exibe o valor pago por cada contribuinte, além do total arrecadado.

---

## 🧩 Funcionalidades
- Cadastro de contribuintes do tipo **Individual (Pessoa Física)**
- Cadastro de contribuintes do tipo **Company (Pessoa Jurídica)**
- Cálculo automático do imposto usando **polimorfismo**
- Impressão do imposto pago por cada contribuinte
- Cálculo e exibição do **total de impostos arrecadados**

---

## 🧠 Conceitos treinados
- Programação Orientada a Objetos (POO)
- **Classe abstrata**
- **Método abstrato**
- Herança (`extends`)
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Uso de `List` e `for-each`
- Leitura de dados com `Scanner`
- Organização de pacotes (`application` e `entities`)

---

## 📐 Regras de cálculo do imposto

### Pessoa Física (Individual)
- Renda anual **abaixo de 20.000** → 15% de imposto
- Renda anual **a partir de 20.000** → 25% de imposto
- Gastos com saúde têm **50% de abatimento** no imposto

**Exemplo:**  
Renda = 50.000  
Gastos com saúde = 2.000  
Imposto = (50.000 × 25%) − (2.000 × 50%) = **11.500**

---

### Pessoa Jurídica (Company)
- Até **10 funcionários** → 16% de imposto
- **Mais de 10 funcionários** → 14% de imposto

**Exemplo:**  
Renda = 400.000  
Funcionários = 25  
Imposto = 400.000 × 14% = **56.000**

---

## ▶️ Como executar
1. Clone o repositório
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse, etc.)
3. Execute a classe `Main`
4. Insira os dados solicitados no console

---

## 🖥️ Exemplgo de saída
TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 29500.00

TOTAL TAXES: $ 97000.00

g
---

## 🚀 Objetivo do projeto
Este projeto tem caráter **educacional** e foi desenvolvido para consolidar os conceitos fundamentais de
POO em Java, especialmente o uso correto de **abstração e polimorfismo** em regras de negócio.



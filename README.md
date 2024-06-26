# Programa para Administração de Árvores em Terrenos

## Objetivo

Este programa tem como objetivo auxiliar na administração de árvores plantadas em terrenos do usuário. Ele permite:

- **Cadastro de Terrenos:** Inserção de dados como nome, tamanho e quantidade de árvores plantadas.
- **Cadastro de Árvores:** Inserção de informações detalhadas sobre as árvores, incluindo nome, cuidados necessários, necessidade de poda, presença de frutos e porte (pequeno, médio ou grande).

Após os cadastros, o usuário pode filtrar as árvores de acordo com diversos critérios:

- Todas as árvores.
- Árvores de um terreno específico.
- Árvores que exigem poda.
- Árvores que possuem frutos.
- Árvores por porte (pequeno, médio ou grande).

Este programa é o desafio final de um módulo de JAVA do 1º semestre de Análise e Desenvolvimento de Sistemas do Senai Joinville-SC.

## Como Rodar?

Para executar o programa na sua máquina, siga as instruções abaixo:

1. **Pré-requisitos:** Certifique-se de que você tem o Java instalado no seu computador.

2. **Executar na IDE:** Abra o projeto na IDE de sua preferência e execute o programa.

3. **Executar via Docker:** Você também pode rodar o programa usando Docker. No terminal do WSL, execute o comando:
   ```bash
   docker compose up --build

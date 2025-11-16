# ⚽ API REST — Futebol

API REST desenvolvida em **Java 21 com Spring Boot**, com o objetivo de disponibilizar dados de jogadores de futebol.
Atualmente, a API contém dados da **Seleção Brasileira** e permite consultas (**GET**) para múltiplas entidades do domínio do futebol.

---

## 🚀 Tecnologias Utilizadas
- Java 21
- Spring Boot 3.5.7
- Spring Web
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

---

## 📌 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/jogadores` | Lista todos os jogadores cadastrados |
| GET | `/clube` | Lista todos os clubes cadastrados |
| GET | `/estatistica` | Lista todas as estatísticas de jogadores |
| GET | `/jogadoresclube` | Lista relações entre jogadores e seus clubes |

✔ Todos os endpoints retornam JSON com listas de dados.

---

## 🔍 Exemplos de Retornos

### 🔹 GET `/jogadores`
```json
[
  {
    "id": 1,
    "nome_completo": "Alisson Becker",
    "apelido": "Alisson",
    "data_nascimento": "1992-10-02T00:00:00",
    "nacionalidade": "Brasil",
    "altura": 1.93,
    "peso": 91.0,
    "posicao": "Goleiro",
    "foto_url": "https://example.com/fotos/alisson.jpg"
  },
  {
    "id": 2,
    "nome_completo": "Marquinhos Corrêa",
    "apelido": "Marquinhos",
    "data_nascimento": "1994-05-14T00:00:00",
    "nacionalidade": "Brasil",
    "altura": 1.83,
    "peso": 75.0,
    "posicao": "Zagueiro",
    "foto_url": "https://example.com/fotos/marquinhos.jpg"
  }
]
```

### 🔹 GET `/jogadoresclube`
```json
[
  {
    "id": 1,
    "jogador_id": 1,
    "clube_id": 9,
    "numero_camisa": 1
  },
  {
    "id": 2,
    "jogador_id": 2,
    "clube_id": 2,
    "numero_camisa": 3
  }
]
```

### 🔹 GET `/estatistica`
```json
[
  {
    "id": 1,
    "jogador_id": 1,
    "jogos": 120,
    "gols": 0,
    "assistencias": 0,
    "cartoes_amarelo": 3,
    "cartoes_vermelho": 0
  },
  {
    "id": 2,
    "jogador_id": 2,
    "jogos": 95,
    "gols": 8,
    "assistencias": 3,
    "cartoes_amarelo": 7,
    "cartoes_vermelho": 0
  }
]
```

### 🔹 GET `/clube`
```json
[
  {
    "id": 1,
    "nome": "Flamengo",
    "pais": "Brasil"
  },
  {
    "id": 2,
    "nome": "Palmeiras",
    "pais": "Brasil"
  }
]
```

---

## 📦 Como executar o projeto

### 🔧 Pré-requisitos
- Java 21 instalado
- Maven instalado
- PostgreSQL configurado

### ▶️ Rodando a aplicação
```bash
git clone https://github.com/DaviMachado16/PROJETO_API_FUTEBOL.git
cd PROJETO_API_FUTEBOL
mvn spring-boot:run
```

A API estará disponível em:
```
http://localhost:8080
```

---

## 🗂 Estrutura do projeto
```
src
 └── main
      ├── java
      │    └── com.api.futebol
      │          ├── controller
      │          ├── model
      │          ├── repository
      │          └── service (caso exista)
      └── resources
```

---

## 📌 Status do Projeto
⏳ Em desenvolvimento — no momento apenas métodos GET estão disponíveis.

---

## 🛠 Melhorias Futuras
- Implementar POST, PUT e DELETE
- Persistência completa com PostgreSQL
- Relacionamentos expandidos entre entidades
- Validações e tratamento de erros
- Autenticação JWT
- Documentação com Swagger

---

## 📜 Licença
Projeto sob licença **MIT**

---

## ✨ Autor
> Desenvolvido por **Davi Machado**

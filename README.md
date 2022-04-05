# resuolve-backend

## Descrição
API Rest em Java Spring Boot desenvolvida para a Fatec São José dos Campos

## Configurações ambiente local
Editar o arquivo `src/main/resources/application.properties`.

````
spring.jpa.hibernate.ddl-auto=validate

spring.datasource.url=jdbc:postgresql://localhost:5432/dbname
spring.datasource.username=postgres
spring.datasource.password=password
````

A propriedade `spring.jpa.hibernate.ddl-auto=validate` significa que o Spring vai validar se as colunas configuradas na entidade existem no banco de dados. Para fazer com que o próprio Spring Boot crie as tabelas e suas colunas, é preciso alterar para `spring.jpa.hibernate.ddl-auto=update`

## Rotas
`/resuolve/usuario`


### POST
* `/cadastrar` - Payload esperado:

```json
{
    "nome": "Nome",
    "email": "email@gmail.com",
    "telefone": "3524568254",
    "senha": "1234"
}

```

### GET
* `/listar` - Payload de retorno:

```json
{
    "id": 1,
    "nome": "Nome",
    "email": "email@gmail.com",
    "telefone": "3524568254"
},
{
    "id": 2,
    "nome": "Nome 2",
    "email": "email2@gmail.com",
    "telefone": "1135789054"
}
```


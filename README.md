# Camada do Cliente

## Obter todos os clientes cadastrados no banco

GET /clientes
```json
[   
    {
        "cod_cliente": int,
        "nome": String,
        "cpf": String,
        "sexo": String,
        "endereco": String,
        "telefone_fixo": String,
        "telefone_celular": String
    }
]

```
## Inserir cliente no banco
POST /clientes
```json 
    {
        "nome": String, //requerido
        "cpf": String, //requerido
        "sexo": String, 
        "endereco": String,
        "telefone_fixo": String,
        "telefone_celular": String
    }
```
## Atualizar cliente no banco
PUT /clientes
Passar o id no link da requisição: localhost:8080/clientes?id=2
```json

    {
        "nome": String, 
        "cpf": String, 
        "sexo": String, 
        "endereco": String,
        "telefone_fixo": String,
        "telefone_celular": String
    }
```

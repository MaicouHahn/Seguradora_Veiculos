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
GET /clientes/{id} 
```json
    {
        "cod_cliente": int,
        "nome": String,
        "cpf": String,
        "sexo": String,
        "endereco": String,
        "telefone_fixo": String,
        "telefone_celular": String
    }
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
PUT /clientes/{id}
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

## Deletar Cliente do banco
DELETE /clientes/{id}

# Camada dos Carros

## Obter cadastros dos carros adicionados no banco
GET /carros
```json
[
    {
        "id": Integer,
        "placa": String,
        "modelo": String,
        "chassi": String,
        "marca": String,
        "ano": Integer,
        "cor": String
    }
]
```

## Obter cadastros dos carros adicionados no banco por ID
GET /carros/{id}
```json
    {
        "id": Integer,
        "placa": String,
        "modelo": String,
        "chassi": String,
        "marca": String,
        "ano": Integer,
        "cor": String
    }
```
## Adicionar o cadastro de um carro no banco
POST /carros
```json
    {
        "placa": String, //requerido
        "modelo": String,
        "chassi": String, //requerido
        "marca": String,
        "ano": Integer,
        "cor": String
    }
```

## Modificar o cadastro de um carro no banco
PUT /carros
```json
    {
        "placa": String, //requerido
        "modelo": String,
        "chassi": String, //requerido
        "marca": String,
        "ano": Integer,
        "cor": String
    }
```

## Deletar um cadastro de carro por ID 
DELETE /carros/{id}

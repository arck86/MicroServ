
<h3 align="center">Documento Proyecto Micro Servicios </h3>

<h3 align="left">Iniciar BBDD usuarios con docker</h3>

```bash
docker run --name postgres -e POSTGRES_PASSWORD=sasa -e POSTGRES_DB=db_ms_usuarios -p 5432:5432 -d postgres
```

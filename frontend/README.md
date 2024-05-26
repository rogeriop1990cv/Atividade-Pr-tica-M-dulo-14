### Implementação de Métodos de Consulta

#### ProjetoRepository, ProjetoService e ProjetoController

##### ProjetoRepository.java

```java
Optional<Projeto> findByProjetoNome(String projetoNome);
```

##### ProjetoService.java

```java
public Projeto getByNome(String nome) {
    return projetoRepository.findByProjetoNome(nome).orElse(null);
}
```

##### ProjetoController.java

```java
@GetMapping("/nome/{nome}")
public ResponseEntity<Projeto> getByNome(@PathVariable String nome) {
    Projeto projeto = projetoService.getByNome(nome);
    if (projeto != null) {
        return new ResponseEntity<>(projeto, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
```

#### RecursoRepository, RecursoService e RecursoController

##### RecursoRepository.java

```java
Optional<Recurso> findByRecursoFuncao(String recursoFuncao);
```

##### RecursoService.java

```java
public Recurso findByRecursoNome(String id) {
    return recursoRepository.findByRecursoNome(id).orElse(null);
}

public Recurso findByRecursoFuncao(String id) {
    return recursoRepository.findByRecursoFuncao(id).orElse(null);
}
```

##### RecursoController.java

```java
@GetMapping("/nome/{nome}")
public ResponseEntity<Recurso> findByRecursoNome(@PathVariable String nome) {
    Recurso recurso = recursoService.findByRecursoNome(nome);
    if (recurso != null) {
        return new ResponseEntity<>(recurso, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}

@GetMapping("/funcao/{funcao}")
public ResponseEntity<Recurso> findByRecursoFuncao(@PathVariable String funcao) {
    Recurso recurso = recursoService.findByRecursoFuncao(funcao);
    if (recurso != null) {
        return new ResponseEntity<>(recurso, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
```

#### StatusTarefaRepository, StatusTarefaService e StatusTarefaController

##### StatusTarefaRepository.java

```java
Optional<StatusTarefa> findByStatusDescricao(String statusDescricao);
```

##### StatusTarefaService.java

```java
public StatusTarefa findByStatusDescricao(String statusDescricao) {
    return statusTarefaRepository.findByStatusDescricao(statusDescricao).orElse(null);
}
```

##### StatusTarefaController.java

```java
@GetMapping("/descricao/{statusDescricao}")
public ResponseEntity<StatusTarefa> findByStatusDescricao(@PathVariable String statusDescricao) {
    StatusTarefa statusTarefa = statusTarefaService.findByStatusDescricao(statusDescricao);
    if (statusTarefa != null) {
        return new ResponseEntity<>(statusTarefa, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
```

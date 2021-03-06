package br.newtonpaiva.lab.tcc.api.cursos.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.newtonpaiva.lab.tcc.api.cursos.request.CursoRequest;
import br.newtonpaiva.lab.tcc.api.cursos.response.CursoResponse;

@RequestMapping(path = "/v1/cursos")
public interface CursosResource {

	// GET listagem
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CursoResponse>> getAll();
	
	// GET by ID
    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<CursoResponse> getById(@PathVariable Optional<String> id);

	// POST criar
    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<CursoResponse> create(
    		@Valid @RequestBody Optional<CursoRequest> request);
	
	// PUT atualizar
    @PutMapping(path = "/{id}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<CursoResponse> update(
    		@PathVariable Optional<String> id, 
    		@RequestBody Optional<CursoRequest> request
    		);
	
	// DELETE excluir
    @DeleteMapping(path = "/{id}")    
    public ResponseEntity<Void> deleteById(@PathVariable Optional<String> id);

}

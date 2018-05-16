package com.hatetags.Hatetags.resource;

import com.hatetags.Hatetags.models.Usuario;
import com.hatetags.Hatetags.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<?> findAll(){

        List<Usuario> usuarios = usuarioRepository.findAll();
        return new ResponseEntity<>(usuarios,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id){

        Usuario usuario = usuarioRepository.getOne(id);
        if(usuario == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Usuario usuario){

        if (usuario.getId() != 0){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        usuario = usuarioRepository.save(usuario);

        return new ResponseEntity<>(usuario,HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){

        try {
            usuarioRepository.deleteById(id);

        }catch (EmptyResultDataAccessException ex){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

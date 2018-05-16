package com.hatetags.Hatetags.repository;

import com.hatetags.Hatetags.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

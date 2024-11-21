package pe.edu.vallegrande.inteligencia.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import pe.edu.vallegrande.inteligencia.model.ChatResponseModel;

public interface ChatInteractionRepository extends R2dbcRepository<ChatResponseModel, Long> {
}

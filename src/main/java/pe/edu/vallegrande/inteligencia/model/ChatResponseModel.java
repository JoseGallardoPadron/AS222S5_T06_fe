package pe.edu.vallegrande.inteligencia.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id; // Importa la anotación Id de Spring Data
import org.springframework.data.relational.core.mapping.Table; // Importa la anotación Table de Spring Data
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("chat_response_model") // Cambia la anotación para R2DBC
public class ChatResponseModel {
    @Id // Usa la anotación de Spring Data para la identificación
    private Long id;

    private String query; // Mantiene los atributos simples

    private String response;

    private LocalDateTime createdAt; // Añade un constructor si es necesario

}

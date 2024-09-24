package infnet.edu.petfriends_transporte_service.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
    private Long pedidoId;
    private Long clienteId;
    private Long produtoId;
    private String enderecoEntrega;
}


USE ProcessoSeletivo;


SELECT cl.NomeCliente, p.PedidoID, p.DataPedido
FROM Clientes cl
JOIN Pedidos p ON cl.ClienteID = p.ClienteID
ORDER BY p.DataPedido  DESC;




USE ProcessoSeletivo;


SELECT Clientes.NomeCliente, Pedidos.PedidoID, PedidoS.DataPedido
FROM Clientes
JOIN Pedidos ON Clientes.ClienteID = Pedidos.ClienteID
ORDER BY Pedidos.DataPedido  DESC;



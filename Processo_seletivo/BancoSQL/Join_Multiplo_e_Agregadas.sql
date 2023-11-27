
USE ProcessoSeletivo;

SELECT
    Clientes.NomeCliente,
    Pedidos.PedidoID,
    COUNT(*) AS QuantidadeTotal
FROM
    Clientes
    JOIN Pedidos ON Clientes.ClienteID = Pedidos.ClienteID
    JOIN Produtos ON Pedidos.ProdutoID = Produtos.ProdutoID
GROUP BY
    Clientes.NomeCliente, Pedidos.PedidoID

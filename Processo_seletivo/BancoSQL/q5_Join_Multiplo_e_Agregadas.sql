USE ProcessoSeletivo;

SELECT
    cl.NomeCliente AS NOME_CLIENTE,
    pd.PedidoID AS ID_PEDIDO,
    COUNT(*) AS Total
FROM
    Clientes cl
    JOIN Pedidos pd ON cl.ClienteID = pd.ClienteID
    JOIN Produtos pdt ON pd.ProdutoID = pdt.ProdutoID
GROUP BY
    cl.NomeCliente, 
    pd.PedidoID;

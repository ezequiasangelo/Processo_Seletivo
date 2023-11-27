
USE ProcessoSeletivo;

SELECT Categoria.NomeCategoria, COUNT(Produtos.ProdutoID) AS NumeroDeProdutos
FROM Categoria
LEFT JOIN Produtos ON Categoria.CategoriaID = Produtos.CategoriaID
GROUP BY Categoria.NomeCategoria;

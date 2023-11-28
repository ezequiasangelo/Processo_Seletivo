
USE ProcessoSeletivo;

SELECT ct.NomeCategoria, COUNT(Pd.ProdutoID) AS num_Produto
FROM Categoria ct
LEFT JOIN Produtos pd ON ct.CategoriaID = pd.CategoriaID
GROUP BY ct.NomeCategoria;


USE ProcessoSeletivo;

SELECT fc.NomeFuncionario, Cargo, Salario
FROM Funcionario fc
WHERE Salario > 50000;
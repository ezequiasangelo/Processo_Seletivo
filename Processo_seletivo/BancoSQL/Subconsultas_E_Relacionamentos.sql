
USE ProcessoSeletivo;

SELECT Aluno.NomeAluno, AVG(Nota.Nota) / 2 AS MediaTotal
FROM Aluno
LEFT JOIN Nota ON Aluno.AlunoID = Nota.AlunoID
GROUP BY Aluno.AlunoID, Aluno.NomeAluno;


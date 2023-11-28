USE ProcessoSeletivo;

SELECT al.NomeAluno, AVG(n.Nota) / 2 AS Media
FROM Aluno al
LEFT JOIN Nota n ON al.AlunoID = n.AlunoID
GROUP BY al.AlunoID, al.NomeAluno;

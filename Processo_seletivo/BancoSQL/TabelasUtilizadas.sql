create database ProcessoSeletivo;

use ProcessoSeletivo;


create table Clientes(
ClienteID int not null auto_increment,
NomeCliente varchar(50) not null,
Email varchar(40),
primary key(ClienteID)
);

create table Pedidos(
PedidoID int primary key auto_increment,
ClienteID int not null,
ProdutoID int not null,
DataPedido DATE not null,
FOREIGN KEY (ClienteID) REFERENCES Clientes(ClienteID),
FOREIGN KEY (ProdutoID) REFERENCES Produtos(ProdutoID)
);

create table Produtos(
ProdutoID int primary key auto_increment,
NomeProduto varchar (50) not null,
CategoriaID int (50) not null,
FOREIGN KEY (CategoriaID) REFERENCES Categoria(CategoriaID)
);

create table Categoria(
CategoriaID int primary key auto_increment,
NomeCadegoria varchar (50) not null
);

create table Funcionario(
FuncionarioID int primary key auto_increment,
NomeFuncionario varchar(70) not null,
Cargo VARCHAR(55) not null,
Salario double not null default '0'
);

create table Aluno(
AlunoID int primary key auto_increment,
NomeAluno varchar (100) not null
);

create table Nota(
AlunoID int primary key auto_increment,
Disciplina varchar(75) not null,
Nota decimal(5, 2) not null,
FOREIGN KEY (AlunoID) REFERENCES Aluno(AlunoID)
);

INSERT INTO Clientes (NomeCliente, Email) VALUES
('João ', 'joao.silva@.com'),
('Maria ', 'maa@.com'),
('ezequias ', 'caezequias@gmail.com');

SELECT * FROM Clientes;


INSERT INTO Pedidos (PedidoID, ClienteID, ProdutoID, DataPedido) VALUES 
('1', '14',	'1','0000-00-00'),
('3', '13', '3', '2016-11-16');


SELECT * FROM Pedidos;

INSERT INTO Produtos (NomeProduto, CategoriaID) VALUES
('Celular', 1),
('Camiseta', 2),
('Cereal', 3);

SELECT * FROM Produtos;


INSERT INTO Categoria (Nomecategoria) VALUES
('Jogos'),
('Roupas'),
('Alimentos');

SELECT * FROM Categoria;



INSERT INTO Funcionario (NomeFuncionario, Cargo, Salario) VALUES
('Marcos Paulo', 'Vendedor', 1200.00),
('Cesar', 'Desenvolvedor', 6000.00),
('Ezequiel', 'Gerente', 8000.00);

SELECT * FROM Funcionario;




INSERT INTO Aluno (NomeAluno) VALUES
('Ricarno M'),
('Larissa Andr'),
('Vandete Ang');

SELECT * FROM Aluno;



INSERT INTO Nota (AlunoID, Disciplina, Nota) VALUES
(1, 'Matemática', 8.5),
(2, 'Português', 7.0),
(3, 'História', 9.0);

SELECT * FROM Nota;
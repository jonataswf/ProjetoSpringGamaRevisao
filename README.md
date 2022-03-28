# Gama Academy – Projeto Itaú

##Criar uma API para consulta de Correntistas x Fluxo de Caixa

Desenvolver uma API, em Java que irá mostrar as informações do correntista e o fluxo de caixa
vinculado a cada correntista.
No banco de dados utilizaremos o contexto do InnerJoin entre as tabelas

Segue abaixo a estrutura das tabelas.

#### Tabela de Correntista  

create table correntista( <br/>
ag int not null, <br>
conta int not null, <br>
nome varchar(50) not null, <br>
email varchar(80) not null, <br>
telefone char(11) not null, <br>
saldo decimal(8,2) not null, <br>
primary key (ag,conta)); <br>


#### Tabela de Fluxo_Caixa

create table fluxo_caixa( <br>
ag int not null, <br>
conta int not null, <br>
fluxo int not null, <br>
entrada decimal(8,2) not null, <br>
saida decimal(8,2) not null, <br>
primary key(ag,conta,fluxo));

## TODO
* Falta fazer o relacionamento entre as duas tabelas, (manytoone/onetomany) 
* Falta criar os metodos atualizar e deletar, trata-se de chaves primarias<br> 
compostas, foi utilizado no codigo duas anotações @Embeddable e @EmbeddedId <br>
em duas classes para identificar o id, precisa ver como pegar os ids do objeto nos<br>
metodos findbyid e deletebyid do jpa

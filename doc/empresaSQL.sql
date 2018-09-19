create database empresa;
use empresa;

create table clientes(
idCliente int primary key auto_increment not null,
nombre varchar(20) not null,
saldoCuenta int not null,
edad int not null
);

create table direccionesEnvio(
idDireccion int primary key auto_increment not null,
calle varchar(20) not null,
ciudad varchar(20) not null,
idCliente int not null,
foreign key (idCliente) references clientes(idCliente)
);

create table articulos(
idArticulo int primary key auto_increment not null,
nombre varchar(20) not null,
precio float not null
);

create table fabricas(
idFabrica int primary key auto_increment not null,
nombre varchar(20) not null,
telefono varchar(20) not null
);

create table articuloFabricado(
idArticuloFabricado int primary key auto_increment not null,
idArticulo int not null,
idFabrica int not null,
foreign key (idArticulo) references articulos(idArticulo),
foreign key (idFabrica) references fabricas(idFabrica)
);

create table pedidos(
idPedido int primary key auto_increment not null,
idCliente int not null,
idDireccion int not null,
fecha date not null,
foreign key (idDireccion) references direccion(idDireccion),
foreign key (idCliente) references clientes(idCliente)
);

create table cuerpos(
idCuerpo int primary key auto_increment not null,
idArticulo int not null,
cantidad int not null,
foreign key (idArticulo) references articulos(idArticulo)
);


create trigger nuevoCliente before insert on clientes
for each row
insert into nuevosClientes(idClinte,nombre,fecha)
values (idCliente.new,nombre.new,now());


create trigger pedidoCancelado before delete on pedidos
for each row
insert into pedidosCancelados(idPedido,fecha)
values (idPedido.old,now());

create trigger cambioFabricante before update on articuloFabricado
for each row
insert into cambiosFabricantes(nombreArticulo,nuevaFabrica,viejaFabrica)
values (,)


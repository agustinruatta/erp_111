create database erp_111;
use erp_111;

create table producto(
codigo_producto int primary key not null auto_increment,
nombre varchar(45) not null,
tipo varchar(45) not null,
unidad varchar(45) not null,
costo double not null,
ganancia double not null,
stock_actual double not null,
stock_minimo double not null,
detalle varchar(200)
);

create table proveedor(
codigo_proveedor int primary key not null auto_increment,
nombre varchar(45) not null,
apellido varchar(45) not null,
cuit varchar(20) not null,
telefono varchar(45) not null,
email varchar(45) not null,
direccion varchar(45) not null,
localidad varchar(45) not null,
provincia varchar(45) not null,
estado varchar(15)
);

create table cliente(
codigo_cliente int primary key not null auto_increment,
nombre varchar(45) not null,
apellido varchar(45) not null,
telefono varchar(45) not null,
direccion varchar(45) not null,
localidad varchar(45) not null,
cuil varchar(20) not null
);

create table venta(
codigo_venta int primary key not null auto_increment,
monto double not null,
fecha date not null,
cliente int not null,
descuento double not null,
foreign key (cliente) references cliente(codigo_cliente)
);

create table detalle_venta(
codigo_detalle_venta int primary key not null auto_increment,
venta int not null,
producto int not null,
cantidad double not null,
precio_unitario double not null,
precio double not null,
importe double not null,
foreign key (producto) references producto(codigo_producto),
foreign key (venta) references venta(codigo_venta)
);

create table compra(
codigo_compra int primary key not null auto_increment,
producto int not null,
monto_total double not null,
proveedor int not null,
fecha date not null,
foreign key (producto) references producto(codigo_producto),
foreign key (proveedor) references proveedor(codigo_proveedor)
);

create table detalle_compra(
codigo_detalle_compra int primary key not null auto_increment,
compra int not null,
producto int not null,
cantidad double not null,
precio_unitario double not null,
foreign key (compra) references compra(codigo_compra),
foreign key (producto) references producto(codigo_producto) 
);





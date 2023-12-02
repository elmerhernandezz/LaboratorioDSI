-- Base de Datos Panaderia
-- DML
use Panaderia;
go
-- DIRECCIONES
-- Departamentos
insert into Departamentos values
--	ID_Departamento, Departamento, Pais 
	('AH', 'Ahuachap�n', 'El Salvador'),
	('CA', 'Caba�as', 'El Salvador'),
	('CH', 'Chalatenango', 'El Salvador'),
	('CU', 'Cuscatl�n', 'El Salvador'),
	('LL', 'La Libertad', 'El Salvador'),
	('LP', 'La Paz', 'El Salvador'),
	('LU', 'La Uni�n', 'El Salvador'),
	('MO', 'Moraz�n', 'El Salvador'),
	('SA', 'Santa Ana', 'El Salvador'),
	('SM', 'San Miguel', 'El Salvador'),
	('SS', 'San Salvador', 'El Salvador'),
	('SV', 'San Vicente', 'El Salvador'),
	('SO', 'Sonsonate', 'El Salvador'),
	('US', 'Usulut�n', 'El Salvador');
go
select * from Departamentos;

go
-- Municipios
insert into Municipios values
--	ID_Municipio, Municipio, ID_Departamento
	('AHN', 'Ahuachap�n Norte', 'AH'),
	('AHC', 'Ahuachap�n Centro', 'AH'),
	('AHS', 'Ahuachap�n Sur', 'AH'),
	('CAE', 'Caba�as Este', 'CA'),
	('CAO', 'Caba�as Oeste', 'CA'),
	('CHN', 'Chalatenango Norte', 'CH'),
	('CHC', 'Chalatenango Centro', 'CH'),
	('CHS', 'Chalatenango Sur', 'CH'),
	('CUN', 'Cuscatl�n Norte', 'CU'),
	('CUS', 'Cuscatl�n Sur', 'CU'),
	('LLN', 'La Libertad Norte', 'LL'),
	('LLC', 'La Libertad Centro', 'LL'),
	('LLO', 'La Libertad Oeste', 'LL'),
	('LLE', 'La Libertad Este', 'LL'),
	('LLS', 'La Libertad Sur', 'LL'),
	('LLT', 'La Libertad Costa', 'LL'),
	('LPO', 'La Paz Oeste', 'LP'),
	('LPC', 'La Paz Centro', 'LP'),
	('LPE', 'La Paz Este', 'LP'),
	('LUN', 'La Uni�n Norte', 'LU'),
	('LUS', 'La Uni�n Sur', 'LU'),
	('MON', 'Moraz�n Norte', 'MO'),
	('MOS', 'Moraz�n Sur', 'MO'),
	('SAN', 'Santa Ana Norte', 'SA'),
	('SAC', 'Santa Ana Centro', 'SA'),
	('SAE', 'Santa Ana Este', 'SA'),
	('SAO', 'Santa Ana Oeste', 'SA'),
	('SMN', 'San Miguel Norte', 'SM'),
	('SMC', 'San Miguel Centro', 'SM'),
	('SMO', 'San Miguel Oeste', 'SM'),
	('SSN', 'San Salvador Norte', 'SS'),
	('SSO', 'San Salvador Oeste', 'SS'),
	('SSE', 'San Salvador Este', 'SS'),
	('SSC', 'San Salvador Centro', 'SS'),
	('SSS', 'San Salvador Sur', 'SS'),
	('SVN', 'San Vicente Norte', 'SV'),
	('SVS', 'San Vicente Sur', 'SV'),
	('SON', 'Sonsonate Norte', 'SO'),
	('SOC', 'Sonsonate Centro', 'SO'),
	('SOE', 'Sonsonate Este', 'SO'),
	('SOO', 'Sonsonate Oeste', 'SO'),
	('USN', 'Usulut�n Norte', 'US'),
	('USE', 'Usulut�n Este', 'US'),
	('USO', 'Usulut�n Oeste', 'US');
go
select * from Municipios;

go
-- Distritos
insert into Distritos values
-- ID_Distrito, Distrito, ID_Municipio
-- Ahuachapan
	('AHN01', 'Atiquizaya', 'AHN'),
	('AHN02', 'El Refugio', 'AHN'),
	('AHN03', 'San Lorenzo', 'AHN'),
	('AHN04', 'Tur�n', 'AHN'),
	('AHC01', 'Ahuachap�n', 'AHC'),
	('AHC02', 'Apaneca', 'AHC'),
	('AHC03', 'Concepci�n de Ataco', 'AHC'),
	('AHC04', 'Tacuba', 'AHC'),
	('AHS01', 'Guaymango', 'AHS'),
	('AHS02', 'Jujutla', 'AHS'),
	('AHS03', 'San Francisco Men�ndez', 'AHS'),
	('AHS04', 'San Pedro Puxtla', 'AHS'),
-- Caba�as
	('CAE01', 'Sensuntepeque', 'CAE'),
	('CAE02', 'Victoria', 'CAE'),
	('CAE03', 'Dolores', 'CAE'),
	('CAE04', 'Guacotecti', 'CAE'),
	('CAE05', 'San Isidro', 'CAE'),
	('CAO01', 'Ilobasco', 'CAO'),
	('CAO02', 'Tejutepeque', 'CAO'),
	('CAO03', 'Jutiapa', 'CAO'),
	('CAO04', 'Cinquera', 'CAO'),
-- Chalatenango
	('CHN01', 'La Palma', 'CHN'),
	('CHN02', 'Cital�', 'CHN'),
	('CHN03', 'San Ignacio', 'CHN'),
	('CHC01', 'Nueva Concepci�n', 'CHC'),
	('CHC02', 'Tejutla', 'CHC'),
	('CHC03', 'La Reina', 'CHC'),
	('CHC04', 'Agua Caliente', 'CHC'),
	('CHC05', 'Dulce Nombre de Mar�a', 'CHC'),
	('CHC06', 'El Para�so', 'CHC'),
	('CHC07', 'San Fernando', 'CHC'),
	('CHC08', 'San Francisco Moraz�n', 'CHC'),
	('CHC09', 'San Rafael', 'CHC'),
	('CHC10', 'Santa Rita', 'CHC'),
	('CHS01', 'Chalatenango', 'CHS'),
	('CHS02', 'Arcatao', 'CHS'),
	('CHS03', 'Azacualpa', 'CHS'),
	('CHS04', 'Comalapa', 'CHS'),
	('CHS05', 'Concepci�n Quezaltepeque', 'CHS'),
	('CHS06', 'El Carrizal', 'CHS'),
	('CHS07', 'La Laguna', 'CHS'),
	('CHS08', 'Las Vueltas', 'CHS'),
	('CHS09', 'Nombre de Jes�s', 'CHS'),
	('CHS10', 'Nueva Trinidad', 'CHS'),
	('CHS11', 'Ojos de Agua', 'CHS'),
	('CHS12', 'Potonico', 'CHS'),
	('CHS13', 'San Antonio de La Cruz', 'CHS'),
	('CHS14', 'San Antonio Los Ranchos', 'CHS'),
	('CHS15', 'San Francisco Lempa', 'CHS'),
	('CHS16', 'San Isidro Labrador', 'CHS'),
	('CHS17', 'San Jos� Cancasque', 'CHS'),
	('CHS18', 'San Miguel de Mercedes', 'CHS'),
	('CHS19', 'San Jos� Las Flores', 'CHS'),
	('CHS20', 'San Luis del Carmen', 'CHS'),
-- Cuscatl�n
	('CUN01', 'Suchitoto', 'CUN'),
	('CUN02', 'San Jos� Guayabal', 'CUN'),
	('CUN03', 'Oratorio de Concepci�n', 'CUN'),
	('CUN04', 'San Bartolom� Perulap�a', 'CUN'),
	('CUN05', 'San Pedro Perulap�n', 'CUN'),
	('CUS01', 'Cojutepeque', 'CUS'),
	('CUS02', 'San Rafael Cedros', 'CUS'),
	('CUS03', 'Candelaria', 'CUS'),
	('CUS04', 'Monte San Juan', 'CUS'),
	('CUS05', 'El Carmen', 'CUS'),
	('CUS06', 'San Cristobal', 'CUS'),
	('CUS07', 'Santa Cruz Michapa', 'CUS'),
	('CUS08', 'San Ram�n', 'CUS'),
	('CUS09', 'El Rosario', 'CUS'),
	('CUS10', 'Santa Cruz Analquito', 'CUS'),
	('CUS11', 'Tenancingo', 'CUS'),
-- La Libertad
	('LLN01', 'Quezaltepeque', 'LLN'),
	('LLN02', 'San Mat�as', 'LLN'),
	('LLN03', 'San Pablo Tacachico', 'LLN'),
	('LLC01', 'San Juan Opico', 'LLC'),
	('LLC02', 'Ciudad Arce', 'LLC'),
	('LLO01', 'Col�n', 'LLO'),
	('LLO02', 'Jayaque', 'LLO'),
	('LLO03', 'Sacacoyo', 'LLO'),
	('LLO04', 'Tepecoyo', 'LLO'),
	('LLO05', 'Talnique', 'LLO'),
	('LLE01', 'Antiguo Cuscatl�n', 'LLE'),
	('LLE02', 'Huiz�car', 'LLE'),
	('LLE03', 'Nuevo Cuscatl�n', 'LLE'),
	('LLE04', 'San Jos� Villanueva', 'LLE'),
	('LLE05', 'Zaragoza', 'LLE'),
	('LLS01', 'Comasagua', 'LLS'),
	('LLS02', 'Santa Tecla', 'LLS'),
	('LLT01', 'Chiltiup�n', 'LLT'),
	('LLT02', 'Jicalapa', 'LLT'),
	('LLT03', 'La Libertad', 'LLT'),
	('LLT04', 'Tamanique', 'LLT'),
	('LLT05', 'Teotepeque', 'LLT'),
-- La Paz
	('LPO01', 'Cuyultitan', 'LPO'),
	('LPO02', 'Olocuilta', 'LPO'),
	('LPO03', 'San Juan Talpa', 'LPO'),
	('LPO04', 'San Luis Talpa', 'LPO'),
	('LPO05', 'San Pedro Masahuat', 'LPO'),
	('LPO06', 'Tapalhuaca', 'LPO'),
	('LPO07', 'San Francisco Chinameca', 'LPO'),
	('LPC01', 'El Rosario', 'LPC'),
	('LPC02', 'Jerusal�n', 'LPC'),
	('LPC03', 'Mercedes La Ceiba', 'LPC'),
	('LPC04', 'Para�so de Osorio', 'LPC'),
	('LPC05', 'San Antonio Masahuat', 'LPC'),
	('LPC06', 'San Emigdio', 'LPC'),
	('LPC07', 'San Juan Tepezontes', 'LPC'),
	('LPC08', 'San Lu�s La Herradura', 'LPC'),
	('LPC09', 'San Miguel Tepezontes', 'LPC'),
	('LPC10', 'San Pedro Nonualco', 'LPC'),
	('LPC11', 'Santa Mar�a Ostuma', 'LPC'),
	('LPC12', 'Santiago Nonualco', 'LPC'),
	('LPE01', 'San Juan Nonualco', 'LPE'),
	('LPE02', 'San Rafael Obrajuelo', 'LPE'),
	('LPE03', 'Zacatecoluca', 'LPE'),
-- La Uni�n
	('LUN01', 'Anamor�s', 'LUN'),
	('LUN02', 'Bolivar', 'LUN'),
	('LUN03', 'Concepci�n de Oriente', 'LUN'),
	('LUN04', 'El Sauce', 'LUN'),
	('LUN05', 'Lislique', 'LUN'),
	('LUN06', 'Nueva Esparta', 'LUN'),
	('LUN07', 'Pasaquina', 'LUN'),
	('LUN08', 'Polor�s', 'LUN'),
	('LUN09', 'San Jos� La Fuente', 'LUN'),
	('LUN10', 'Santa Rosa de Lima', 'LUN'),
	('LUS01', 'Conchagua', 'LUS'),
	('LUS02', 'El Carmen', 'LUS'),
	('LUS03', 'Intipuc�', 'LUS'),
	('LUS04', 'La Uni�n', 'LUS'),
	('LUS05', 'Meanguera del Golfo', 'LUS'),
	('LUS06', 'San Alejo', 'LUS'),
	('LUS07', 'Yayantique', 'LUS'),
	('LUS08', 'Yucuaiqu�n', 'LUS'),
-- Moraz�n
	('MON01', 'Arambala', 'MON'),
	('MON02', 'Cacaopera', 'MON'),
	('MON03', 'Corinto', 'MON'),
	('MON04', 'El Rosario', 'MON'),
	('MON05', 'Joateca', 'MON'),
	('MON06', 'Jocoaitique', 'MON'),
	('MON07', 'Meanguera', 'MON'),
	('MON08', 'Perqu�n', 'MON'),
	('MON09', 'San Fernando', 'MON'),
	('MON10', 'San Isidro', 'MON'),
	('MON11', 'Torola', 'MON'),
	('MOS01', 'Chilanga', 'MOS'),
	('MOS02', 'Delicias de Concepci�n', 'MOS'),
	('MOS03', 'El Divisadero', 'MOS'),
	('MOS04', 'Gualococti', 'MOS'),
	('MOS05', 'Guatajiagua', 'MOS'),
	('MOS06', 'Jocoro', 'MOS'),
	('MOS07', 'Lolotiquillo', 'MOS'),
	('MOS08', 'Osicala', 'MOS'),
	('MOS09', 'San Carlos', 'MOS'),
	('MOS10', 'San Francisco Gotera', 'MOS'),
	('MOS11', 'San Sim�n', 'MOS'),
	('MOS12', 'Sensembra', 'MOS'),
	('MOS13', 'Sociedad', 'MOS'),
	('MOS14', 'Yamabal', 'MOS'),
	('MOS15', 'Yoloaiqu�n', 'MOS'),
-- Santa Ana
	('SAN01', 'Masahuat', 'SAN'),
	('SAN02', 'Metap�n', 'SAN'),
	('SAN03', 'Santa Rosa Guachipil�n', 'SAN'),
	('SAN04', 'Texistepeque', 'SAN'),
	('SAC01', 'Santa Ana', 'SAC'),
	('SAE01', 'Coatepeque', 'SAE'),
	('SAE02', 'El Congo', 'SAE'),
	('SAO01', 'Candelaria de la Frontera', 'SAO'),
	('SAO02', 'Chalchuapa', 'SAO'),
	('SAO03', 'El Porvenir', 'SAO'),
	('SAO04', 'San Antonio Pajonal', 'SAO'),
	('SAO05', 'San Sebasti�n Salitrillo', 'SAO'),
	('SAO06', 'Santiago de La Frontera', 'SAO'),
-- San Miguel
	('SMN01', 'Ciudad Barrios', 'SMN'),
	('SMN02', 'Sesori', 'SMN'),
	('SMN03', 'Nuevo Ed�n de San Juan', 'SMN'),
	('SMN04', 'San Gerardo', 'SMN'),
	('SMN05', 'San Luis de La Reina', 'SMN'),
	('SMN06', 'Carolina', 'SMN'),
	('SMN07', 'San Antonio del Mosco', 'SMN'),
	('SMN08', 'Chapeltique', 'SMN'),
	('SMC01', 'San Miguel', 'SMC'),
	('SMC02', 'Comacar�n', 'SMC'),
	('SMC03', 'Uluazapa', 'SMC'),
	('SMC04', 'Moncagua', 'SMC'),
	('SMC05', 'Quelepa', 'SMC'),
	('SMC06', 'Chirilagua', 'SMC'),
	('SMO01', 'Chinameca', 'SMO'),
	('SMO02', 'Nueva Guadalupe', 'SMO'),
	('SMO03', 'Lolotique', 'SMO'),
	('SMO04', 'San Jorge', 'SMO'),
	('SMO05', 'San Rafael Oriente', 'SMO'),
	('SMO06', 'El Tr�nsito', 'SMO'),
-- San Salvador
	('SSN01', 'Aguilares', 'SSN'),
	('SSN02', 'El Paisnal', 'SSN'),
	('SSN03', 'Guazapa', 'SSN'),
	('SSO01', 'Apopa', 'SSO'),
	('SSO02', 'Nejapa', 'SSO'),
	('SSE01', 'Ilopango', 'SSE'),
	('SSE02', 'San Mart�n', 'SSE'),
	('SSE03', 'Soyapango', 'SSE'),
	('SSE04', 'Tonacatepeque', 'SSE'),
	('SSC01', 'Ayutuxtepeque', 'SSC'),
	('SSC02', 'Mejicanos', 'SSC'),
	('SSC03', 'San Salvador', 'SSC'),
	('SSC04', 'Cuscatancingo', 'SSC'),
	('SSC05', 'Ciudad Delgado', 'SSC'),
	('SSS01', 'Panchimalco', 'SSS'),
	('SSS02', 'Rosario de Mora', 'SSS'),
	('SSS03', 'San Marcos', 'SSS'),
	('SSS04', 'Santo Tom�s', 'SSS'),
	('SSS05', 'Santiago Texacuangos', 'SSS'),
-- San Vicente
	('SVN01', 'Apastepeque', 'SVN'),
	('SVN02', 'Santa Clara', 'SVN'),
	('SVN03', 'San Ildefonso', 'SVN'),
	('SVN04', 'San Esteban Catarina', 'SVN'),
	('SVN05', 'San Sebasti�n', 'SVN'),
	('SVN06', 'San Lorenzo', 'SVN'),
	('SVN07', 'Santo Domingo', 'SVN'),
	('SVS01', 'San Vicente', 'SVS'),
	('SVS02', 'Guadalupe', 'SVS'),
	('SVS03', 'Verapaz', 'SVS'),
	('SVS04', 'Tepetit�n', 'SVS'),
	('SVS05', 'Tecoluca', 'SVS'),
	('SVS06', 'San Cayetano Istepeque', 'SVS'),
-- Sonsonate
	('SON01', 'Juay�a', 'SON'),
	('SON02', 'Nahuizalco', 'SON'),
	('SON03', 'Salcoatit�n', 'SON'),
	('SON04', 'Santa Catarina Masahuat', 'SON'),
	('SOC01', 'Sonsonate', 'SOC'),
	('SOC02', 'Sonzacate', 'SOC'),
	('SOC03', 'Nahulingo', 'SOC'),
	('SOC04', 'San Antonio del Monte', 'SOC'),
	('SOC05', 'Santo Domingo de Guzm�n', 'SOC'),
	('SOE01', 'Izalco', 'SOE'),
	('SOE02', 'Armenia', 'SOE'),
	('SOE03', 'Caluco', 'SOE'),
	('SOE04', 'San Juli�n', 'SOE'),
	('SOE05', 'Cuisnahuat', 'SOE'),
	('SOE06', 'Santa Isabel Ishuat�n', 'SOE'),
	('SOO01', 'Acajutla', 'SOO'),
-- Usulut�n
	('USN01', 'Santiago de Mar�a', 'USN'),
	('USN02', 'Alegr�a', 'USN'),
	('USN03', 'Berl�n', 'USN'),
	('USN04', 'Mercedes Uma�a', 'USN'),
	('USN05', 'Jucuapa', 'USN'),
	('USN06', 'El triunfo', 'USN'),
	('USN07', 'Estanzuelas', 'USN'),
	('USN08', 'San Buenaventura', 'USN'),
	('USN09', 'Nueva Granada', 'USN'),
	('USE01', 'Usulut�n', 'USE'),
	('USE02', 'Jucuar�n', 'USE'),
	('USE03', 'San Dionisio', 'USE'),
	('USE04', 'Concepci�n Batres', 'USE'),
	('USE05', 'Santa Mar�a', 'USE'),
	('USE06', 'Ozatl�n', 'USE'),
	('USE07', 'Tecap�n', 'USE'),
	('USE08', 'Santa Elena', 'USE'),
	('USE09', 'California', 'USE'),
	('USE10', 'Ereguayqu�n', 'USE'),
	('USO01', 'Jiquilisco', 'USO'),
	('USO02', 'Puerto El Triunfo', 'USO'),
	('USO03', 'San Agust�n', 'USO'),
	('USO04', 'San Francisco Javier', 'USO');
go
select * from Distritos;
go
-- Direcciones 
insert into Direcciones values
-- Linea1, Linea2, ID_Distrito, CodigoPostal
	('Col Madera, Calle 1, #1N', 'Frente al parque', 'SON02', '02311'),  -- 1					
	('Barrio El Caldero, Av 2, #2I', 'Frente al amate', 'SOE01', '02306'), -- 2
	('Res El Cangrejo, Av 3, #3A', 'Frente a la playa', 'SOO01', '02302'), -- 3
	('Barrio El Centro, Av 4, #4S', 'Frente a catedral', 'SOC01', '02301'), -- 4
	('Col La Frontera, Calle 5, #5G', 'Km 10', 'AHS03', '02113'), -- 5
	('Res Buenavista, Calle 6, #6A', 'Contiguo a Alcaldia', 'SAC01', '02201'), -- 6
	('Res Altavista, Av 7, #7S', 'Contiguo al ISSS', 'SSC03', '01101'), -- 7
	('Col Las Margaritas, Pje 20, #2-4', 'Junto a ANDA', 'AHS01', '02114'),-- 8
	('Urb Las Magnolias, Pol 21, #2-6', 'Casa de esquina', 'LLO01', '01115'),-- 9
	('Caserio Florencia, 3era Calle, #5', 'Casa rosada', 'SON01', '02305'),--10
	('Caserio Asuncion, 5ta Calle, #6', 'Casa verde', 'SON01', '02305');-- 11
go
select * from Direcciones;

-- EMPLEADOS
-- Cargos
go
insert into Cargos values
-- Cargo
  ('Gerente'),
  ('Vendedor'),
  ('Panadero'),
  ('Contador'),
  ('jefe de bodega'),
  ('Recursos Humanos');
go
select * from Cargos;
go
--EMPLEADOS  
insert into Empleados values
-- Nombres_Empleado, Apellidos_Empleado, DUI, ISSS, FechaNacEmpleado, Telefono, ID_Cargo, ID_Direccion
	('Juan Alberto', 'P�rez L�pez', '12345678-9', '12345678','1990-05-15', '7777-1234','1','1'),
	('Mar�a Magdalena', 'Gonz�lez P�rez','98765432-1', '98765432','1985-08-22', '8888-5678','2','2'),
	('Pedro Fernandez', 'L�pez Bonilla', '56473829-0', '98765432', '1995-02-10', '9999-9876','3','3'),
	('Maria Luisa', 'Calderon Mart�nez', '10111213-4', '87654321', '1980-11-30', '7777-5432','4','4'),
	('Carlos Maurico', 'Ram�rez Hernandez', '19202122-5', '11223344', '1992-07-03', '8888-8765','5','5'),
	('Mario Steven', 'Cortez Sandobal', '23445678-3', '54223356', '1992-07-03', '8888-8765','6','6');
go
select * from Empleados;
go
--CLIENTES
insert into Clientes values
-- Nombres_Cliente, Apellidos_Cliente, DUI, ID_Direccion, Telefono
	('Ana', 'S�nchez', '30313233-6', '7', '7777-1111'),
	('Roberto', 'Hern�ndez', NULL, '8', '8888-2222'),
	('Elena', 'G�mez', '40414243-7', '9', '9999-3333'),
	('Manuel', 'Torres', '50515253-8', '10', '7777-4444'),
	('Sof�a', 'D�az', NULL, '11', '8888-5555');
go 
select * from Clientes;
go
-- PRODUCTOS
insert into Productos values
--Nombre_Producto, Precio_Unitario, Descripcion
	('Pan Franc�s', '1.50', 'Pan fresco tipo baguette'),
	('Pastel de Chocolate', '12.99', 'Pastel de chocolate con crema'),
	('Galletas de Avena','0.75', 'Galletas de avena caseras'),
	('Empanadas de Carne','2.25', 'Empanadas rellenas de carne'),
	('Torta de Manzana','9.99','Torta de manzana con canela');
go
select * from Productos;
go
--PROVEEDORES 
insert into Proveedores values
-- Empresa, Telefono
	('Panader�a La Delicia', '7777-7777'),
	('Distribuidora Pan y M�s', '8888-8888'),
	('Molinos San Salvador', '9999-9999'),
	('Carnicer�a El Ranchero', '7777-9999'),
	('Frutas Frescas', '8888-7777');
go
select * from Proveedores;
go
-- COMPRAS
insert into Compras values
-- FechaCompra, MontoCompra, ID_Proveedor
	('2023-09-01','150.75','1'),
	('2023-08-25','98.50','2'),
	('2023-08-20','75.25','3'),
	('2023-08-15','120.30','1'),
	('2023-08-10','55.75','2');
go
select * from Compras;
go
insert into DetallesCompras values
-- CantidadComprada, PrecioUnitarioCompra, Subtotal, ID_Compra, ID_Producto
	('100', '1.00', '100.00', '1', '1'),
	('50', '2.50', '125.00', '2', '2'),
	('80', '1.20', '96.00', '3', '3'),
	('60', '2.00', '120.00', '4', '1'),
	('40', '3.00', '120.00', '5', '4');
go
select * from DetallesCompras;
go
-- VENTAS
insert into Ventas values
-- FechaVenta, Totalventa, ID_Cliente
	('2023-09-02 10:15:00','25.50','1'),
	('2023-09-01 15:30:00','48.75','2'),
	('2023-08-30 09:45:00','37.20','3'),
	('2023-08-29 17:20:00','62.40','4'),
	('2023-08-28 14:55:00','30.75','5');
go 
select * from Ventas;
go
insert into DetallesVentas values
-- CantidadVendida, PrecioUnitarioVenta, Subtotal, ID_Venta, ID_Producto
	('20', '1.50', '30.00', '1', '1'),
	('10', '12.99', '129.90', '2', '2'),
	('30', '0.75', '22.50', '3', '3'),
	('15', '2.25', '33.75', '4', '4'),
	('25', '9.99', '249.75', '5', '5');
go
select * from DetallesCompras;
go
-- INVENTARIOS
insert into Inventarios values
-- CantidadInventario, FechaActualizacion, ID_Producto
	('500', '2023-09-02', '1'),
	('200', '2023-09-02', '2'),
	('300', '2023-09-02', '3'),
	('150', '2023-09-02', '4'),
	('250', '2023-09-02', '5');
go
select * from Inventarios;
go
-- FACTURAS
insert into Facturas values
-- FechaFactura, TotalFactura, ID_Venta
	('2023-09-02', '25.50', '1'),
	('2023-09-01', '48.75', '2'),
	('2023-08-30', '37.20', '3'),
	('2023-08-29', '62.40', '4'),
	('2023-08-28', '30.75', '5');
go
select * from Facturas;
go
-- Inserciones en la tabla Roles
INSERT INTO Roles (NombreRol) VALUES ('Sysadmin');
INSERT INTO Roles (NombreRol) VALUES ('Gerente');
INSERT INTO Roles (NombreRol) VALUES ('Vendedor');
INSERT INTO Roles (NombreRol) VALUES ('Contador');
INSERT INTO Roles (NombreRol) VALUES ('Bodega');
INSERT INTO Roles (NombreRol) VALUES ('RH');
INSERT INTO Roles (NombreRol) VALUES ('Panadero');

-- Inserciones en la tabla Opciones
INSERT INTO Opciones (NombreOpcion) VALUES ('Control total de la base de datos');
INSERT INTO Opciones (NombreOpcion) VALUES ('Seleccionar, actualizar, insertar, eliminar');
INSERT INTO Opciones (NombreOpcion) VALUES ('Seleccionar');


-- Inserciones en la tabla Usuarios
-- Inserciones en la tabla Usuarios
INSERT INTO Usuarios (ID_Empleado, ID_Rol, Usuario, Clave) VALUES (1, 1, 'SysadminPedroHernandez', 'root');
INSERT INTO Usuarios (ID_Empleado, ID_Rol, Usuario, Clave) VALUES (2, 2, 'GerenteJuanLopez', 'lopez1234');
INSERT INTO Usuarios (ID_Empleado, ID_Rol, Usuario, Clave) VALUES (3, 3, 'VendedorMariaGonzales', 'gonzales1234');
INSERT INTO Usuarios (ID_Empleado, ID_Rol, Usuario, Clave) VALUES (4, 4, 'ContadorMariaCalderon', 'calderon1234');
INSERT INTO Usuarios (ID_Empleado, ID_Rol, Usuario, Clave) VALUES (5, 5, 'BodegaCarlosRamirez', 'ramirez1234');
INSERT INTO Usuarios (ID_Empleado, ID_Rol, Usuario, Clave) VALUES (6, 6, 'RHMarioCortez', 'cortez1234');
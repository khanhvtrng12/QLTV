Create database QuanLyNhaSach
go
use QuanLyNhaSach
go
-- Tạo cấu trúc bảng QuanLyNhaSach
CREATE TABLE PHIEUNHAPSACH(
	MAPN INT NOT NULL IDENTITY(1,1) primary key,
	NGAYNHAP DATE NOT NULL,
	TENSACH NVARCHAR(100) NULL,
	THELOAI NVARCHAR(50) NULL,
	TACGIA nvarchar(100) NULL,
	SL INT NULL
)
CREATE TABLE BAOCAOTON(
	MABCT INT NOT NULL IDENTITY	(1,1) primary key,
	MAPN INT NOT NULL foreign key references PHIEUNHAPSACH(MAPN),
	THANG char NOT NULL,
	TONDAU INT NULL,
	PHATSINH INT NULL
)

CREATE TABLE PHIEUTHUTIEN(
	MAPT INT NOT NULL IDENTITY(1,1) primary key,
	HOTENKH NVARCHAR(100) NOT NULL,
	SDT CHAR(10) not null,
	DIACHI NVARCHAR(200) NOT NULL,
	EMAIL VARCHAR(100) NOT NULL,
	NGAYTHUTIEN DATE NOT NULL,
	SOTIENTHU INT NOT NULL
) 
CREATE TABLE BAOCAOCONGNO(
	MABCCN INT NOT NULL IDENTITY(1,1) primary key,
	MAPT INT NOT NULL foreign key references PHIEUTHUTIEN(MAPT),
	THANG char NOT NULL,
	NODAU INT NOT NULL,
	PHATSINH INT NULL
) 
CREATE TABLE HOADONBANSACH(
	MAHD INT NOT NULL IDENTITY(1,1) primary key,
	MAPT INT NOT NULL foreign key references PHIEUTHUTIEN(MAPT),
	MABCCN INT NOT NULL foreign key references BAOCAOCONGNO(MABCCN),
	MAPN INT NOT NULL foreign key references PHIEUNHAPSACH(MAPN),
	NGAYLAPHOADON date NOT NULL,
	SL INT NULL,
	DONGIA INT NULL
)
CREATE TABLE USERS(
 ID int identity(1,1) primary key,
 TenTK varchar(25),
 MatKhau varchar(25),
 MoTa nvarchar(100)
)
insert into PHIEUNHAPSACH values('1/1/1990',N'Tôi thấy hoa vàng trên cỏ xanh',N'Tiểu thuyết',N'Nguyễn Nhật Ánh',150)
insert into PHIEUNHAPSACH values('2/1/1990',N'Hạnh Phúc Thật Đơn Giản',N'Tâm Lý - Kỹ Năng Sống',N'Nguyễn Mạnh Hùng',152)
insert into PHIEUNHAPSACH values('3/1/1990',N'Giàu từ chứng khoán',N'Tài Chính - Chứng Khoán',N'John Boik',152)
insert into PHIEUNHAPSACH values('4/1/1990',N'Trên đỉnh phố Wall',N'Tài Chính - Chứng Khoán',N'Peter Lynch',152)
insert into PHIEUNHAPSACH values('5/1/1990',N'Bước đi ngẫu nhiên trên phố Wall',N'Tài Chính - Chứng Khoán',N'Burton G. Malkiel',152)
insert into PHIEUNHAPSACH values('6/1/1990',N'Cổ phiếu thường, lợi nhuận phi thường',N'Tài Chính - Chứng Khoán',N'Philip A. Fisher',152)
insert into PHIEUNHAPSACH values('7/1/1990',N'Phi Lý Trí ',N'Tâm Lý',N'Dan Ariely',152)
insert into PHIEUNHAPSACH values('8/1/1990',N'Tình Cờ Gặp Hạnh Phúc',N'Tâm Lý',N'Daniel Gilbert',152)
insert into PHIEUNHAPSACH values('9/1/1990',N'Bản Chất Của Dối Trá ',N'Tâm Lý',N'Dan Ariely',152)
insert into PHIEUNHAPSACH values('10/1/1990',N'Nghịch Lý Của Sự Lựa Chọn',N'Tâm Lý',N'Barry Schwartz',152)
insert into PHIEUNHAPSACH values('11/1/1990',N'Đi Tìm Lẽ Sống',N'Tâm Lý',N'Viktor Emil Frankl',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'It',N'Kinh dị',N'Stephen King',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'Tấm Vải Đỏ',N'Kinh dị',N'Hồng Nương Tử',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'The Haunting of Hill House',N'Kinh dị',N'Shirley Jackson',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'Let the Right One In',N'Kinh dị',N'John Ajvide Lindqvist',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'Tuổi thơ dữ dội',N'Văn học',N'Phùng Quán',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'Giết con chim nhại',N'Văn học',N'Harper Lee',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'Tiếng chim hót trong bụi mận gai',N'Văn học',N'Colleen McCullough, A. Ward',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'Anh chàng Hobbits',N'Văn học',N'J. R. R. Tolkien',152)
insert into PHIEUNHAPSACH values('12/1/1990',N'Tôi thấy hoa vàng trên cỏ xanh',N'Tiểu thuyết',N'Nguyễn Nhật Ánh',150)

select *
from PHIEUNHAPSACH

insert into BAOCAOTON values(1,'7',151,0)
insert into BAOCAOTON values(2,'7',152,0)
insert into BAOCAOTON values(3,'7',153,0)
insert into BAOCAOTON values(4,'7',154,0)
insert into BAOCAOTON values(5,'7',155,0)
insert into BAOCAOTON values(6,'7',156,0)
insert into BAOCAOTON values(7,'7',157,0)
insert into BAOCAOTON values(8,'7',158,0)
insert into BAOCAOTON values(9,'7',159,0)
insert into BAOCAOTON values(10,'7',160,0)
insert into BAOCAOTON values(11,'7',161,0)
insert into BAOCAOTON values(12,'7',162,0)
insert into BAOCAOTON values(13,'7',163,0)
insert into BAOCAOTON values(14,'7',164,0)
insert into BAOCAOTON values(15,'7',165,0)
insert into BAOCAOTON values(16,'7',166,0)
insert into BAOCAOTON values(17,'7',167,0)
insert into BAOCAOTON values(18,'7',168,0)
insert into BAOCAOTON values(19,'7',169,0)
insert into BAOCAOTON values(20,'7',170,0)

select a.MABCT,a.THANG,b.TACGIA, a.TONDAU,a.PHATSINH, (a.TONDAU+a.PHATSINH) AS 'TONCUOI' from BAOCAOTON a ,PHIEUNHAPSACH b where a.MAPN =b.MAPN

insert into PHIEUTHUTIEN values(N'Nguyễn Văn A','0999999999',N'Trần Duy Hưng','a@gmail.com','12/1/1990',1000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn B','0888888888',N'Trần Duy Hưng','b@gmail.com','12/1/1990',2000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn C','0777777777',N'Trần Duy Hưng','c@gmail.com','12/1/1990',3000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn D','0666666666',N'Trần Duy Hưng','d@gmail.com','12/1/1990',4000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn X','0555555555',N'Trần Duy Hưng','x@gmail.com','12/1/1990',5000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn Y','0444444444',N'Trần Duy Hưng','y@gmail.com','12/1/1990',6000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn Z','0333333333',N'Trần Duy Hưng','z@gmail.com','12/1/1990',7000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn F','0222222222',N'Trần Duy Hưng','f@gmail.com','12/1/1990',8000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn G','0111111111',N'Trần Duy Hưng','g@gmail.com','12/1/1990',9000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn H','0000000000',N'Trần Duy Hưng','h@gmail.com','12/1/1990',10000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn J','0999999999',N'Trần Duy Hưng','j@gmail.com','12/1/1990',1000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn K','0888888888',N'Trần Duy Hưng','k@gmail.com','12/1/1990',2000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn L','0777777777',N'Trần Duy Hưng','l@gmail.com','12/1/1990',3000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn P','0666666666',N'Trần Duy Hưng','p@gmail.com','12/1/1990',4000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn O','0555555555',N'Trần Duy Hưng','o@gmail.com','12/1/1990',5000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn I','0444444444',N'Trần Duy Hưng','i@gmail.com','12/1/1990',6000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn U','0333333333',N'Trần Duy Hưng','u@gmail.com','12/1/1990',7000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn T','0222222222',N'Trần Duy Hưng','t@gmail.com','12/1/1990',8000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn R','0111111111',N'Trần Duy Hưng','r@gmail.com','12/1/1990',9000)
insert into PHIEUTHUTIEN values(N'Nguyễn Văn E','0000000000',N'Trần Duy Hưng','e@gmail.com','12/1/1990',10000)


select p.*, (d.SL * d.DONGIA) as'Sotienthu' from PHIEUTHUTIEN p, HOADONBANSACH d where  p.MAPT = d.MAPT

insert into BAOCAOCONGNO values(1,'7',9000,10000)
insert into BAOCAOCONGNO values(2,'7',9000,10000)
insert into BAOCAOCONGNO values(3,'7',9000,10000)
insert into BAOCAOCONGNO values(4,'7',9000,10000)
insert into BAOCAOCONGNO values(5,'7',9000,10000)
insert into BAOCAOCONGNO values(6,'7',9000,10000)
insert into BAOCAOCONGNO values(7,'7',9000,10000)
insert into BAOCAOCONGNO values(8,'7',9000,10000)
insert into BAOCAOCONGNO values(9,'7',9000,10000)
insert into BAOCAOCONGNO values(10,'7',9000,10000)
insert into BAOCAOCONGNO values(11,'7',9000,10000)
insert into BAOCAOCONGNO values(12,'7',9000,10000)
insert into BAOCAOCONGNO values(13,'7',9000,10000)
insert into BAOCAOCONGNO values(14,'7',9000,10000)
insert into BAOCAOCONGNO values(15,'7',9000,10000)
insert into BAOCAOCONGNO values(16,'7',9000,10000)
insert into BAOCAOCONGNO values(17,'7',9000,10000)
insert into BAOCAOCONGNO values(18,'7',9000,10000)
insert into BAOCAOCONGNO values(19,'7',9000,10000)
insert into BAOCAOCONGNO values(20,'7',9000,10000)


select b.MABCCN, b.THANG, t.HOTENKH,b.NODAU,b.PHATSINH, (NODAU+PHATSINH) as'NOCUOI' from BAOCAOCONGNO b , PHIEUTHUTIEN t where b.MAPT = t.MAPT

insert into HOADONBANSACH values(1,1,1,'12/1/1990',2,1000)
insert into HOADONBANSACH values(2,2,2,'12/1/1990',2,1000)
insert into HOADONBANSACH values(3,3,3,'12/1/1990',2,1000)
insert into HOADONBANSACH values(4,4,4,'12/1/1990',2,1000)
insert into HOADONBANSACH values(5,5,5,'12/1/1990',2,1000)
insert into HOADONBANSACH values(6,6,6,'12/1/1990',2,1000)
insert into HOADONBANSACH values(7,7,7,'12/1/1990',2,1000)
insert into HOADONBANSACH values(8,8,8,'12/1/1990',2,1000)
insert into HOADONBANSACH values(9,9,9,'12/1/1990',2,1000)
insert into HOADONBANSACH values(10,10,10,'12/1/1990',2,1000)
insert into HOADONBANSACH values(11,11,11,'12/1/1990',2,1000)
insert into HOADONBANSACH values(12,12,12,'12/1/1990',2,1000)
insert into HOADONBANSACH values(13,13,13,'12/1/1990',2,1000)
insert into HOADONBANSACH values(14,14,14,'12/1/1990',2,1000)
insert into HOADONBANSACH values(15,15,15,'12/1/1990',2,1000)
insert into HOADONBANSACH values(16,16,16,'12/1/1990',2,1000)
insert into HOADONBANSACH values(17,17,17,'12/1/1990',2,1000)
insert into HOADONBANSACH values(18,18,18,'12/1/1990',2,1000)
insert into HOADONBANSACH values(19,19,19,'12/1/1990',2,1000)
insert into HOADONBANSACH values(20,20,20,'12/1/1990',2,1000)



insert into USERS(TenTK, MatKhau, MoTa) values('admin','123321',N'Quản trị viên')
insert into USERS(TenTK, MatKhau, MoTa) values('baoanh','1234567',N'Người dùng')
select * from HOADONBANSACH
select * from PHIEUTHUTIEN



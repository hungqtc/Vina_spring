-- phpMyAdmin SQL Dump
-- version 4.3.8
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 18, 2017 at 11:28 PM
-- Server version: 5.5.51-38.2
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vinaente_demo_cland`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE IF NOT EXISTS `categories` (
  `cid` int(10) unsigned NOT NULL,
  `cname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`cid`, `cname`) VALUES
(1, 'Nhà đất bán'),
(2, 'Nhà đất cho thuê'),
(3, 'Cần thuê'),
(4, 'Cần mua');

-- --------------------------------------------------------

--
-- Table structure for table `lands`
--

CREATE TABLE IF NOT EXISTS `lands` (
  `lid` int(10) unsigned NOT NULL,
  `lname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `description` text COLLATE utf8mb4_unicode_ci,
  `date_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cid` int(10) unsigned NOT NULL,
  `picture` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `area` int(11) DEFAULT NULL,
  `address` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `count_views` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `lands`
--

INSERT INTO `lands` (`lid`, `lname`, `description`, `date_create`, `cid`, `picture`, `area`, `address`, `count_views`) VALUES
(1, 'Khu đô thị FPT City Đà Nẵng nay mở bán đất nền 695 triệu/nền', 'Khu đô thị FPT City Đà Nẵng - Ước mơ chắp cánh với một nơi an cư sinh thái trong lòng sinh thái. <br />\r\nBạn có biết điều gì đã xảy ra! Khu đô thị FPT City nay đã mở bán đất nền. Nơi Tận hưởng cuộc sống trong lành tại khu đô thị xanh ven sông, kề biển văn minh bậc nhất Đà Nẵng. <br />\r\nCơ hội sở hữu đất nền FPT City Đà Nẵng: <br />\r\n300 cơ hội vàng, giá hấp dẫn với 695 triệu/nền (tương đương từ 7tr - 8tr/m2). Diện tích đa dạng từ 90 - 105m2. Được ngân hàng TP Bank hỗ trợ chính sách vay. <br />\r\nSố lượng có hạn, khách hàng nhanh tay book quỹ hàng ngay hôm nay. <br />\r\n\r\nGiới thiệu phân khu mở bán đất nền FPT City Đà Nẵng: <br />\r\nVị trí mở bán là V1 (khu bắc) và V5 (khu tây)- Nơi đẹp nhất ngay trung tâm khu đô thị dễ dàng tiếp cận mọi tiện ích: Trường Đại Học FPT, trường Trung Học FPT, công viên xanh, khu TT giải trí. <br /><br />\r\n\r\nChính sách thanh toán linh hoạt dành cho khách hàng: <br />\r\nĐỢT 1: Giữ chỗ 50 triệu VNĐ. <br />\r\nĐỢT 2: Thanh toán 50% (ký hợp đồng đặt cọc) - 15 ngày sau đợt 1. <br />\r\nĐỢT 3: Thanh toán đủ 100% (ký hợp đồng chuyển nhượng) - 120 ngày sau đợt 1. <br />\r\nĐỢT 4: Nhận sổ - 30 ngày sau đợt 3. <br />\r\n\r\nChương trình khuyến mãi: <br />\r\nƯu đãi quà tân gia: Xây nhà ngay, tặng liền móng 7o triệu. <br />\r\n\r\nKhu đô thị FPT City - tận hưởng cuộc sống xanh, tri thức, văn minh bậc nhất Đà Nẵng. <br />\r\nFPT City là giấc mơ đã thành hiện thực của Chủ tịch FPT Trương Gia Bình về một Thung lũng Silicon ở Việt Nam. <br />\r\nDự án được Công ty Cổ phần Đô thị FPT Đà Nẵng làm chủ đầu tư với tổng diện tích hơn 181 hécta, trong đó mật độ xây dựng chỉ chiếm 40%, 60% còn lại dành cho cây xanh và mặt nước, kiến tạo nên KĐT sinh thái thân thiện với môi trường và phát triển bền vững. <br />\r\nVị trí KĐT ngay trục giao thông chính: Võ Nguyên Giáp, Nam Kì Khởi Nghĩa, Võ Chí Công, Trần Đại Nghĩa. \r\nDự án ven sông Cổ Cò, nằm giữa 2 sân golf đẳng cấp quốc tế: BRG & Montgomerie Links, tiếp giáp hàng loạt Resort đẳng cấp 5* bên bờ biển Mỹ Khê tuyệt đẹp. Hạ tầng khu đô thị hoàn chỉnh bao gồm khu công viên, hồ nước, lối dạo bộ, hệ thống kênh nhân tạo. <br />\r\nBãi tăm tự nhiên - Bãi tắm Tân Trà, được quản lý bởi FPT City. <br />\r\nDự án được xây dựng với tổ hợp tiện ích nội khu hoàn hảo: Trường Đại học FPT, Trường Trung học FPT, Trường mẫu giáo FPT, FPT Complex, trung tâm thể thao và khu vui chợi trẻ em, bệnh viện quốc tế, hồ bơi. Là lời hứa mang đến cuộc sống an cư lạc nghiệp và nuôi dạy con trẻ lý tưởng."<br />', '2017-08-11 17:33:44', 1, 'files/PD3yqBgq9eqc9iMioDVkpt64V39qPlZo3dHjHSvb.jpeg', 105, 'Quận Ngũ Hành Sơn - Đà Nẵng"', 123),
(2, 'Chính chủ cần bán ô đất 500m2 ở đường mới tại Phường Mỹ An, Quận Ngũ Hành Sơn, TP. Đà Nẵng', 'Chính chủ cần bán ô đất đường mới tại phường Mỹ An, quận Ngũ Hành Sơn, TP Đà Nẵng:<br/>- Cách đường Phan Tứ 30m, cách đường Võ Nguyên Giáp 120m, cách biển 150m;<br/>- Đã có sổ đỏ, phù hợp xây dựng khách sạn 3, 4 sao. Diện tích ô đất 500m2.<br/>- Khu vực tiếp đón nhiều khách du lịch.<br/>Do gia đình cần tiền lên bán gấp: Giá bán 24,8 tỷ.<br/><br/>Hiện tại gia đình ở Hà Nội, nếu cần có thể liên hệ với chú Dân: 01663039427 (chủ cửa hàng tạp hóa gần ô đất).<br/>Chình chủ: 0904990976 (Hà Nội).', '2017-08-11 17:38:52', 1, 'files/UE6AXvrtxNMfljpSqxoXg5krUq92QWyoReM7k8ZG.jpeg', 500, 'Phường Mỹ An - Quận Ngũ Hành Sơn - Đà Nẵng', 200),
(3, 'Bán đất biển đường Võ Nguyên Giáp chỉ từ 33 tr/m2. Tel 0932 592 598', 'Mở bán dự án SaPhia, dự án vàng trên bãi biển Kim Cương, mặt tiền chính đường Võ Nguyên Giáp. Cung đường biển 5* của Tp.Đà Nẵng<br/>Cách trung tâm hội nghị Apec 2017 500m<br/>- Mặt tiền Võ Nguyên Giáp, mặt sau Nguyễn Khắc Viện, đối diện bãi tắm Sơn Thủy - Đà Nẵng. - - Nằm cạnh sân bay nước mặn, được nhà đầu tư Malaysia mua lại và đầu tư khu đô thị Quốc Tế Đà Nẵng.<br/>- Đối diện Hyatt Regency Resort, sòng bài Crowne Palaza<br/>- Nằm gần khu du lịch tâm linh Ngũ Hành Sơn<br/>- Nằm giữa 2 bãi tắm Sơn Thủy<br/>Vị Trí: <br/>+ Phía Đông: Tiếp giáp với đường Võ Nguyên Giáp, các khu Resort 5* như Regency resort, Crowne Palaza, The Song resort, Fulama Villas…<br/>+ Phía Tây: Tiếp giáp với đường Nguyễn Khắc Viện<br/>+ Phía Nam: Tiếp giáp Trục đường Minh Mạng 48m<br/>+ Phía Bắc: Tiếp giáp với Sân bay nước mặn.<br/>Quy hoạch:<br/>+ Có quyết định 1/500 phê duyệt<br/>+ Gồm các Condotel, nhà phố liền kề, trường mầm non quốc tế<br/>+ Cung đường quy hoạch 13.5m và 20,5m<br/><br/>5.Lý do nên đầu tư tại saphia ngay thời điểm này? <br/>- SaPhia – Hội tụ đủ yếu tố của dự án tuyệt đẹp và đẳng cấp<br/>- SaPhia – Gía bán hấp dẫn, ổn định<br/>- SaPhia – Tiềm năng phát triển cực lớn<br/>- SaPhia – Đầu tư LỢI NHUẬN KHỦNG<br/>- SaPhia – Đầu tư siêu an toàn: chủ đầu tư uy tín<br/><br/>***** Siêu phẩm gia tăng giá trị mạnh nhất trong tương lai tại TP Đà Nẵng, được phân phối độc quyền bởi Cty CP BĐS Link House Miền Trung.<br/>Địa chỉ: 320 đường 2 tháng 9, Q.Hải Châu, Tp.Đà Nẵng<br/>Website: linkhousemientrung.com.vn<br/>LH: 0932 592 598', '2017-08-11 17:42:29', 1, 'files/4wWPcHktMBF4AJkz1COUswjt83eY6b9lG6n2aZj2.jpeg', 1500, 'Đường Võ Nguyên Giáp - Quận Ngũ Hành Sơn - Đà Nẵng', 800),
(4, 'Thuê chung cư mini 2 pn khu Bắc Từ Liêm', 'Cần thuê gấp chung cư mini 2 phòng ngủ, đầy đủ nội thất cơ bản, sạch sẽ, gần trường Học Viện Tài Chính và Y Tế Công Cộng 3km đổ lại. Giá tầm 5,5tr đổ lại.', '2017-08-11 17:48:21', 3, 'files/APiFVgrBxKXx3THb0zqUK7IXAXWD3k9yGsjmSZjn.jpeg', 90, 'Quận Bắc Từ Liêm - Hà Nội', 500),
(5, 'Bán đất xây dựng khách sạn đường Lâm Hoành 0918444053', 'Cần bán khu đất xây khách sạn tại đường Lâm Hoành, Quận Sơn Trà, TP Đà Nẵng.<br/>Diện tích: 695 m2.<br/>Vị trí nằm trong khu tập trung tổ hợp nhà hàng, khách sạn, dịch vụ du lịch tốt nhất của biển Đà Nẵng. <br/>Khu đất rộng, thích hợp xây khách sạn, vị trí đắc địa, tập trung nhiều khách sạn lớn.<br/>Giá bán: 75 triệu/m2.<br/>Giá bán chính chủ. Liên hệ: 0918444053.', '2017-08-11 17:44:53', 1, 'files/rfMpt81RIQJlvmebUd3IUcJigrJtlGhapzxhTGnw.png', 695, 'Đường Lâm Hoành - Quận Sơn Trà - Đà Nẵng', 644);

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE IF NOT EXISTS `migrations` (
  `id` int(10) unsigned NOT NULL,
  `migration` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2014_10_12_000000_create_users_table', 1),
(2, '2014_10_12_100000_create_password_resets_table', 1),
(3, '2017_07_27_184804_create_categories_table', 1),
(4, '2017_07_27_184922_create_lands_table', 1),
(5, '2017_07_27_184938_create_vnecontact_table', 1),
(6, '2017_07_27_205208_update_lands_table', 2);

-- --------------------------------------------------------

--
-- Table structure for table `password_resets`
--

CREATE TABLE IF NOT EXISTS `password_resets` (
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(10) unsigned NOT NULL,
  `username` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fullname` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `remember_token` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `fullname`, `remember_token`, `password`) VALUES
(1, 'admin', 'Nguyễn Văn C', 'IDZqqi8YlUuKaUewLIh1LZR2l4cUfMPRnnA3kT7ZZ9tCcGMlwQoO4Be4ieBE', '$2y$10$Cf0gEBK/gRIVEpSa54HOyed9WKUSfJOofgd3l5OuSH80QeKjzq0F6'),
(2, 'mod', 'VinaEnter Edu', '', '$2y$10$GMqRL4w6DQN9ePEHbWsqo.5aSNe1eNCAnqdzTe1lNKusbsspIor6G'),
(3, 'user', 'Người dùng', '', '$2y$10$zfn92kzRbwQsUbScuH82Z.s8VM7r38aApjFaQsO10zQ2AmrkPYwzC');

-- --------------------------------------------------------

--
-- Table structure for table `vnecontact`
--

CREATE TABLE IF NOT EXISTS `vnecontact` (
  `cid` int(10) unsigned NOT NULL,
  `fullname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `subject` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `content` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `vnecontact`
--

INSERT INTO `vnecontact` (`cid`, `fullname`, `email`, `subject`, `content`) VALUES
(1, 'Nguyễn Thị Hạnh', 'hanh@gmail.com', 'Phòng A1', 'Để bảo vệ giàn khoan, Trung Quốc đã điều thêm 17 tàu các loại so với hôm trước,\n		        sẵn sàng đâm va vào tàu Việt Nam.'),
(2, 'Phan Quốc Bảo', 'quocbao@gmail.com', 'Phòng A2', 'World Cup 2014 chưa đi hết lượt đầu vòng bảng nhưng các trọng tài đẳng cấp FIFA đã có tới bốn trận bị chỉ trích dữ dội.'),
(3, 'Nguyễn Văn Hòa', 'hoa@gmail.com', 'Phòng A3', 'Để bảo vệ giàn khoan, Trung Quốc đã điều thêm 17 tàu các loại so với hôm trước,\n		        sẵn sàng đâm va vào tàu Việt Nam.'),
(5, 'Bảo', 'bao@gmail.com', 'Nhà cho thuê', 'Test nhà cho thuê');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `lands`
--
ALTER TABLE `lands`
  ADD PRIMARY KEY (`lid`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_resets`
--
ALTER TABLE `password_resets`
  ADD KEY `password_resets_email_index` (`email`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vnecontact`
--
ALTER TABLE `vnecontact`
  ADD PRIMARY KEY (`cid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `cid` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `lands`
--
ALTER TABLE `lands`
  MODIFY `lid` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `vnecontact`
--
ALTER TABLE `vnecontact`
  MODIFY `cid` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

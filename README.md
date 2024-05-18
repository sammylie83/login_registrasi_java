# login_registrasi_java
aplikasi login registrasi menggunakan java netbeans

-- Database: `login`

-- Table structure for table `login`

CREATE TABLE `login` (
  `id` varchar(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `age` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `login` (`id`, `username`, `password`, `age`) VALUES
('AD001', 'sammylie83@gmail.com', 'UGFzc3dvcmQwMQ==', '40');

-- Indexes for table `login`

ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);
COMMIT;

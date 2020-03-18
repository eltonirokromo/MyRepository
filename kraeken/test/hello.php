<?php
include("connection.php");
$query = "INSERT INTO nummer VALUES ('7','My Momma','00:06:36')";
$data = mysqli_query($conn, $query);

if ($data)
{
	echo "Data inserted into database";
}

?>
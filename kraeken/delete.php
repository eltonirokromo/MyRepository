<?php
include("db/connection.php");
$in = $_GET['id'];
$query = "DELETE FROM nummer WHERE idnummer='$in'";
$data = mysqli_query($conn,$query);
if($data)
{
	echo "<script>alert('Record is verwijderd')</script>";
	?>
	<META HTTP-EQUIV="refresh" CONTENT="0; URL=http://localhost:8888/kraeken/display.php">
	<?php

}
else
{
	echo "<font color='red'>Delete failed";
}


?>
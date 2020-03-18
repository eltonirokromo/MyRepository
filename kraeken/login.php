<?php
include("db/connection.php")
?>
<form action="" method="post">
	Username: <input type="text" name="username" value=""><br><br>
	Password: <input type="text" name="Password" value=""><br><br>
	<input type="submit" name="submit" value="login">
</form>

<?php
if (isset($_POST['submit'])) {
	# code...
}

?>
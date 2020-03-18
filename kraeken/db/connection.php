<?php
$host = "localhost:8889";
$user = "root";
$pass = "root";
$dbname = "kraeken&kronen";

$conn = mysqli_connect($host, $user, $pass, $dbname);

if($conn)
{
  echo "";
}
else
{
  die("Connection failed because" . mysqli_connect_error());
}

?>
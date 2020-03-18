

<?php
include("db/connection.php");
$_GET['id'];
$_GET['titel'];
$_GET['duur'];
?>

<html>
  <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>wijziging</title>
  <link rel="stylesheet" href="css/kraekendisplay.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=B612" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >

</head>

<body>

<div id="navbar">
    <a class="active" href="index.php">Home</a>
    <a href="javascript:void(0)">Contact</a>
    <a href="zender.php">Zender</a>


</div>

<body>
<div class="centera">
  <form action="" method="GET">
    idnummer  <input type="text" name="idnummer" value="<?php echo $_GET['id']; ?>"><br><br>
    Naam  <input type="text" name="naam" value="<?php echo $_GET['titel']; ?>"><br><br>
    Duur <input type="time" name="duur" value="<?php echo $_GET['duur']; ?>"><br><br>
    <input type="submit" name="submit" value="update">
    
  </form>
</div>
  <?php 
  if($_GET['submit'])
  {
  	$id = $_GET['idnummer'];
  	$titel = $_GET['naam'];
  	$duur = $_GET['duur'];
  	$query = "UPDATE nummer SET titel='$titel', duur='$duur' WHERE idnummer='$id'";
  	$data = mysqli_query($conn, $query);
  	if ($data) {
  		echo "<script>alert('Record is geupdate')</script>";
         ?>
           <META HTTP-EQUIV="refresh" CONTENT="0; URL=http://localhost:8888/kraeken/display.php">
  <?php
  	}
  	else
  		{ 
  			echo "Record not updated";
  		}
  } 
  else
  {
  	echo "";
  }


  ?>


</body>
</html>
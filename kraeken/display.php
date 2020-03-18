<?php
include("db/connection.php");
$query = "SELECT * FROM nummer";
$data = mysqli_query($conn, $query);
$total = mysqli_num_rows ($data);

?>

<html>
  <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
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


<table>
	<tr>
		<th>idnummer</th>
		<th>titel</th>
		<th>duur</th>
		<th colspan="2">operations</th>
	</tr>

<?php

if ($total !=0)
{
	
	while ($result = mysqli_fetch_assoc($data)) {
		echo "	

				<tr>
					<td>".$result['idnummer']."</td>
					<td>".$result['titel']."</td>
					<td>".$result['duur']."</td>
					<td><a href= 'update.php?id=$result[idnummer]&titel=$result[titel]&duur=$result[duur]'>wijzig</a>
					<a href='delete.php?id=$result[idnummer]' onclick=' return checkdelete()'>verwijder</a></td>
				</tr>";
	}
}
else
{
	echo "no records found";
}
?>
</table>



<div class="centera">
<form action="" method="GET">
    idnummer  <input type="text" name="idnummer" value=""><br><br>
    Naam  <input type="text" name="Naam" value=""><br><br>
    Duur <input type="time" name="duur" value=""><br><br>
    <input type="submit" name="submit" value="Invoeren">
    
  </form>
</div>
  <?php 
  if($_GET['submit'])
  {
    $id = $_GET['idnummer'];
    $titel = $_GET['Naam'];
    $duur = $_GET['duur'];

    if ($id!="" && $titel!="" && $duur!="") {
          $query = "INSERT INTO nummer VALUES ('$id','$titel','$duur')";
          $data = mysqli_query($conn, $query);

          if ($data)
          {
            echo "<br> . <font color='green'>Data inserted into database . <a href='display.php'>klik hier voor overzicht</a>";
            ?>
            <META HTTP-EQUIV="refresh" CONTENT="0">
            <?php
          }
    }
    else
      { 
        echo "<script>alert('Invoeren is mislukt!!! Alle velden moeten ingevuld zijn')</script>";
       ?>
         <META HTTP-EQUIV="refresh" CONTENT="0; URL=http://localhost:8888/kraeken/display.php">
         <?php
      }
  }


  ?>
<script>
function checkdelete()
{
	return confirm('Zeker dat je dit wilt weghalen?');
}
</script>
</body>
</html>
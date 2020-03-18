<?php
include("connection.php");

?>

<!DOCTYPE html>
<html>
<head>
  <title></title>
</head>
<body>
  <form action="" method="GET">
    idnummer  <input type="text" name="idnummer" value=""><br><br>
    Naam  <input type="text" name="Naam" value=""><br><br>
    Duur <input type="time" name="duur" value=""><br><br>
    <input type="submit" name="submit" value="submit">
    
  </form>

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
          }
    }
    else
      { 
        echo "All fields are required";
      }
  }


  ?>


</body>
</html>
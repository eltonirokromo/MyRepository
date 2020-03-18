<html>
  <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
  <link rel="stylesheet" href="css/kraeken.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=B612" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >

</head>

<body>

<div id="navbar">
    <a href="index.php">Home</a>
    <a href="javascript:void(0)">Contact</a>
    <a class="active" href="zender.php">Zender</a>

</div>

<h2>Zender KKSoul</h2>

<table>
<tr>
<th>Programma</th>
<th>Datum</th>
<th>Tijd</th>
<th>Presentator</th>
<th>Zender</th>
</tr>
<?php
$conn = mysqli_connect("localhost:8889", "root", "root", "kraeken&kronen");
// Check connection
if ($conn->connect_error) {
die("Connection failed: " . $conn->connect_error);
}
$sql = "SELECT idprogramma, datum, begintijd, eindtijd, idmedewerker, idzender FROM uitzending";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
// output data of each row
while($row = $result->fetch_assoc()) {
echo "<tr><td>" . $row["idprogramma"]. "<br>" . "</td><td>" . $row["datum"] . "</td><td>"
. $row["begintijd"]. " - <br>" . $row["eindtijd"]. "</td><td>" . $row["idmedewerker"] . "</td><td>"
. $row["idzender"]. "</td></tr>";
}
echo "</table>";
} else { echo "0 results"; }
$conn->close();
?>
</table>
</body>
</html>
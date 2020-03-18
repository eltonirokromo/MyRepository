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
<table border = "1">
<?php
$conn = mysqli_connect("localhost:8889", "root", "root", "kraeken&kronen");
$result = mysqli_query($conn, "SELECT * FROM zender");

while ($row = mysqli_fetch_assoc($result))
{

?>

<tr>
  <td rowspan = "3"><?php echo $row['naam']; ?><br><?php echo $row['omschrijving']; ?><br><a href="programma.php">programmaomschrijving</a></td>
</tr>

<?php } ?>
</table>
</body>
</html>
<?php

$id = "";
$fname = "";
$lname = "";
$age = "";

$conn = mysqli_connect("localhost:8889", "root", "root", "kraeken&kronen");

function getPosts()
{
	$posts = array();
	$posts[0] = $_POST['idnummer'];
	$posts[1] = $_POST['titel'];
	$posts[2] = $_POST['duur'];
	return $posts;
}

if(isset($_POST['search']))
{ 
	$data = getPosts ();

	$search_Query = "SELECT * FROM nummer WHERE idnummer = $data[0]";

	$search_result = mysqli_query($conn, $search_Query);

	if($search_result)
	{
		if(mysqli_num_rows($search_result))
		{
			while($row = mysqli_fetch_array($search_result))
				{	
					$id = $row['idnummer'];
					$fname = $row['titel'];
					$lname = $row['duur'];

				}
		} else{
			echo 'No data for this id';
		} else {
			echo 'result error';
		}
	}
}
?>



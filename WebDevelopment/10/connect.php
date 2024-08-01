<?php
$username = filter_input(INPUT_POST, 'username');
$password = filter_input(INPUT_POST, 'password');
echo ($username);

if (!($username == null)){
if (!empty($password)){
$host = "localhost";
$dbusername = "root";
$dbpassword = "";
$dbname = "users";
// Create connection
$conn = new mysqli ($host, $dbusername, $dbpassword, $dbname);
if (mysqli_connect_error()){
die('Connect Error ('. mysqli_connect_errno() .') '
. mysqli_connect_error());
}
else{
$sql = "INSERT INTO login (username, password)
values ('$username','$password')";

$sql = "INSERT INTO login (username, password)
values ('Banu','233')";

$sql = "INSERT INTO login (username, password)
values ('nave','523')";


if(mysqli_query($conn, $sql))
{
    $last_id = mysqli_insert_id($conn);
    echo "New record created successfully. Last inserted ID is: ".$last_id;
}

else{
    echo "Error: " .$sql."<br>".mysqli_error($conn);
}

if ($conn->query($sql)){
echo "New record is inserted sucessfully";
}
else{
echo "Error: ". $sql ."
". $conn->error;
}
$conn->close();
}
}
else{
echo "Password should not be empty";
die();
}
}
else{
echo "Username should not be empty";
die();
}
?>
<!DOCTYPE html>
<html>
    <head>
        <title>
            PHP
        </title>
      
    </head>

    <body>

        <H1>Q 1</H1>
        <?php
        echo "PHP is a server scripting language and a powerful tool for making
        dynamic and interactive Web pages.";
        
        echo "<br>";

        echo "PHP is a widely-used, free, and efficient alternative to competitors such
        as Microsoft's ASP.";
        ?>
        <br><br><br><br>

        <h1>Q 2</h1>
        <h2>Click the button to generate a random number<h2>
        <form method="POST">
            <input type="submit" value="Generate" name="btn">
        </form>
        
        <?php
       

        if(isset($_POST['btn']))
        {
            echo("<br>".rand(1,10)."<br>");
        }
        
        ?>

        <br><br>

        <h1>Q 3</h1>
        <form method="POST">
             <label for="fname"><h3>Please input your name :</h3></label>
             <input type="text" id="name" name="name" size="50"><br><br>
                <input type="submit" value="Submit" name="btn2">
            
        </form>

        <?php
       

        if(isset($_POST['btn2']))
        {
            $name = $_POST['name'];
            echo("<h3>Hi my name is :".$name."</h3>");
        }
        
        ?>

            <br><br>

            <h1>Q 4</h1>
            <h2> Check  input number is odd or even<h2>
            <form method="POST">
             <label for="num1"><h3>Please input number :</h3></label>
             <input type="text" id="num1" name="num1" size="50"><br><br>
                <input type="submit" value="Check" name="btn3">
            
            
        </form>

        <?php
       

        if(isset($_POST['btn3']))
        {
            $x = $_POST['num1'];

            if($x%2==0)
            echo("<h3>Even number</h3>");

            else
            echo("<h3>Odd number</h3>");
        }
        
        ?>
    </body>
</html>

<!-- example of form with text inputs -->
<h4>Example of HTML form using the POST method and text inputs</h4>
<form method="post" action="form_process.php">
    <p>
  First Name: <input type="text" name="first_name"><br>
  Last Name: <input type="text" name="last_name"><br>
  </p>
  <input type="submit">
</form>

<!-- same example as before but using the GET method -->
<h4>Example of HTML form using the GET method and text inputs</h4>
<form method="get" action="form_process.php">
    <p>
  First Name: <input type="text" name="first_name"><br>
  Last Name: <input type="text" name="last_name"><br>
  </p>
  <input type="submit">
</form>

<!-- example of form with password inputs -->
<h4>Example of HTML form using the POST method and the password inputs</h4>
<form method="post" action="form_process.php">
    <p>
  Password: <input type="password" name="password"><br>
  </p>
  <input type="submit">
</form>

<!-- example of form with a radio input -->
<h4>Example of HTML form using the POST method and the radio inputs</h4>
<form method="post" action="form_process.php">
    <p>
        What ice cream do you like<br>
    <input type="radio" name="ice_cream" value="chocolate">chocolate
    <input type="radio" name="ice_cream" value="vanilla">vanilla
    <input type="radio" name="ice_cream" value="strawberry">strawberry
    <input type="radio" name="ice_cream" value="other">other
    <br>
    <input type="submit">
    </p>
</form>
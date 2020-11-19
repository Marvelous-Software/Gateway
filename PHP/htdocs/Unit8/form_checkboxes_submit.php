<form method="post" action="form_checkboxes_process.php">
    Select your favorite fruit:<br />

    <p>
        <!-- form using checkboxes. Notice the [] that represent an array --> 
        <input type="checkbox" name="fruits[]" value="apple" />Apple<br>
        <input type="checkbox" name="fruits[]" value="orange" />Orange<br>
        <input type="checkbox" name="fruits[]" value="apricot" />Apricot<br>
        <input type="checkbox" name="fruits[]" value="pineapple" />Pineapple<br>
        <input type="checkbox" name="fruits[]" value="pear" />Pear<br>

    </p>

    <input type="submit" name="submit" value="Submit" />

</form>
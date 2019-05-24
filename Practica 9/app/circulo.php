<?php

    require("figura.php");

    $datos = filter_input_array(INPUT_POST, $_POST);

    $radio = $datos['r'];

    $cir = new Circulo($radio);

    echo $cir->realizarCalculos();
?>
<?php

    require once 'figura.php';

    $datos = filter_input_array(INPUT_POST, $_POST);

    $altura = $datos['a'];
    $base = $datos['b'];

    $rec = new Rectangulo($base, $altura);

    echo $rec->realizarCalculos();
?>
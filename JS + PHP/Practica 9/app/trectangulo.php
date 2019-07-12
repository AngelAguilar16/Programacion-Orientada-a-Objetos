<?php

    require("figura.php");

    $datos = filter_input_array(INPUT_POST, $_POST);

    $altura = $datos['a'];
    $base = $datos['b'];
    $ladoc = $datos['c'];

    $trec = new TrianguloRectangulo($base, $altura, $ladoc);

    echo $trec->realizarCalculos();
?>
<?php

    require("figura.php");

    $datos = filter_input_array(INPUT_POST, $_POST);

    $altura = $datos['a'];
    $base = $datos['b'];
    $ladoc = $datos['c'];

    $teq = new TrianguloEquilatero($base, $altura, $ladoc);

    echo $teq->realizarCalculos();
?>
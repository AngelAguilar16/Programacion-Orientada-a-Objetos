<?php

    require("figura.php");

    $datos = filter_input_array(INPUT_POST, $_POST);

    $altura = $datos['a'];
    $base = $datos['b'];

    $teq = new TrianguloEquilatero($base, $altura);

    echo $teq->realizarCalculos();
?>
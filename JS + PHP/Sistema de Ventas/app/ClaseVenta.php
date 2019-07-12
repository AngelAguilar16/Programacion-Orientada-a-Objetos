<?php

    require("venta.php");

    $valores= filter_input_array(INPUT_POST, $_POST);

    $subtotal = $valores['r'];
    $iva = $valores['l'];
    $total = $valores['g'];

    $ven = new Venta($subtotal, $iva, $total);

    echo $ven->realizarCalculos();
?>
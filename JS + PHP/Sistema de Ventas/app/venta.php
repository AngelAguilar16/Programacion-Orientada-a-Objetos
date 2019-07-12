<?php

    class Venta {
        private $r = 0;
        private $l = 0;
        private $g = 0;

        public function __construct($r, $l, $g){
            $this->r = $r;
            $this->l = $l;
            $this->g = $g;
        }

        public function calculaSubtotal(){
            $this->subtotal = ($this->r * 8) + ($this->l * 15) + ($this->g * 15);
        }

        public function calculaIva(){
            $this->iva = $this->subtotal * .16;
        }

        public function calcularTotal(){
            $this->total = $this->subtotal +  $this->iva;
        }

        public function realizarCalculos(){
            $this->calculaSubtotal();
            $this->calculaIva();
            $this->calcularTotal();
            return json_encode(['s' => $this->subtotal, 'i' => $this->iva, 't' => $this->total]);
        }
    }
?>

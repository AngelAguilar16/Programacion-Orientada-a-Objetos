<?php

    abstract class Figura {
        public $perimetro;
        public $area;

        public abstract function calculaPerimetro();
        public abstract function calculaArea();
    }

    class Rectangulo extends Figura {
        private $base = 0;
        private $altura = 0;

        public function __construct($b, $a){
            $this->base = $b;
            $this->altura = $a;
        }

        public function calculaPerimetro(){
            $this->perimetro = 2 * ($this->base + $this->altura);
        }

        public function calculaArea(){
            $this->area = $this->base * $this->altura;
        }

        public function realizarCalculos(){
            $this->calculaPerimetro();
            $this->calculaArea();
            return json_encode(['a' => $this->area, 'p' => $this->perimetro]);
        }
    }
?>

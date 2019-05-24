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

    class Circulo extends Figura {
        private $radio = 0;

        public function __construct($r){
            $this->radio = $r;
        }

        public function calculaPerimetro(){
            $this->perimetro = 2 * 3.14 * $this->radio;
        }

        public function calculaArea(){
            $this->area = 3.14 * ($this->radio*$this->radio);
        }

        public function realizarCalculos(){
            $this->calculaPerimetro();
            $this->calculaArea();
            return json_encode(['a' => $this->area, 'p' => $this->perimetro]);
        }
    }

    class TrianguloEquilatero extends Figura {
        private $base = 0;
        private $altura = 0;

        public function __construct($b, $a){
            $this->base = $b;
            $this->altura = $a;
        }

        public function calculaPerimetro(){
            $this->perimetro = 3 * $this->base;
        }

        public function calculaArea(){
            $this->area = ($this->base * $this->altura) / 2;
        }

        public function realizarCalculos(){
            $this->calculaPerimetro();
            $this->calculaArea();
            return json_encode(['a' => $this->area, 'p' => $this->perimetro]);
        }
    }

    class TrianguloRectanguloIsosceles extends Figura {
        private $base = 0;
        private $altura = 0;

        public function __construct($b, $a){
            $this->base = $b;
            $this->altura = $a;
        }

        public function calculaPerimetro(){
            $this->perimetro = (2 * $this->base) + $this->altura;
        }

        public function calculaArea(){
            $this->area = ($this->base * $this->altura) / 2;
        }

        public function realizarCalculos(){
            $this->calculaPerimetro();
            $this->calculaArea();
            return json_encode(['a' => $this->area, 'p' => $this->perimetro]);
        }
    }
?>

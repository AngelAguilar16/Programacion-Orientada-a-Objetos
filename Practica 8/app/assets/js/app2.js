var gpo = new Grupo();

const element = document.querySelector("#listaDatos");

const formGuardar = document.querySelector("#form-est");

let nocta = document.querySelector("#nocta");
let nombre = document.querySelector("#nombre");
let email = document.querySelector("#email");


formGuardar.addEventListener('submit', e => {
    e.preventDefault();
    e.stopPropagation();
    var est = new Estudiante(nocta.value, nombre.value, email.value);

    est.nombre = 'C. ' + est.nombre;

    gpo.nuevoEstudiante(est);
    gpo.listaEstudiantes(element);
});
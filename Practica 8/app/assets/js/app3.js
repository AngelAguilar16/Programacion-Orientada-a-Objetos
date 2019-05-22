


var gpo = new Grupo();

const element = document.querySelector('#listaDatos');

const form_guardar = document.querySelector('#form-est');

let nocta  = document.querySelector('#nocta');
let nombre = document.querySelector('#nombre');
let email  = document.querySelector('#email');

form_guardar.addEventListener('submit', e => {

    e.preventDefault();
    e.stopPropagation();

    var est = new Estudiante(nocta.value,nombre.value,email.value);

    est.Nombre = 'C. ' + est.nombre;

    gpo.nuevoEstudiante(est);

    gpo.listaEstudiantes(element);

    

});
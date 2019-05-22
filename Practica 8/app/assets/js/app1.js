var estudiantesObj = {
    data: [{nocta:'20150902', nombre:'Miguel Angel', correo:'mgordillo0@ucol.mx'},
            {nocta:'20150903', nombre:'Juan Manuel', correo:'angel@gmail.com'}],
    element : document.querySelector('#listaDatos'),
    html : '',
    enlistar: function() {
        this.html = '';
        for(let est of this.data){
            this.html += `<tr>
                            <td>${est.nocta}</td>
                            <td>${est.nombre}</td>
                            <td><a href="mailto:${est.correo}"><i class="far fa-envelope"></i></td>
                        </tr>`;
        }
        this.element.innerHTML = this.html;
    }
};

console.log(estudiantesObj);

const btn_cargar = document.querySelector('#guardar');
btn_cargar.addEventListener('click',()=>{
    estudiantesObj.enlistar();
});

/*btn_cargar.addEventListener('click',function(){
    estudiantesObj.enlistar();
});*/
class Estudiante {
   constructor(nc,n,e){
       this.nocta = nc;
       this.nombre = n;
       this.email = e;
   } 
    get noCta(){
        return this.nocta;
    }

    get Nombre(){
        return this.nombre;
    }

    get Email(){
        return this.email;
    }

    set noCta(nc){
        this.nocta = nc;
    }

    set Nombre(n){
        this.nombre = n;
    }

    set Email(e){
        this.email = e;
    }
}

class Grupo {
    constructor(){
        this.estudiantes = new Array();
    }

    nuevoEstudiante(est){
        this.estudiantes.push(est);
    }

    listaEstudiantes(element){
        if(element.tagName === "TBODY"){
            let html = '';
            for(let est of this.estudiantes){
                html += `<tr>
                            <td>${est.nocta}</td>
                            <td>${est.nombre}</td>
                            <td><a href="mailto:${est.email}"><i class="far fa-envelope"></i></a></td>
                        </tr>`;
            }        
            element.innerHTML = html;            
        }else{
            console.log("Error, el elemento debe ser tipo tbody");
        }
    }
}
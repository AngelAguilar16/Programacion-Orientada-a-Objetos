const figura = document.querySelector("#figura");
//const figura = $("#figura"); JQuery

const form = document.querySelector("#form-figura");

figura.addEventListener('change',()=> {
    var html = '';
    switch(figura.value){
        case "2": html =`
                    <div class="form-group">
                        <label for="radio">Radio</label>
                        <input type="number" class="form-control" id="radio"  placeholder="0.0">
                    </div>
                    <button type="submit" class="btn btn-primary">Calcular</button>
                `;break;
        case "1": html = `
                    <div class="form-group">
                        <label for="base">Base</label>
                        <input type="number" class="form-control" id="base"  placeholder="0.0">
                    </div>
                    <div class="form-group">
                        <label for="altura">Altura</label>
                        <input type="number" class="form-control" id="altura" placeholder="0.0">
                    </div>
                    <button type="submit" class="btn btn-primary">Calcular</button>`;
                    break;
        case "3":
        case "4": html =`
                        <div class="form-group">
                            <label for="base">Base</label>
                            <input type="number" class="form-control" id="base"  placeholder="0.0">
                        </div>
                        <div class="form-group">
                            <label for="altura">Altura</label>
                            <input type="number" class="form-control" id="altura" placeholder="0.0">
                        </div>
                        <div class="form-group">
                            <label for="ladoc">Lado C</label>
                            <input type="number" class="form-control" id="ladoc" placeholder="0.0">
                        </div>
                        <button type="submit" class="btn btn-primary">Calcular</button>`;
                        break;
    }
    form.innerHTML = html;
});


form.addEventListener('submit', (e) => {
    e.preventDefault();
    e.stopPropagation();

    var datos = new FormData();
    if(figura.value == 1){
        let altura = document.querySelector("#altura").value;
        let base = document.querySelector("#base").value;
        datos.append('a', altura);
        datos.append('b', base);
    }

    else if(figura.value == 3 && figura.value == 4){
        let altura = document.querySelector("#altura").value;
        let base = document.querySelector("#base").value;
        let ladoc = document.querySelector("#ladoc").value;
        datos.append('a', altura);
        datos.append('b', base);
        datos.append('c', ladoc);
    }

    else if(figura.value == 2){
        let radio = document.querySelector("#radio").value;
        datos.append('r', radio);
    }

    var url = '';
    switch(figura.value){
        case "1":
            url = './app/rectangulo.php'
            break;
        case "2":
            url = './app/circulo.php'
            break;
        case "3":
            url = './app/tequilatero.php'
            break;
        case "4":
            url = './app/trectangulo.php'
            break;
    }

    const resultado = document.querySelector("#resultado");

    fetch(url, {
        method : 'POST', 
        body: datos
    }).then( response => response.json()).then( res => {
        console.log(res);
        let html = `
                    <b>Area: </b>&nbsp;<u>${res.a}</u><br>
                    <b>Perimetro: </b>&nbsp;<u>${res.p}</u><br>
                    `;
        resultado.innerHTML = html;
    }).catch(error => console.error('Hubo un error: ',error));
});


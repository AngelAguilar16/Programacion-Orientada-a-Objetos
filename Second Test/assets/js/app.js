const send = document.querySelector("#form-venta");

send.addEventListener('submit', (e)=> {
    e.preventDefault();
    e.stopPropagation();

    var valores = new FormData();
    let refrescos = document.querySelector("#refresco").value;
    let leche = document.querySelector("#leche").value;
    let galletas = document.querySelector("#galletas").value;
    valores.append('r', refrescos);
    valores.append('l', leche);
    valores.append('g', galletas);

    var url = './app/ClaseVenta.php';

    const venta = document.querySelector("#ventas");

    fetch(url, {
        method : 'POST', 
        body: valores
    }).then( response => response.json()).then( res => {
        console.log(res);
        let html = `<tr>
                        <td>Subtotal</td>
                        <td>${res.s}</td>
                    </tr>
                    <tr>
                        <td>IVA</td>
                        <td>${res.i}</td>
                    </tr>
                    <tr>
                        <td>Total</td>
                        <td>${res.t}</td>
                    </tr>`;
        venta.innerHTML = html;
    }).catch(error => console.error('Hubo un error: ',error));
})
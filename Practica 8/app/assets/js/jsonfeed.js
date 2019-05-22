class Post{
    
    constructor(){
        this.url = 'https://jsonplaceholder.typicode.com/posts';
    }

    verPosts(element){
        let html = '';
        var user = document.getElementById("users");
        var idUser = user.options[user.selectedIndex].value;
        fetch(this.url).then( response => response.json()).then( posts => {
            for(let post of posts){
                if(idUser == "1"){
                    if(post.userId == 1){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "2"){
                    if(post.userId == 2){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "3"){
                    if(post.userId == 3){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "4"){
                    if(post.userId == 4){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "5"){
                    if(post.userId == 5){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "6"){
                    if(post.userId == 6){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "7"){
                    if(post.userId == 7){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "8"){
                    if(post.userId == 8){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "9"){
                    if(post.userId == 9){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
                if(idUser == "10"){
                    if(post.userId == 10){
                        html += `<tr>
                                    <td>${post.userId}</td>
                                    <td>${post.title}</td>
                                    <td>${post.body}</td>
                                </tr>`;
                    }
                }
            }
            console.log(idUser);
            element.innerHTML = html;
        });
    }
}
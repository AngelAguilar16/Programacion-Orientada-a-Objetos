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
                switch(idUser){
                    case "1":
                        if(post.userId == 1){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "2":
                        if(post.userId == 2){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "3":
                        if(post.userId == 3){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "4":
                        if(post.userId == 4){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "5":
                        if(post.userId == 5){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "6":
                        if(post.userId == 6){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "7":
                        if(post.userId == 7){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "8":
                        if(post.userId == 8){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "9":
                        if(post.userId == 9){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                    case "10":
                        if(post.userId == 10){
                            html += `<tr>
                                        <td>${post.userId}</td>
                                        <td>${post.title}</td>
                                        <td>${post.body}</td>
                                    </tr>`;
                        }
                        break;
                }
            }
            console.log(idUser);
            element.innerHTML = html;
        });
    }
}
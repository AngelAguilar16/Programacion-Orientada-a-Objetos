const el = document.querySelector('#listaDatos');
const cargar = document.querySelector('#cargar');

cargar.addEventListener('click', e => {

    e.preventDefault();
    e.stopPropagation();

    var post = new Post();

    post.verPosts(el);
});
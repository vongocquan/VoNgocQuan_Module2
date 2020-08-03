function searching() {
    document.getElementById('list-result').innerHTML = "";
    var kw = document.getElementById('keyword').value;
    fetch("https://api.github.com/search/users?q=" + kw)
        .then(function (res) {
        return res.json();
    })
        .then(function (data) {
        var insertLiTag = document.getElementById('list-result');
        insertLiTag.innerHTML += "<li><b>Total result: " + data.total_count + "</b></li><hr>";
        var i;
        for (i in data.items) {
            insertLiTag.innerHTML +=
                "<li>Id: " + data.items[i].id + "</li>\n                            <li>Login: " + data.items[i].login + "</li>\n                            <li>Url: " + data.items[i].url + "</li>\n                            <li>Repositories url: " + data.items[i].repos_url + "</li>\n                            <li>Type: " + data.items[i].type + "</li>\n                            <hr>";
        }
    });
}

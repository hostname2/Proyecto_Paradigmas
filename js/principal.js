function init() {
    var RefDiv = document.getElementById('menu');

    if (RefDiv) {
        var btn = document.createElement("Button");
        btn.className = 'btn btn1';
        btn.id = 'about-btn';
        btn.innerHTML = 'About';
        RefDiv.appendChild(btn);
    }

    document.getElementById('about-btn').addEventListener('click',
            function () {
                document.querySelector('.bg-about').style.display = 'flex';
            });
}


function ceclose() {
    document.getElementById('close').addEventListener('click',
            function () {
                document.querySelector('.bg-about').style.display = 'none';
            });
}
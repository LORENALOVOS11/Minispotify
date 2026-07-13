function buscarCancion(){

    let texto = document
        .getElementById("buscar")
        .value
        .toLowerCase();


    let canciones = document
        .getElementsByClassName("card");


    for(let i = 0; i < canciones.length; i++){

        let titulo = canciones[i]
            .querySelector(".titulo")
            .textContent
            .toLowerCase();


        if(titulo.includes(texto)){

            canciones[i].style.display = "block";

        } else {

            canciones[i].style.display = "none";

        }

    }

}



// Permitir que solo una canción se reproduzca a la vez

document.addEventListener("play", function(e){

    if(e.target.tagName === "AUDIO"){

        let audios = document.querySelectorAll("audio");


        audios.forEach(function(audio){

            if(audio !== e.target){

                audio.pause();
                audio.currentTime = 0;

            }

        });

    }

}, true);
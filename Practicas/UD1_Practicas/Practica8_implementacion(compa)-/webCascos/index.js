

    // $(document).ready(function () {
    //     $(".card").mouseenter(function () {
    //         console.log("Mouse enter");
    //         const cardLabel = $(this).children(".card-label");
    //         if (cardLabel.length > 0) {
    //             cardLabel.stop(true).slideDown(200);
    //         }
    //     });
    
    //     $(".card").mouseleave(function () {
    //         console.log("Mouse leave");
    //         const cardLabel = $(this).children(".card-label");
    //         if (cardLabel.length > 0) {
    //             cardLabel.stop(true).slideUp(300);
    //         }
    //     });
    // });
    $(document).ready(function () {
        $(".card").mouseenter(function () {
            console.log("Mouse enter");
            const cardLabel = $(this).children(".card-label");
            const image = $(this).children(".card-img-top"); // Cambia ".image-class" por la clase real de tu imagen.
    
            if (cardLabel.length > 0) {
                cardLabel.stop(true).slideDown(200);
            }
    
            if (image.length > 0) {
                image.stop(true).animate({
                    left: "0px", // Cambia este valor al desplazamiento deseado.
                    top: "0px",  // Cambia este valor al desplazamiento deseado.
                    width: "18em" // Cambia este valor a la nueva anchura deseada.
                }, 300); // La duración de la animación en milisegundos.
            }
        });
    
        $(".card").mouseleave(function () {
            console.log("Mouse leave");
            const cardLabel = $(this).children(".card-label");
            const image = $(this).children(".card-img-top"); 
    
            if (cardLabel.length > 0) {
                cardLabel.stop(true).slideUp(300);
            }
    
            if (image.length > 0) {
                image.stop(true).animate({
                    left: "50px",
                    top: "-20px",
                    width: "20em" 
                }, 300); 
            }
        });
    });
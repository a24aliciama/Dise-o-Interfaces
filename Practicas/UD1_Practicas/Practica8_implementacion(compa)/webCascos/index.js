

    $(document).ready(function () {
        $(".card").mouseenter(function () {
            console.log("Mouse enter");
            const cardLabel = $(this).children(".card-label");
            if (cardLabel.length > 0) {
                cardLabel.stop(true).slideDown(200);
            }
        });
    
        $(".card").mouseleave(function () {
            console.log("Mouse leave");
            const cardLabel = $(this).children(".card-label");
            if (cardLabel.length > 0) {
                cardLabel.stop(true).slideUp(300);
            }
        });
    });

$(document).ready(

    function(){

        $(".agree").click(

            function(){

                $(".galletas").fadeOut(1000);

            }
        );

        $("#menu").click(

            function(){
                
                $(".menu").stop();
                $(".menu").slideToggle();
            }
        );

        $(".card-main").mouseenter(
            function(){
                $(this).children(".card-label").stop(true);
                $(this).stop(true);
                $(this).children(".card-label").slideDown(200).parent(".card-main");
        });
        $(".card-main").mouseleave(
            function(){
                $(this).children(".card-label").stop(true);
                $(this).stop(true);
                $(this).children(".card-label").slideUp(300).parent(".card-main");
        });

    }
);
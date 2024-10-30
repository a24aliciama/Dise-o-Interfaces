
// JavaScript para alternar el estado de expansión del menú
const botonColapsador = document.getElementById("botonColapsador");
const menuPadre = document.getElementById("menuPadre");

botonColapsador.addEventListener("click", () => {
    menuPadre.classList.toggle("expandido");
});
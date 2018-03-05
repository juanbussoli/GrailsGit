<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:javascript src="application.js"/>
    <asset:stylesheet src="application.css"/>
    <title>Categorias</title>

    <style>
        .rojo{
            color: red;
        }
        .verde{
            color: green;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Categorias!</h1>

        <ol name="listacat" id="listacat">
            <g:each in="${lista}">
                <li name="${it.active}">${it.name} <a href="http://localhost:8080/category//${it.id}">Link</a> </li>
            </g:each>
        </ol>
</div>


<script>

    $( "#listacat li" ).each(function( index ) {
        if($(this).attr("name")=="true"){
            $(this).addClass("verde");
        }else{
            $(this).addClass("rojo");
        }
    });

</script>

</body>
</html>
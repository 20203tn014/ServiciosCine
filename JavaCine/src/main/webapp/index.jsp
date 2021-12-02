<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% String context = request.getContextPath(); %>

<!DOCTYPE html>
<html>
<head>
    <title>Cine</title>
</head>
<body>

<div class="row">
    <div class="col-12 col-sm-12 col-md-12">
        <section>
            <div class="card">
                <hr>
                <figure class="text-center">
                    <img src="https://www.nti-audio.com/portals/0/pics/en/Teaser-Cinema-1200-500.jpg"
                         class="card-img-top img-fluid" style="height: 325px !important; width: 70%">
                </figure>
                <hr class="bg-info">
                <div class="card-body">
                    <form enctype="multipart/form-data" method="post">
                        <div class="container">
                            <div class="row">
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <h3 style="color: #0056b3" class="">Categoría <i data-feather="film"></i></h3>
                                        <hr>
                                        <label>Nombre de categoría: </label>
                                        <input type="text" id="categoria" name="categoria" class="form-control">
                                    </div>
                                </div>
                                <br>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <br>
                                        <h3 style="color: #0056b3" class="">Película <i data-feather="video"></i></h3>
                                        <hr>
                                        <label>Título: </label>
                                        <input type="text" id="titulo" name="titulo" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <label>Descripción: </label>
                                        <input type="text" id="descripcion" name="descripcion" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <label>Sinopsis: </label>
                                        <input type="text" id="sinopsis" name="sinopsis" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <label>Rating: </label>
                                        <input type="number" id="rating" name="rating" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <label>Fecha de registro: </label>
                                        <input type="datetime-local" id="fecha_registro" name="fecha_registro" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <label>Fecha de actualización: </label>
                                        <input type="datetime-local" id="fecha_actualizacion" name="fecha_actualizacion" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <label>Estado: </label>
                                        <input type="number" id="estado" name="estado" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <div class="form-group">
                                        <label>ID Categoría: </label>
                                        <input type="number" id="id_categoria" name="id_categoria" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <br>
                            <div class="row text-right" style="margin-top: 20px">
                                <div class="col-12">
                                    <button type="submit" class="btn btn-outline-success">Registrar <i data-feather="play"></i></button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-12 bg-white">
            <table class="table table-responsive-sm">
                <thead class="thead-light text-center">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Título</th>
                    <th scope="col">Descripción</th>
                    <th scope="col">Sinopsis</th>
                    <th scope="col">Rating</th>
                    <th scope="col">Fecha de registro</th>
                    <th scope="col">Estado</th>
                    <th scope="col">ID Categoría</th>
                    <th scope="col">Modificar</th>
                    <th scope="col">Eliminar</th>
                </tr>
                </thead>
                <tbody class="text-center">
                        <td class="text-center">
                            <form method="get" action="<%=context%>/mx.edu.utez/client/JavaClientUpdate">
                                <input type="hidden" name="id" value="${pelicula.id}">
                                <button title="Modificar" class="btn btn-outline-warning"><i class="fas fa-edit"></i></button>
                            </form>
                        </td>
                        <td class="text-center">
                            <form method="post" action="<%=context%>/mx.edu.utez/client/JavaClienteDelete">
                                <input type="hidden" name="id" value="${pelicula.id}">
                                <button title="Elminar" class="btn btn-outline-danger"><i class="fas fa-trash"></i></button>
                            </form>
                        </td>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.24.1/feather.min.js"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/feather-icons"></script>
<script>
    feather.replace()
</script>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

</body>
</html>
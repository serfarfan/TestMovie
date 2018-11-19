README RAPPI TEST


Las capas utilizadas con sus respectivas clases y la responsabilidad de cada clase fueron :

1. View: (Vista)
ListActivity: Clase contenedora de los fragments
DetailsFragment: Contiene el detalle de cada ítem
ListMovieFragment: Contiene el recyclerview

Dentro de esta, está el sub paquete Adapter, el cual contiene las clases adapter (Offline y Online) encargadas de inflar el recyclerview con la información respectiva.
Además contiene una interfaz q maneja los onClick de cada tipo de item (Offline y Online)


2. Api (Red)
Contiene las clases: Request, Response, RetrofitClient, ApiManager y la interfaz MovieApi, estas en conjunto conforman la funiconalidad de networking usando la librería Retrofit

3. Util
Es un paquete que contiene 2 clases:
Constants que contiene las constantes globales de la aplicación
Utils que contiene el método estático q consulta el estado de la conexión a internet.

4. Model
 Contiene la clase que permite modelar los atributos de cada movie antes de ser enviada al fragment DetailsFragment

5. Database (Persistencia)
Esta capa está conformada por los subpaquetes:
Async, el cuál posee la clase AppExecutors que utiliza otro thread para cceder a la BD local.
Entity, incluye las 3 entidades de la BD local: Movie, TopRatedMovie y UpComingMovie.
A su vez contiene la clase abstracta MovieDatabase, esta es la BD.
Y finalmente la interfaz DaoAccess que contiene los queries para acceder a la BD local.


6. Controller (Lógica)
Este paquete contiene sólo dos clases:

ListMovieFragController : se encarga de comunicarse con el modelo y la persistencia para modificar la vista del listado y envía la data necesaria para inflar el Detalle.
DetailsFragmentController : se encarga de comunicarse con el modelo y la persistencia para modificar la vista del Detalle.

7. Application
Contiene la clase q extiende a Application y permite retornar el singleton de la base de datos Room. 


PREGUNTAS:


1. En qué consiste el principio de responsabilidad única? Cuál es su propósito?

Es te es el primero de los 5 principios q conforman el SOLID, consisite en que cada método o clase tenga una sola funcionalidad o responsabilidad,
su propósito es facilitar la legibilidad del código y la implementación de cambios.

2. Qué características tiene, según su opinión, un “buen” código o código limpio? 

Un código limpio debe aplicar el principio de responsabilidad única y además:

* Los nombres de los métodos, variables y clases deben ser cortos y dicientes de la funcionalidad que desempeñan.
* Los nombres de los métodos y variables deben seguir el notación camel case, ej: userName
* Los nombres de las clases deben comenzar con mayúscula y seguir la notación camel case, ej: ApiManager 
* Minimizar el número de warnings en cada clase o archivo XML
* Los nombres de los métodos deben ser consistentes a través de todas las clases, ej: si en una clase utilizo "get"
  en otra clase no puedo utilizar  "find"
* Los nombres de los métodos deben comenzar con verbos, ej: increasePrice()
* Para las constantes utilizar letras mayúsculas y separar las palabras por guion bajo, ej : API_KEY = "ytyewyuRgT" 




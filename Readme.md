# Activity Intent implicit y explicit 

1. Intent Explícitos (Ejemplo)
 * Se necesita un objeto de tipo Intent, teniendo en cuenta:
 * El activity donde nos encontramos
 * El activity a donde queremos ir
 * Llamar a startActivity() para que el S.O. lance la segunda actividad.


## Ejemplo:

Haremos es un Activity principal, al que llamaremos ExampleIntentExplicit y dos activitys de nombre
`FirstActivityIntentExplicit` y `SecondActivityIntentExplicit`. En el principal, harán dos botones 
que nos llevará a ambos activitys. Desde los otros dos activity, mostrarán información que el 
principal les pasará y un botón de volver al principal. Queremos programar nuestra primera 
navegación entre activitys


Lo primero es crear los activitys y sus vistas. Dentro del manifest
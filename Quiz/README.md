**Instrucción:**
Desarrolla un programa que valide si una contraseña ingresada por el usuario cumple con los siguientes criterios de seguridad:

- Debe tener al menos 8 caracteres
- Debe contener al menos una letra mayúscula
- Debe contener al menos una letra minúscula
- Debe contener al menos un número
- Debe contener al menos un carácter especial (@, #, $, %, &, *)
El programa debe indicar cuáles criterios no se cumplen.

(c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*')

--LOGICA DEL EJERCICIO--

_Voy a crear 5 variables 

_Una variable se va a llamar contraseña
 Otra se va a llamar letMayus
 Otra se va a llamar letMinus
 Otra se va a llamar numeros
 Otra se va a llamar carEspeciales

_Luego voy a pedir al usuario que ingrese la contraseña y con un Scanner voy a leer los datos ingresados por el usuario y la guardo en la variable contraseña.

_Luego valido si la contraseña es de 8 caracteres como se requiere con un if.

_Luego valido con un else if si contiene una letra mayuscula.

_Luego valido con un else if si contiene una letra minuscula.

_Luego valido con un else if si contiene al menos un numero.

_Luego valido con un else if si contiene algun caracter especial.

_Luego con un else muestro un mensaje si llegado el caso que no cumple con ninguno de los requerimietos.

#Author: Kevin Abdiel Gonzalez
#language: es

@Escenario1
Característica:  Calcular porcentaje de tasa nominal a tasa efectiva

 Yo como usuario quiero ingresar a la pagina web de bancolombia y convertir de tasa nominal a tasa efectiva

Escenario: Convertir de tasa nominal a tasa efectiva
    Dado ingrese a la pagina de GrupoBancolombia
    Y cambie de pestana a bancolombia persona
    Cuando navego hasta la pantalla de conversion de tasas de intereses
    Y realizo la conversion de interes de tasa nominal a efectiva
    Entonces verifico que se refleje el valor del resultado




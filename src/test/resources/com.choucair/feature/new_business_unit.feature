#Autor: Santiago Zapata Álvarez
  Feature: Agregar nueva unidad de negocio
    Yo como automatizador
    Necesito agregar una nueva unidad de negocio
    Para validar el funcionamiento del sistema

  Background:
    Given "Santiago" Desea navegar a la pagina "https://serenity.is/demo/"
    And Se logea con usuario "admin" y password "serenity"

    Scenario: Agregar nueva unidad de negocio
      When Crea una unidad de negocio con el nombre "CRUD"
      Then Valida que la unidad "CRUD" exista en la lista


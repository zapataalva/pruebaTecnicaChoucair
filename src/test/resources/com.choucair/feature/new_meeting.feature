#Autor: Santiago Zapata Álvarez
Feature: Crear nueva reunion
  Yo como automatizador
  Necesito crear una nueva reunion
  Para validar el funcionamiento del sistema

  Background:
    Given "Santiago" Desea navegar a la pagina "https://serenity.is/demo/"
    And Se logea con usuario "admin" y password "serenity"

  Scenario: Crear nueva reunion
    When Crea una reunion con los datos
      | meeting_name   | reunion de automatizacion |
      | meeting_type   | General                   |
      | meeting_number | 3123                      |
      | start_date     | 12/02/2021                |
      | time_start     | 09:00                     |
      | end_date       | 12/02/2021                |
      | time_end       | 16:30                     |
    And Crea una location con los datos
      | name      | Paraiso    |
      | address   | Cl 20 # 32 |
      | latitude  | 1.029123   |
      | longitude | -1.37432   |
    And Crea el usuario organizador con los datos
      | title      | Gestion   |
      | first_name | Santiago  |
      | last_name  | Zapata    |
      | email      | sza       |
      | dominio    | gmail.com |
      | identity   | 10920234  |
      | user       | Admin     |
    And Crea la lista de asistentes con los datos
      | title      | Asistente |
      | first_name | Cecil     |
      | last_name  | Felipe    |
      | email      | felipe    |
      | dominio    | gmail.com |
      | identity   | 12131415  |
      | user       | Admin     |
    And Selecciona el reportero "Santiago Zapata"
    And Selecciona la unidad "CRUD"
    Then Valida que la reunión "reunion de automatizacion" se haya creado correctamente
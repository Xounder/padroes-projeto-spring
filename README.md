# About

### ENG

A simple API that expands the database of a Film Distributor that only had the name of the film, transporting more content to this database from the consumption of the [OMDb](https://www.omdbapi.com/) API to pull this data and store it in the bank. You can also remove, add and show the films inserted in the bank.

### PT-BR

Uma simples API que faz a expansão da database de uma Distribuidora de Filmes que só possuia o nome do filme, transportando para este banco mais conteúdos a partir do consumo da APi do [OMDb](https://www.omdbapi.com/) para puxar esses dados e armazená-los no banco. Podendo também, remover, adicionar e mostrar os filmes inseridos no banco.

## Diagrama das classes

``` mermaid
classDiagram
  class Film {
    - Title: String
    - Year: String
    - Rated: String
    - Released: String
    - Runtime: String
    - Genre: String
    - Director: String
    - Writer: String
    - Actors: String
    - Plot: String
    - Language: String
    - Country: String
    - Awards: String
    - Poster: String
    - Metascore: String
    - imdbRating: String
    - imdbVotes: String
    - imdbID: String
    - Type: String
    - DVD: String
    - BoxOffice: String
    - Production: String
    - Website: String
    - Response: String
  }
  
  class Rating {
    - Source: String
    - Value: String
  }

  Film --> Rating
```

>[!NOTE] 
>
>**PT-BR**
>
>Para uma melhor experiência é utilizado o OpenApi (Swagger) para ter uma interface de visualização via link -> 127.0.0.1:8080/swagger-ui.html
>
>**ENG**
>
>For a better experience, OpenApi (Swagger) is used to have a visualization interface via link -> 127.0.0.1:8080/swagger-ui.html

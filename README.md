# SEM-1-EXAM-5

# 5. Brugere

I dette program skal du lave en klasse User, som repræsenterer en bruger i et system.
Vi kan have flere eller færre oplysninger om brugeren, og derfor skal du overloade konstruktoren, dvs. have flere versioner af den, med forskellige parameterlister.

1. Lav en klasse User
    -	Giv klassen attributterne name, password, email og phoneNumber med passende datatyper
    -	Giv klassen en konstruktør, der tager name og password som parameter
    -	Giv klassen en konstruktør, der tager name, password og email som parameter
    -	Giv klassen en konstruktør, der tager name, password, email og phoneNumber som parameter


2.  Giv klassen getter- og setter-metoder for alle attributter


3.	Giv klassen en toString-metode, som printer de attributter, der har fået værdi (det vil sige, at metoden fx ikke skal printe “email: null” hvis email ikke har fået en værdi).


4.	Lav en klasse Main med en main-metode, hvor du opretter et antal User-objekter ved at bruge de forskellige konstruktører.
      Lav nogle udprint med System.out.println() som viser, at toString()-metoden fungerer efter hensigten.


5. Lav noget validering på det navn som et User-objekt bliver oprettet med:
   Navnet skal starte med stort bogstav og være maks 12 karakterer langt.

6. Lav validering af email: skal indeholde '@'.

6. Lav en liste hvor brugerne er sorteret alfabetisk. Udskriv den sorterede liste.
# SP3: System til at styre bordfodboldturneringer

En skole vil gerne have et system til at styre de studerendes bordfodboldturneringer.

Systemet skal I første omgang bruges af en studerende (som vi kalder turneringslederen) som har ansvaret for at oprette turneringer, tage imod tilmeldinger, skemalægge kampe og registrere kampresultater.

# Oprette turnering

Når en turnering oprettes, skal der angives et start og sluttidspunkt og en beskrivelse af turneringen.

Alle turneringer er knock-out* turneringer med 8 kampe:

- 4 indledende kampe hvor 8 hold bliver sat til at spille mod et andet holdet.

- 2 semifinale kampe hvor de 4 vinderhold sættes til at spille mod et andet vinderhold.

- 1 finalekamp hvor de to vinderhold spiller mod hinanden.

Turneringslederen skal angive hvornår alle disse kampe skal spilles, når han opretter turneringen.

# Registrering af hold

For at tilmelde sig til turneringen skal man henvende sig til turneringslederen med navnet på sit hold og navne på de spillere der er på holdet.

Der må være mindst 2 og højest 5 spillere på et hold. Holdene bestemmer selv hvilke spillere der skal spille i hver kamp og dette registreres ikke.

Når turneringslederen modtager en tilmelding, skal han kunne registrere holdet i systemet.

# Tilføje hold til kampe

Når der er 8 tilmeldte hold til en turnering, kan turneringslederen tilføje hold til alle de indledende kampe.

Når de indledende kampe er spillet, skal han manuelt kunne sætte hvilke hold der skal spille semifinaler mod hinanden, og når semifinalerne er spillet, kan han sætte hvilke hold der skal spille mod hinanden.

Det er altså turneringslederen der bestemmer hvilke hold der spiller mod hinanden i de indledende kampe og i semifinalekampene, og han tilføjer også manuelt hvilke hold der skal spille finalekampen.

Det ville være smart hvis systemet selv kunne sætte de to hold på semifinalekampene ud fra målscoren (hold med højeste målscore spiller mod hold med laveste målscore), men det er ikke et krav, hvis blot systemet kan vise holdenes målscore.

# Registrering af kampresultater

Når en kamp er spillet registrerer turneringslederen resultatet i systemet.

Vinderholdet får 2 point. Der findes ikke uafgjort.

Målscoren er afgørende for slutplaceringen - hvis to hold har samme antal point, er det målscoren der afgør hvem der placeres højest.

Et holds målscore defineres som antal mål de scorede minus antal mål der gik ind.

# Systemet skal kunne vise:

- Alle tilmeldte hold

- Holdenes placering i turneringen

- Et kampprogram hvor alle planlagte kampe listes. Men kun Udfor kampe der ER spillet, vises resultatet

- Hvornår næste kamp spilles.

# Tekniske krav:

- Systemet skal udvikles som en Java applikation

- Tekstbaseret brugerinterface er tilstrækkeligt

- Al data om hold og kampe bliver skrevet til fil hver gang programmet afsluttes, og loadet ind igen når programmet starter.

- Senere skal data kunne gemmes og loades fra en database

- I en knockout turnering går man kun videre hvis man vinder sin kamp.

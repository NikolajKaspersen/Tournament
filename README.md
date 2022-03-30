# SP3: System til styring af bordfodboldturneringer

En skole vil gerne have et system til at styre elevernes bordfodboldturneringer.

Systemet skal i første omgang bruges af en elev (som vi kalder turneringslederen), som er ansvarlig for at oprette turneringer, tage imod tilmeldinger, planlægge kampe og registrere kampresultater.

# Opret turnering

Når en turnering oprettes, skal der angives et start- og sluttidspunkt samt en beskrivelse af turneringen.

Alle turneringer er knock-out * turneringer med 8 kampe:

- 4 indledende kampe, hvor 8 hold skal spille mod et andet hold.

- 2 semifinalekampe, hvor de 4 vinderhold skal spille mod et andet vinderhold.

- 1 finalekamp hvor de to vinderhold spiller mod hinanden.

Turneringslederen skal angive, hvornår alle disse kampe skal spilles, når turneringen oprettes.

# Tilmelding af hold

For at tilmelde dig turneringen skal du kontakte turneringslederen med navnet på dit hold og navnene på spillerne på holdet.

Der skal være minimum 2 og højst 5 spillere på et hold. Holdene bestemmer selv, hvilke spillere der skal spille i hver kamp, og dette er ikke registreret.

Når turneringslederen modtager en tilmelding, skal han kunne tilmelde holdet i systemet.

# Tilføj hold til kampe

Når der er tilmeldt 8 hold til en turnering, kan turneringslederen tilføje hold til alle de indledende kampe.

Når de indledende kampe er spillet, skal han manuelt kunne indstille, hvilke hold der skal spille semifinaler mod hinanden, og når semifinalerne er spillet, kan han indstille, hvilke hold der skal spille mod hinanden.

Det er således turneringslederen, der bestemmer, hvilke hold der skal spille mod hinanden i de indledende kampe og i semifinalekampene, og han tilføjer også manuelt, hvilke hold der skal spille finalekampen.

Det ville være smart, hvis systemet selv kunne sætte de to hold i semifinalekampene ud fra målscore (hold med den højeste målscore spiller mod hold med den laveste målscore), men det er ikke et krav, hvis kun system kan vise holdenes målscore.

# Registrering af kampresultater

Når en kamp er spillet, registrerer turneringslederen resultatet i systemet.

Det vindende hold får 2 point. Der er ingen uafgjort.

Målscoren er afgørende for slutplaceringen – hvis to hold har lige mange point, er det målscore, der afgør, hvem der placeres højest.

Et holds målscore er defineret som antallet af scorede mål minus antallet af scorede mål.

# Systemet skal kunne vise:

- Alle tilmeldte hold

- Holdenes placering i turneringen

- Et kampprogram, hvor alle planlagte kampe er listet. Men kun for kampe, der ER blevet spillet, vil resultatet blive vist.

- Hvornår den næste kamp spilles.

# Tekniske krav:

- Systemet skal udvikles som en Java-applikation

- Tekstbaseret brugergrænseflade er tilstrækkelig

- Alle data om hold og kampe skrives til fil hver gang programmet slutter, og genindlæses når programmet starter.

- Senere skal data kunne gemmes og indlæses fra en database

- I en knockout-turnering går du kun videre, hvis du vinder din kamp.

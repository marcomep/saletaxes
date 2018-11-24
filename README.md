# Assunzioni fatte

- Il sistema è il più semplice possibile per realizzare i requisiti richiesti.
- La ricevuta viene stampata sullo standard output senza alcun particolare formato se non quello che si può evincere dal testo dell'esercizio.
- Non c'è necessità di avere log.
- Non c'è necessità che il sistema sia esposto tramite servizi o comunque che sia richiamabile da remoto.
- L'input viene fornito hard coded tramite test junit.
- Sullo scontrino non deve essere stampato la tipologia generica dell'articolo (es. Book), ma il suo titolo specifico (es. "The Lord of the Ring").
- Tutti gli articoli possono essere importati o meno a seconda della disponibilità in un magazzino locale. La verifica sulla presenza o meno in magazzino dell'articolo non è stata implementata in quanto non richiesta.
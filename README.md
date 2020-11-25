# first_steps

## Installazione di Git for windows x64

- Sono state scelte le opzioni di default
- Git è stato poi configurato con le credenziali github (username e mail), seguendo le indicazioni rintracciabili al seguente link:
  https://kbroman.org/github_tutorial/pages/first_time.html
- E' stata creata una chiave SSH da git, caricata poi su github. Non è stata ancora utilizzata

## Creazione github repo

- Partendo dal mio account github già esistente (Username: Gabe994), è stata creata una prima repository, intitolata
  "first_steps"
- La repo è stata salvata in locale (nella directory /Documents) con il comando git clone da bash git

## Add, Commit, Push, Pull

- Sono stati fatti degli esperimenti con i comandi base di git:
  - modifica del file README.txt in locale (repo "first_steps") utilizzando Sublime Text editor
  - git add -all da git bash per aggiungere le modifiche
  - git commit -m "commento" per fare il commit
  - git push per caricare le modifiche sulla remote repository
  - La repo "first_steps" è stata condivisa con Giovanni, che ha effettuato alcune modifiche sul file README, committato e pushato
    (=======
	 mex da giovanni
	>>>>>>> 9397f9e894754a8b599ab29b0271d75a03d5cbca)
  - Dato che la mia modifica era successiva a quella di Giovanni, il mio push non era inizialmente permesso (Conflict)
  - E' stato necessario eseguire un pull prima del push, per aggiornare il README con le modifiche di Giovanni

### Punti da rivedere
- utilizzo chiave SSH per bypassare richiesta di accesso
- code editing su Sublime Text  





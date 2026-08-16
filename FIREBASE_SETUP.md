# Configurazione Firebase

La versione pubblica del repository non include `app/google-services.json` e non contiene token Firebase hard-coded.

## Procedura

1. Crea o utilizza un progetto Firebase.
2. Registra un'app Android con package `it.uniba.dib.sms22245`.
3. Scarica `google-services.json`.
4. Copialo in `app/google-services.json`.
5. Abilita:
   - Firebase Authentication
   - Cloud Firestore
   - Firebase Storage
6. Apri:
   `app/src/main/java/it/uniba/dib/sms22245/tasks/organization/fragments/OrganizationImportDataFragment.java`
7. Sostituisci `YOUR_FIREBASE_STORAGE_DOWNLOAD_URL` con un URL valido del tuo progetto Firebase.

Le credenziali di test presenti nella documentazione originale sono state rimosse dalla versione pubblica.

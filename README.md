# WebChat App cu Spring Boot

## 1. Introducere
Acest proiect dezvoltă o aplicație de chat web, utilizând diverse tehnologii pentru a oferi utilizatorilor o platformă de comunicare în timp real și securizată. Aplicația permite utilizatorilor să se alăture, să interacționeze și să părăsească camerele de chat fără întreruperi. Construită pe baza Spring Boot, aceasta asigură o arhitectură robustă și scalabilă, în timp ce WebSocket facilitează comunicarea în timp real între server și clienți. Funcționalitățile principale includ alăturarea camerelor de chat, trimiterea de mesaje și părăsirea camerelor, oferind o experiență de chat fluentă și interactivă pentru utilizatorii săi.

---

## 2. Implementare

### 2.1 Tehnologii

- Spring Boot: Oferă configurare rapidă și o structură de bază robustă pentru aplicație.
- Spring Security: Asigură un sistem de autentificare și autorizare pentru securizarea accesului în aplicație.
- Spring Data JPA: Permite gestionarea și persistența datelor utilizatorilor într-un mod eficient și integrat.
- Web Session: Gestionează sesiunile utilizatorilor în mod securizat, păstrând datele sensibile protejate.
- WebSockets: Suportă comunicarea bidirecțională în timp real între client și server, oferind o experiență interactivă.
- Thymeleaf: Un motor de șabloane pentru Java, folosit pentru a genera dinamic pagini web pe partea de server. Acesta permite integrarea ușoară a datelor din backend în interfața utilizatorului, oferind un design personalizat și modern.

---

## 3. Arhitectura și Structura Proiectului

### 3.1 Arhitectura Aplicației
Aplicația utilizează arhitectura **MVC (Model-View-Controller)**, asigurând o separare clară a responsabilităților fiecărei componente:

- **Model**: Gestionează logica aplicației și interacțiunea cu baza de date folosind **Spring JPA** pentru persistența datelor.
- **View**: Se ocupă de afișarea datelor și interacțiunea cu utilizatorii, utilizând șabloanele dinamice oferite de **Thymeleaf**.
- **Controller**: Primește cererile HTTP, interacționează cu serviciile backend și returnează răspunsurile către componenta View.

Aplicația este construită modular, cu funcționalități dedicate pentru securitate, gestionarea sesiunilor și comunicarea în timp real.

### 3.2 Structura Proiectului
Proiectul este organizat în următoarele pachete principale:

- **`controller`**: Conține clasele care gestionează cererile HTTP.
  
- **`repository`**: Administrează interacțiunile cu baza de date folosind Spring JPA.

- **`model`**: Include clasele și entitățile necesare pentru persistența datelor.

- **`config`**: Conține configurările aplicației pentru securitate, WebSockets și alte funcționalități.

- **`service`**: Conține logica de business a aplicației.

- **`filter`**: Este utilizat pentru monitorizarea cookie-urilor, sesiunilor, cache-ului și debugging.

---

## 4. Fluxul de Date

### 4.1 Autorizare și Autentificare
1. Utilizatorul trimite datele de autentificare către server.
2. **Spring Security** validează datele și stochează detaliile utilizatorului în sesiunea activă.

---

## 5. Funcționalități Principale
- **Alăturarea camerelor de chat**: Utilizatorii pot intra în camere de chat existente.
- **Trimiterea mesajelor**: Mesajele sunt trimise în timp real utilizând WebSockets.
- **Părăsirea camerelor de chat**: Utilizatorii pot ieși din camere fără a afecta funcționarea aplicației.
- **Autorizare și autentificare**: Datele utilizatorilor sunt validate și securizate folosind Spring Security.
- **Gestionarea sesiunilor**: Aplicația asigură o gestionare sigură și eficientă a sesiunilor active.

---

## 6. Cerințe de Sistem
- **Java 17+**
- **Spring Boot 3.x**
- **Thymeleaf 3.x**

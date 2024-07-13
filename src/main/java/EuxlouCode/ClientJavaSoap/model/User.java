package EuxlouCode.ClientJavaSoap.model;

import java.util.Date;

public class User {

    private Long id;
    private String role;
    private String nom;
    private String prenom;
    private String email;
    private String token;
    private String tokenRest;
    private Date dateExpirationToken;
    private Date dateExpirationTokenRest;

    public User() {
    }

    public User(Long id, String role, String nom, String prenom, String email, String token, String tokenRest, Date dateExpirationToken, Date dateExpirationTokenRest) {
        this.id = id;
        this.role = role;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.token = token;
        this.tokenRest = tokenRest;
        this.dateExpirationToken = dateExpirationToken;
        this.dateExpirationTokenRest = dateExpirationTokenRest;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenRest() {
        return tokenRest;
    }

    public void setTokenRest(String tokenRest) {
        this.tokenRest = tokenRest;
    }

    public Date getDateExpirationToken() {
        return dateExpirationToken;
    }

    public void setDateExpirationToken(Date dateExpirationToken) {
        this.dateExpirationToken = dateExpirationToken;
    }

    public Date getDateExpirationTokenRest() {
        return dateExpirationTokenRest;
    }

    public void setDateExpirationTokenRest(Date dateExpirationTokenRest) {
        this.dateExpirationTokenRest = dateExpirationTokenRest;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", token='" + token + '\'' +
                ", tokenRest='" + tokenRest + '\'' +
                ", dateExpirationToken=" + dateExpirationToken +
                ", dateExpirationTokenRest=" + dateExpirationTokenRest +
                '}';
    }
}

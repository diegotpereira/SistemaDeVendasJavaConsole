package br.com.java.modelo;

public class Cliente extends Pessoa {
    
    private String email;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf);
        this.email = email;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente \n nome= " + nome + "\n CPF= "+ cpf + "\n email= "+email;
    }

    
}

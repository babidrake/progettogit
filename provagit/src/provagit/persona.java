/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provagit;

/**
 *
 * @author barbaradraghi
 */
public class persona implements personaIF{
    private String nome;
    private String cognome;
    private String soprannome;
    private String universita;
    private String matricola;
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCognome() {
        return cognome;
    }

    public String getSoprannome() {
        return soprannome;
    }

    public String getUniversita() {
        return universita;
    }
 
}

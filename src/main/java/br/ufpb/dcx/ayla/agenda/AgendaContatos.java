package br.ufpb.dcx.ayla.agenda;

public class AgendaContatos {
    private Contato[] contatos;
    public static final int MAX_CONTATOS = 250;

    public AgendaContatos(){
        this.contatos = new Contato[MAX_CONTATOS];
    }
}

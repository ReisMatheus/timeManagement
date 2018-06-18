    /*
Trabalho Final-
Time Management 
Resume: Faca uma agenda dinamica com tudo que consome seu tempo e use as funcoes da aplicacao para otimiza-lo.;

    -Recebe todos as tarefas e tempo gasto com cada tarefa;
    -Distribui tarefas por prioridades (ALTA, MEDIA, BAIXA);
    -Propoe novas atividades (baseadas nas tarefas do usuario);
    -Propoe uma nova distribuicao de horario baseada na prioridade das tarefas;
    -Propoe intervalos de descanco e implementa timer para o mesmo;
    -Mostra grafico de producao diaria baseada no tempo/tarefa;
    -Lista todas as tarefas ja completadas e em curso;
    -Lista tempo gasto em todas as tarefas e em curso;
 */
import java.text.*;
import java.util.*;

public class User {
    protected String nome;
    protected Date data;
    public User(String nome){
        this.nome = nome;
        data = new Date();
    }
    public User(){
        this.nome = "std";
    }
    protected String getNome(){
        return this.nome;
    }
    protected void setNome(String newNome){
        this.nome = newNome;
    }
    private String formataData() throws ParseException{
        String oldString = "00-00-000";
        data = new SimpleDateFormat("dd-MM-yyyy").parse(oldString);
        return oldString;
    }
    protected String getDados(){
        try{
            return this.nome+"\n"+formataData();
        }
        catch(ParseException e){
            return "Erro Formatacao de Data";
        }
    }
}

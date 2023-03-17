class Album{
  private String genero;
  private int ano;
  private String nome;
  private String artista;
  private String musica;

  public Album(String genero,int ano,String nome,String artista){
    this.genero = genero;
    this.ano = ano;
    this.nome = nome;
    this.artista = artista;
  }

  
}

class Musica{
  private String titulo;
  private double duracao;

  public Musica(String titulo, double duracao){
    this.titulo = titulo;
    this.duracao = duracao;
  }

  public void tocarMusica(String musica){
    // for(int i = 0;i < 5; i++){
    //   System.out.println(titulo);
      if(musica == titulo){
        System.out.println("Play: " + musica);
      }else{ System.out.println("Música não encontrada! ");}
    // }
  }
}


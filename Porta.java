class Porta{
  private boolean aberta;
  private String cor;

  public Porta(boolean aberta, String cor){
    this.aberta = aberta;
    this.cor = cor;
  }

  public boolean abre(){
    this.aberta = true;
    return true;
  }

  public boolean fecha(){
    this.aberta = false;
    return false;
  }

  public void estaAberta(){
    if(aberta == true){
      System.out.println("A porta está aberta!");
    }else{
      System.out.println("A porta está fechada!");
    }
  }

  public void print(){
    System.out.println(aberta);
    System.out.println(cor);
  }
}

// class casa{
//   public static void main(String[] args){
//     Porta p1 = new Porta(true, "marrom");
//     p1.abre();
//   }
// }
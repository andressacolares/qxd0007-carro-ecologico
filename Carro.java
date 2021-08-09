public class Carro {
    private int passageiros;
    private int combustivel;
    private int quilometragem;
    private boolean embarcar;
    private boolean desembarcar;
    private boolean dirigir;
    private boolean abastecer;
    
    public int getpassageiros (){
        return getpassageiros();
    }
    public int getcombustivel (){
        return getcombustivel();
    }
    public int getquilometragem(){
        return getquilometragem();
    }
    public boolean embarcar (){
        if (this.passageiros >= 0 && this.passageiros <=2) {
            return true;
            system.out.println ("Embarque realizado com sucesso");
       } else { 
           return false;
            system.out.println ("Não foi possivel realizar o embarque, tente novamente");
          }
    }
    
    public boolean desembarcar (){
        
        if (this.passageiros == 0){
            return true;

            system.out.println ("Não há passageiros para desembarcar");
        }
        else if (this.passageiros==1){
            return true;
            system.out.println ("Desembarque efetuado com sucesso");   
        } else {
            return false;
            system.out.println ("Só é possivel um desembarque por vez");
        }
    }
        
    
public boolean dirigir (){
        
        switch (dirigir) {
            case 1:
                if (this.passageiros > 0 && this.passageiros <=2  && this.combustivel > 0){
                this.quilometragem++;
                return 0;
                system.out.println ("Distancia percorrida em Km" + this.quilometragem);
                }
                break;
               
            case 2:
            if (this.combustivel < this.quilometragem){
                return -1;
            system.out.println ("Foi percorrido em km" + this.quilometragem);
            }
            break;
            
                }
       
    }
    
      public boolean abastecer(){
               if (this.combustivel > 100){
            this.combustivel=0;
            return true;
        } else {
            return false;
            system.out.println ("A quantidade de combustivel" + this.combustivel);
                  } 
                  @Override
                  public String toString() {
                      return "Carro{" +
                              "passageiros=" + -1 +
                              ", combustivel=" + -1 +
                              ", quilometragem=" + -1 +
                              '}';
                  }  
      }
   

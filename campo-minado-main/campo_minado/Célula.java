package campo_minado;

public class C�lula {
 private int numeroDaCelula;
 private char mina, escondidinho, vazio, bandeira ;
 private boolean abrirCelula;
 
 public C�lula() {
	 this.mina = 'B';
	 this.vazio = '*';
	 this.bandeira = 'p';
	 this.escondidinho = '0';
 }
 
 public void explodir() {
	 if(this.escondidinho == this.mina)
		 System.exit(0);
 }
 
 public boolean expansao() {
	 boolean expandir;
	 if(this.abrirCelula == true && this.escondidinho == this.vazio)
		 expandir = true;
	 else expandir = false; 
		return expandir;
 }

 public void colocarBandeira() {
	 if(this.abrirCelula == false)
		 this.escondidinho = this.bandeira;
 }
}


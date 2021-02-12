package edu.pingpong.cotxox.domain;

public class Carrera {

    private String tarjetaCredito = "424242424";

    private String  origen = "Aereopuerto";
    private String destino = "Magalluf";
    private Double distancia = 0.;
    private int tiempoEsperado = 15;
    private int tiempoCarrera = 20;
    private Double costeTotal = 1.;
    private int propina = 5;
    private Conductor conductor;



        public Carrera (String tarjetaCredito){
            this.tarjetaCredito = tarjetaCredito;
        }


		public String getTarjetaCredito() {
			return this.tarjetaCredito;
		}

		public String getOrigen() {
			return origen;
		}

		public void setOrigen(String origen) {
			this.origen = origen;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public Double getDistancia() {
			return distancia;
		}

		public void setDistancia(Double distancia) {
			this.distancia = distancia;
		}

		public int getTiempoEsperado() {
			return tiempoEsperado;
		}

		public void setTiempoEsperado(int tiempoEsperado) {
			this.tiempoEsperado = tiempoEsperado;
		}

		public int getTiempoCarrera() {
			return tiempoCarrera;
		}

		public void setTiempoCarrera(int tiempoCarrera) {
			this.tiempoCarrera = tiempoCarrera;
		}

		public Double getCosteTotal() {
			return costeTotal;
		}

		public void setCosteTotal(Double costeTotal) {
			this.costeTotal = costeTotal;
		}




		public int getPropina() {
			return propina;
		}

		public void setPropina(int propina) {
			this.propina = propina;
		}


        public Conductor getConductor(){
            return this.conductor;
        }




        
    

    
}
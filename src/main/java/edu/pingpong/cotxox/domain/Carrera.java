package edu.pingpong.cotxox.domain;

import java.lang.reflect.Array;

public class Carrera {

    private String tarjetaCredito = "";
    private String  origen = "";
    private String destino = "";
    private Double distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private Double costeTotal = 0d;
    private int propina = 0;
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

		public Double getCosteEsperado(){
			return Tarifa.getCosteDistancia(distancia) + Tarifa.getCosteTiempo(tiempoEsperado); //Tal vez hay que poner aquí el metodo getCostetotalesperado()
			//return Tarifa.getCosteTotalEsperado(this); al usar esto m devuelve 10.455 corregir la clase Tarifa
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

		public void setConductor(Conductor conductor){
			this.conductor = conductor;
		}

        public Conductor getConductor(){
            return this.conductor;
        }

		public void asignarConductor(PoolConductores conductores){
			setConductor(conductores.asignarConductor()); //Este asingarConductor es de la clase PoolConductores
		}


		public void liberarConductor() {
			conductor.setOcupado(false);

		}


		public void recibirPropina(int propina){
			this.propina = propina;

		}


		public void realizarPago(Double costeEsperado) {
			this.getCosteEsperado();
		}




        
    

    
}
package clase_12;

public class Estudiante {

        public int carnet,edad;
        public String nombre,paterno,materno;
        public ListaSimPracticas practicas;
        public ListaDobleEvaluacion evaluaciones;
        

       

        public Estudiante(int carnet, int edad, String nombre, String paterno, String materno,
				ListaSimPracticas practicas, ListaDobleEvaluacion evaluaciones) {
		
			this.carnet = carnet;
			this.edad = edad;
			this.nombre = nombre;
			this.paterno = paterno;
			this.materno = materno;
			this.practicas = practicas;
			this.evaluaciones = evaluaciones;
		}

		public int getCarnet() {
            return carnet;
        }

        public void setCarnet(int carnet) {
            this.carnet = carnet;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getPaterno() {
            return paterno;
        }

        public void setPaterno(String paterno) {
            this.paterno = paterno;
        }

        public String getMaterno() {
            return materno;
        }

        public void setMaterno(String materno) {
            this.materno = materno;
        }
        
        public ListaSimPracticas getPracticas() {
			return practicas;
		}

		public void setPracticas(ListaSimPracticas practicas) {
			this.practicas = practicas;
		}

		public ListaDobleEvaluacion getEvaluaciones() {
			return evaluaciones;
		}

		public void setEvaluaciones(ListaDobleEvaluacion evaluaciones) {
			this.evaluaciones = evaluaciones;
		}

		public void mostrarEstudiante() {
			System.out.println(" ");
            System.out.println("nombre del estudiante: " + this.nombre + " apellido paterno " + this.paterno + " apellido materno " + this.materno + " edad " + this.edad + " carnet: " +this.carnet);
            this.practicas.mostrarListaSimplePracticas();
            this.evaluaciones.mostrarListaDobleEvaluacion();
            System.out.println(" ");
           
            System.out.println("--------------------------------------------------------------");
        }

    }


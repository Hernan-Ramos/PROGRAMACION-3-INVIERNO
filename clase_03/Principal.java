package clase_03;

public class Principal {
    public static void main(String[] args) {
        //pila y cola instancias
        ColaP cp = new ColaP(10);
        PilaM pm1 = new PilaM(10);
        PilaM pm2 = new PilaM(10);
        PilaM pm3 = new PilaM(10);
        //mascotas instancias
        Mascota m1 = new Mascota("Peluza", "Atigrado","Macho",11 );
        Mascota m2 = new Mascota("Tiger", "Egipcio","Macho",12 );
        Mascota m3 = new Mascota("tormenta", "Persa","Hembra",6 );
        Mascota m4 = new Mascota("Coffe", "Mestizo","Macho",13 );
        Mascota m5 = new Mascota("Diana", "Doberman","Hembra",7 );
        Mascota m6 = new Mascota("kobby", "Golden","Hembra",6 );
        Mascota m7 = new Mascota("Lulu", "Mestizo","Hembra",3 );
        // cola de mascotas
        pm1.adicionar(m1);
        pm1.adicionar(m2);
        pm1.adicionar(m3);

        pm2.adicionar(m4);
        pm2.adicionar(m5);
        pm3.adicionar(m6);
        pm3.adicionar(m7);

        Propietarios p1 = new Propietarios("Diego", "Las Retamas",62379604, 18,pm1);
        Propietarios p2 = new Propietarios("Jhoana", "El Alto",62379604, 18,pm2);
        Propietarios p3 = new Propietarios("Cris", "Cotahuma",62379604, 19,pm3);

        //cola de propietarios
        cp.adicionar(p1);
        cp.adicionar(p2);
        cp.adicionar(p3);
        //cp.Mostrar();

        Principal pr = new Principal();
        //pr.mostrarMascotasSexo("Hembra",cp);
        pr.mostrarMascotaNombre("Diana",cp);
     }
     public void mostrarMascotasSexo(String x, ColaP c){
        Propietarios p ;
        ColaP caux = new ColaP(c.max);

        while(!c.esVacia()){
            p = c.eliminar();
            caux.adicionar(p);
            PilaM pilamascotas = p.getMascotas();
            PilaM aux = new PilaM(pilamascotas.max);
            while (!pilamascotas.esVacia()){
                Mascota m = pilamascotas.eliminar();
                aux.adicionar(m);
                if(m.getSexo().equals(x)){
                    m.mostrarMascota();
                }
            }
            pilamascotas.Vaciar(aux);
         }
        c.Vaciar(caux);

     }
    public void mostrarMascotaNombre(String n, ColaP c) {
        Propietarios x;
        ColaP caux = new ColaP(c.max);

        while (!c.esVacia()) {
            x = c.eliminar();
            caux.adicionar(x);

            PilaM pilamascotas = x.getMascotas();
            PilaM paux = new PilaM(pilamascotas.max);
            boolean sw = false;

            while (!pilamascotas.esVacia()) {
                Mascota m = pilamascotas.eliminar();
                paux.adicionar(m);

                if (m.getNombre().equals(n)) {
                    sw = true;
                    if(sw) {
                        x.mostrarDatosPropietario();  // muestra el propietario

                    }
                    m.mostrarMascota();

                }

            }

            // RECIÉN AQUÍ restauras la pila
            pilamascotas.Vaciar(paux);
        }
        // restauras la cola
        c.Vaciar(caux);
    }

}

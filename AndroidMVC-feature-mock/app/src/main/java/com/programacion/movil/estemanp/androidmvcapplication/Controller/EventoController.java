package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.Evento;
import com.programacion.movil.estemanp.androidmvcapplication.R;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by wpena on 17/09/2017.
 */

public class EventoController {
    private static EventoController _instance;

    private ArrayList<Evento> eventos;

    public static EventoController getInstance()
    {
        if (_instance == null)
        {
            _instance = new EventoController();
        }
        return _instance;
    }

    private EventoController(){
        this.fillEventoList();
    }


    private void fillEventoList(){
        eventos = new ArrayList<Evento>();
        eventos.add(new Evento(R.mipmap.feriaflores,"Feria de las flores","Culturales","Cada año, miles de personas se reúnen en torno a esta fiesta, concebida para recordar, exaltar y perpetuar los valores de Antioquia.","Lugar","David Ramos","Llevar flores", new Date(2017, 9 ,18) ));
        eventos.add(new Evento(R.mipmap.ic_cup,"Junior Vs Nacional","Deportivos","Liga Águila","Estadio Atanasio","Wilmar Peña","Todos al estadio",new Date(2017, 9 ,19) ));
        eventos.add(new Evento(R.mipmap.ic_grado,"Grados UNAC","Académicos","Unac","Bolivar Rave","Wilmar Peña","Grados 2017",new Date(2017, 9 ,22) ));
        eventos.add(new Evento(R.mipmap.iglesia,"Semana de Oración","Espiritual","Unac","Iglesia Unac","Pastor iglesia","Prestar atención",new Date(2017, 9 ,18) ));
        eventos.add(new Evento(R.mipmap.unac,"Almuerzo Istitucional","Gastronómico","Almuerzo en campuz universitario","Campus Unac","Bicerrector estudiantil","Traer coca",new Date(2017, 9 ,23) ));
        eventos.add(new Evento(R.mipmap.glovant,"Reunión Globant","Empresarial","Visita Empresarial Glovant","Glovant","Gerente Glovant","Llevar documento de identificación",new Date(2017, 10 ,03) ));
    }


    public ArrayList<Evento> getEventos() {

        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
}

class Sat {

    int sati,minute,sekunde;

    Sat(int sati, int minute, int sekunde) { postavi(sati,minute,sekunde); }

    void postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }

    void sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    void prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    void pomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) sljedeci();
		else for (int i=0; i<-pomak; i++) prethodni();
    }
    int dajSate()  { return sati; }
    int dajMinute()  { return minute; }
    int dajSekunde()  { return sekunde; }
    void ispisi() {
        System.out.println(sati+":"+minute+":"+sekunde);
    }


};
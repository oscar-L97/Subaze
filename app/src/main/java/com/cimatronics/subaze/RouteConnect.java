package com.cimatronics.subaze;

public class RouteConnect {
    public double marker1Lat, marker1Lng, marker2Lat,marker2Lng = 0;
    public int rutas = 0;


    public void setMark1(double lat, double lng){
        this.marker1Lat = lat;
        this.marker1Lng = lng;
    }

    public void setMark2 (double lat, double lng){
        this.marker2Lat = lat;
        this. marker2Lng = lng;
    }


    public void getRoutes(){
        // OTAY
        if ( (marker1Lat > 32.52622631908194) && (marker1Lat <  32.542248261770084) && (marker1Lng < -116.921051269526 ) && (marker1Lng > -116.99232458109341) ){

            //CENTRO
            if ( (marker2Lat > 32.52614687757833) && (marker2Lat <  32.53908203051756) && (marker2Lng < -117.03170152140612 ) && (marker2Lng > -117.05711421455524) ) {
                rutas = 1;
            }
            //5 Y 10
            else if ( (marker2Lat > 32.49521823575567) && (marker2Lat <  32.50502446233908) && (marker2Lng < -116.96134568005485 ) && (marker2Lng > -116.99232458109341) ) {
                rutas = 2;
            }
            //RIO
            else if ( (marker2Lat > 32.5078369262949) && (marker2Lat <  32.52889295230459) && (marker2Lng < -116.99154709543065 ) && (marker2Lng > -117.02943118104425) ) {
                rutas = 3;
            }
            //INSURGENTES
            else if ( (marker2Lat > 32.45828482969817) && (marker2Lat <  32.49917957560338) && (marker2Lng < -116.90087622135772 ) && (marker2Lng > -116.93738621351272) ) {
                rutas = 4;
            }
            //MARIANO
            else if ( (marker2Lat > 32.47816737006107) && (marker2Lat <  32.501484307869376) && (marker2Lng < -116.87615487504667 ) && (marker2Lng > -116.90063227083152) ) {
                rutas = 5;
            }
            //FLORIDO
            else if ( (marker2Lat > 32.46192520378638) && (marker2Lat <  32.474667916628555) && (marker2Lng < -116.85990092912897 ) && (marker2Lng > -116.87484369478148) ) {
                rutas = 6;
            }
        }
        //CENTRO
        else if ( (marker1Lat > 32.52614687757833) && (marker1Lat <  32.53908203051756) && (marker1Lng < -117.03170152140612 ) && (marker1Lng > -117.05711421455524) ) {

            // OTAY
            if ((marker2Lat > 32.52622631908194) && (marker2Lat < 32.542248261770084) && (marker2Lng < -116.921051269526) && (marker2Lng > -116.99232458109341)) {
                rutas = 1;
            }
            //5 Y 10
            else if ( (marker2Lat > 32.49521823575567) && (marker2Lat <  32.50502446233908) && (marker2Lng < -116.96134568005485 ) && (marker2Lng > -116.99232458109341) ) {
                rutas = 7;
            }
            //RIO
            else if ( (marker2Lat > 32.5078369262949) && (marker2Lat <  32.52889295230459) && (marker2Lng < -116.99154709543065 ) && (marker2Lng > -117.02943118104425) ) {
                rutas = 8;
            }
            //INSURGENTES
            else if ( (marker2Lat > 32.45828482969817) && (marker2Lat <  32.49917957560338) && (marker2Lng < -116.90087622135772 ) && (marker2Lng > -116.93738621351272) ) {
                rutas = 9;
            }
            //MARIANO
            else if ( (marker2Lat > 32.47816737006107) && (marker2Lat <  32.501484307869376) && (marker2Lng < -116.87615487504667 ) && (marker2Lng > -116.90063227083152) ) {
                rutas = 10;
            }
            //FLORIDO
            else if ( (marker2Lat > 32.46192520378638) && (marker2Lat <  32.474667916628555) && (marker2Lng < -116.85990092912897 ) && (marker2Lng > -116.87484369478148) ) {
                rutas = 11;
            }
        }
        //5 Y 10
        else if ( (marker1Lat > 32.49521823575567) && (marker1Lat <  32.50502446233908) && (marker1Lng < -116.96134568005485 ) && (marker1Lng > -116.99232458109341) ) {

            // OTAY
            if ( (marker2Lat > 32.52622631908194) && (marker2Lat <  32.542248261770084) && (marker2Lng < -116.921051269526 ) && (marker2Lng > -116.99232458109341) ){
                rutas = 2;
            }
            //CENTRO
            else if ( (marker2Lat > 32.52614687757833) && (marker2Lat <  32.53908203051756) && (marker2Lng < -117.03170152140612 ) && (marker2Lng > -117.05711421455524) ) {
                rutas = 7;
            }
            //RIO
            else if ( (marker2Lat > 32.5078369262949) && (marker2Lat <  32.52889295230459) && (marker2Lng < -116.99154709543065 ) && (marker2Lng > -117.02943118104425) ) {
                rutas = 12;
            }
            //INSURGENTES
            else if ( (marker2Lat > 32.45828482969817) && (marker2Lat <  32.49917957560338) && (marker2Lng < -116.90087622135772 ) && (marker2Lng > -116.93738621351272) ) {
                rutas = 13;
            }
            //MARIANO
            else if ( (marker2Lat > 32.47816737006107) && (marker2Lat <  32.501484307869376) && (marker2Lng < -116.87615487504667 ) && (marker2Lng > -116.90063227083152) ) {
                rutas = 14;
            }
            //FLORIDO
            else if ( (marker2Lat > 32.46192520378638) && (marker2Lat <  32.474667916628555) && (marker2Lng < -116.85990092912897 ) && (marker2Lng > -116.87484369478148) ) {
                rutas = 15;
            }

        }
        //RIO
        else if ( (marker1Lat > 32.5078369262949) && (marker1Lat <  32.52889295230459) && (marker1Lng < -116.99154709543065 ) && (marker1Lng > -117.02943118104425) ) {

            // OTAY
            if ( (marker2Lat > 32.52622631908194) && (marker2Lat <  32.542248261770084) && (marker2Lng < -116.921051269526 ) && (marker2Lng > -116.99232458109341) ){
                rutas = 3;
            }
            //CENTRO
            else if ( (marker2Lat > 32.52614687757833) && (marker2Lat <  32.53908203051756) && (marker2Lng < -117.03170152140612 ) && (marker2Lng > -117.05711421455524) ) {
                rutas = 8;
            }
            //5 Y 10
            else if ( (marker2Lat > 32.49521823575567) && (marker2Lat <  32.50502446233908) && (marker2Lng < -116.96134568005485 ) && (marker2Lng > -116.99232458109341) ) {
                rutas = 12;
            }
            //INSURGENTES
            else if ( (marker2Lat > 32.45828482969817) && (marker2Lat <  32.49917957560338) && (marker2Lng < -116.90087622135772 ) && (marker2Lng > -116.93738621351272) ) {
                rutas = 16;
            }
            //MARIANO
            else if ( (marker2Lat > 32.47816737006107) && (marker2Lat <  32.501484307869376) && (marker2Lng < -116.87615487504667 ) && (marker2Lng > -116.90063227083152) ) {
                rutas = 17;
            }
            //FLORIDO
            else if ( (marker2Lat > 32.46192520378638) && (marker2Lat <  32.474667916628555) && (marker2Lng < -116.85990092912897 ) && (marker2Lng > -116.87484369478148) ) {
                rutas = 18;
            }

        }
        //INSURGENTES
        else if ( (marker1Lat > 32.45828482969817) && (marker1Lat <  32.49917957560338) && (marker1Lng < -116.90087622135772 ) && (marker1Lng > -116.93738621351272  ) ) {

            // OTAY
            if ( (marker2Lat > 32.52622631908194) && (marker2Lat <  32.542248261770084) && (marker2Lng < -116.921051269526 ) && (marker2Lng > -116.99232458109341) ){
                rutas = 4;
            }
            //CENTRO
            else if ( (marker2Lat > 32.52614687757833) && (marker2Lat <  32.53908203051756) && (marker2Lng < -117.03170152140612 ) && (marker2Lng > -117.05711421455524) ) {
                rutas = 9;
            }
            //5 Y 10
            else if ( (marker2Lat > 32.49521823575567) && (marker2Lat <  32.50502446233908) && (marker2Lng < -116.96134568005485 ) && (marker2Lng > -116.99232458109341) ) {
                rutas = 13;
            }
            //RIO
            else if ( (marker2Lat > 32.5078369262949) && (marker2Lat <  32.52889295230459) && (marker2Lng < -116.99154709543065 ) && (marker2Lng > -117.02943118104425) ) {
                rutas = 16;
            }
            //MARIANO
            else if ( (marker2Lat > 32.47816737006107) && (marker2Lat <  32.501484307869376) && (marker2Lng < -116.87615487504667 ) && (marker2Lng > -116.90063227083152) ) {
                rutas = 19;
            }
            //FLORIDO
            else if ( (marker2Lat > 32.46192520378638) && (marker2Lat <  32.474667916628555) && (marker2Lng < -116.85990092912897 ) && (marker2Lng > -116.87484369478148) ) {
                rutas = 20;
            }
        }
        //MARIANO
        else if ( (marker1Lat > 32.47816737006107) && (marker1Lat <  32.501484307869376) && (marker1Lng < -116.87615487504667 ) && (marker1Lng > -116.90063227083152) ) {
            // OTAY
            if ( (marker2Lat > 32.52622631908194) && (marker2Lat <  32.542248261770084) && (marker2Lng < -116.921051269526 ) && (marker2Lng > -116.99232458109341) ){
                rutas = 5;
            }
            //CENTRO
            else if ( (marker2Lat > 32.52614687757833) && (marker2Lat <  32.53908203051756) && (marker2Lng < -117.03170152140612 ) && (marker2Lng > -117.05711421455524) ) {
                rutas = 10;
            }
            //5 Y 10
            else if ( (marker2Lat > 32.49521823575567) && (marker2Lat <  32.50502446233908) && (marker2Lng < -116.96134568005485 ) && (marker2Lng > -116.99232458109341) ) {
                rutas = 14;
            }
            //RIO
            else if ( (marker2Lat > 32.5078369262949) && (marker2Lat <  32.52889295230459) && (marker2Lng < -116.99154709543065 ) && (marker2Lng > -117.02943118104425) ) {
                rutas = 17;
            }
            //INSURGENTES
            else if ( (marker2Lat > 32.45828482969817) && (marker2Lat <  32.49917957560338) && (marker2Lng < -116.90087622135772 ) && (marker2Lng > -116.93738621351272) ) {
                rutas = 19;
            }
            //FLORIDO
            else if ( (marker2Lat > 32.46192520378638) && (marker2Lat <  32.474667916628555) && (marker2Lng < -116.85990092912897 ) && (marker2Lng > -116.87484369478148) ) {
                rutas = 21;
            }
        }
        //FLORIDO
        else if ( (marker1Lat > 32.46192520378638) && (marker1Lat <  32.474667916628555) && (marker1Lng < -116.85990092912897 ) && (marker1Lng > -116.87484369478148) ) {
            // OTAY
            if ( (marker2Lat > 32.52622631908194) && (marker2Lat <  32.542248261770084) && (marker2Lng < -116.921051269526 ) && (marker2Lng > -116.99232458109341) ){
                rutas = 6;
            }
            //CENTRO
            else if ( (marker2Lat > 32.52614687757833) && (marker2Lat <  32.53908203051756) && (marker2Lng < -117.03170152140612 ) && (marker2Lng > -117.05711421455524) ) {
                rutas = 11;
            }
            //5 Y 10
            else if ( (marker2Lat > 32.49521823575567) && (marker2Lat <  32.50502446233908) && (marker2Lng < -116.96134568005485 ) && (marker2Lng > -116.99232458109341) ) {
                rutas = 15;
            }
            //RIO
            else if ( (marker2Lat > 32.5078369262949) && (marker2Lat <  32.52889295230459) && (marker2Lng < -116.99154709543065 ) && (marker2Lng > -117.02943118104425) ) {
                rutas = 18;
            }
            //INSURGENTES
            else if ( (marker2Lat > 32.45828482969817) && (marker2Lat <  32.49917957560338) && (marker2Lng < -116.90087622135772 ) && (marker2Lng > -116.93738621351272) ) {
                rutas = 20;
            }
            //MARIANO
            else if ( (marker2Lat > 32.47816737006107) && (marker2Lat <  32.501484307869376) && (marker2Lng < -116.87615487504667 ) && (marker2Lng > -116.90063227083152) ) {
                rutas = 22;
            }
        }
        else {

        }
    }
        /*
        Florido 3
    Lat inferior: marker1Lat > 32.46192520378638
    Lat superior: marker1Lat <  32.474667916628555
    lng derecho: marker1Lng < -116.85990092912897
    Lng izquierdo: marker1Lng > -116.87484369478148

        Centro
    Lat inferior: marker1Lat > 32.52614687757833
    Lat superior: marker1Lat < 32.53908203051756
    Lng derecho: marker1Lng < -117.03170152140612
    Lng izquierdo: marker1Lng > -117.05711421455524

        5 Y 10
    Lat inferior: marker1Lat > 32.49521823575567
    Lat superior: maker1Lat < 32.50502446233908
    Lng derecho: marker1Lng < -116.96134568005485
    Lng izquierdo: marker1Lng >  -116.9757834093192

        Otay
    Lat inferior: marker1Lat > 32.52622631908194
    Lat superior: marker1Lat < 32.542248261770084
    Lng derecho: marker1Lng < -116.921051269526
    Lng izquierdo: marker1Lng > -116.99232458109341

        Mariano
     Lat inferior: marker1Lat > 32.47816737006107
     Lat superior: marker1Lat < 32.501484307869376
     Lng derecho: marker1Lng < -116.87615487504667
     Lng izquierdo: marker1Lng > -116.90063227083152

        Rio
     Lat inferior: marker1Lat >  32.5078369262949
     Lat superior: marker1Lat < 32.52889295230459
     Lng derecho: marker1Ln < -116.99154709543065
     Lng izquierdo: marker1Lng > -117.02943118104425

        Insurgentes (parte de pinos)
     Lat inferior: marker1Lat > 32.45828482969817
     Lat superior: marker1Lat < 32.49917957560338
     Lng derocho: marker1Lng < -116.90087622135772
     Lng izquierdo: marker1Lng > -116.93738621351272

    */
}

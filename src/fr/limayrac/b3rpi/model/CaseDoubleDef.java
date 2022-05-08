package fr.limayrac.b3rpi.model;

public class CaseDoubleDef extends CaseDef {


    public CaseDoubleDef(Coordonnee coordonnee) {
        super(coordonnee);
    }

    public class Definition {
        private String def2;
        private String direction2;

        public Definition(String definition) {
            this.def2 = definition;
        }

        //recupere la deuxieme definition
        public String getDef2() {
            return this.def2;
        }

    }

}

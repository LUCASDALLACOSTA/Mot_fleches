package fr.limayrac.b3rpi.model;

public class CaseDef extends Case {


    public CaseDef(Coordonnee coordonnee) {
        super(coordonnee);
    }

    public class Definition {
        private String def;
        private String direction;

        //recupere la definition et la directio pour la case
        public Definition(String definition, String direction) {
            this.def = definition;
            this.direction = direction;
        }

        //recupere la definition
        public String getDef() {
            return this.def;
        }

        //recupere la direction
        public String getDirection() {
            return this.direction;
        }
    }

}

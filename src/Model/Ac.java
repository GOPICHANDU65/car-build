package Model;

public class Ac {


        private double capacity;
        private String Company;

        public Ac(double capacity, String company) {
            this.capacity = capacity;
            this.Company = company;
        }

        @Override
        public String toString() {
            return  "Company "+Company+ "," +" Capasity " + capacity ;
        }


    }


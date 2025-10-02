package com.pluralsight;

    public class SuperSayin {

        String name;
        int powerlevel;

        public void PowerUp(){
            this.powerlevel = this.powerlevel *2;
        }

        public void Stats() {
            System.out.println(this.name + " powerlevel is " + this.powerlevel);
            if(this.powerlevel > 9000)
            {
                System.out.println("Vegeta shouts: ITS OVER 9000!");
            }
        }
        public void Attack(SuperSayin _anySaiyan) {
            _anySaiyan.powerlevel = _anySaiyan.powerlevel -100;
        }

        public void HealingDrink() {
        this.powerlevel+=2000;
        }
    }


    // A class is a blueprint to create a type of object


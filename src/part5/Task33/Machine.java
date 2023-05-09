package part5.Task33;

class Machine implements TurnOn{
       String name;

        public Machine(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println(name);
        }


        @Override
        public void TurnOn() {
            System.out.println(name + "  turn on");
        }
    }


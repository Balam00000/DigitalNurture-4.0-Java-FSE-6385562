class Computer {
     private String CPU;
    private String RAM;

    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    Computer(Builder builder){
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.graphicsCard=builder.graphicsCard;
        this.operatingSystem=builder.operatingSystem;

    }
    public  static class Builder{
         private String CPU;
         private String RAM;
         private String storage;
        private String graphicsCard;
        private String operatingSystem;

        Builder(String CPU,String RAM){
            this.CPU=CPU;
            this.RAM=RAM;
        }
        public Builder setstorage(String storage){
            this.storage=storage;
            return this;
        }
        public Builder setgraphisCard(String graphicsCard){
            this.graphicsCard=graphicsCard;
            return this;
        }
        public Builder setoperatingSystem(String operatingSystem){
            this.operatingSystem=operatingSystem;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
    @Override
    public String toString(){
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
                 ", GraphicsCard=" + graphicsCard + ", OS=" + operatingSystem + "]";
    }
}
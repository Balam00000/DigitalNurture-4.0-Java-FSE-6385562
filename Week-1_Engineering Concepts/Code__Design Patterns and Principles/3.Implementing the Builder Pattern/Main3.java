public class Main3 {
    public static void main(String[] args) {
        Computer Basiccomputer=new Computer.Builder("Intel i5", "8GB").build();
        Computer gamingComputer=new Computer.Builder("AMD Ryzen 9", "32GB")
                                .setstorage("1TB SSD")
                                .setgraphisCard("NVIDIA RTX 3080")
                                .setoperatingSystem("Windows 11")
                                .build();

          System.out.println("Basic Computer: " + Basiccomputer);
          System.out.println("Gaming Computer: " + gamingComputer);                       

    }
    
}

public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        CPU.Harddisk hd1TB = myKomputer.new Harddisk(512, "Seagate");
        CPU.Motherboard mb = myKomputer.new Motherboard("ATX", "ASUS");
        CPU.PowerSupply psu = myKomputer.new PowerSupply(600, "Corsair");
        CPU.VGACard vga = myKomputer.new VGACard("NVIDIA", "GTX 1680");

        hd1TB.getHarddiskInfo();
        mb.getMotherboardInfo();
        psu.getPowerSupplyInfo();
        vga.getVGACardInfo();
    }
}
package Work6.Num10;

public class Computer {
    private String name;
    private String mark;
    private Processor processor;
    private Monitor monitor;
    private Memory memory;
    public Computer(String namePc, String nameProc, String nameMem, String nameMon){
        this.name = namePc;
        processor = new Processor(nameProc);
        monitor = new Monitor(nameMon);
        memory = new Memory(nameMem);
    }
    public void setMark(String mark){
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void info() {
        System.out.println("Name: " + name + "mask: " + mark + "monitor mark: " + monitor.getName() + "processor mark: " + processor.getName() + "memory mark: " + memory.getName());
    }
}

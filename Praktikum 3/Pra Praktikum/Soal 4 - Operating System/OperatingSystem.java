public abstract class OperatingSystem {
    private String name;
    private String version;
    private String kernelType;
    private double baseScore;


    public OperatingSystem(String name, String version, String kernelType, double baseScore) {
        this.name = name;
        this.version = version;
        this.kernelType = kernelType;
        this.baseScore = baseScore;
    }
}
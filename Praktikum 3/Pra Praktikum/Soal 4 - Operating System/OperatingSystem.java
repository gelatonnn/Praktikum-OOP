public abstract class OperatingSystem {
    private String name;
    private String version;
    private String kernelType;
    private double baseScore;

    public OperatingSystem(String name, String version, String kernelType, double baseScore) {
    this.name = (name == null || name.isEmpty()) ? "Unknown OS" : name;
    this.version = (version == null || version.isEmpty()) ? "Unknown Version" : version;
    this.kernelType = (kernelType == null || kernelType.isEmpty()) ? "Unknown Kernel" : kernelType;
    this.baseScore = baseScore;
    }

    public String getName() {
        return name;
    }
    
    public String getVersion() {
        return version;
    }
    
    public String getKernelType() {
        return kernelType;
    }
    
    public double getBaseScore() {
        return baseScore;
    }
    
    public abstract double calculateCompatibility(UsageType usage);

    protected double clampScore(double score){
        if (score > 100){
            return 100;
        }
        if (score < 0){
            return 0;
        }
        return score;
    }

    protected String getAdditionalInfo() {
        return "";
    }

    public void printInfo(UsageType usage) {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Version: %s%n", version);
        System.out.printf("Kernel Type: %s%n", kernelType);
        
        String additionalInfo = getAdditionalInfo();
        if (!additionalInfo.isEmpty()) {
            System.out.printf("%s%n", additionalInfo);
        }
        
        System.out.printf("Base Score: %.2f%n", baseScore);
        System.out.printf("Compatibility for %s: %.2f%n", usage.name(), calculateCompatibility(usage));
    }

}

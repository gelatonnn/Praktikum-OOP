
import Praktikum.UsageType;

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

    public abstract double calculatePerformanceScore();

    protected double clampScore(double score) {
        if (score < 0) {
            return 0;
        } else if (score > 100) {
            return 100;
        }
        return score;
    }

    protected String getAdditionalInfo() {
        return "";
    }

    public void printInfo(UsageType usage) {
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Kernel Type: " + kernelType);
        String addInfo = getAdditionalInfo();
        
        if (!addInfo.isEmpty()) {
            System.out.println(addInfo);
        }

        System.out.printf("Base Score: %.2f%n", baseScore);
        System.out.printf("Compatibility for %s: %.2f%n", usage.name(), calculateCompatibility(usage));
    }
}
public class Linux extends OperatingSystem {
    public enum Distro {
        UBUNTU, FEDORA, ARCH, DEBIAN
    }
    
    private Distro distroType;

    public Linux(String name, String version, String kernelType, double baseScore, Distro distroType) {
        super(name, version, kernelType, baseScore);
        this.distroType = distroType;
    }

    public double calculateCompatibility(UsageType usage) {
        double multiplier = 0;
        if (usage == UsageType.SERVER) {
            multiplier = 0.2;
        } else if (usage == UsageType.DEVELOPMENT) {
            multiplier = 0.1;
        } else if (usage == UsageType.GAMING) {
            multiplier = -0.15;
        }
        double result = getBaseScore() + (getBaseScore() * multiplier);
        return clampScore(result);
    }

    @Override
    protected String getAdditionalInfo() {
        return "Distribution: " + distroType.name();
    }
}
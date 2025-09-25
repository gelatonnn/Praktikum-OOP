public class MacOS extends OperatingSystem {
    private boolean hasMSeriesChip;

    public MacOS(String name, String version, String kernelType, double baseScore, boolean hasMSeriesChip) {
        super(name, version, kernelType, baseScore);
        this.hasMSeriesChip = hasMSeriesChip;
    }

    public boolean isHasMSeriesChip() {
        return hasMSeriesChip;
    }

    public double calculateCompatibility(UsageType usage) {
        double multiplier = 0;
        if (usage == UsageType.DEVELOPMENT) {
            multiplier += 0.25;
        } else if (usage == UsageType.GAMING) {
            multiplier += -0.20;
        }

        if (hasMSeriesChip) {
            multiplier += 0.10;
        }

        double result = getBaseScore() + multiplier * getBaseScore();
        return clampScore(result);
    }

    @Override
    protected String getAdditionalInfo() {
        return "Has M-Series Chip: " + (hasMSeriesChip ? "Yes" : "No");
    }
}
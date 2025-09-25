public class Windows extends OperatingSystem {
    public enum Edition {
        HOME, PRO, SERVER
    }

    private Edition edition;

    public Windows(String name, String version, String kernelType, double baseScore, Edition edition) {
        super(name, version, kernelType, baseScore);
        this.edition = edition;
    }

    public Edition getEditionType() {
        return edition;
    }

    public double calculateCompatibility(UsageType usage) {
        double multiplier = 0;

        if (edition == Edition.SERVER && usage == UsageType.SERVER) {
            multiplier += 0.30;
        }

        if (usage == UsageType.GAMING) {
            multiplier += 0.20;
        }

        if (edition == Edition.HOME && usage == UsageType.SERVER) {
            multiplier += -0.05;
        }

        double result = getBaseScore() + multiplier * getBaseScore();
        return clampScore(result);
    }

    @Override
    protected String getAdditionalInfo() {
        return "Edition: " + edition.name();
    }
}

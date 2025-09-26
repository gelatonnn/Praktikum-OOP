class MacOS extends OperatingSystem {
    private boolean hasMSeriesChip;
    
    public MacOS(String name, String version, String kernelType, double baseScore, boolean hasMSeriesChip) {
        super(name, version, kernelType, baseScore);
        this.hasMSeriesChip = hasMSeriesChip;
    }
    
    public boolean hasMSeriesChip() {
        return hasMSeriesChip;
    }
    
    @Override
    protected String getAdditionalInfo() {
        return "Has M-Series Chip: " + (hasMSeriesChip ? "Yes" : "No");
    }
    
    @Override
    public double calculateCompatibility(UsageType usage) {
        double multiplier = 0.0;
        
        switch (usage) {
            case DEVELOPMENT:
                multiplier = 0.25;
                break;
            case GAMING:
                multiplier = -0.20;
                break;
            case SERVER:
                multiplier = 0.0;
                break;
        }
        
        if (hasMSeriesChip) {
            multiplier += 0.10;
        }
        
        double score = getBaseScore() + (multiplier * getBaseScore());
        return clampScore(score);
    }
}
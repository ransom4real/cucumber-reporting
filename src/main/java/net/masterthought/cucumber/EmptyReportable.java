package net.masterthought.cucumber;

import net.masterthought.cucumber.json.support.Status;

/**
 * Defines empty reportable that is used when the build fails.
 *
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class EmptyReportable implements Reportable {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDeviceName() {
        return null;
    }

    @Override
    public int getFeatures() {
        return 0;
    }

    @Override
    public int getPassedFeatures() {
        return 0;
    }

    @Override
    public int getFailedFeatures() {
        return 0;
    }

    @Override
    public int getPendingFeatures() { return 0; }

    @Override
    public int getUndefinedFeatures() { return 0; }

    @Override
    public int getScenarios() {
        return 0;
    }

    @Override
    public int getPassedScenarios() {
        return 0;
    }

    @Override
    public int getFailedScenarios() {
        return 0;
    }

    @Override
    public int getPendingScenarios() { return 0; }

    @Override
    public int getUndefinedScenarios() { return 0; }

    @Override
    public int getSteps() {
        return 0;
    }

    @Override
    public int getPassedSteps() {
        return 0;
    }

    @Override
    public int getFailedSteps() {
        return 0;
    }

    @Override
    public int getSkippedSteps() {
        return 0;
    }

    @Override
    public int getUndefinedSteps() {
        return 0;
    }

    @Override
    public int getPendingSteps() {
        return 0;
    }

    @Override
    public long getDurations() {
        return 0;
    }

    @Override
    public String getFormattedDurations() {
        return null;
    }

    @Override
    public Status getStatus() {
        return null;
    }
}

package tmp

import org.spockframework.runtime.AbstractRunListener
import org.spockframework.runtime.model.ErrorInfo
import org.spockframework.runtime.model.FeatureInfo
import org.spockframework.runtime.model.IterationInfo
import org.spockframework.runtime.model.SpecInfo

class Wtf extends AbstractRunListener
{
    @Override
    void beforeSpec(SpecInfo spec) {
        super.beforeSpec(spec)
    }

    @Override
    void beforeFeature(FeatureInfo feature) {
        super.beforeFeature(feature)
    }

    @Override
    void beforeIteration(IterationInfo iteration) {
        super.beforeIteration(iteration)
    }

    @Override
    void afterIteration(IterationInfo iteration) {
        super.afterIteration(iteration)
    }

    @Override
    void afterFeature(FeatureInfo feature) {
        super.afterFeature(feature)
    }

    @Override
    void afterSpec(SpecInfo spec) {
        super.afterSpec(spec)
    }

    @Override
    void error(ErrorInfo error) {
        super.error(error)
    }

    @Override
    void specSkipped(SpecInfo spec) {
        super.specSkipped(spec)
    }

    @Override
    void featureSkipped(FeatureInfo feature) {
        super.featureSkipped(feature)
    }
}

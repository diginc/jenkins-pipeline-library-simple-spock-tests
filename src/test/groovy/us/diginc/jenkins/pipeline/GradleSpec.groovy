package us.diginc.jenkins.pipeline

import spock.lang.Specification

class GradleSpec extends Specification{
    def "hello spock"() {
        given:
        def staticVar = 'hello'

        when:
        def gradle = new Gradle()
        def output = gradle.build(staticVar, dynamicVar)

        then:
        assert output == "${staticVar} ${dynamicVar}"

        where:
        dynamicVar << ['world','demo','jenkins','pipelines']
    }
}

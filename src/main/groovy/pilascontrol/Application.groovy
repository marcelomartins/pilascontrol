package pilascontrol

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {
    static void main(String[] args) {
        println("xxx")
        Micronaut.run(Application)
    }
}
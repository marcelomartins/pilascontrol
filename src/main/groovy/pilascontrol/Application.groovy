package pilascontrol

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {
    static void main(String[] args) {
        println("xxx5")
        Micronaut.run(Application)
    }
}
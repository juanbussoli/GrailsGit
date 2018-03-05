package grailsgit

import java.util.stream.Collectors

class GrailsGitController {

    def list() {
        def lista = Site.getAll()
        //filtrada = lista.stream().filter{it -> it.getActive()}.collect(Collectors.toList())
        render(view: "list", model: [lista: lista])
    }

}

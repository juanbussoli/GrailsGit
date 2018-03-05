package grailsgit

class Category {

    String name
    String urlImage
    int visits


    static belongsTo = [site: Site]

    static constraints = {

    }

}

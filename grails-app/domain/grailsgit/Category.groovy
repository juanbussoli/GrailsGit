package grailsgit

class Category {

    String name
    String urlImage
    int visits

    //Comment


    static belongsTo = [site: Site]

    static constraints = {

    }

}

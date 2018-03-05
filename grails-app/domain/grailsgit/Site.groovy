package grailsgit

class Site {

    String name
    String idSite
    boolean active

    static hasMany = [categories: Category]

    static constraints = {
    }
}

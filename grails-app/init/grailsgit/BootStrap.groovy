package grailsgit

class BootStrap {

    def init = { servletContext ->
        Site site = new Site(name: "Argentina", idSite: "MLA", active: true).save()
        Site site2 = new Site(name: "Colombia", idSite: "MLC", active: false).save()
        Site site3 = new Site(name: "Peru", idSite: "MLP", active: true).save()
        Site site4 = new Site(name: "Paraguay", idSite: "MLR", active: false).save()
        Site site5 = new Site(name: "Chile", idSite: "MLH", active: true).save()
        Site site6 = new Site(name: "Bolivia", idSite: "MLB", active: false).save()
        Site site7 = new Site(name: "Uruguay", idSite: "MLU", active: true).save()

        site.addToCategories(name: "Perros", urlImage: "link", visits: 0)
        site.addToCategories(name: "Pañales", urlImage: "link", visits: 0)
        site.addToCategories(name: "Autos", urlImage: "link", visits: 0)
        site.addToCategories(name: "Motos", urlImage: "link", visits: 0)
        site.addToCategories(name: "Relojes", urlImage: "link", visits: 0)


    }
    def destroy = {
    }
}

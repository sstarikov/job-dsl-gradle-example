dashboardView('backend') {
    jobs {
        regex(/sw-.*/)
    }
    columns {
        status()
        weather()
        buildButton()
    }
}
dashboardView('frontend') {
    jobs {
        regex(/gc-.*/)
    }
    columns {
        status()
        weather()
        buildButton()
    }
}
dashboardView('seedJob') {
    jobs {
        regex(/seed.*/)
    }
    columns {
        status()
        weather()
        buildButton()
    }
}

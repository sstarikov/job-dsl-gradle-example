dashboardView('backend') {
    jobs {
        regex(/sw-.*/)
    }
    columns {
        status()
        name()
        weather()
        buildButton()
    }
    topPortlets {
        jenkinsJobsList {
            displayName('backend jobs')
        }
    }
}
dashboardView('frontend') {
    jobs {
        regex(/gc-.*/)
    }
    columns {
        status()
        name()
        weather()
        buildButton()
    }
    topPortlets {
        jenkinsJobsList {
            displayName('frontend jobs')
        }
    }
}
dashboardView('seedJob') {
    jobs {
        regex(/seed.*/)
    }
    columns {
        status()
        name()
        weather()
        buildButton()
    }
    topPortlets {
        jenkinsJobsList {
            displayName('seed jobs')
        }
    }
}

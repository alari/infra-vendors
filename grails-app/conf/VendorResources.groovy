modules = {
    'masonry' {
        resource url: "/vendor/masonry/jquery.masonry.min.js", plugin: 'infra-vendors'
        dependsOn 'jquery'
    }

    'angular-ui' {
        resource url: "vendor/angular-ui/angular-ui.min.js", bundle: 'ui', plugin: 'infra-vendors'
        resource url: "vendor/angular-ui/angular-ui-ieshiv.min.js", bundle: 'ui', plugin: 'infra-vendors'
        resource url: "vendor/angular-ui/angular-ui.min.css", bundle: 'ui', plugin: 'infra-vendors'
        dependsOn "angular"
    }

    'redactor' {
        resource url: 'vendor/redactor/langs/ru.js', plugin: 'infra-vendors'
        resource url: 'vendor/redactor/redactor.min.js', plugin: 'infra-vendors'
        resource url: 'vendor/redactor/redactor.css', plugin: 'infra-vendors'
        dependsOn 'jquery'
    }

    'masked-input' {
        resource url: 'vendor/maskedinput/jquery.maskedinput.js', plugin: 'infra-vendors'
        dependsOn 'jquery'
    }

    'angular' {
        resource 'http://ajax.googleapis.com/ajax/libs/angularjs/1.0.5/angular.min.js'
        resource 'http://ajax.googleapis.com/ajax/libs/angularjs/1.0.5/angular-resource.min.js'
        dependsOn 'jquery'
    }

    'jquery-ui' {
        resource "http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css"
        resource "http://code.jquery.com/ui/1.10.0/jquery-ui.js"
        dependsOn "jquery"
    }

    'jquery' {
        resource "http://code.jquery.com/jquery-1.8.3.js"
    }

    'placeholder' {
        resource url: 'vendor/placeholder/placeholder.js', plugin: 'infra-vendors'
        dependsOn 'jquery'
    }

    'multi-sortable' {
        resource url: 'vendor/multi-sortable/multiSortable.js', plugin: 'infra-vendors'
        dependsOn 'jquery', 'jquery-ui', 'angular-ui'
    }
}
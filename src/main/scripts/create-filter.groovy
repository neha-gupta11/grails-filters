description("Creates a new Filter") {
    usage "grails create-filter [FILTER NAME]"
    argument name:'Filter Name', description:"The name of the filter"
}

model = model( args[0] )
render  template:"Filter.groovy",
        destination: file( "grails-app/conf/$model.packagePath/${model.simpleName}Filters.groovy"),
        model: model
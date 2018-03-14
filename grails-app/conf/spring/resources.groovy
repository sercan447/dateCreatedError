import com.test.EmbeddedPostgresFactory
// Place your Spring DSL code here
beans = {

    embeddedPostgresFactory(EmbeddedPostgresFactory){
        port = application.config.dataSource?.embeddedPort
    }
    embeddedPostgres(embeddedPostgresFactory: "getDataBase")
    getBeanDefinition('dataSource').setDependsOn('embeddedPostgres')
}

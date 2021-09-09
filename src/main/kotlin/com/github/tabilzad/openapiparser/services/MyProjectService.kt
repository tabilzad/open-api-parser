package com.github.tabilzad.openapiparser.services

import com.intellij.openapi.project.Project
import com.github.tabilzad.openapiparser.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

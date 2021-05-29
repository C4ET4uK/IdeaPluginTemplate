package com.github.c4et4uk.ideaplugintemplate.services

import com.github.c4et4uk.ideaplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.misjaalma.livyideaplugin.services

import com.github.misjaalma.livyideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

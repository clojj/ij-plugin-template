package com.github.clojj.ijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.clojj.ijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

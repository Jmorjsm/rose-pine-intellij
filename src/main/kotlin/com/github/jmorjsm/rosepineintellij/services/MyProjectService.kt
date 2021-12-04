package com.github.jmorjsm.rosepineintellij.services

import com.intellij.openapi.project.Project
import com.github.jmorjsm.rosepineintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

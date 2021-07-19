package com.github.benjaming1314.testmvvp.services

import com.github.benjaming1314.testmvvp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

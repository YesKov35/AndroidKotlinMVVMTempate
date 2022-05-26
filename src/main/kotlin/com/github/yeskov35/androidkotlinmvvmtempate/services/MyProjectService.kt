package com.github.yeskov35.androidkotlinmvvmtempate.services

import com.intellij.openapi.project.Project
import com.github.yeskov35.androidkotlinmvvmtempate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

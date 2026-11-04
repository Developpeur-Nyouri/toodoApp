package org.ldv.todoapp.controller
import org.ldv.todoapp.model.entity.Utilisateur
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
@Controller
class UtilisateursController {
    @GetMapping("/admin/utilisateurs")
    fun Utilisateur(): String {
        return "admin/utilisateurs"
    }
}
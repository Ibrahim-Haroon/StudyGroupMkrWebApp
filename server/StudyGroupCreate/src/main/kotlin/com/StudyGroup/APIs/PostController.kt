package com.StudyGroup.StudyGroupCreate.APIs

import com.StudyGroup.StudyGroupCreate.model.HelpPost
import com.StudyGroup.StudyGroupCreate.service.HelpPostService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/v1/post"])
class PostController(var helpPostService: HelpPostService) {

    @DeleteMapping(value = ["/{id}"])
    fun deletePost(@PathVariable(name = "id") id: String): String {
        //TODO
        return this.helpPostService.deleteExistingHelpPost(id);
    }
    @PostMapping
    fun updatePost(@RequestBody post: HelpPost): HelpPost {
        //TODO
        return this.helpPostService.updateExistingHelpPost(post);
    }
    @PutMapping
    fun writeNewPost(@RequestBody post: HelpPost): HelpPost {
        //TODO
        return this.helpPostService.writeNewHelpPost(post);
    }
    @PostMapping(value = ["/search"])
    fun doSearch(@RequestBody post: HelpPost) : List<HelpPost> {
        //TODO
        return this.helpPostService.doSearch(post);
    }

}
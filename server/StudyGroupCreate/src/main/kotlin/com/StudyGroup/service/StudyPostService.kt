package com.StudyGroup.StudyGroupCreate.service

import com.StudyGroup.StudyGroupCreate.model.HelpPost
import com.StudyGroup.StudyGroupCreate.repository.HelpPostRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*

@Service
class HelpPostService(var repository: HelpPostRepository) {

    fun writeNewHelpPost(helpPost: HelpPost): HelpPost {

        if (helpPost.id != null) {
            throw IllegalArgumentException("A help post needs an ID number");
        }
        helpPost.creationDate = Date();
        return this.repository.save(helpPost);
    }

    fun updateExistingHelpPost(helpPost: HelpPost): HelpPost {
        if (helpPost.id == null) {
            throw IllegalArgumentException("Cannot update post which does not exist");
        }
        helpPost.creationDate = Date();
        return this.repository.save(helpPost);
    }

    fun deleteExistingHelpPost(id: String): String {
        try {
            this.repository.deleteById(id)
            return "SUCCESSFULLY Deleted";
        } catch (e: Exception) {
            return "FAILED to Delete";
        }
    }

    fun doSearch(helpPost: HelpPost) : List<HelpPost> {
        return this.repository.findAll(Example.of(helpPost));
    }
}
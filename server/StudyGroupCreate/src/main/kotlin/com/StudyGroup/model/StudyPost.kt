package com.StudyGroup.StudyGroupCreate.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document(collection = "help_post")
data class HelpPost(@Id var id: String?, var content: String?, var creationDate: Date?, var isHTML: Boolean?, var author: Author?) {

    data class Author(var name: String?, var surname: String?);
}
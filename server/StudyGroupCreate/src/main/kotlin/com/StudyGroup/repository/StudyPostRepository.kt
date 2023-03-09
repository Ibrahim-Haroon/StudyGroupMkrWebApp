package com.StudyGroup.StudyGroupCreate.repository

import com.StudyGroup.StudyGroupCreate.model.HelpPost
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface HelpPostRepository : MongoRepository<HelpPost, String>
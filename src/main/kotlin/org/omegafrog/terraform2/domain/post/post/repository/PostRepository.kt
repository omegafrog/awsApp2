package com.think.back250417.domain.post.post.repository

import com.think.back250417.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>
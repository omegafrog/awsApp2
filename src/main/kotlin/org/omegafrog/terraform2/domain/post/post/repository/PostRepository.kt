package org.omegafrog.terraform2.domain.post.post.repository

import org.omegafrog.terraform2.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>
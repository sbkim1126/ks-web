package com.subinkim.app.repository;

import com.subinkim.app.entity.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class SocialMediaRepository implements JpaRepository<SocialMedia, Long> {
}

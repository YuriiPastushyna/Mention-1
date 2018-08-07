package org.danit.mention.service;

import org.danit.mention.dto.PostDto;

import java.util.List;

public interface UserPostsService {

  List<PostDto> getFollowedPosts(Long id);
}

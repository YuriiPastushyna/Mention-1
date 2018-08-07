package org.danit.mention.service002;

import org.danit.mention.repository.LikeRepository;
import org.danit.mention.model.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeServiceImpl implements LikeService {

  private LikeRepository likeRepository;

  @Autowired
  public LikeServiceImpl(LikeRepository likeRepository) {
    this.likeRepository = likeRepository;
  }

  @Override
  public Optional<Like> getLike(Long id) {
    return likeRepository.findById(id);
  }

  @Override
  public void addLike(Like like) {
    likeRepository.save(like);
  }

  @Override
  public void deleteLike(Long id) {
    likeRepository.deleteById(id);

  }
}

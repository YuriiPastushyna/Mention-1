package org.danit.mention.dto;

import org.danit.mention.model.Profile;
import lombok.Data;

@Data
public class PostUserDetails {

  private String username;

  private ProfileAvatar profile;
}

package org.danit.mention.dto;

import org.danit.mention.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class PostComment {

  private String body;

  private PostUserDetails commentator;

  private Date timestamp;

  private String mediafileUrl;
}

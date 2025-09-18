/*
 * SPDX-FileCopyrightText: Copyright © 2017 WebGoat authors
 * SPDX-License-Identifier: GPL-2.0-or-later
 */
package org.owasp.webgoat.lessons.idor;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/** Created by jason on 1/5/17. */
@Setter
@Getter
public class UserProfile {
    //
    private String userId;
  private String name;
  private String color;
  private String size;
  private boolean isAdmin;
  private int role;

  public UserProfile() {}

  public UserProfile(String id) {
    setProfileFromId(id);
  }

  //
  private void setProfileFromId(String id) {
    // emulate look up from database
    if (id.equals("2342384")) {
      this.userId = id;
      this.color = "yellow";
      this.name = "Tom Cat";
      this.size = "small";
      this.isAdmin = false;
      this.role = 3;
    } else if (id.equals("2342388")) {
      this.userId = id;
      this.color = "brown";
      this.name = "Buffalo Bill";
      this.size = "large";
      this.isAdmin = false;
      this.role = 3;
    } else {
      // not found
    }
  }

  public Map<String, Object> profileToMap() {
    Map<String, Object> profileMap = new HashMap<>();
    profileMap.put("userId", this.userId);
    profileMap.put("name", this.name);
    profileMap.put("color", this.color);
    profileMap.put("size", this.size);
    profileMap.put("role", this.role);
    return profileMap;
  }

  public String toHTMLString() {
    String htmlBreak = "<br/>";
    return "userId"
        + this.userId
        + htmlBreak
        + "name"
        + this.name
        + htmlBreak
        + "size"
        + this.size
        + htmlBreak
        + "role"
        + this.role
        + htmlBreak
        + "isAdmin"
        + this.isAdmin;
  }

}

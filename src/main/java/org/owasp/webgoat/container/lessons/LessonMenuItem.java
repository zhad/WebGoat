/*
 * SPDX-FileCopyrightText: Copyright © 2014 WebGoat authors
 * SPDX-License-Identifier: GPL-2.0-or-later
 */
package org.owasp.webgoat.container.lessons;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class LessonMenuItem {

    /**
     * -- GETTER --
     *  Getter for the field <code>name</code>.
     *
     *
     * -- SETTER --
     *  Setter for the field <code>name</code>.
     *
     @return the name
      * @param name the name to set
     */
    private String name;
    /**
     * -- GETTER --
     *  Getter for the field <code>type</code>.
     *
     *
     * -- SETTER --
     *  Setter for the field <code>type</code>.
     *
     @return the type
      * @param type the type to set
     */
    private LessonMenuItemType type;
    /**
     * -- GETTER --
     *  Getter for the field <code>children</code>.
     *
     *
     * -- SETTER --
     *  Setter for the field <code>children</code>.
     *
     @return the children
      * @param children the children to set
     */
    private List<LessonMenuItem> children = new ArrayList<>();
    /**
     * -- GETTER --
     *  isComplete.
     *
     *
     * -- SETTER --
     *  Setter for the field <code>complete</code>.
     *
     @return the complete
      * @param complete the complete to set
     */
    private boolean complete;
    /**
     * -- GETTER --
     *  Getter for the field <code>link</code>.
     *
     *
     * -- SETTER --
     *  Setter for the field <code>link</code>.
     *
     @return the link
      * @param link the link to set
     */
    private String link;
  private int ranking;

    /**
   * addChild.
   *
   * @param child a {@link LessonMenuItem} object.
   */
  public void addChild(LessonMenuItem child) {
    children.add(child);
  }

  @Override
  public String toString() {
      String bldr = "Name: " + name + " | " +
              "Type: " + type + " | ";
    return bldr;
  }

}

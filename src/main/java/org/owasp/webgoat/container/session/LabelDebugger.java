/*
 * SPDX-FileCopyrightText: Copyright © 2015 WebGoat authors
 * SPDX-License-Identifier: GPL-2.0-or-later
 */
package org.owasp.webgoat.container.session;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class LabelDebugger implements Serializable {

    /**
     * -- GETTER --
     *  isEnabled.
     *
     *
     * -- SETTER --
     *  Sets the status to enabled
     *
     @return a boolean.
      * @param enabled {@link LabelDebugger} object
     */
    private boolean enabled = false;

    /** Enables label debugging */
  public void enable() {
    this.enabled = true;
  }

  /** Disables label debugging */
  public void disable() {
    this.enabled = false;
  }

}

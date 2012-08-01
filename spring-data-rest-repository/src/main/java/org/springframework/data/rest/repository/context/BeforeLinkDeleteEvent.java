package org.springframework.data.rest.repository.context;

/**
 * Emitted before a link to a related object is deleted from the parent.
 *
 * @author Jon Brisbin
 */
public class BeforeLinkDeleteEvent extends LinkSaveEvent {
  public BeforeLinkDeleteEvent(Object source, Object linked) {
    super(source, linked);
  }
}
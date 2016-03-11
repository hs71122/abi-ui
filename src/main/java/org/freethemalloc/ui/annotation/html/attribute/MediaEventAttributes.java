package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MediaEventAttributes {

    /**
     *Script to be run on abort
     */
    String onAbort() default "";

    /**
     *Script to be run when a file is ready to start playing (when it has buffered enough to begin)
     */
    String onCanplay() default "";

    /**
     *Script to be run when a file can be played all the way to the end without pausing for buffering
     */
    String onCanplaythrough() default "";

    /**
     *Script to be run when the cue changes in a &lt track &gt element
     */
    String onCuechange() default "";

    /**
     *Script to be run when the length of the media changes
     */
    String onDurationchange() default "";

    /**
     *Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)
     */
    String onEmptied() default "";

    /**
     *Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")
     */
    String onEnded() default "";

    /**
     *Script to be run when an error occurs when the file is being loaded
     */
    String onError() default "";

    /**
     *Script to be run when media data is loaded
     */
    String onLoadeddata() default "";

    /**
     *Script to be run when meta data (like dimensions and duration) are loaded
     */
    String onLoadedmetadata() default "";

    /**
     *Script to be run just as the file begins to load before anything is actually loaded
     */
    String onLoadstart() default "";

    /**
     * Script to be run when the media is paused either by the user or programmatically
     */
    String onPause() default "";

    /**
     *Script to be run when the media is ready to start playing
     */
    String onPlay() default "";

    /**
     *Script to be run when the media actually has started playing
     */
    String onplaying() default "";

    /**
     * Script to be run when the browser is in the process of getting the media data
     */
    String onProgress() default "";

    /**
     *Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)
     */
    String onRatechange() default "";

    /**
     *Script to be run when the seeking attribute is set to false indicating that seeking has ended
     */
    String onSeeked() default "";

    /**
     *Script to be run when the seeking attribute is set to true indicating that seeking is active
     */
    String onSeeking() default "";

    /**
     *Script to be run when the browser is unable to fetch the media data for whatever reason
     */
    String onStalled() default "";

    /**
     *Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason
     */
    String onSuspend() default "";

    /**
     *Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)
     */
    String onTimeupdate() default "";

    /**
     *Script to be run each time the volume is changed which (includes setting the volume to "mute")
     */
    String onVolumechange() default "";

    /**
     * Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)
     */
    String onWaiting() default "";

}

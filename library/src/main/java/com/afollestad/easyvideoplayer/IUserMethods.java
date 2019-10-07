package com.afollestad.easyvideoplayer;

import android.graphics.drawable.Drawable;
import android.net.Uri;

import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

/**
 * @author Aidan Follestad (afollestad)
 */
@SuppressWarnings("unused")
interface IUserMethods {

    void setSource(@NonNull Uri source);

    void setCallback(@NonNull EasyVideoCallback callback);

    void setProgressCallback(@NonNull EasyVideoProgressCallback callback);

    void setLeftAction(@EasyVideoPlayer.LeftAction int action);

    void setRightAction(@EasyVideoPlayer.RightAction int action);

    void setCustomLabelText(@Nullable CharSequence text);

    void setCustomLabelTextRes(@StringRes int textRes);

    void setBottomLabelText(@Nullable CharSequence text);

    void setBottomLabelTextRes(@StringRes int textRes);

    void setRetryText(@Nullable CharSequence text);

    void setRetryTextRes(@StringRes int res);

    void setSubmitText(@Nullable CharSequence text);

    void setSubmitTextRes(@StringRes int res);

    void setRestartDrawable(@NonNull Drawable drawable);

    void setRestartDrawableRes(@DrawableRes int res);

    void setPlayDrawable(@NonNull Drawable drawable);

    void setPlayDrawableRes(@DrawableRes int res);

    void setPauseDrawable(@NonNull Drawable drawable);

    void setPauseDrawableRes(@DrawableRes int res);

    void setThemeColor(@ColorInt int color);

    void setThemeColorRes(@ColorRes int colorRes);

    void setHideControlsOnPlay(boolean hide);

    void setAutoPlay(boolean autoPlay);

    void setInitialPosition(@IntRange(from = 0, to = Integer.MAX_VALUE) int pos);

    void showControls();

    void hideControls();

    @CheckResult
    boolean isControlsShown();

    void toggleControls();

    void enableControls(boolean andShow);

    void disableControls();

    @CheckResult
    boolean isPrepared();

    @CheckResult
    boolean isPlaying();

    @CheckResult
    int getCurrentPosition();

    @CheckResult
    int getDuration();

    void start();

    void seekTo(@IntRange(from = 0, to = Integer.MAX_VALUE) int pos);

    void setVolume(@FloatRange(from = 0f, to = 1f) float leftVolume, @FloatRange(from = 0f, to = 1f) float rightVolume);

    void pause();

    void stop();

    void reset();

    void release();

    void setAutoFullscreen(boolean autoFullScreen);

    void setLoop(boolean loop);
}
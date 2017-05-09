package com.pattern.thai.mvpapplication.models.entitys;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
//import com.google.common.base.Objects;
//import com.google.common.base.Strings;
import java.util.UUID;

/**
 * Created by ggttoo44 on 2017/5/9.
 */

public class AData {
    @NonNull
    private final String mId;

    @Nullable
    private final String mTitle;

    @Nullable
    private final String mDescription;

    private final boolean mCompleted;

    /**
     * Use this constructor to create a new active Task.
     *
     * @param title       title of the task
     * @param description description of the task
     */
    public AData(@Nullable String title, @Nullable String description) {
        this(title, description, UUID.randomUUID().toString(), false);
    }

    /**
     * Use this constructor to create an active Task if the Task already has an id (copy of another
     * Task).
     *
     * @param title       title of the task
     * @param description description of the task
     * @param id          id of the task
     */
    public AData(@Nullable String title, @Nullable String description, @NonNull String id) {
        this(title, description, id, false);
    }

    /**
     * Use this constructor to create a new completed Task.
     *
     * @param title       title of the task
     * @param description description of the task
     * @param completed   true if the task is completed, false if it's active
     */
    public AData(@Nullable String title, @Nullable String description, boolean completed) {
        this(title, description, UUID.randomUUID().toString(), completed);
    }

    /**
     * Use this constructor to specify a completed Task if the Task already has an id (copy of
     * another Task).
     *
     * @param title       title of the task
     * @param description description of the task
     * @param id          id of the task
     * @param completed   true if the task is completed, false if it's active
     */
    public AData(@Nullable String title, @Nullable String description,
                 @NonNull String id, boolean completed) {
        mId = id;
        mTitle = title;
        mDescription = description;
        mCompleted = completed;
    }

    @NonNull
    public String getId() {
        return mId;
    }

    @Nullable
    public String getTitle() {
        return mTitle;
    }

//    @Nullable
//    public String getTitleForList() {
//        if (!Strings.isNullOrEmpty(mTitle)) {
//            return mTitle;
//        } else {
//            return mDescription;
//        }
//    }

    @Nullable
    public String getDescription() {
        return mDescription;
    }

    public boolean isCompleted() {
        return mCompleted;
    }

    public boolean isActive() {
        return !mCompleted;
    }

//    public boolean isEmpty() {
//        return Strings.isNullOrEmpty(mTitle) &&
//                Strings.isNullOrEmpty(mDescription);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AData data = (AData) o;
//        return Objects.equal(mId, data.mId) &&
//                Objects.equal(mTitle, data.mTitle) &&
//                Objects.equal(mDescription, data.mDescription);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(mId, mTitle, mDescription);
//    }
//
//    @Override
//    public String toString() {
//        return "Task with title " + mTitle;
//    }
}

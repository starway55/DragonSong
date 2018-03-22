package com.dny.dragonsong.com.dny.dragonsong.helper;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface SongFeature {
    public String name() default "untitled";
    public int speed();
    public boolean testMode() default false;
}

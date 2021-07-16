package com.ram.hanumanjetpacklibrery;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;

import androidx.core.view.MotionEventCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class HanumanAutoswipeable extends ViewPager {
    public static final int DEFAULT_INTERVAL = 1500;

    public static final int LEFT = 0;

    public static final int RIGHT = 1;

    public static final int SCROLL_WHAT = 0;

    public static final int SLIDE_BORDER_MODE_CYCLE = 1;

    public static final int SLIDE_BORDER_MODE_NONE = 0;

    public static final int SLIDE_BORDER_MODE_TO_PARENT = 2;

    private double autoScrollFactor = 1.0D;

    private int direction = 1;

    private float downX = 0.0F;

    private Handler handler;

    private long interval = 1500L;

    private boolean isAutoScroll = false;

    private boolean isBorderAnimation = true;

    private boolean isCycle = true;

    private boolean isStopByTouch = false;

    private CustomDurationScroller scroller = null;

    private int slideBorderMode = 0;

    private boolean stopScrollWhenTouch = true;

    private double swipeScrollFactor = 1.0D;

    private float touchX = 0.0F;

    public HanumanAutoswipeable(Context paramContext) {
        super(paramContext);
        init();
    }

    public HanumanAutoswipeable(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        init();
    }

    private void init() {
        this.handler = new MyHandler(this);
        setViewPagerScroller();
    }

    private void sendScrollMessage(long paramLong) {
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, paramLong);
    }

    private void setViewPagerScroller() {
        try {
            Field field1 = ViewPager.class.getDeclaredField("mScroller");
            field1.setAccessible(true);
            Field field2 = ViewPager.class.getDeclaredField("sInterpolator");
            field2.setAccessible(true);
            this.scroller = new CustomDurationScroller(getContext(), (Interpolator)field2.get((Object)null));
            field1.set(this, this.scroller);
            return;
        } catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
        int i = MotionEventCompat.getActionMasked(paramMotionEvent);
        if (this.stopScrollWhenTouch)
            if (i == 0 && this.isAutoScroll) {
                this.isStopByTouch = true;
                stopAutoScroll();
            } else if (paramMotionEvent.getAction() == 1 && this.isStopByTouch) {
                startAutoScroll();
            }
        if (this.slideBorderMode == 2 || this.slideBorderMode == 1) {
            this.touchX = paramMotionEvent.getX();
            if (paramMotionEvent.getAction() == 0)
                this.downX = this.touchX;
            int j = getCurrentItem();
            PagerAdapter pagerAdapter = getAdapter();
            if (pagerAdapter == null) {
                i = 0;
            } else {
                i = pagerAdapter.getCount();
            }
            if ((j == 0 && this.downX <= this.touchX) || (j == i - 1 && this.downX >= this.touchX)) {
                if (this.slideBorderMode == 2) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    if (i > 1)
                        setCurrentItem(i - j - 1, this.isBorderAnimation);
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.dispatchTouchEvent(paramMotionEvent);
            }
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(paramMotionEvent);
    }

    public int getDirection() {
        return (this.direction == 0) ? 0 : 1;
    }

    public long getInterval() {
        return this.interval;
    }

    public int getSlideBorderMode() {
        return this.slideBorderMode;
    }

    public boolean isBorderAnimation() {
        return this.isBorderAnimation;
    }

    public boolean isCycle() {
        return this.isCycle;
    }

    public boolean isStopScrollWhenTouch() {
        return this.stopScrollWhenTouch;
    }

    public void scrollOnce() {
        PagerAdapter pagerAdapter = getAdapter();
        int i = getCurrentItem();
        if (pagerAdapter != null) {
            int j = pagerAdapter.getCount();
            if (j <= 1)
                return;
            if (this.direction == 0) {
                i--;
            } else {
                i++;
            }
            if (i < 0) {
                if (this.isCycle) {
                    setCurrentItem(j - 1, this.isBorderAnimation);
                    return;
                }
            } else if (i == j) {
                if (this.isCycle) {
                    setCurrentItem(0, this.isBorderAnimation);
                    return;
                }
            } else {
                setCurrentItem(i, true);
            }
            return;
        }
    }

    public void setAutoScrollDurationFactor(double paramDouble) {
        this.autoScrollFactor = paramDouble;
    }

    public void setBorderAnimation(boolean paramBoolean) {
        this.isBorderAnimation = paramBoolean;
    }

    public void setCycle(boolean paramBoolean) {
        this.isCycle = paramBoolean;
    }

    public void setDirection(int paramInt) {
        this.direction = paramInt;
    }

    public void setInterval(long paramLong) {
        this.interval = paramLong;
    }

    public void setSlideBorderMode(int paramInt) {
        this.slideBorderMode = paramInt;
    }

    public void setStopScrollWhenTouch(boolean paramBoolean) {
        this.stopScrollWhenTouch = paramBoolean;
    }

    public void setSwipeScrollDurationFactor(double paramDouble) {
        this.swipeScrollFactor = paramDouble;
    }

    public void startAutoScroll() {
        this.isAutoScroll = true;
        double d1 = this.interval;
        double d2 = this.scroller.getDuration();
        double d3 = this.autoScrollFactor;
        Double.isNaN(d2);
        d2 /= d3;
        d3 = this.swipeScrollFactor;
        Double.isNaN(d1);
        sendScrollMessage((long)(d1 + d2 * d3));
    }

    public void startAutoScroll(int paramInt) {
        this.isAutoScroll = true;
        sendScrollMessage(paramInt);
    }

    public void stopAutoScroll() {
        this.isAutoScroll = false;
        this.handler.removeMessages(0);
    }

    private static class MyHandler extends Handler {
        private final WeakReference<HanumanAutoswipeable> autoScrollViewPager;

        public MyHandler(HanumanAutoswipeable param1HanumanAutoswipeable) {
            this.autoScrollViewPager = new WeakReference<HanumanAutoswipeable>(param1HanumanAutoswipeable);
        }

        public void handleMessage(Message param1Message) {
            super.handleMessage(param1Message);
            if (param1Message.what != 0)
                return;
            HanumanAutoswipeable hanumanAutoswipeable = this.autoScrollViewPager.get();
            if (hanumanAutoswipeable != null) {
                hanumanAutoswipeable.scroller.setScrollDurationFactor(hanumanAutoswipeable.autoScrollFactor);
                hanumanAutoswipeable.scrollOnce();
                hanumanAutoswipeable.scroller.setScrollDurationFactor(hanumanAutoswipeable.swipeScrollFactor);
                hanumanAutoswipeable.sendScrollMessage(hanumanAutoswipeable.interval + hanumanAutoswipeable.scroller.getDuration());
            }
        }
    }
}

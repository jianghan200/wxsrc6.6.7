package com.tencent.matrix.resource.analyzer.model;

import android.app.Activity;
import java.lang.ref.WeakReference;

public class DestroyedActivityInfo
{
  public final String mActivityName;
  public final WeakReference<Activity> mActivityRef;
  public int mDetectedCount = 0;
  public final String mKey;
  public final long mLastCreatedActivityCount;
  
  public DestroyedActivityInfo(String paramString1, Activity paramActivity, String paramString2, long paramLong)
  {
    this.mKey = paramString1;
    this.mActivityName = paramString2;
    this.mActivityRef = new WeakReference(paramActivity);
    this.mLastCreatedActivityCount = paramLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/analyzer/model/DestroyedActivityInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
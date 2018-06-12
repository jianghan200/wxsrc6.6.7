package com.tencent.mm.accessibility;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;

public class Util
{
  public static Activity getActivityOfView(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    for (paramView = paramView.getContext(); (paramView instanceof ContextWrapper); paramView = ((ContextWrapper)paramView).getBaseContext()) {
      if ((paramView instanceof Activity)) {
        return (Activity)paramView;
      }
    }
    return null;
  }
  
  public static String getViewIdName(View paramView)
  {
    if (paramView == null) {
      return "NO_ID";
    }
    int i = paramView.getId();
    StringBuilder localStringBuilder = new StringBuilder(128);
    Object localObject;
    if (i != -1)
    {
      localObject = paramView.getResources();
      if ((resourceHasPackage(i)) && (localObject != null)) {
        switch (0xFF000000 & i)
        {
        }
      }
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(i);
        String str = ((Resources)localObject).getResourceTypeName(i);
        localObject = ((Resources)localObject).getResourceEntryName(i);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Throwable paramView)
      {
        continue;
      }
      return localStringBuilder.toString();
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  public static boolean resourceHasPackage(int paramInt)
  {
    return paramInt >>> 24 != 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/accessibility/Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
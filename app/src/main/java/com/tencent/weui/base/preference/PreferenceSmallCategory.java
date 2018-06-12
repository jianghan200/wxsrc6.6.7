package com.tencent.weui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.bw.a.g;

public class PreferenceSmallCategory
  extends PreferenceCategory
{
  public PreferenceSmallCategory(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PreferenceSmallCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PreferenceSmallCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.mm_preference_header_catalog);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/weui/base/preference/PreferenceSmallCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
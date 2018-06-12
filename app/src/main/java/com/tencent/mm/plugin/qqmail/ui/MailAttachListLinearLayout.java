package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class MailAttachListLinearLayout
  extends LinearLayout
{
  Context context;
  List<String> mhi = new ArrayList();
  
  public MailAttachListLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }
  
  static String ei(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2.length() == 0)) {}
    int k;
    do
    {
      return null;
      k = paramString1.indexOf(paramString2);
    } while (k == -1);
    int j = paramString1.indexOf("&", k);
    int i = j;
    if (j == -1) {
      i = paramString1.length();
    }
    return paramString1.substring(k + paramString2.length() + 1, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
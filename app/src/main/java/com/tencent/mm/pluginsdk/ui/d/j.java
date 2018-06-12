package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class j
{
  static LinkedList<g> qPZ = new LinkedList();
  private static boolean qQa = bi.fU(ad.getContext());
  
  public static String TT(String paramString)
  {
    if (bi.oW(paramString)) {
      return paramString;
    }
    p localp = new p(ad.getContext());
    localp.qQH = false;
    localp.qQF = true;
    localp.qQM = true;
    localp.qQN = true;
    localp.qQO = true;
    localp.qQQ = 1;
    localp.qQI = false;
    localp.qQK = false;
    localp.qQJ = false;
    localp.qQL = false;
    localp.qQP = false;
    localp.qQS = false;
    return localp.a(paramString, 0, false).toString();
  }
  
  public static SpannableString a(Context paramContext, CharSequence paramCharSequence)
  {
    return a(paramContext, paramCharSequence, 0, true);
  }
  
  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    return a(paramContext, paramCharSequence, (int)paramFloat, true);
  }
  
  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    return a(paramContext, paramCharSequence, paramInt, true);
  }
  
  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    paramContext = new p(paramContext);
    paramContext.qQH = true;
    paramContext.qQF = true;
    paramContext.qQG = qQa;
    paramContext.qQQ = paramInt2;
    paramContext.qQI = true;
    paramContext.qQK = false;
    paramContext.qQS = true;
    if (paramInt2 == 1)
    {
      paramContext.qQJ = true;
      paramContext.qQL = true;
    }
    for (;;)
    {
      return paramContext.a(paramCharSequence, paramInt1, true);
      if (paramInt2 == 2)
      {
        paramContext.qQJ = false;
        paramContext.qQL = false;
      }
    }
  }
  
  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt, Object paramObject)
  {
    paramContext = new p(paramContext);
    paramContext.qQH = true;
    paramContext.qQF = true;
    paramContext.qQG = qQa;
    paramContext.qQO = true;
    paramContext.qQQ = 1;
    paramContext.qQI = true;
    paramContext.qQK = false;
    paramContext.qQS = true;
    paramContext.qQT = paramObject;
    paramContext.qQJ = true;
    paramContext.qQL = true;
    return paramContext.a(paramCharSequence, paramInt, false);
  }
  
  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt, Object paramObject, String paramString)
  {
    paramContext = new p(paramContext);
    paramContext.qQH = true;
    paramContext.qQF = true;
    paramContext.qQG = qQa;
    paramContext.qQQ = 1;
    paramContext.qQI = true;
    paramContext.qQK = false;
    paramContext.qQS = true;
    paramContext = paramContext.h(null);
    paramContext.qQT = paramObject;
    paramContext.fmS = paramString;
    paramContext.qQJ = true;
    paramContext.qQL = true;
    return paramContext.a(paramCharSequence, paramInt, true);
  }
  
  private static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    paramContext = new p(paramContext);
    paramContext.qQI = false;
    paramContext.qQJ = false;
    paramContext.qQF = false;
    paramContext.qQK = false;
    paramContext.qQH = false;
    paramContext.qQS = false;
    paramContext = paramContext.a(paramCharSequence, paramInt, paramBoolean);
    d(paramContext);
    return paramContext;
  }
  
  public static SpannableString a(TextView paramTextView, Object paramObject)
  {
    return a(paramTextView, true, paramObject);
  }
  
  public static SpannableString a(TextView paramTextView, boolean paramBoolean, Object paramObject)
  {
    if (paramTextView == null)
    {
      x.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      return new SpannableString("");
    }
    Object localObject = paramTextView.getContext();
    int i = (int)paramTextView.getTextSize();
    localObject = new p((Context)localObject);
    ((p)localObject).qQH = true;
    ((p)localObject).qQF = true;
    ((p)localObject).qQM = true;
    ((p)localObject).qQO = true;
    ((p)localObject).qQQ = 1;
    ((p)localObject).qQI = true;
    ((p)localObject).qQK = false;
    ((p)localObject).qQS = true;
    localObject = ((p)localObject).h(paramTextView);
    ((p)localObject).qQJ = true;
    ((p)localObject).qQL = true;
    if (paramObject != null) {
      ((p)localObject).qQT = paramObject;
    }
    return ((p)localObject).a(paramTextView.getText(), i, paramBoolean);
  }
  
  public static void a(g paramg)
  {
    qPZ.add(paramg);
  }
  
  public static SpannableString b(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    return a(paramContext, paramCharSequence, (int)paramFloat, false);
  }
  
  public static SpannableString b(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    paramContext = new p(paramContext);
    paramContext.qQI = false;
    paramContext.qQJ = false;
    paramContext.qQF = false;
    paramContext.qQK = false;
    paramContext.qQQ = paramInt;
    paramContext.qQH = false;
    paramContext.qQS = false;
    paramContext = paramContext.a(paramCharSequence, 0, true);
    d(paramContext);
    return paramContext;
  }
  
  private static SpannableString b(Context paramContext, CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    paramContext = new p(paramContext);
    paramContext.qQH = false;
    paramContext.qQF = true;
    paramContext.qQM = true;
    paramContext.qQN = paramBoolean;
    paramContext.qQO = true;
    paramContext.qQQ = 1;
    paramContext.qQI = false;
    paramContext.qQK = false;
    paramContext.qQJ = false;
    paramContext.qQL = false;
    paramContext.qQS = false;
    return paramContext.a(paramCharSequence, paramInt, true);
  }
  
  public static SpannableString b(TextView paramTextView, Object paramObject)
  {
    if (paramTextView == null)
    {
      x.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      return new SpannableString("");
    }
    Object localObject = paramTextView.getContext();
    int i = (int)paramTextView.getTextSize();
    localObject = new p((Context)localObject);
    ((p)localObject).qQH = true;
    ((p)localObject).qQF = true;
    ((p)localObject).qQG = qQa;
    ((p)localObject).qQQ = 1;
    ((p)localObject).qQI = true;
    ((p)localObject).qQK = false;
    ((p)localObject).qQS = true;
    localObject = ((p)localObject).h(paramTextView);
    ((p)localObject).qQT = paramObject;
    ((p)localObject).fmS = null;
    ((p)localObject).qQJ = true;
    ((p)localObject).qQL = true;
    return ((p)localObject).a(paramTextView.getText(), i, true);
  }
  
  public static void b(g paramg)
  {
    qPZ.remove(paramg);
  }
  
  public static SpannableString c(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    return b(paramContext, paramCharSequence, (int)paramFloat, false);
  }
  
  public static SpannableString c(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    paramContext = new p(paramContext);
    paramContext.qQH = true;
    paramContext.qQF = true;
    paramContext.qQG = qQa;
    paramContext.qQO = true;
    paramContext.qQQ = 1;
    paramContext.qQI = true;
    paramContext.qQK = false;
    paramContext.qQS = true;
    paramContext.qQT = null;
    paramContext.qQJ = true;
    paramContext.qQL = true;
    return paramContext.a(paramCharSequence, paramInt, true);
  }
  
  public static void clearCache()
  {
    x.i("MicroMsg.MMSpanManager", "clear MMSpanManager cache");
    p.clearCache();
  }
  
  public static SpannableString d(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    return b(paramContext, paramCharSequence, paramInt, true);
  }
  
  private static void d(Spannable paramSpannable)
  {
    int i = 0;
    ClickableSpan[] arrayOfClickableSpan = (ClickableSpan[])paramSpannable.getSpans(0, paramSpannable.length(), ClickableSpan.class);
    while (i < arrayOfClickableSpan.length)
    {
      paramSpannable.removeSpan(arrayOfClickableSpan[i]);
      i += 1;
    }
  }
  
  public static SpannableString g(TextView paramTextView)
  {
    if (paramTextView == null)
    {
      x.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      return new SpannableString("");
    }
    Object localObject = paramTextView.getContext();
    int i = (int)paramTextView.getTextSize();
    localObject = new p((Context)localObject);
    ((p)localObject).qQH = false;
    ((p)localObject).qQF = false;
    ((p)localObject).qQG = false;
    ((p)localObject).qQI = false;
    ((p)localObject).qQK = false;
    ((p)localObject).qQS = true;
    localObject = ((p)localObject).h(paramTextView);
    ((p)localObject).qQJ = false;
    ((p)localObject).qQL = false;
    return ((p)localObject).a(paramTextView.getText(), i, false);
  }
  
  public static SpannableString g(TextView paramTextView, int paramInt)
  {
    if (paramTextView == null)
    {
      x.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      return new SpannableString("");
    }
    Object localObject = paramTextView.getContext();
    int i = (int)paramTextView.getTextSize();
    localObject = new p((Context)localObject);
    ((p)localObject).qQH = true;
    ((p)localObject).qQF = true;
    ((p)localObject).qQG = qQa;
    ((p)localObject).qQQ = paramInt;
    ((p)localObject).qQI = true;
    ((p)localObject).qQK = false;
    ((p)localObject).qQS = true;
    localObject = ((p)localObject).h(paramTextView);
    if (paramInt == 1)
    {
      ((p)localObject).qQJ = true;
      ((p)localObject).qQL = true;
    }
    for (;;)
    {
      return ((p)localObject).a(paramTextView.getText(), i, true);
      if (paramInt == 2)
      {
        ((p)localObject).qQJ = false;
        ((p)localObject).qQL = false;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
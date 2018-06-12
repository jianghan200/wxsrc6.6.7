package com.tencent.mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.lang.reflect.Method;

public enum af
{
  static final Class gJt;
  
  static
  {
    Object localObject = null;
    try
    {
      Class localClass = Class.forName("android.view.inputmethod.ComposingText");
      localObject = localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrand.InputUtil", "class for ComposingText e = %s", new Object[] { localClassNotFoundException });
      }
    }
    gJt = (Class)localObject;
  }
  
  static boolean bt(Object paramObject)
  {
    return gJt.isInstance(paramObject);
  }
  
  static InputMethodManager cg(View paramView)
  {
    if (paramView != null)
    {
      Context localContext = paramView.getContext();
      paramView = localContext;
      if (localContext != null) {}
    }
    else
    {
      paramView = ad.getContext();
    }
    return (InputMethodManager)paramView.getSystemService("input_method");
  }
  
  static boolean f(Boolean paramBoolean)
  {
    return (paramBoolean != null) && (paramBoolean.booleanValue());
  }
  
  static Spannable r(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    }
    for (;;)
    {
      if ((paramCharSequence instanceof Spannable)) {
        return (Spannable)paramCharSequence;
      }
      return new SpannableStringBuilder(paramCharSequence);
    }
  }
  
  public static boolean s(CharSequence paramCharSequence)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramCharSequence instanceof Spanned))
    {
      paramCharSequence = (Spanned)paramCharSequence;
      paramCharSequence = paramCharSequence.getSpans(0, paramCharSequence.length(), gJt);
      bool1 = bool2;
      if (paramCharSequence != null)
      {
        bool1 = bool2;
        if (paramCharSequence.length > 0) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public static enum a
  {
    public static void a(Activity paramActivity, View paramView)
    {
      if (!apT()) {}
      while (paramActivity.getResources().getConfiguration().orientation == 2) {
        return;
      }
      paramActivity.getWindow().setFlags(1024, 1024);
      paramActivity.getWindow().addFlags(2048);
      paramView.setPadding(0, e.eL(paramActivity), 0, 0);
    }
    
    private static boolean apT()
    {
      try
      {
        boolean bool = ((Boolean)Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke(null, new Object[0])).booleanValue();
        return bool;
      }
      catch (Exception localException)
      {
        if (Build.DEVICE.equals("mx2")) {
          return true;
        }
        if ((Build.DEVICE.equals("mx")) || (Build.DEVICE.equals("m9"))) {
          return false;
        }
      }
      return false;
    }
  }
  
  static enum b
  {
    static int a(EditText paramEditText, float paramFloat1, float paramFloat2)
    {
      if (paramEditText == null) {
        return -1;
      }
      int j = paramEditText.getPaddingTop();
      Layout localLayout = paramEditText.getLayout();
      if (localLayout == null) {
        return -1;
      }
      Editable localEditable = paramEditText.getEditableText();
      if (localEditable == null) {
        return -1;
      }
      paramEditText = paramEditText.getPaint();
      if (paramEditText == null) {
        return -1;
      }
      Rect localRect = new Rect();
      int i = 0;
      while (i < localLayout.getLineCount())
      {
        localLayout.getLineBounds(i, localRect);
        int k = j + localRect.height();
        if (k >= paramFloat2)
        {
          int m = localLayout.getLineStart(i);
          int n = localLayout.getLineEnd(i);
          Object localObject = (RelativeSizeSpan[])localEditable.getSpans(m, n, RelativeSizeSpan.class);
          float f2 = 1.0F;
          float f1 = f2;
          if (localObject != null)
          {
            int i1 = localObject.length;
            j = 0;
            f1 = f2;
            while (j < i1)
            {
              f1 = localObject[j].getSizeChange();
              j += 1;
            }
          }
          localObject = localEditable.subSequence(m, n).toString();
          float[] arrayOfFloat = new float[((String)localObject).length()];
          paramEditText.getTextWidths((String)localObject, arrayOfFloat);
          f2 = 0.0F;
          j = 0;
          while (j < ((String)localObject).length())
          {
            f2 += arrayOfFloat[j] * f1;
            if ((f2 >= paramFloat1) || (j == ((String)localObject).length() - 1)) {
              return m + j;
            }
            j += 1;
          }
        }
        i += 1;
        j = k;
      }
      return -1;
    }
    
    static void c(EditText paramEditText)
    {
      if (paramEditText == null) {
        return;
      }
      af.cg(paramEditText).hideSoftInputFromInputMethod(paramEditText.getWindowToken(), 2);
    }
    
    static void setNoSystemInputOnEditText(EditText paramEditText)
    {
      if (paramEditText == null) {}
      for (;;)
      {
        return;
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramEditText.setShowSoftInputOnFocus(false);
          return;
        }
        try
        {
          Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
          localMethod1.setAccessible(true);
          localMethod1.invoke(paramEditText, new Object[] { Boolean.valueOf(false) });
          localMethod1.setAccessible(false);
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          x.i("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, setShowSoftInputOnFocus no such method, api level = %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
          try
          {
            Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
            localMethod2.setAccessible(true);
            localMethod2.invoke(paramEditText, new Object[] { Boolean.valueOf(false) });
            localMethod2.setAccessible(false);
            return;
          }
          catch (Exception localException)
          {
            x.e("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, reflect method [setSoftInputShownOnFocus], exp = %s", new Object[] { bi.i(localException) });
          }
          if ((paramEditText.getContext() != null) && ((paramEditText.getContext() instanceof MMActivity)))
          {
            ((MMActivity)paramEditText.getContext()).hideVKB(paramEditText);
            return;
          }
        }
        catch (Exception paramEditText)
        {
          x.e("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, reflect method [setShowSoftInputOnFocus], exp = %s", new Object[] { bi.i(paramEditText) });
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.kiss.widget.textview.b;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class a
{
  private static boolean dpg;
  private static boolean duA;
  private static Constructor<StaticLayout> duB;
  private static Object duC;
  
  @TargetApi(18)
  private static void Ff()
  {
    for (;;)
    {
      Object localObject1;
      try
      {
        boolean bool = dpg;
        if (bool) {
          return;
        }
      }
      finally {}
      try
      {
        if (Build.VERSION.SDK_INT < 18) {
          break label167;
        }
        localObject1 = TextDirectionHeuristic.class;
        duC = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        localObject1 = StaticLayout.class.getDeclaredConstructor(new Class[] { CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, localObject1, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE });
        duB = (Constructor)localObject1;
        ((Constructor)localObject1).setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Object localObject4;
        Class localClass;
        x.e("StaticTextView.StaticLayoutWithMaxLines", "StaticLayout constructor with max lines not found.", new Object[] { localNoSuchMethodException });
        duA = true;
        dpg = true;
        continue;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        x.e("StaticTextView.StaticLayoutWithMaxLines", "TextDirectionHeuristic class not found.", new Object[] { localClassNotFoundException });
        duA = true;
        dpg = true;
        continue;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        x.e("StaticTextView.StaticLayoutWithMaxLines", "TextDirectionHeuristics.FIRSTSTRONG_LTR not found.", new Object[] { localNoSuchFieldException });
        duA = true;
        dpg = true;
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        x.e("StaticTextView.StaticLayoutWithMaxLines", "TextDirectionHeuristics.FIRSTSTRONG_LTR not accessible.", new Object[] { localIllegalAccessException });
        duA = true;
        dpg = true;
        continue;
      }
      catch (Exception localException)
      {
        x.e("StaticTextView.StaticLayoutWithMaxLines", "Other error.", new Object[] { localException });
        duA = true;
        dpg = true;
        continue;
      }
      finally
      {
        dpg = true;
      }
      x.i("StaticTextView.StaticLayoutWithMaxLines", "ensureInitialized finish, sInitialError: " + duA);
      continue;
      label167:
      localObject4 = a.class.getClassLoader();
      localClass = ((ClassLoader)localObject4).loadClass("android.text.TextDirectionHeuristic");
      localObject4 = ((ClassLoader)localObject4).loadClass("android.text.TextDirectionHeuristics");
      duC = ((Class)localObject4).getField("FIRSTSTRONG_LTR").get(localObject4);
    }
  }
  
  public static StaticLayout a(CharSequence paramCharSequence, int paramInt1, int paramInt2, TextPaint paramTextPaint, int paramInt3, Layout.Alignment paramAlignment, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt4, int paramInt5)
  {
    try
    {
      Ff();
      if (duA) {
        throw new IllegalStateException("initialize error, cannot create StaticLayout");
      }
    }
    finally {}
    try
    {
      Object localObject = duC;
      paramCharSequence = (StaticLayout)duB.newInstance(new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramTextPaint, Integer.valueOf(paramInt3), paramAlignment, localObject, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Boolean.valueOf(paramBoolean), paramTruncateAt, Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      return paramCharSequence;
    }
    catch (Exception paramCharSequence)
    {
      throw new IllegalStateException("Error creating StaticLayout with max lines: " + paramCharSequence.getCause());
    }
  }
  
  public static StaticLayout a(CharSequence paramCharSequence, int paramInt1, int paramInt2, TextPaint paramTextPaint, int paramInt3, Layout.Alignment paramAlignment, TextDirectionHeuristic paramTextDirectionHeuristic, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt4, int paramInt5)
  {
    try
    {
      Ff();
      if (duA) {
        throw new IllegalStateException("initialize error, cannot create StaticLayout");
      }
    }
    finally {}
    try
    {
      paramCharSequence = (StaticLayout)duB.newInstance(new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramTextPaint, Integer.valueOf(paramInt3), paramAlignment, paramTextDirectionHeuristic, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Boolean.valueOf(paramBoolean), paramTruncateAt, Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      return paramCharSequence;
    }
    catch (Exception paramCharSequence)
    {
      throw new IllegalStateException("Error creating StaticLayout with max lines: " + paramCharSequence.getCause());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
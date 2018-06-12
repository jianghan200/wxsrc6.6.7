package com.tencent.mm.plugin.fts.a;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.tencent.mm.plugin.fts.a.a.d.a;
import com.tencent.mm.plugin.fts.a.a.d.b;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.g.b;
import com.tencent.mm.plugin.fts.a.a.g.c;
import com.tencent.mm.plugin.fts.a.a.g.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class f
{
  @Deprecated
  public static Spannable a(CharSequence paramCharSequence, String paramString)
  {
    paramCharSequence = a(com.tencent.mm.plugin.fts.a.a.d.b(paramCharSequence, paramString));
    if ((paramCharSequence.jrO instanceof Spannable)) {
      return (Spannable)paramCharSequence.jrO;
    }
    return new SpannableString(paramCharSequence.jrO);
  }
  
  private static e a(SpannableString paramSpannableString, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    e locale = new e();
    float f1 = paramd.jrC - paramd.dug.getTextSize() * 2.0F;
    float f2 = paramd.dug.measureText("…");
    float f3 = paramd.dug.measureText(paramSpannableString, 0, paramb.jrM);
    float f4 = paramd.dug.measureText(paramSpannableString, paramb.jrM, paramb.jrN);
    float f5 = paramd.dug.measureText(paramSpannableString, paramb.jrN, paramSpannableString.length());
    if (f3 + f4 + f5 < f1) {
      return c(paramSpannableString, paramb, paramd);
    }
    Object localObject1;
    Object localObject2;
    if (paramd.jrA == d.a.jrJ)
    {
      localObject1 = new SpannableString(TextUtils.concat(new CharSequence[] { paramd.jrF, paramSpannableString.subSequence(paramb.jrM, paramb.jrN), paramd.jrG }));
      if (f3 + f4 + f2 >= f1) {
        break label365;
      }
      localObject2 = new SpannableStringBuilder(paramSpannableString, 0, paramb.jrM);
      ((SpannableStringBuilder)localObject2).append((CharSequence)localObject1);
      ((SpannableStringBuilder)localObject2).append(TextUtils.ellipsize(paramSpannableString.subSequence(paramb.jrN, paramSpannableString.length()), paramd.dug, f1 - f3 - f4, TextUtils.TruncateAt.END));
      locale.jrO = ((CharSequence)localObject2);
    }
    for (;;)
    {
      locale.bjW = 0;
      return locale;
      if (paramd.jrA == d.a.jrI) {}
      for (localObject1 = new BackgroundColorSpan(paramd.jrB);; localObject1 = new ForegroundColorSpan(paramd.jrB))
      {
        localObject2 = new SpannableString(paramSpannableString.subSequence(paramb.jrM, paramb.jrN));
        try
        {
          ((SpannableString)localObject2).setSpan(localObject1, 0, ((SpannableString)localObject2).length(), 33);
          localObject1 = localObject2;
        }
        catch (Exception paramd)
        {
          x.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", paramd, "setSpan %s", new Object[] { paramb.toString() });
          locale.bjW = -1;
          locale.jrO = paramSpannableString;
          return locale;
        }
      }
      label365:
      if (f2 + f4 + f5 < f1)
      {
        localObject2 = new SpannableStringBuilder();
        ((SpannableStringBuilder)localObject2).append(TextUtils.ellipsize(paramSpannableString.subSequence(0, paramb.jrM), paramd.dug, f1 - f4 - f5, TextUtils.TruncateAt.START));
        ((SpannableStringBuilder)localObject2).append((CharSequence)localObject1);
        ((SpannableStringBuilder)localObject2).append(paramSpannableString, paramb.jrN, paramSpannableString.length());
        locale.jrO = ((CharSequence)localObject2);
      }
      else if (f2 + f4 + f2 >= f1)
      {
        paramSpannableString = new SpannableStringBuilder();
        paramSpannableString.append(TextUtils.ellipsize((CharSequence)localObject1, paramd.dug, f1, TextUtils.TruncateAt.END));
        locale.jrO = paramSpannableString;
      }
      else
      {
        localObject2 = new SpannableStringBuilder();
        f1 = (f1 - f4) / 2.0F;
        CharSequence localCharSequence = paramSpannableString.subSequence(0, paramb.jrM);
        paramSpannableString = paramSpannableString.subSequence(paramb.jrN, paramSpannableString.length());
        ((SpannableStringBuilder)localObject2).append(TextUtils.ellipsize(localCharSequence, paramd.dug, f1, TextUtils.TruncateAt.START));
        ((SpannableStringBuilder)localObject2).append((CharSequence)localObject1);
        ((SpannableStringBuilder)localObject2).append(TextUtils.ellipsize(paramSpannableString, paramd.dug, f1, TextUtils.TruncateAt.END));
        locale.jrO = ((CharSequence)localObject2);
      }
    }
  }
  
  public static final e a(com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    Object localObject1 = new e();
    SpannableString localSpannableString = new SpannableString(TextUtils.concat(new CharSequence[] { paramd.jrD, paramd.jrw, paramd.jrE }));
    ((e)localObject1).bjW = -1;
    ((e)localObject1).jrO = localSpannableString;
    if ((!bi.K(paramd.jrw)) && (paramd.jrx != null)) {}
    Object localObject3;
    for (int i = 1; i == 0; i = 0)
    {
      localObject3 = localObject1;
      return (e)localObject3;
    }
    Object localObject4 = d.Cv(paramd.jrw.toString());
    Object localObject2 = new ArrayList();
    if (paramd.jry) {
      localObject2 = aw((String)localObject4, paramd.jrz);
    }
    for (;;)
    {
      Object localObject6;
      if ((paramd.jrx.jrZ.size() == 1) || (a(localSpannableString, paramd)))
      {
        localObject5 = new d.b();
        if (paramd.jrx.jrZ.size() == 1)
        {
          ((d.b)localObject5).jrL = ((g.c)paramd.jrx.jrZ.get(0));
          if (paramd.jry) {
            a((List)localObject2, (d.b)localObject5, paramd);
          }
          for (;;)
          {
            localObject3 = localObject1;
            if (!((d.b)localObject5).isAvailable()) {
              break;
            }
            try
            {
              paramd = b(localSpannableString, (d.b)localObject5, paramd);
              return paramd;
              a((String)localObject4, (d.b)localObject5, paramd);
            }
            catch (Exception paramd)
            {
              for (;;)
              {
                ((e)localObject1).jrO = localSpannableString;
                paramd = (com.tencent.mm.plugin.fts.a.a.d)localObject1;
              }
            }
          }
        }
        localObject6 = paramd.jrx.jrZ.iterator();
        for (;;)
        {
          localObject3 = localObject1;
          if (!((Iterator)localObject6).hasNext()) {
            break;
          }
          ((d.b)localObject5).jrL = ((g.c)((Iterator)localObject6).next());
          if (paramd.jry) {
            a((List)localObject2, (d.b)localObject5, paramd);
          }
          while (((d.b)localObject5).isAvailable())
          {
            try
            {
              paramd = b(localSpannableString, (d.b)localObject5, paramd);
              return paramd;
            }
            catch (Exception paramd)
            {
              ((e)localObject1).jrO = localSpannableString;
              return (e)localObject1;
            }
            a((String)localObject4, (d.b)localObject5, paramd);
          }
        }
      }
      localObject3 = new d.b();
      ((d.b)localObject3).jrL = new g.c();
      Object localObject5 = new g.b();
      ((g.b)localObject5).jsc = g.d.jsh;
      ((g.b)localObject5).content = paramd.jrx.jrW;
      ((d.b)localObject3).jrL.jse.add(localObject5);
      if (paramd.jry) {
        a((List)localObject2, (d.b)localObject3, paramd);
      }
      while (((d.b)localObject3).isAvailable())
      {
        try
        {
          paramd = b(localSpannableString, (d.b)localObject3, paramd);
          return paramd;
        }
        catch (Exception paramd)
        {
          ((e)localObject1).jrO = localSpannableString;
          return (e)localObject1;
        }
        a((String)localObject4, (d.b)localObject3, paramd);
      }
      localObject3 = new ArrayList();
      localObject5 = paramd.jrx.jrZ.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject6 = (g.c)((Iterator)localObject5).next();
        d.b localb = new d.b();
        localb.jrL = ((g.c)localObject6);
        ((List)localObject3).add(localb);
      }
      localObject5 = ((List)localObject3).iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject6 = (d.b)((Iterator)localObject5).next();
        if (paramd.jry) {
          a((List)localObject2, (d.b)localObject6, paramd);
        } else {
          a((String)localObject4, (d.b)localObject6, paramd);
        }
      }
      localObject4 = ((List)localObject3).iterator();
      for (;;)
      {
        localObject3 = localObject1;
        if (!((Iterator)localObject4).hasNext()) {
          break;
        }
        localObject2 = (d.b)((Iterator)localObject4).next();
        if (((d.b)localObject2).isAvailable())
        {
          localObject2 = b(localSpannableString, (d.b)localObject2, paramd);
          if (((e)localObject2).bjW == 0) {
            localObject1 = localObject2;
          }
        }
      }
    }
  }
  
  public static final e a(String paramString1, String paramString2, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    paramd = a(paramd);
    paramd.jrO = TextUtils.concat(new CharSequence[] { paramString1, paramd.jrO, paramString2 });
    return paramd;
  }
  
  private static void a(String paramString, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    Object localObject;
    if ((paramb.jrL != null) && (paramb.jrL.jse.size() > 0))
    {
      localObject = paramb.jrL.jse.iterator();
      while (((Iterator)localObject).hasNext())
      {
        g.b localb = (g.b)((Iterator)localObject).next();
        if (localb.jsc == g.d.jsh)
        {
          localObject = localb.content;
          if (!bi.oW((String)localObject)) {
            break label91;
          }
        }
      }
    }
    label91:
    do
    {
      return;
      localObject = null;
      break;
      int i = paramString.indexOf((String)localObject);
      if (i >= 0)
      {
        paramb.jrM = i;
        paramb.jrN = (((String)localObject).length() + i);
      }
    } while ((!paramb.isAvailable()) || (paramd.jrD == null));
    paramb.jrM += paramd.jrD.length();
    paramb.jrN += paramd.jrD.length();
  }
  
  private static void a(List<List<String>> paramList, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    Object localObject2;
    Object localObject1;
    if (paramd.jrz)
    {
      localObject2 = paramb.jrL.jse.iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject1 = (g.b)((Iterator)localObject2).next();
      } while (((g.b)localObject1).jsc != g.d.jsg);
    }
    for (;;)
    {
      if (localObject1 == null) {}
      label160:
      label229:
      for (;;)
      {
        return;
        int i = f(paramList, ((g.b)localObject1).jsd);
        if (i >= 0)
        {
          paramb.jrM = i;
          paramb.jrN = (((g.b)localObject1).jsd.size() + i);
          break label160;
        }
        for (;;)
        {
          if ((!paramb.isAvailable()) || (paramd.jrD == null)) {
            break label229;
          }
          paramb.jrM += paramd.jrD.length();
          paramb.jrN += paramd.jrD.length();
          return;
          localObject1 = paramb.jrL.jse.iterator();
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (g.b)((Iterator)localObject1).next();
            if (((g.b)localObject2).jsc != g.d.jsf) {
              break;
            }
            i = f(paramList, ((g.b)localObject2).jsd);
            if (i < 0) {
              break;
            }
            paramb.jrM = i;
            paramb.jrN = (((g.b)localObject2).jsd.size() + i);
          }
        }
      }
      localObject1 = null;
    }
  }
  
  private static boolean a(SpannableString paramSpannableString, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramd.jrC > 0.0F)
    {
      bool1 = bool2;
      if (paramd.dug != null)
      {
        bool1 = bool2;
        if (paramd.jrC - paramd.dug.getTextSize() * 2.0F < paramd.dug.measureText(paramSpannableString.toString())) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  private static List<List<String>> aw(String paramString, boolean paramBoolean)
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    if (i < paramString.length())
    {
      char c = paramString.charAt(i);
      ArrayList localArrayList2 = new ArrayList(2);
      if (g.i(c))
      {
        String[] arrayOfString = (String[])g.jrm.get(String.valueOf(c));
        if ((arrayOfString != null) && (arrayOfString.length > 0) && (arrayOfString[0].length() > 0))
        {
          int k = arrayOfString.length;
          int j = 0;
          while (j < k)
          {
            String str2 = arrayOfString[j];
            String str1 = str2;
            if (paramBoolean) {
              str1 = str2.substring(0, 1);
            }
            if (!localArrayList2.contains(str1)) {
              localArrayList2.add(str1);
            }
            j += 1;
          }
          localArrayList1.add(localArrayList2);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList1.add(localArrayList2);
        continue;
        localArrayList1.add(localArrayList2);
      }
    }
    return localArrayList1;
  }
  
  private static e b(SpannableString paramSpannableString, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    if (a(paramSpannableString, paramd)) {
      return a(paramSpannableString, paramb, paramd);
    }
    return c(paramSpannableString, paramb, paramd);
  }
  
  private static e c(SpannableString paramSpannableString, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    e locale = new e();
    if (paramd.jrA == d.a.jrJ)
    {
      paramSpannableString = paramSpannableString.toString();
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(paramSpannableString.substring(0, paramb.jrM));
      localStringBuffer.append(paramd.jrF);
      localStringBuffer.append(paramSpannableString.substring(paramb.jrM, paramb.jrN));
      localStringBuffer.append(paramd.jrG);
      if (paramb.jrN < paramSpannableString.length()) {
        localStringBuffer.append(paramSpannableString.substring(paramb.jrN, paramSpannableString.length()));
      }
      locale.jrO = localStringBuffer.toString();
      locale.bjW = 0;
      return locale;
    }
    if (paramd.jrA == d.a.jrI) {}
    for (paramd = new BackgroundColorSpan(paramd.jrB);; paramd = new ForegroundColorSpan(paramd.jrB)) {
      try
      {
        paramSpannableString.setSpan(paramd, paramb.jrM, paramb.jrN, 18);
        locale.jrO = paramSpannableString;
        locale.bjW = 0;
        return locale;
      }
      catch (Exception paramd)
      {
        x.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", paramd, "setSpan %s", new Object[] { paramb.toString() });
        locale.jrO = paramSpannableString;
        locale.bjW = -1;
        return locale;
      }
    }
  }
  
  public static final SpannableString d(CharSequence paramCharSequence, int paramInt)
  {
    paramCharSequence = new SpannableString(paramCharSequence);
    d.b localb = new d.b();
    localb.jrM = 0;
    localb.jrN = paramInt;
    b(paramCharSequence, localb, new com.tencent.mm.plugin.fts.a.a.d());
    return paramCharSequence;
  }
  
  private static int f(List<List<String>> paramList, List<String> paramList1)
  {
    int k = 0;
    int i = 0;
    if (k < paramList.size() - paramList1.size() + 1)
    {
      int j;
      for (;;)
      {
        if (i < paramList1.size())
        {
          Object localObject = (List)paramList.get(k + i);
          String str = (String)paramList1.get(i);
          if (((List)localObject).contains(str))
          {
            i += 1;
          }
          else if (i == paramList1.size() - 1)
          {
            localObject = ((List)localObject).iterator();
            for (;;)
            {
              if (((Iterator)localObject).hasNext()) {
                if (((String)((Iterator)localObject).next()).startsWith(str))
                {
                  j = 1;
                  label132:
                  if (j != 0)
                  {
                    i += 1;
                    break;
                  }
                  j = 0;
                  i = 0;
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        if (j != 0)
        {
          return k;
          j = 0;
          i = 0;
        }
        else
        {
          k += 1;
          break;
          j = 0;
          break label132;
          j = 1;
        }
      }
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/fts/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
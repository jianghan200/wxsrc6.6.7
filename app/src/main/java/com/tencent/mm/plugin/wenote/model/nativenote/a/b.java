package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ParagraphStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.j;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.m;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.q;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.r;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public final class b
{
  private static int a(Stack<a> paramStack, StringBuilder paramStringBuilder)
  {
    int i = 0;
    if (!paramStack.isEmpty())
    {
      paramStack = (a)paramStack.pop();
      String str = paramStack.qsK.qtk;
      int j = paramStack.qsM;
      while (i < j)
      {
        paramStringBuilder.append(str);
        i += 1;
      }
      return paramStack.qsM;
    }
    return 0;
  }
  
  public static String a(Spanned paramSpanned)
  {
    if ((paramSpanned == null) || (bi.oW(paramSpanned.toString()))) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramSpanned, localStringBuilder);
    return localStringBuilder.toString();
  }
  
  private static Set<r> a(Spanned paramSpanned, e parame)
  {
    HashSet localHashSet = new HashSet();
    paramSpanned = (ParagraphStyle[])paramSpanned.getSpans(parame.Tw, parame.tK, ParagraphStyle.class);
    int j = paramSpanned.length;
    int i = 0;
    while (i < j)
    {
      parame = paramSpanned[i];
      q localq = q.a(parame);
      if (localq != null) {
        localHashSet.add(new r(localq, parame));
      }
      i += 1;
    }
    return localHashSet;
  }
  
  private static void a(Spanned paramSpanned, StringBuilder paramStringBuilder)
  {
    ArrayList localArrayList = new j(paramSpanned).qrn;
    Stack localStack = new Stack();
    int m = localArrayList.size();
    int i = 0;
    if (i < m)
    {
      n localn = (n)localArrayList.get(i);
      Object localObject2 = a(paramSpanned, localn);
      q localq = null;
      Object localObject3 = ((Set)localObject2).iterator();
      do
      {
        localObject1 = localq;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        localObject1 = (r)((Iterator)localObject3).next();
      } while (!((r)localObject1).qsK.qtl);
      Object localObject1 = ((r)localObject1).qsK;
      localq = q.qtf;
      localObject2 = ((Set)localObject2).iterator();
      int j = 0;
      int k;
      label186:
      Object localObject4;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (r)((Iterator)localObject2).next();
        boolean bool;
        if ((((r)localObject3).qsK.caL()) || (((r)localObject3).qsK.caM()) || (((r)localObject3).qsK.caN()))
        {
          k = 1;
          j += k;
          localObject4 = ((r)localObject3).qsK;
          if (!((r)localObject3).qsK.caL()) {
            break label241;
          }
          bool = ((d)((r)localObject3).qtr).qsQ;
          label222:
          if (!bool) {
            break label301;
          }
          localq = q.qtf;
        }
        for (;;)
        {
          break;
          k = 0;
          break label186;
          label241:
          if (((r)localObject3).qsK.caM())
          {
            bool = ((m)((r)localObject3).qtr).qsQ;
            break label222;
          }
          if (((r)localObject3).qsK.caN())
          {
            bool = ((k)((r)localObject3).qtr).qsQ;
            break label222;
          }
          bool = true;
          break label222;
          label301:
          if (((q)localObject4).caL()) {
            localq = q.qtg;
          } else if (((q)localObject4).caM()) {
            localq = q.qth;
          } else if (((q)localObject4).caN()) {
            localq = q.qti;
          }
        }
      }
      a(localStack, paramStringBuilder, new a(localq, j, 0));
      if (localq.caN())
      {
        localObject2 = (k[])paramSpanned.getSpans(localn.Tw, localn.tK, k.class);
        if (localObject2.length > 0)
        {
          localq.qtp = localObject2[0].qsW;
          j = localq.qtm.indexOf("\"") + 1;
          k = localq.qtm.lastIndexOf("\"");
          if (j < k)
          {
            localObject3 = localq.qtm.substring(j, k);
            if (!bi.oW((String)localObject3))
            {
              localObject4 = ((String)localObject3).trim();
              if (!localq.qtp) {
                break label663;
              }
              localObject2 = "1";
              label489:
              if (!((String)localObject4).equals(localObject2))
              {
                localObject4 = localq.qtm;
                if (!localq.qtp) {
                  break label671;
                }
              }
            }
          }
        }
      }
      label663:
      label671:
      for (localObject2 = "1";; localObject2 = "0")
      {
        localq.qtm = ((String)localObject4).replaceAll((String)localObject3, (String)localObject2);
        paramStringBuilder.append(localq.qtm);
        if (localObject1 != null) {
          paramStringBuilder.append(((q)localObject1).qtj);
        }
        j = localn.Tw;
        k = localn.tK;
        localObject2 = new TreeSet(new b.1(paramSpanned));
        ((SortedSet)localObject2).addAll(Arrays.asList(paramSpanned.getSpans(j, k, CharacterStyle.class)));
        a(paramSpanned, paramStringBuilder, j, k, (SortedSet)localObject2);
        if (localObject1 != null)
        {
          a(paramStringBuilder, (q)localObject1);
          paramStringBuilder.append(((q)localObject1).qtk);
        }
        a(paramStringBuilder, localq);
        paramStringBuilder.append(localq.qtn);
        i += 1;
        break;
        localObject2 = "0";
        break label489;
      }
    }
    while (!localStack.isEmpty()) {
      a(localStack, paramStringBuilder);
    }
  }
  
  private static void a(Spanned paramSpanned, StringBuilder paramStringBuilder, int paramInt1, int paramInt2, SortedSet<CharacterStyle> paramSortedSet)
  {
    if (paramInt1 < paramInt2)
    {
      CharacterStyle localCharacterStyle;
      label18:
      int i;
      if (paramSortedSet.isEmpty())
      {
        localCharacterStyle = null;
        if (localCharacterStyle != null) {
          break label77;
        }
        i = Integer.MAX_VALUE;
        label28:
        if (localCharacterStyle != null) {
          break label90;
        }
      }
      label77:
      label90:
      for (int j = Integer.MAX_VALUE;; j = paramSpanned.getSpanEnd(localCharacterStyle))
      {
        if (paramInt1 >= i) {
          break label103;
        }
        a(paramSpanned, paramStringBuilder, paramInt1, Math.min(paramInt2, i));
        paramInt1 = i;
        break;
        localCharacterStyle = (CharacterStyle)paramSortedSet.first();
        break label18;
        i = paramSpanned.getSpanStart(localCharacterStyle);
        break label28;
      }
      label103:
      paramSortedSet.remove(localCharacterStyle);
      if ((localCharacterStyle instanceof BoldSpan))
      {
        paramStringBuilder.append("<wx-b>");
        label129:
        a(paramSpanned, paramStringBuilder, Math.max(i, paramInt1), Math.min(j, paramInt2), paramSortedSet);
        if (!(localCharacterStyle instanceof ForegroundColorSpan)) {
          break label511;
        }
        paramStringBuilder.append("</wx-font>");
      }
      for (;;)
      {
        paramInt1 = j;
        break;
        if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 1))
        {
          paramStringBuilder.append("<wx-b>");
          break label129;
        }
        if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 2))
        {
          paramStringBuilder.append("<i>");
          break label129;
        }
        if ((localCharacterStyle instanceof UnderlineSpan))
        {
          paramStringBuilder.append("<u>");
          break label129;
        }
        if ((localCharacterStyle instanceof RelativeSizeSpan))
        {
          paramStringBuilder.append("<wx-font style=\"font-size:");
          paramStringBuilder.append(com.tencent.mm.plugin.wenote.model.nativenote.manager.b.Bu((int)(((RelativeSizeSpan)localCharacterStyle).getSizeChange() * com.tencent.mm.plugin.wenote.model.nativenote.manager.b.getTextSize())));
          paramStringBuilder.append("px\">");
          break label129;
        }
        if ((localCharacterStyle instanceof AbsoluteSizeSpan))
        {
          paramStringBuilder.append("<wx-font style=\"font-size:");
          paramStringBuilder.append(com.tencent.mm.plugin.wenote.model.nativenote.manager.b.Bu(((AbsoluteSizeSpan)localCharacterStyle).getSize()));
          paramStringBuilder.append("px\">");
          break label129;
        }
        if ((localCharacterStyle instanceof ForegroundColorSpan))
        {
          paramStringBuilder.append("<wx-font style=\"color:#");
          for (str = Integer.toHexString(((ForegroundColorSpan)localCharacterStyle).getForegroundColor() + 16777216); str.length() < 6; str = "0" + str) {}
          paramStringBuilder.append(str);
          paramStringBuilder.append("\">");
          break label129;
        }
        if (!(localCharacterStyle instanceof BackgroundColorSpan)) {
          break label129;
        }
        paramStringBuilder.append("<wx-font style=\"background-color:#");
        for (String str = Integer.toHexString(((BackgroundColorSpan)localCharacterStyle).getBackgroundColor() + 16777216); str.length() < 6; str = "0" + str) {}
        paramStringBuilder.append(str);
        paramStringBuilder.append("\">");
        break label129;
        label511:
        if ((localCharacterStyle instanceof BackgroundColorSpan)) {
          paramStringBuilder.append("</wx-font>");
        } else if ((localCharacterStyle instanceof AbsoluteSizeSpan)) {
          paramStringBuilder.append("</wx-font>");
        } else if ((localCharacterStyle instanceof UnderlineSpan)) {
          paramStringBuilder.append("</u>");
        } else if ((localCharacterStyle instanceof BoldSpan)) {
          paramStringBuilder.append("</wx-b>");
        } else if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 2)) {
          paramStringBuilder.append("</i>");
        } else if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 1)) {
          paramStringBuilder.append("</wx-b>");
        } else if ((localCharacterStyle instanceof RelativeSizeSpan)) {
          paramStringBuilder.append("</wx-font>");
        }
      }
    }
  }
  
  public static void a(CharSequence paramCharSequence, StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      char c = paramCharSequence.charAt(paramInt1);
      if (c == '\n') {
        paramStringBuilder.append("<br/>");
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        if (c == '<')
        {
          paramStringBuilder.append("&lt;");
        }
        else if (c == '>')
        {
          paramStringBuilder.append("&gt;");
        }
        else if (c == '&')
        {
          paramStringBuilder.append("&amp;");
        }
        else if (c == ' ')
        {
          while ((paramInt1 + 1 < paramInt2) && (paramCharSequence.charAt(paramInt1 + 1) == ' '))
          {
            paramStringBuilder.append("&nbsp;");
            paramInt1 += 1;
          }
          paramStringBuilder.append(' ');
        }
        else if (c < ' ')
        {
          paramStringBuilder.append("&#" + c + ";");
        }
        else
        {
          paramStringBuilder.append(c);
        }
      }
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, q paramq)
  {
    if ((paramq.qto) && (paramStringBuilder.length() >= 5))
    {
      int i = paramStringBuilder.length() - 5;
      int j = paramStringBuilder.length();
      if (paramStringBuilder.subSequence(i, j).equals("<br/>")) {
        paramStringBuilder.delete(i, j);
      }
    }
  }
  
  private static void a(Stack<a> paramStack, StringBuilder paramStringBuilder, a parama)
  {
    int i = 0;
    Object localObject = q.qtf;
    if (!paramStack.isEmpty())
    {
      localObject = (a)paramStack.peek();
      i = ((a)localObject).qsL;
      localObject = ((a)localObject).qsK;
    }
    if (parama.qsL > i)
    {
      parama.qsM = (parama.qsL - i);
      b(paramStack, paramStringBuilder, parama);
    }
    do
    {
      return;
      if (parama.qsL < i)
      {
        a(paramStack, paramStringBuilder);
        break;
      }
    } while (parama.qsK == localObject);
    parama.qsM = a(paramStack, paramStringBuilder);
    b(paramStack, paramStringBuilder, parama);
  }
  
  private static void b(Stack<a> paramStack, StringBuilder paramStringBuilder, a parama)
  {
    String str = parama.qsK.qtj;
    int j = parama.qsM;
    int i = 0;
    while (i < j)
    {
      paramStringBuilder.append(str);
      i += 1;
    }
    paramStack.push(parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
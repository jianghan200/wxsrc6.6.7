package com.tencent.mm.plugin.messenger.b;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import com.tencent.mm.plugin.messenger.a.e;
import com.tencent.mm.plugin.messenger.a.e.a;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a
  implements e
{
  private Map<String, e.b> lcI = new HashMap();
  private Map<String, e.a> lcJ = new HashMap();
  private com.tencent.mm.ak.a.d.a<Long, CharSequence> lcK = new com.tencent.mm.ak.a.d.a(200);
  private com.tencent.mm.ak.a.d.a<Long, CharSequence> lcL = new com.tencent.mm.ak.a.d.a(500);
  public n lcM = new a.1(this);
  
  private static CharSequence F(ArrayList<CharSequence> paramArrayList)
  {
    SpannableString localSpannableString = new SpannableString("");
    Iterator localIterator = paramArrayList.iterator();
    for (paramArrayList = localSpannableString; localIterator.hasNext(); paramArrayList = TextUtils.concat(new CharSequence[] { paramArrayList, (CharSequence)localIterator.next() })) {}
    return paramArrayList;
  }
  
  private static boolean Hj(String paramString)
  {
    return ("link_profile".equals(paramString)) || ("link_revoke".equals(paramString)) || ("link_revoke_qrcode".equals(paramString)) || ("link_plain".equals(paramString)) || ("link_view_wxapp".equals(paramString));
  }
  
  private CharSequence a(Map<String, String> paramMap, Bundle paramBundle, WeakReference<Context> paramWeakReference, int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    Object localObject2 = new StringBuilder();
    Object localObject1;
    if (i == 0)
    {
      localObject1 = "";
      label30:
      localObject1 = localObject1;
      localObject1 = ".sysmsg.sysmsgtemplate.content_template" + (String)localObject1;
      if (bi.oW((String)paramMap.get(localObject1))) {
        break label848;
      }
      localObject2 = (String)paramMap.get((String)localObject1 + ".$type");
      if ((!"tmpl_type_profile".equals(localObject2)) && (!"tmpl_type_profilewithrevoke".equals(localObject2)) && (!"tmpl_type_profilewithrevokeqrcode".equals(localObject2)) && (!"tmpl_type_wxappnotifywithview".equals(localObject2))) {
        break label316;
      }
      j = 1;
      label155:
      if (j == 0)
      {
        x.w("MicroMsg.SysMsgTemplateImp", "hy: non supported type: %s", new Object[] { localObject2 });
        localArrayList1.add(j((String)localObject1, paramMap));
      }
      localObject1 = (String)paramMap.get((String)localObject1 + ".template");
      x.v("MicroMsg.SysMsgTemplateImp", "hy: rawTemplate : %s", new Object[] { localObject1 });
      localObject1 = b.Hk((String)localObject1);
      if (localObject1 != null) {
        break label322;
      }
    }
    label316:
    label322:
    for (int j = 0;; j = ((ArrayList)localObject1).size())
    {
      x.d("MicroMsg.SysMsgTemplateImp", "hy: parsed %d models", new Object[] { Integer.valueOf(j) });
      if ((localObject1 != null) && (((ArrayList)localObject1).size() != 0)) {
        break label332;
      }
      localArrayList1.add(new SpannableString(""));
      i += 1;
      break;
      localObject1 = Integer.valueOf(i);
      break label30;
      j = 0;
      break label155;
    }
    label332:
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    label348:
    label609:
    label654:
    label660:
    label720:
    label848:
    label880:
    label881:
    for (;;)
    {
      b.a locala;
      if (localIterator.hasNext())
      {
        locala = (b.a)localIterator.next();
        if (locala.type == 0)
        {
          localArrayList2.add(new SpannableString(j.a(ad.getContext(), locala.content)));
          continue;
        }
        if (locala.type == 1)
        {
          j = 0;
          localObject1 = ".sysmsg.sysmsgtemplate.content_template" + ".link_list.link";
          if (j == 0) {
            break label880;
          }
          localObject1 = (String)localObject1 + j;
        }
      }
      for (;;)
      {
        if (bi.oW((String)paramMap.get(localObject1))) {
          break label881;
        }
        localObject2 = (String)paramMap.get((String)localObject1 + ".$name");
        Object localObject3;
        boolean bool;
        if (locala.content.equals(localObject2))
        {
          localObject2 = (String)paramMap.get((String)localObject1 + ".$type");
          if (paramInt != 0) {
            break label720;
          }
          localObject3 = (e.b)this.lcI.get(localObject2);
          if ((Hj((String)localObject2)) && (localObject3 != null)) {
            break label660;
          }
          localObject2 = bi.aG((String)localObject2, "");
          if (localObject3 != null) {
            break label654;
          }
          bool = true;
          x.i("MicroMsg.SysMsgTemplateImp", "alvinluo not support link type: %s or listener == null: %b", new Object[] { localObject2, Boolean.valueOf(bool) });
          localArrayList2.add(j((String)localObject1, paramMap));
        }
        for (;;)
        {
          j += 1;
          break;
          bool = false;
          break label609;
          localObject2 = ((e.b)localObject3).a(paramMap, (String)localObject1, paramBundle, paramWeakReference);
          x((CharSequence)localObject2);
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            if (((CharSequence)localObject2).length() != 0) {}
          }
          else
          {
            localObject1 = new SpannableString("");
          }
          localArrayList2.add(localObject1);
          continue;
          if (paramInt == 1)
          {
            localObject3 = (e.a)this.lcJ.get(localObject2);
            if ((!Hj((String)localObject2)) || (localObject3 == null)) {
              localArrayList2.add(j((String)localObject1, paramMap));
            } else {
              localArrayList2.add(bi.oV(((e.a)localObject3).h(paramMap, (String)localObject1)));
            }
          }
          else
          {
            x.e("MicroMsg.SysMsgTemplateImp", "hy: not supported digest type");
          }
        }
        x.e("MicroMsg.SysMsgTemplateImp", "hy: invalid! should not get here");
        break label348;
        localObject1 = F(localArrayList2);
        x.v("MicroMsg.SysMsgTemplateImp", "hy: concatedvalue is %s", new Object[] { localObject1 });
        localArrayList1.add(localObject1);
        break;
        if (localArrayList1.size() == 0)
        {
          x.w("MicroMsg.SysMsgTemplateImp", "hy: not handled");
          return new SpannableString("");
        }
        return F(localArrayList1);
      }
    }
  }
  
  private static CharSequence j(String paramString, Map<String, String> paramMap)
  {
    if (bi.getInt((String)paramMap.get(paramString + ".$hidden"), 0) == 1) {}
    for (int i = 1; i != 0; i = 0)
    {
      x.v("MicroMsg.SysMsgTemplateImp", "hy: hide");
      return new SpannableString("");
    }
    paramString = (String)paramMap.get(paramString + ".plain");
    return new SpannableString(j.a(ad.getContext(), bi.oV(paramString)));
  }
  
  private static void x(CharSequence paramCharSequence)
  {
    int i = 0;
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0) && ((paramCharSequence instanceof Spanned)))
    {
      paramCharSequence = (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class);
      if ((paramCharSequence != null) && (paramCharSequence.length > 0))
      {
        int j = paramCharSequence.length;
        while (i < j)
        {
          if (!(paramCharSequence[i] instanceof com.tencent.mm.ui.base.a.a)) {
            throw new IllegalArgumentException("hy: actively throw Exception!!! all clickable spans must be instance of com.tencent.mm.ui.base.span.IPressableSpan!");
          }
          i += 1;
        }
      }
    }
  }
  
  public final void Gs(String paramString)
  {
    x.i("MicroMsg.SysMsgTemplateImp", "hy: removing template listener: %s", new Object[] { paramString });
    this.lcI.remove(paramString);
  }
  
  public final void Gt(String paramString)
  {
    x.i("MicroMsg.SysMsgTemplateImp", "hy: removing digest listener: %s", new Object[] { paramString });
    this.lcJ.remove(paramString);
  }
  
  public final CharSequence Gu(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.SysMsgTemplateImp", "hy: [digest] request translate content is null!");
      return null;
    }
    paramString = bl.z(paramString, "sysmsg");
    if (paramString == null)
    {
      x.i("MicroMsg.SysMsgTemplateImp", "hy: [digest] not retrieved sysmsg from new xml!");
      return null;
    }
    String str = (String)paramString.get(".sysmsg.$type");
    if ((bi.oW(str)) || (!"sysmsgtemplate".equals(str)))
    {
      x.w("MicroMsg.SysMsgTemplateImp", "hy: [digest] not acceptable sysmsg: %s", new Object[] { str });
      return null;
    }
    return a(paramString, null, null, 1);
  }
  
  public final CharSequence a(String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.SysMsgTemplateImp", "hy: request translate content is null!");
      return null;
    }
    paramString = bl.z(paramString, "sysmsg");
    if (paramString == null)
    {
      x.i("MicroMsg.SysMsgTemplateImp", "hy: not retrieved sysmsg from new xml!");
      return null;
    }
    String str = (String)paramString.get(".sysmsg.$type");
    if ((bi.oW(str)) || (!"sysmsgtemplate".equals(str)))
    {
      x.w("MicroMsg.SysMsgTemplateImp", "hy: not acceptable sysmsg: %s", new Object[] { str });
      return null;
    }
    return a(paramString, paramBundle, paramWeakReference, 0);
  }
  
  public final void a(String paramString, e.a parama)
  {
    x.i("MicroMsg.SysMsgTemplateImp", "hy: adding digest listener: %s", new Object[] { paramString });
    this.lcJ.put(paramString, parama);
  }
  
  public final void a(String paramString, e.b paramb)
  {
    x.i("MicroMsg.SysMsgTemplateImp", "hy: adding template listener: %s", new Object[] { paramString });
    this.lcI.put(paramString, paramb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/messenger/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
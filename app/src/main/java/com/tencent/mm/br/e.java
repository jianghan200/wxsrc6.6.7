package com.tencent.mm.br;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.tencent.mm.g.a.hd;
import com.tencent.mm.g.a.hd.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.n.a.a;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.s;
import java.util.ArrayList;

public class e
{
  private static e sLQ = null;
  private String[] sLR;
  private String[] sLS;
  private String[] sLT;
  private ArrayList<s> sLU = new ArrayList();
  private SparseArray<s> sLV = new SparseArray();
  
  public e(Context paramContext)
  {
    this.sLR = paramContext.getResources().getStringArray(a.a.merge_smiley_code_smiley);
    this.sLS = paramContext.getResources().getStringArray(a.a.merge_smiley_softbank_emoji);
    this.sLT = paramContext.getResources().getStringArray(a.a.merge_smiley_unicode_emoji);
    this.sLU.clear();
    this.sLV.clear();
    cjG();
  }
  
  private void cjG()
  {
    int k = 0;
    if ((this.sLR != null) && (this.sLS != null))
    {
      int m = this.sLR.length;
      int j = 0;
      int i = 0;
      s locals;
      while (j < m)
      {
        locals = new s(i, this.sLR[j]);
        this.sLU.add(locals);
        this.sLV.put(i, locals);
        j += 1;
        i += 1;
      }
      m = this.sLS.length;
      j = k;
      while (j < m)
      {
        locals = new s(i, this.sLS[j]);
        this.sLU.add(locals);
        this.sLV.put(i, locals);
        j += 1;
        i += 1;
      }
    }
  }
  
  public static e cjH()
  {
    if (sLQ == null) {}
    try
    {
      sLQ = new e(ad.getContext());
      return sLQ;
    }
    finally {}
  }
  
  public int apV()
  {
    x.d("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo");
    this.sLU.clear();
    ArrayList localArrayList1 = ((PluginEmoji)g.n(PluginEmoji.class)).getEmojiMgr().aDS();
    if ((localArrayList1 != null) && (!localArrayList1.isEmpty()))
    {
      ArrayList localArrayList2 = ((PluginEmoji)g.n(PluginEmoji.class)).getEmojiMgr().aDR();
      int k = localArrayList1.size();
      int j = 0;
      int i = 0;
      if (j < k)
      {
        s locals = (s)localArrayList1.get(j);
        String str = locals.field_key;
        if ((str.startsWith("[")) && (!localArrayList2.contains(str))) {
          x.i("MicroMsg.MergerSmileyManager", "no smiley info. key:%s", new Object[] { str });
        }
        for (;;)
        {
          j += 1;
          break;
          this.sLU.add(locals);
          this.sLV.put(i, locals);
          i += 1;
        }
      }
      return 0;
    }
    cjG();
    x.i("MicroMsg.MergerSmileyManager", "smiley panel list is null.");
    return -1;
  }
  
  public int apW()
  {
    if (this.sLU == null) {
      return 0;
    }
    return this.sLU.size();
  }
  
  public String getText(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.sLU.size()))
    {
      x.w("MicroMsg.MergerSmileyManager", "get text, error index");
      return "";
    }
    s locals = (s)this.sLU.get(paramInt);
    if (locals != null)
    {
      q localq = f.cjI().Xz(locals.field_key);
      if (localq != null)
      {
        if ((w.chM()) && (!bi.oW(localq.field_cnValue))) {
          return localq.field_cnValue;
        }
        if ((w.chN()) && (!bi.oW(localq.field_twValue))) {
          return localq.field_twValue;
        }
      }
      return locals.field_key;
    }
    return "";
  }
  
  public Drawable mg(int paramInt)
  {
    if (this.sLV == null)
    {
      x.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley panel map is null.");
      return null;
    }
    Object localObject1 = (s)this.sLV.get(paramInt);
    if (localObject1 == null)
    {
      x.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley info is null.");
      return null;
    }
    Object localObject2 = f.cjI().Xz(((s)localObject1).field_key);
    if (localObject2 != null)
    {
      f.cjI();
      paramInt = ((q)localObject2).field_position;
      if (paramInt >= 0) {}
      for (localObject1 = b.cjC().mg(paramInt);; localObject1 = f.Xy(((q)localObject2).field_fileName)) {
        return (Drawable)localObject1;
      }
    }
    localObject2 = b.cjC();
    localObject1 = ((s)localObject1).field_key;
    if (bi.oW((String)localObject1))
    {
      x.i("MicroMsg.EmojiHelper", "getEmoji item failed. key is null.");
      localObject1 = null;
    }
    for (;;)
    {
      localObject1 = b.cjC().a((c)localObject1, true);
      break;
      paramInt = ((String)localObject1).codePointAt(0);
      if (((b)localObject2).Dg(paramInt) != null) {
        localObject1 = ((b)localObject2).Dg(paramInt);
      } else {
        localObject1 = ((b)localObject2).eH(paramInt, 0);
      }
    }
  }
  
  public String mh(int paramInt)
  {
    if (paramInt < 0)
    {
      x.w("MicroMsg.MergerSmileyManager", "get emoji text, error index down");
      return "";
    }
    Object localObject1 = new hd();
    a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    if (((hd)localObject1).bQr.bKi == 1) {}
    for (int i = 1; i != 0; i = 0)
    {
      Object localObject2 = cjH().sLS[paramInt].split(" ");
      localObject1 = Character.toChars(Integer.decode(localObject2[0]).intValue());
      localObject2 = Character.toChars(Integer.decode(localObject2[1]).intValue());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((char[])localObject1);
      localStringBuilder.append((char[])localObject2);
      return localStringBuilder.toString();
    }
    return cjH().sLS[paramInt];
  }
  
  public String mi(int paramInt)
  {
    if (paramInt < 0)
    {
      x.w("MicroMsg.MergerSmileyManager", "get text, error index");
      return "";
    }
    s locals = (s)this.sLU.get(paramInt);
    if (locals != null) {
      return locals.field_key;
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/br/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.pluginsdk.a;

import android.content.Context;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ar.f;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.s;
import java.util.ArrayList;
import java.util.List;

public abstract interface d
  extends e
{
  public abstract String a(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString);
  
  public abstract void a(Context paramContext, bd parambd);
  
  public abstract void a(String paramString, EmojiInfo paramEmojiInfo, bd parambd);
  
  public abstract boolean a(Context paramContext, EmojiInfo paramEmojiInfo, int paramInt, String paramString);
  
  public abstract boolean a(String paramString1, String paramString2, long paramLong, String paramString3, d.a parama);
  
  public abstract byte[] a(EmojiInfo paramEmojiInfo);
  
  public abstract boolean aDP();
  
  public abstract ArrayList<q> aDQ();
  
  public abstract ArrayList<String> aDR();
  
  public abstract ArrayList<s> aDS();
  
  public abstract f aDT();
  
  public abstract ap cu(String paramString1, String paramString2);
  
  public abstract String cv(String paramString1, String paramString2);
  
  public abstract void d(EmojiInfo paramEmojiInfo);
  
  public abstract int e(EmojiInfo paramEmojiInfo);
  
  public abstract int[] f(EmojiInfo paramEmojiInfo);
  
  public abstract boolean o(Context paramContext, String paramString1, String paramString2);
  
  public abstract boolean p(ArrayList<q> paramArrayList);
  
  public abstract boolean q(ArrayList<s> paramArrayList);
  
  public abstract EmojiInfo zi(String paramString);
  
  public abstract String zj(String paramString);
  
  public abstract List<EmojiInfo> zk(String paramString);
  
  public abstract boolean zl(String paramString);
  
  public abstract ArrayList<String> zm(String paramString);
  
  public abstract String zn(String paramString);
  
  public abstract String zo(String paramString);
  
  public abstract int zp(String paramString);
  
  public abstract String zq(String paramString);
  
  public abstract void zr(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
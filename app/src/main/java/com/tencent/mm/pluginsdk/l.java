package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.ab.f;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd.a;

@Deprecated
public abstract interface l
{
  public abstract String B(String paramString1, String paramString2);
  
  public abstract Bitmap a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent);
  
  public abstract com.tencent.mm.ab.l a(f paramf);
  
  public abstract void a(Context paramContext, ab paramab, bd.a parama, Bundle paramBundle, String paramString);
  
  public abstract void a(Context paramContext, bd.a parama, Bundle paramBundle);
  
  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5);
  
  public abstract void a(Intent paramIntent, String paramString);
  
  public abstract void a(aue paramaue, String paramString);
  
  public abstract void a(String paramString1, String paramString2, String paramString3, long paramLong);
  
  public abstract boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString);
  
  public abstract boolean a(ab paramab);
  
  public abstract com.tencent.mm.ab.l aG(boolean paramBoolean);
  
  public abstract boolean b(Context paramContext, int paramInt1, int paramInt2, String paramString);
  
  public abstract void bb(Context paramContext);
  
  public abstract String cS(String paramString);
  
  public abstract boolean cT(String paramString);
  
  public abstract boolean cU(String paramString);
  
  public abstract void cV(String paramString);
  
  public abstract void eu(int paramInt);
  
  public abstract boolean f(Activity paramActivity);
  
  public abstract void g(Activity paramActivity);
  
  public abstract String h(Context paramContext, String paramString1, String paramString2);
  
  public abstract String q(Context paramContext, String paramString);
  
  public abstract boolean r(Context paramContext, String paramString);
  
  public abstract String s(String paramString, int paramInt);
  
  public abstract void vl();
  
  public abstract void vn();
  
  public abstract void vo();
  
  public abstract Intent vp();
  
  public abstract boolean vq();
  
  public abstract void vr();
  
  public abstract boolean vs();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.model;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;

public abstract interface al
  extends an
{
  public abstract int a(Notification paramNotification, boolean paramBoolean);
  
  public abstract Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4);
  
  public abstract Notification a(Notification paramNotification, int paramInt1, PendingIntent paramPendingIntent1, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt2, String paramString4, PendingIntent paramPendingIntent2, int paramInt3, String paramString5, PendingIntent paramPendingIntent3, String paramString6);
  
  public abstract Notification a(PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4);
  
  public abstract void a(int paramInt, Notification paramNotification, boolean paramBoolean);
  
  public abstract void aR(boolean paramBoolean);
  
  public abstract void aS(boolean paramBoolean);
  
  public abstract int b(Notification paramNotification);
  
  public abstract void cancel(int paramInt);
  
  public abstract void cancelNotification(String paramString);
  
  public abstract void eJ(String paramString);
  
  public abstract void eK(String paramString);
  
  public abstract void fp(int paramInt);
  
  public abstract void fq(int paramInt);
  
  public abstract void fr(int paramInt);
  
  public abstract void n(int paramInt, String paramString);
  
  public abstract void notify(int paramInt, Notification paramNotification);
  
  public abstract void v(String paramString, int paramInt);
  
  public abstract void vo();
  
  public abstract String xQ();
  
  public abstract void xR();
  
  public abstract boolean xS();
  
  public abstract void xT();
  
  public abstract void xU();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/model/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
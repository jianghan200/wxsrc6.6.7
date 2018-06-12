package com.tencent.mm.storage;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.plugin.messenger.foundation.a.e;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.g;
import com.tencent.mm.vending.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract interface az
  extends g
{
  public abstract boolean Cp(String paramString);
  
  public abstract boolean GL(String paramString);
  
  public abstract Cursor YA(String paramString);
  
  public abstract Cursor YB(String paramString);
  
  public abstract int YC(String paramString);
  
  public abstract String YD(String paramString);
  
  public abstract ai YE(String paramString);
  
  public abstract int YF(String paramString);
  
  public abstract void YG(String paramString);
  
  public abstract void YH(String paramString);
  
  public abstract int YI(String paramString);
  
  public abstract void Yp(String paramString);
  
  public abstract ai Yq(String paramString);
  
  public abstract void Yr(String paramString);
  
  public abstract boolean Ys(String paramString);
  
  public abstract boolean Yt(String paramString);
  
  public abstract boolean Yu(String paramString);
  
  public abstract boolean Yv(String paramString);
  
  public abstract boolean Yw(String paramString);
  
  public abstract boolean Yx(String paramString);
  
  public abstract Cursor Yy(String paramString);
  
  public abstract Cursor Yz(String paramString);
  
  public abstract int a(ai paramai, String paramString);
  
  public abstract int a(ai paramai, String paramString, boolean paramBoolean);
  
  public abstract Cursor a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean);
  
  public abstract Cursor a(String paramString1, List<String> paramList, boolean paramBoolean, String paramString2);
  
  public abstract Cursor a(ArrayList<String> paramArrayList, String paramString1, List<String> paramList, String paramString2);
  
  public abstract b a(com.tencent.mm.plugin.messenger.foundation.a.f paramf);
  
  public abstract void a(e parame);
  
  public abstract void a(ai paramai, int paramInt1, int paramInt2);
  
  public abstract void a(a parama);
  
  public abstract void a(a parama, Looper paramLooper);
  
  public abstract void a(b paramb);
  
  public abstract boolean a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2);
  
  public abstract String aZ(int paramInt, String paramString);
  
  public abstract void ak(bd parambd);
  
  public abstract void as(LinkedList<String> paramLinkedList);
  
  public abstract Cursor b(String paramString1, List<String> paramList, String paramString2);
  
  public abstract void b(com.tencent.mm.plugin.messenger.foundation.a.a.f paramf, f.c paramc);
  
  public abstract void b(a parama);
  
  public abstract void c(a parama);
  
  public abstract HashMap<String, Long> clA();
  
  public abstract void clB();
  
  public abstract List<String> clD();
  
  public abstract List<String> clE();
  
  public abstract Cursor clF();
  
  public abstract int clH();
  
  public abstract String clI();
  
  public abstract Cursor clJ();
  
  public abstract ai clK();
  
  public abstract boolean cly();
  
  public abstract boolean clz();
  
  public abstract long d(ai paramai);
  
  public abstract void d(String[] paramArrayOfString, String paramString);
  
  public abstract boolean f(ai paramai);
  
  public abstract Cursor fZ(String paramString1, String paramString2);
  
  public abstract boolean g(ai paramai);
  
  public abstract int hX(String paramString);
  
  public abstract Cursor k(List<String> paramList, int paramInt);
  
  public abstract Cursor t(String paramString, List<String> paramList);
  
  public abstract b vu();
  
  public static abstract interface a
  {
    public abstract void a(ai paramai, az paramaz);
  }
  
  public static abstract interface b
  {
    public abstract String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext);
    
    public abstract void a(bd parambd, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
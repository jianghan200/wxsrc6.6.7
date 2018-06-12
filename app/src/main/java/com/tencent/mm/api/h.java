package com.tencent.mm.api;

import android.content.Intent;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.protocal.c.biy;
import com.tencent.mm.protocal.c.bja;
import java.util.ArrayList;

public abstract interface h
  extends a
{
  public abstract void a(Intent paramIntent, biy parambiy, int paramInt);
  
  public abstract void a(Intent paramIntent, bja parambja, int paramInt);
  
  public abstract boolean cB(String paramString);
  
  public abstract ArrayList<String> cC(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/api/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
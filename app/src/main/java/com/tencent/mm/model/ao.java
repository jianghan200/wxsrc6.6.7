package com.tencent.mm.model;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.storage.bd;
import java.util.List;

public abstract interface ao
{
  public abstract void B(List<bd> paramList);
  
  public abstract void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle);
  
  public abstract void a(bd parambd);
  
  public abstract Looper getLooper();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/model/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
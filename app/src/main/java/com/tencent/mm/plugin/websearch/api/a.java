package com.tencent.mm.plugin.websearch.api;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.protocal.c.bxd;
import java.util.LinkedList;

public abstract class a
  extends l
{
  public String bWs;
  public int fdx;
  public int pKL;
  public String pKM;
  public Bundle pKN;
  public int tH;
  
  public abstract String JS();
  
  public abstract int JT();
  
  public void ak(LinkedList<bxd> paramLinkedList) {}
  
  public final boolean bSI()
  {
    return this.tH == 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
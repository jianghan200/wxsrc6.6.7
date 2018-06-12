package com.tencent.mm.plugin.sns.model;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class i
  extends h<String, Integer, Boolean>
{
  private String aAL = "";
  private n dvu = null;
  private String kJG;
  private int nnK;
  private String nnL;
  private List<ate> nnM;
  
  public i(String paramString1, String paramString2, List<ate> paramList)
  {
    af.byl().nnp.add(paramString1);
    this.kJG = paramString2;
    this.nnL = af.getAccSnsPath();
    this.nnK = af.byw();
    this.nnM = paramList;
    this.aAL = paramString1;
  }
  
  private boolean a(String paramString1, String paramString2, List<ate> paramList)
  {
    x.i("MicroMsg.MutiImageLoader", "makeMutilMedia " + paramString1 + " " + paramString2);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    int i = 0;
    String str1;
    String str3;
    String str2;
    if (localIterator.hasNext())
    {
      ate localate = (ate)localIterator.next();
      str1 = com.tencent.mm.plugin.sns.data.i.f(localate);
      str3 = com.tencent.mm.plugin.sns.data.i.e(localate);
      str2 = an.s(this.nnL, localate.ksA);
      if (!FileOp.cn(str2 + str1)) {
        if (!FileOp.cn(str2 + str3))
        {
          paramList = com.tencent.mm.plugin.sns.data.i.l(localate);
          if (FileOp.cn(str2 + paramList)) {
            break label433;
          }
          paramList = com.tencent.mm.plugin.sns.data.i.m(localate);
        }
      }
    }
    label433:
    for (;;)
    {
      s.a(str2, paramList, str3, af.byx());
      s.b(str2, str3, str1, af.byw());
      paramList = com.tencent.mm.plugin.sns.data.i.LJ(str2 + str1);
      if (paramList == null)
      {
        FileOp.deleteFile(str2 + str1);
        x.e("MicroMsg.MutiImageLoader", "userThumb decode fail !! " + str1);
        return false;
      }
      localLinkedList.add(paramList);
      x.i("MicroMsg.MutiImageLoader", "getbitmap from bm " + paramList + " " + str2 + str1);
      i += 1;
      if (i >= 4) {
        try
        {
          paramString1 = an.s(this.nnL, paramString1);
          FileOp.mL(paramString1);
          c.a(com.tencent.mm.plugin.sns.data.i.i(localLinkedList, this.nnK), 100, Bitmap.CompressFormat.JPEG, paramString1 + paramString2, false);
          return true;
        }
        catch (IOException paramString1)
        {
          x.printErrStackTrace("MicroMsg.MutiImageLoader", paramString1, "makeMutilMedia failed: " + paramString2, new Object[0]);
          return false;
        }
      }
      break;
    }
  }
  
  public final ag bxH()
  {
    return af.aRs();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
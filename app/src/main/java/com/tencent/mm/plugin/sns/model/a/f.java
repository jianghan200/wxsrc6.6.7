package com.tencent.mm.plugin.sns.model.a;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.sns.lucky.a.b;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class f
  extends c
{
  protected boolean ntm = false;
  protected boolean ntn = false;
  protected boolean nto = false;
  protected boolean ntp = false;
  
  public f(c.a parama, a parama1)
  {
    super(parama, parama1);
  }
  
  private static String k(String paramString, String... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    int i;
    if (paramString.contains("?"))
    {
      paramString = "&";
      localStringBuilder.append(paramString);
      int j = 1;
      int k = paramVarArgs.length;
      i = 0;
      label37:
      if (i >= k) {
        break label84;
      }
      paramString = paramVarArgs[i];
      if (j == 0) {
        break label73;
      }
      j = 0;
    }
    for (;;)
    {
      localStringBuilder.append(paramString);
      i += 1;
      break label37;
      paramString = "?";
      break;
      label73:
      localStringBuilder.append("&");
    }
    label84:
    return localStringBuilder.toString();
  }
  
  public final String MJ(String paramString)
  {
    int m = 2;
    int n = 0;
    Object localObject1 = paramString;
    for (;;)
    {
      int i;
      try
      {
        localObject2 = g.AT().getValue("SnsCloseDownloadWebp");
        localObject1 = paramString;
        if (bi.oW((String)localObject2)) {
          break label903;
        }
        localObject1 = paramString;
        i = bi.WU((String)localObject2);
      }
      catch (Exception localException1)
      {
        Object localObject2;
        Object localObject3;
        paramString = (String)localObject1;
        x.e("MicroMsg.SnsDownloadImageBase", "error get dyna by webp " + localException1.getMessage());
        return paramString;
      }
      localObject1 = paramString;
      int j;
      if (!n.zq())
      {
        j = 0;
        localObject1 = paramString;
        if (!n.zq())
        {
          k = n;
          localObject1 = paramString;
          if (bi.oW(com.tencent.mm.platformtools.af.exY))
          {
            localObject1 = paramString;
            if (bi.oW(com.tencent.mm.platformtools.af.exZ)) {
              continue;
            }
          }
          localObject3 = paramString;
          localObject1 = paramString;
          if (bi.oW(com.tencent.mm.platformtools.af.exY)) {
            continue;
          }
          localObject1 = paramString;
          localObject2 = paramString.split("(//?)");
          localObject1 = paramString;
          localObject3 = new StringBuilder();
          localObject1 = paramString;
          ((StringBuilder)localObject3).append(localObject2[0]).append("//").append(com.tencent.mm.platformtools.af.exY);
          i = m;
          localObject1 = paramString;
          if (i >= localObject2.length) {
            continue;
          }
          localObject1 = paramString;
          ((StringBuilder)localObject3).append("/").append(localObject2[i]);
          i += 1;
          continue;
          localObject1 = paramString;
          if (Build.VERSION.SDK_INT < 14)
          {
            i = 0;
            continue;
          }
          localObject1 = paramString;
          if (q.deW.der == 2)
          {
            i = 0;
            continue;
          }
          localObject1 = paramString;
          if (bi.oW(com.tencent.mm.platformtools.af.exZ)) {
            break label898;
          }
          i = 0;
        }
      }
      else
      {
        localObject1 = paramString;
        if (!com.tencent.mm.plugin.sns.model.af.byz())
        {
          j = 0;
          continue;
        }
        localObject1 = paramString;
        if (bi.oW(com.tencent.mm.platformtools.af.exZ)) {
          break label893;
        }
        j = 0;
        continue;
      }
      int k = n;
      localObject1 = paramString;
      if (com.tencent.mm.plugin.sns.model.af.byy())
      {
        k = n;
        localObject1 = paramString;
        if (bi.oW(com.tencent.mm.platformtools.af.exZ))
        {
          k = 1;
          continue;
          localObject1 = paramString;
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject1 = localObject3;
          x.i("MicroMsg.SnsDownloadImageBase", "new url  " + (String)localObject3);
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (!bi.oW(com.tencent.mm.platformtools.af.exZ))
          {
            localObject1 = localObject3;
            localObject2 = k((String)localObject3, new String[] { "tp=" + com.tencent.mm.platformtools.af.exZ });
            localObject1 = localObject2;
            x.i("MicroMsg.SnsDownloadImageBase", "(dbg) new url  " + (String)localObject2);
          }
          paramString = (String)localObject2;
          localObject1 = localObject2;
          if (this.nsN != null)
          {
            paramString = (String)localObject2;
            localObject1 = localObject2;
            if (this.nsN.noc.rVQ != 0)
            {
              localObject1 = localObject2;
              paramString = k((String)localObject2, new String[] { "enc=1" });
              localObject1 = paramString;
              x.i("MicroMsg.SnsDownloadImageBase", "test for enckey " + this.nsN.noc.rVR + " " + this.nsN.noc.rVQ + " " + paramString);
              localObject1 = paramString;
              b.kB(136);
              localObject1 = paramString;
              this.ntp = true;
            }
          }
          localObject2 = paramString;
          try
          {
            if (this.nsN != null)
            {
              localObject2 = paramString;
              if (this.nsN.noc != null)
              {
                localObject2 = this.nsN.noc;
                if (!this.nsN.nsG) {
                  break label869;
                }
                localObject1 = ((ate)localObject2).rVW;
                if (!this.nsN.nsG) {
                  break label879;
                }
                i = ((ate)localObject2).rVX;
                localObject2 = paramString;
                if (!TextUtils.isEmpty((CharSequence)localObject1)) {
                  localObject2 = k(paramString, new String[] { "token=" + (String)localObject1, "idx=" + i });
                }
              }
            }
            return (String)localObject2;
          }
          catch (Exception localException2)
          {
            String str;
            label869:
            label879:
            continue;
          }
          if (j != 0)
          {
            localObject1 = paramString;
            localObject2 = k(paramString, new String[] { "tp=wxpc" });
            localObject1 = localObject2;
            x.i("MicroMsg.SnsDownloadImageBase", "new url  " + (String)localObject2);
          }
          else if (k != 0)
          {
            localObject1 = paramString;
            str = k(paramString, new String[] { "tp=hevc" });
            localObject1 = str;
            x.i("MicroMsg.SnsDownloadImageBase", "new url  " + str);
          }
          else
          {
            str = paramString;
            if (i != 0)
            {
              localObject1 = paramString;
              str = k(paramString, new String[] { "tp=webp" });
              localObject1 = str;
              x.i("MicroMsg.SnsDownloadImageBase", "new url  " + str);
              continue;
              localObject1 = str.rVT;
              continue;
              i = str.rVU;
              continue;
              label893:
              j = 1;
              continue;
              label898:
              i = 1;
              continue;
              label903:
              i = 0;
              if (i != 0) {
                i = 0;
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
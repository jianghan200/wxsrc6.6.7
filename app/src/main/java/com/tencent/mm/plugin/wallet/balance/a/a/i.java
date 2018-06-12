package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.loader.stub.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.FileEntry;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ab;
import com.tencent.mm.plugin.wallet_core.model.d;
import com.tencent.mm.protocal.c.arq;
import com.tencent.mm.protocal.c.ll;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i
{
  public static final i oYM = new i();
  private static final String oYN = b.bnE + "wallet/lqt";
  private static final String oYO = oYN + "/save/";
  private static final String oYP = oYN + "/fetch/";
  public arq oYG;
  public arq oYH;
  private long oYI;
  private long oYJ;
  private List<Bankcard> oYK;
  private List<Bankcard> oYL;
  
  private List<Bankcard> je(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = this.oYG;
    }
    while (localObject == null) {
      if (paramBoolean)
      {
        this.oYK = null;
        return null;
        localObject = this.oYH;
      }
      else
      {
        this.oYL = null;
        return null;
      }
    }
    if (paramBoolean)
    {
      if ((this.oYK != null) && (this.oYK.size() > 0)) {
        return this.oYK;
      }
    }
    else if ((this.oYL != null) && (this.oYL.size() > 0)) {
      return this.oYL;
    }
    Bankcard localBankcard;
    if (paramBoolean)
    {
      this.oYK = new ArrayList();
      if (this.oYG.rTT != null)
      {
        localObject = ab.a(this.oYG.rTT);
        if (localObject != null) {
          this.oYK.add(localObject);
        }
      }
      if ((this.oYG.rFB != null) && (this.oYG.rFB.size() > 0))
      {
        localObject = this.oYG.rFB.iterator();
        while (((Iterator)localObject).hasNext())
        {
          localBankcard = d.a((ll)((Iterator)localObject).next());
          if (localBankcard != null) {
            this.oYK.add(localBankcard);
          }
        }
      }
      return this.oYK;
    }
    this.oYL = new ArrayList();
    if (this.oYH.rTT != null)
    {
      localObject = ab.a(this.oYH.rTT);
      if (localObject != null) {
        this.oYL.add(localObject);
      }
    }
    if ((this.oYH.rFB != null) && (this.oYH.rFB.size() > 0))
    {
      localObject = this.oYH.rFB.iterator();
      while (((Iterator)localObject).hasNext())
      {
        localBankcard = d.a((ll)((Iterator)localObject).next());
        if (localBankcard != null) {
          this.oYL.add(localBankcard);
        }
      }
    }
    return this.oYL;
  }
  
  public final void a(arq paramarq, boolean paramBoolean)
  {
    if (paramarq != null)
    {
      if (!paramBoolean) {
        break label66;
      }
      this.oYG = paramarq;
      this.oYK = null;
      this.oYI = System.currentTimeMillis();
    }
    for (;;)
    {
      x.i("MicroMsg.LqtBindQueryInfoCache", "setCache: %s, save: %s", new Object[] { paramarq, Boolean.valueOf(paramBoolean) });
      try
      {
        e.post(new i.1(this, paramarq.toByteArray(), paramBoolean), "LqtBindQueryInfoCache_saveCacheToDiski");
        return;
      }
      catch (Exception paramarq)
      {
        label66:
        x.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", paramarq, "saveCacheToDisk error: %s", new Object[] { paramarq.getMessage() });
      }
      this.oYH = paramarq;
      this.oYL = null;
      this.oYJ = System.currentTimeMillis();
    }
  }
  
  public final Bankcard jb(boolean paramBoolean)
  {
    jf(paramBoolean);
    if (paramBoolean) {}
    for (Object localObject1 = this.oYG; (localObject1 != null) && (!bi.oW(((arq)localObject1).rTR)); localObject1 = this.oYH)
    {
      Object localObject2 = je(paramBoolean);
      if ((localObject2 == null) || (((List)localObject2).size() <= 0)) {
        break;
      }
      localObject1 = ((arq)localObject1).rTR;
      if (bi.oW((String)localObject1)) {
        break;
      }
      localObject2 = ((List)localObject2).iterator();
      Bankcard localBankcard;
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localBankcard = (Bankcard)((Iterator)localObject2).next();
      } while ((localBankcard == null) || (!((String)localObject1).equals(localBankcard.field_bindSerial)));
      return localBankcard;
    }
    return null;
  }
  
  public final List<Bankcard> jc(boolean paramBoolean)
  {
    jf(paramBoolean);
    if (paramBoolean) {}
    for (arq localarq = this.oYG; localarq != null; localarq = this.oYH) {
      return je(paramBoolean);
    }
    return null;
  }
  
  public final String jd(boolean paramBoolean)
  {
    jf(paramBoolean);
    if (paramBoolean) {}
    for (arq localarq = this.oYG; localarq != null; localarq = this.oYH) {
      return localarq.rTU;
    }
    return null;
  }
  
  public final void jf(boolean paramBoolean)
  {
    long l2 = System.currentTimeMillis();
    Object localObject1;
    long l1;
    label24:
    label61:
    label70:
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = this.oYG;
      if (!paramBoolean) {
        break label103;
      }
      l1 = this.oYI;
      if (localObject1 != null)
      {
        if (l2 - l1 > 3600000L)
        {
          x.i("MicroMsg.LqtBindQueryInfoCache", "checkCache, saveCache time exceed, try reload from disk");
          this.oYG = null;
          if (!paramBoolean) {
            break label111;
          }
          this.oYI = 0L;
        }
      }
      else
      {
        if (!paramBoolean) {
          break label119;
        }
        localObject1 = oYO;
        localObject2 = FileOp.H((String)localObject1, false);
        if ((localObject2 != null) && (((List)localObject2).size() != 0)) {
          break label127;
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.oYH;
      break;
      label103:
      l1 = this.oYJ;
      break label24;
      label111:
      this.oYJ = 0L;
      break label61;
      label119:
      localObject1 = oYP;
      break label70;
      label127:
      x.i("MicroMsg.LqtBindQueryInfoCache", "tryLoadCacheFromDisk: %s, save: %s", new Object[] { localObject2, Boolean.valueOf(paramBoolean) });
      l1 = System.currentTimeMillis();
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = new File(((SFSContext.FileEntry)localIterator.next()).name).getName();
        Object localObject3 = (String)localObject1 + (String)localObject2;
        l2 = bi.getLong((String)localObject2, 0L);
        x.i("MicroMsg.LqtBindQueryInfoCache", "file name: %s", new Object[] { Long.valueOf(l2) });
        if (l2 > 0L)
        {
          if (l1 - l2 < 3600000L)
          {
            localObject3 = FileOp.e((String)localObject3, 0, (int)FileOp.mI((String)localObject3));
            localObject2 = new arq();
            try
            {
              ((arq)localObject2).aG((byte[])localObject3);
              if (localObject2 == null) {
                continue;
              }
              if (paramBoolean)
              {
                this.oYG = ((arq)localObject2);
                this.oYK = null;
                this.oYI = l2;
                x.i("MicroMsg.LqtBindQueryInfoCache", "succ get saveCache: %s %s", new Object[] { localObject2, Long.valueOf(l2) });
                return;
              }
            }
            catch (IOException localIOException)
            {
              for (;;)
              {
                localObject2 = null;
                x.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", localIOException, "parse bindquery from cache error: %s", new Object[] { localIOException.getMessage() });
                continue;
                this.oYH = ((arq)localObject2);
                this.oYL = null;
                this.oYJ = l2;
              }
            }
          }
          else
          {
            FileOp.deleteFile(localIOException);
          }
        }
        else {
          FileOp.deleteFile(localIOException);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
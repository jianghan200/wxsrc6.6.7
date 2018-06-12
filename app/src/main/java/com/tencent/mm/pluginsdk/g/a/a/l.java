package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.a.g;
import com.tencent.mm.a.q;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.pluginsdk.g.a.d.a;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

final class l
{
  private final int bIC;
  private final int bID;
  private final int bIE;
  private final boolean bIF;
  private final boolean bIJ;
  final String filePath;
  private final String qBB;
  private final int qBC;
  private final byte[] qBD;
  private final String qBE;
  private final long qBG;
  private final String qBH;
  private final int qBI;
  private final int qBJ;
  final String qBy;
  volatile String qCH = null;
  volatile String qCI = null;
  final boolean qCf;
  final boolean qCg;
  volatile int state = -1;
  private final String url;
  
  l(int paramInt1, int paramInt2, String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2, int paramInt3, boolean paramBoolean3, boolean paramBoolean4, byte[] paramArrayOfByte, String paramString3, String paramString4, long paramLong, String paramString5, int paramInt4, int paramInt5, int paramInt6)
  {
    this.qBy = i.ex(paramInt1, paramInt2);
    this.bIC = paramInt1;
    this.bID = paramInt2;
    this.filePath = paramString1;
    this.qCg = paramBoolean1;
    this.qCf = paramBoolean2;
    this.qBB = paramString2;
    this.qBC = paramInt3;
    this.qBD = paramArrayOfByte;
    this.qBE = paramString3;
    this.bIJ = paramBoolean3;
    this.bIF = paramBoolean4;
    this.qBH = paramString4;
    this.qBG = paramLong;
    this.url = paramString5;
    this.qBI = paramInt4;
    this.qBJ = paramInt5;
    this.bIE = paramInt6;
  }
  
  final l ccw()
  {
    x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), file_state = %s, before do decrypt, inPath = %s, outPath = %s, (key == empty) = %b", new Object[] { this.qBy, ccz(), this.qCH, this.qCI, Boolean.valueOf(bi.oW(this.qBB)) });
    if (1 != this.state) {
      return this;
    }
    if (bi.oW(this.qBB))
    {
      x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), invalid encrypt key", new Object[] { this.qBy });
      this.qCH = null;
      this.state = 8;
      j.n(this.qBG, 54L);
      j.n(this.qBG, 45L);
      return this;
    }
    for (;;)
    {
      try
      {
        localObject2 = this.qCH;
        str = this.qCI;
        localObject1 = this.qBB;
        localFile = new File((String)localObject2);
        if ((!localFile.exists()) || (!localFile.isFile()))
        {
          x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", new Object[] { localObject2 });
          bool1 = false;
        }
      }
      catch (Exception localException1)
      {
        Object localObject2;
        String str;
        Object localObject1;
        File localFile;
        boolean bool2;
        boolean bool1 = false;
      }
      try
      {
        x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), decrypt done, ret = %b", new Object[] { this.qBy, Boolean.valueOf(bool1) });
        x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), after try-catch, ret = %b", new Object[] { this.qBy, Boolean.valueOf(bool1) });
        if (bool1) {
          break;
        }
        this.qCH = null;
        this.state = 8;
        return this;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localFile = new File(str);
      localFile.getParentFile().mkdirs();
      localFile.delete();
      localObject2 = a.Tq((String)localObject2);
      if (bi.bC((byte[])localObject2))
      {
        x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "read bytes empty");
        j.n(this.qBG, 56L);
        j.n(this.qBG, 45L);
        j.n(this.qBG, 18L);
        bool1 = false;
      }
      else
      {
        localObject1 = MMProtocalJni.aesDecrypt((byte[])localObject2, ((String)localObject1).getBytes());
        if (bi.bC((byte[])localObject1))
        {
          x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypted bytes empty");
          j.n(this.qBG, 55L);
          j.n(this.qBG, 45L);
          j.n(this.qBG, 18L);
          bool1 = false;
        }
        else
        {
          bool2 = a.v(str, (byte[])localObject1);
          bool1 = bool2;
          if (!bool2)
          {
            x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypt write bytes fail");
            j.n(this.qBG, 57L);
            j.n(this.qBG, 45L);
            j.n(this.qBG, 18L);
            bool1 = bool2;
            continue;
            x.printErrStackTrace("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", localException1, "", new Object[0]);
            x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), error = %s", new Object[] { this.qBy, localException1 });
            j.n(this.qBG, 45L);
            j.n(this.qBG, 18L);
          }
        }
      }
    }
    j.n(this.qBG, 17L);
    this.qCH = this.qCI;
    if (this.qCf)
    {
      this.qCI = (this.filePath + ".decompressed");
      this.state = 2;
      return this;
    }
    this.state = 4;
    return this;
  }
  
  final l ccx()
  {
    x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), file_state = %s, before do decompress, inPath = %s, outPath = %s", new Object[] { this.qBy, ccz(), this.qCH, this.qCI });
    if (2 != this.state) {
      if ((8 == this.state) && (this.qCg)) {
        j.a(this.bIC, this.bID, this.qBC, this.bIJ, false, false, false, this.qBH);
      }
    }
    do
    {
      return this;
      for (;;)
      {
        try
        {
          localObject = this.qCH;
          str1 = this.qCI;
          File localFile = new File((String)localObject);
          if ((!localFile.exists()) || (!localFile.isFile()))
          {
            x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", new Object[] { localObject });
            bool = false;
          }
        }
        catch (Exception localException1)
        {
          Object localObject;
          String str1;
          boolean bool = false;
        }
        try
        {
          x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), decompress done, ret = %b", new Object[] { this.qBy, Boolean.valueOf(bool) });
          x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), after try-catch, ret = %b", new Object[] { this.qBy, Boolean.valueOf(bool) });
          if (!bool) {
            break;
          }
          this.qCH = this.qCI;
          this.state = 4;
          j.n(this.qBG, 19L);
          return this;
        }
        catch (Exception localException2)
        {
          int j;
          int k;
          String str2;
          int m;
          int i;
          for (;;) {}
        }
        new File(str1).delete();
        localObject = q.x(a.Tq((String)localObject));
        if (bi.bC((byte[])localObject))
        {
          x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "uncompressed bytes empty");
          bool = false;
        }
        else
        {
          bool = a.v(str1, (byte[])localObject);
          continue;
          x.printErrStackTrace("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", localException1, "", new Object[0]);
          x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), error = %s", new Object[] { this.qBy, localException1 });
        }
      }
      this.qCH = null;
      this.state = 8;
      j.n(this.qBG, 20L);
      j.n(this.qBG, 46L);
      if (this.qCg)
      {
        j.a(this.bIC, this.bID, this.qBC, this.bIJ, true, false, false, this.qBH);
        return this;
      }
    } while ((!this.qCf) || (!this.bIF));
    j = this.bIC;
    k = this.bID;
    str2 = this.url;
    m = this.bIE;
    if (this.qBI > this.qBJ) {}
    for (i = j.a.qCz;; i = j.a.qCx)
    {
      j.a(j, k, str2, m, i, false, this.bIJ, false, this.qBH);
      return this;
    }
  }
  
  final String ccy()
  {
    x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSum(), state " + ccz(), new Object[] { this.qBy });
    if (16 == this.state) {
      localObject = this.qCH;
    }
    String str1;
    label113:
    label353:
    label478:
    label567:
    do
    {
      do
      {
        do
        {
          do
          {
            return (String)localObject;
            if ((4 != this.state) && (32 != this.state)) {
              return null;
            }
            if (!bi.oW(this.qCH))
            {
              localObject = this.qBy;
              String str2 = ccz();
              String str3 = this.qBE;
              if (this.qBD == null)
              {
                str1 = "null";
                x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, originalMd5 = %s, eccSig.size = %s", new Object[] { localObject, str2, str3, str1 });
                if ((bi.oW(this.qBE)) || (!bi.oV(g.cu(this.qCH)).equals(this.qBE))) {
                  break label353;
                }
                x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, md5 ok", new Object[] { this.qBy, ccz() });
                if (this.state == 4) {
                  j.n(this.qBG, 23L);
                }
                str1 = this.qCH;
              }
            }
            for (;;)
            {
              x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl return = %s", new Object[] { this.qBy, str1 });
              localObject = str1;
              if (this.state != 4) {
                break;
              }
              if ((bi.oW(str1)) && (!this.qCf))
              {
                j.n(this.qBG, 58L);
                j.n(this.qBG, 45L);
              }
              if (!bi.oW(str1)) {
                break label567;
              }
              if (!this.qCg) {
                break label478;
              }
              j.a(this.bIC, this.bID, this.qBC, this.bIJ, true, true, false, this.qBH);
              return str1;
              str1 = String.valueOf(this.qBD.length);
              break label113;
              if (this.state == 4) {
                j.n(this.qBG, 24L);
              }
              if ((!bi.bC(this.qBD)) && (UtilsJni.doEcdsaSHAVerify(i.qCi, a.Tq(this.qCH), this.qBD) > 0))
              {
                x.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, ecc check ok", new Object[] { this.qBy, ccz() });
                if (this.state == 4) {
                  j.n(this.qBG, 25L);
                }
                str1 = this.qCH;
              }
              else
              {
                if (this.state == 4) {
                  j.n(this.qBG, 26L);
                }
                str1 = null;
              }
            }
            localObject = str1;
          } while (!this.qCf);
          localObject = str1;
        } while (!this.bIF);
        j = this.bIC;
        k = this.bID;
        localObject = this.url;
        m = this.bIE;
        if (this.qBI > this.qBJ) {}
        for (i = j.a.qCz;; i = j.a.qCx)
        {
          j.a(j, k, (String)localObject, m, i, false, this.bIJ, true, this.qBH);
          return str1;
        }
        if (this.qCg)
        {
          j.a(this.bIC, this.bID, this.qBC, this.bIJ, true, true, true, this.qBH);
          return str1;
        }
        localObject = str1;
      } while (!this.qCf);
      localObject = str1;
    } while (!this.bIF);
    int j = this.bIC;
    int k = this.bID;
    Object localObject = this.url;
    int m = this.bIE;
    if (this.qBI > this.qBJ) {}
    for (int i = j.a.qCz;; i = j.a.qCx)
    {
      j.a(j, k, (String)localObject, m, i, true, this.bIJ, true, this.qBH);
      return str1;
    }
  }
  
  final String ccz()
  {
    switch (this.state)
    {
    default: 
      return this.state;
    case 1: 
      return "state_decrypt";
    case 2: 
      return "state_decompress";
    case 4: 
      return "state_check_sum";
    case 8: 
      return "state_file_invalid";
    case 16: 
      return "state_file_valid";
    }
    return "state_pre_verify_check_sum";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
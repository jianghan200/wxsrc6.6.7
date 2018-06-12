package com.tencent.mm.plugin.emoji.e;

import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;

public class e
{
  public static e ifs;
  private String aAL;
  boolean bgH = false;
  
  public static e aDM()
  {
    if (ifs == null) {}
    try
    {
      ifs = new e();
      return ifs;
    }
    finally {}
  }
  
  public final byte[] a(EmojiInfo paramEmojiInfo)
  {
    if (paramEmojiInfo == null)
    {
      x.w("MicroMsg.emoji.EmojiFileEncryptMgr", "decodeEmojiData failed. emoji is null.");
      return null;
    }
    String str = paramEmojiInfo.cnF();
    byte[] arrayOfByte1 = com.tencent.mm.a.e.e(str, 0, com.tencent.mm.a.e.cm(str));
    if ((com.tencent.mm.a.e.cm(str) > 0) && (arrayOfByte1 != null) && (arrayOfByte1.length >= 10))
    {
      byte[] arrayOfByte2 = new byte[10];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 10);
      if (((paramEmojiInfo.field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW) && (!o.bw(arrayOfByte2)))
      {
        long l = System.currentTimeMillis();
        int j = com.tencent.mm.a.e.cm(str);
        int i = j;
        if (j > 1024) {
          i = 1024;
        }
        arrayOfByte2 = com.tencent.mm.a.e.e(str, 0, i);
        paramEmojiInfo = null;
        if (!bi.oW(aDN())) {
          paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte2, aDN().getBytes(), false, false);
        }
        if ((!bi.bC(paramEmojiInfo)) && (!bi.bC(arrayOfByte1)))
        {
          System.arraycopy(paramEmojiInfo, 0, arrayOfByte1, 0, i);
          l = System.currentTimeMillis() - l;
          h.mEJ.a(252L, 0L, l, false);
          h.mEJ.a(252L, 5L, 1L, false);
          x.d("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte1.length), Long.valueOf(l) });
          return arrayOfByte1;
        }
        h.mEJ.a(252L, 2L, 1L, false);
        x.i("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path:%s return original ", new Object[] { str });
        return arrayOfByte1;
      }
      return arrayOfByte1;
    }
    x.i("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path is no exist :%s ", new Object[] { str });
    return null;
  }
  
  public final String aDN()
  {
    if (bi.oW(this.aAL)) {
      this.aAL = i.aEA().igx.getKey();
    }
    return this.aAL;
  }
  
  public final boolean b(EmojiInfo paramEmojiInfo)
  {
    int i = 1024;
    if (paramEmojiInfo == null)
    {
      x.w("MicroMsg.emoji.EmojiFileEncryptMgr", "decodeEmojiData failed. emoji is null.");
      return false;
    }
    long l = System.currentTimeMillis();
    Object localObject = paramEmojiInfo.cnF();
    int j = com.tencent.mm.a.e.cm((String)localObject);
    byte[] arrayOfByte;
    boolean bool;
    if (j > 1024)
    {
      arrayOfByte = com.tencent.mm.a.e.e((String)localObject, 0, i);
      if ((com.tencent.mm.a.e.cm((String)localObject) <= 0) || (arrayOfByte == null) || (arrayOfByte.length < 10)) {
        break label199;
      }
      localObject = new byte[10];
      System.arraycopy(arrayOfByte, 0, localObject, 0, 10);
      if (!o.bw((byte[])localObject)) {
        break label138;
      }
      bool = true;
    }
    for (;;)
    {
      x.d("MicroMsg.emoji.EmojiFileEncryptMgr", "checkout use time:%s result:%b", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool) });
      return bool;
      i = j;
      break;
      label138:
      if ((paramEmojiInfo.field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW)
      {
        paramEmojiInfo = null;
        if (!bi.oW(aDN())) {
          paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte, aDN().getBytes(), false, false);
        }
        if ((!bi.bC(paramEmojiInfo)) && (o.bw(paramEmojiInfo)))
        {
          bool = true;
          continue;
        }
      }
      label199:
      bool = false;
    }
  }
  
  public final boolean c(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    if (paramEmojiInfo == null)
    {
      x.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. emoji is null.");
      return false;
    }
    if (!isEnable())
    {
      x.i("MicroMsg.emoji.EmojiFileEncryptMgr", "disable encrypt");
      return false;
    }
    String str = paramEmojiInfo.cnF();
    byte[] arrayOfByte1;
    boolean bool1;
    if (com.tencent.mm.a.e.cn(str))
    {
      boolean bool2 = false;
      arrayOfByte1 = com.tencent.mm.a.e.e(str, 0, 10);
      bool1 = bool2;
      if (arrayOfByte1 != null) {
        bool1 = bool2;
      }
    }
    for (;;)
    {
      try
      {
        if (arrayOfByte1.length >= 10) {
          bool1 = o.bw(arrayOfByte1);
        }
        if ((paramBoolean) || (bool1))
        {
          long l = System.currentTimeMillis();
          j = com.tencent.mm.a.e.cm(str);
          if (j > 1024)
          {
            i = 1024;
            arrayOfByte1 = com.tencent.mm.a.e.e(str, 0, j);
            byte[] arrayOfByte2 = AesEcb.aesCryptEcb(com.tencent.mm.a.e.e(str, 0, i), aDN().getBytes(), true, false);
            if ((bi.bC(arrayOfByte2)) || (bi.bC(arrayOfByte1))) {
              break label376;
            }
            System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
            i = com.tencent.mm.a.e.b(str, arrayOfByte1, arrayOfByte1.length);
            if (i != 0) {
              continue;
            }
            l = System.currentTimeMillis() - l;
            h.mEJ.a(252L, 1L, l, false);
            h.mEJ.a(252L, 6L, 1L, false);
            paramEmojiInfo.field_reserved4 |= EmojiInfo.tcW;
            paramEmojiInfo.field_size = j;
            i.aEA().igx.q(paramEmojiInfo);
            x.i("MicroMsg.emoji.EmojiFileEncryptMgr", "encode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte1.length), Long.valueOf(l) });
            return true;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        int j;
        x.printErrStackTrace("MicroMsg.emoji.EmojiFileEncryptMgr", localThrowable, "", new Object[0]);
        bool1 = false;
        continue;
        i = j;
        continue;
        x.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. write file failed.");
        h.mEJ.a(252L, 3L, 1L, false);
        return false;
      }
      x.i("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile file had encrypt.");
      return true;
      x.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. file not exist. path%s", new Object[] { str });
      paramEmojiInfo.field_reserved4 = 0;
      i.aEA().igx.q(paramEmojiInfo);
      return false;
      label376:
      int i = -1;
    }
  }
  
  public final boolean isEnable()
  {
    return !bi.oW(aDN());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
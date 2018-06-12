package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class ap
{
  public String aeskey;
  public String bKg;
  public String bKk;
  public String bOt;
  public long bYu;
  public int cqa;
  public String cqb = "";
  public long createTime;
  public int dYP;
  public String dwA;
  public String dwu;
  public String enF;
  public int height;
  public String id;
  public String knh;
  public int taZ;
  public String talker;
  public int tba;
  public int tbb;
  public int tbc;
  public String tbd = "";
  public String tbe;
  public String tbf;
  public String tbg;
  public boolean tbh = true;
  public String tbi;
  public String thumbUrl;
  public int width;
  
  public static ap a(Map<String, String> paramMap, String paramString1, String paramString2, String paramString3)
  {
    if (paramMap == null) {
      return null;
    }
    ap localap = new ap();
    localap.tbd = paramString2;
    localap.talker = paramString1;
    localap.id = ((String)paramMap.get(".msg.emoji.$idbuffer"));
    localap.enF = ((String)paramMap.get(".msg.emoji.$fromusername"));
    paramString1 = (String)paramMap.get(".msg.emoji.$androidmd5");
    localap.bKg = paramString1;
    if (paramString1 == null) {
      localap.bKg = ((String)paramMap.get(".msg.emoji.$md5"));
    }
    if (!bi.oW(localap.bKg)) {
      localap.bKg = localap.bKg.toLowerCase();
    }
    try
    {
      localap.taZ = Integer.valueOf((String)paramMap.get(".msg.emoji.$type")).intValue();
      if (paramMap.get(".msg.emoji.$androidlen") != null) {
        localap.tba = Integer.valueOf((String)paramMap.get(".msg.emoji.$androidlen")).intValue();
      }
      for (;;)
      {
        if (paramMap.get(".msg.gameext.$type") != null) {
          localap.tbb = Integer.valueOf((String)paramMap.get(".msg.gameext.$type")).intValue();
        }
        if (paramMap.get(".msg.gameext.$content") != null) {
          localap.tbc = Integer.valueOf((String)paramMap.get(".msg.gameext.$content")).intValue();
        }
        if (paramMap.get(".msg.emoji.$productid") != null) {
          localap.bKk = ((String)paramMap.get(".msg.emoji.$productid"));
        }
        if (paramMap.get(".msg.emoji.$cdnurl") != null) {
          localap.knh = ((String)paramMap.get(".msg.emoji.$cdnurl"));
        }
        if (paramMap.get(".msg.emoji.$tpurl") != null) {
          localap.dwu = ((String)paramMap.get(".msg.emoji.$tpurl"));
        }
        if (paramMap.get(".msg.emoji.$tpauthkey") != null) {
          localap.dwA = ((String)paramMap.get(".msg.emoji.$tpauthkey"));
        }
        if (paramMap.get(".msg.emoji.$designerid") != null) {
          localap.tbe = ((String)paramMap.get(".msg.emoji.$designerid"));
        }
        if (paramMap.get(".msg.emoji.$thumburl") != null) {
          localap.thumbUrl = ((String)paramMap.get(".msg.emoji.$thumburl"));
        }
        if (paramMap.get(".msg.emoji.$encrypturl") != null) {
          localap.bOt = ((String)paramMap.get(".msg.emoji.$encrypturl"));
        }
        if (paramMap.get(".msg.emoji.$aeskey") != null) {
          localap.aeskey = ((String)paramMap.get(".msg.emoji.$aeskey"));
        }
        if (paramMap.get(".msg.emoji.$width") != null) {
          localap.width = Integer.valueOf((String)paramMap.get(".msg.emoji.$width")).intValue();
        }
        if (paramMap.get(".msg.emoji.$height") != null) {
          localap.height = Integer.valueOf((String)paramMap.get(".msg.emoji.$height")).intValue();
        }
        if (paramMap.get(".msg.emoji.$externurl") != null) {
          localap.tbf = ((String)paramMap.get(".msg.emoji.$externurl"));
        }
        if (paramMap.get(".msg.emoji.$externmd5") != null) {
          localap.tbg = ((String)paramMap.get(".msg.emoji.$externmd5"));
        }
        if (paramMap.get(".msg.emoji.$activityid") != null) {
          localap.tbi = ((String)paramMap.get(".msg.emoji.$activityid"));
        }
        if (!bi.oW(paramString3)) {
          localap.cqb = paramString3;
        }
        x.d("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiXml id:%s  md5:%s  type:%d  len:%d  gameType:%d  gameContent:%d  productId:%s  cdnUrl:%s tpUrl:%s designerid:%s thumburl:%s encryptrul:%s width:%d height:%d externUrl:%s externMd5:%s", new Object[] { localap.id, localap.bKg, Integer.valueOf(localap.taZ), Integer.valueOf(localap.tba), Integer.valueOf(localap.tbb), Integer.valueOf(localap.tbc), localap.bKk, localap.knh, localap.dwu, localap.tbe, localap.thumbUrl, localap.bOt, Integer.valueOf(localap.width), Integer.valueOf(localap.height), localap.tbf, localap.tbg });
        return localap;
        if (paramMap.get(".msg.emoji.$len") != null) {
          localap.tba = Integer.valueOf((String)paramMap.get(".msg.emoji.$len")).intValue();
        }
      }
      return null;
    }
    catch (Exception paramMap)
    {
      x.e("MicroMsg.emoji.EmojiMsgInfo", "exception:%s", new Object[] { bi.i(paramMap) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */